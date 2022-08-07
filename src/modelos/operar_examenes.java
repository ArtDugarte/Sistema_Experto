package modelos;

import BD.BDConex;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class operar_examenes {

    public int idUltimoExamen() {

        ResultSet rs = null;
        BDConex bd = new BDConex();
        int id = 0;

        rs = bd.consultar("SELECT MAX(id) AS id FROM examenes");

        try {
            if (rs.next()) {
                id = rs.getInt("id");

            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        bd.desconectar();
        return id;

    }

    public void Crear(int id_paciente, byte[] archivo_subido, String tipo) {

        BD.BDConex bd = new BD.BDConex();

        int op = 0, id;
        id = 0;
        PreparedStatement ps = null;
        String sql = "INSERT INTO examenes (id_paciente, documento, estado, fecha, tipo) values(?, ?, ?, ?, ?)";

        try {

            ps = bd.getConexion().prepareStatement(sql);
            ps.setInt(1, id_paciente);
            ps.setBytes(2, archivo_subido);
            ps.setInt(3, 0);
            ps.setString(5, tipo);
            java.util.Date utilDate = new java.util.Date();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

            ps.setDate(4, sqlDate);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "         ¡Subida Exitosa!", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {

            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "¡Ocurrio un error en la operación! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "¡Ocurrio un error en la operación! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                ps.close();
                bd.desconectar();
            } catch (Exception ex) {
            }
        }
    }

    public void SubirSangre(float hematies, float hemoglobina, float hematocritos, float plaquetas, float leucocitos, float segmentados, float linfocitos) {

        int ultimo_id = idUltimoExamen();
        BD.BDConex bd = new BD.BDConex();

        int op = 0;

        op = bd.ejecutar("INSERT INTO sangre (id_examen, hematies, hemoglobina, hematocritos, plaquetas, leucocitos, segmentados, linfocitos)\n"
                + "VALUES(" + ultimo_id + ", " + hematies + ", " + hemoglobina + ", " + hematocritos + ", " + plaquetas + ", " + leucocitos + ", " + segmentados + ", " + linfocitos + ")");

        bd.desconectar();
    }

    public void SubirOrina(String aspecto, String color, String reaccion, float densidad, float leucocitos, float hematies, String piocitos, String bacterias, float e_plano,
            String proteinas, String glucosa, String hemoglobina, String c_cetonico, String p_biliares, String urobilinogelen, String bilirrubina, String nitritos) {

        int ultimo_id = idUltimoExamen();
        BD.BDConex bd = new BD.BDConex();

        int op = 0;

        op = bd.ejecutar("INSERT INTO orina (id_examen, aspecto, color, reaccion, densidad, leucocitos, hematies, piocitos, bacterias, e_plano, \n"
                + "        proteinas, glucosa, hemoglobina, c_cetonico, p_biliares, urobilinogelen, bilirrubina, nitritos)\n"
                + "VALUES(" + ultimo_id + ", '" + aspecto + "', '" + color + "', '" + reaccion + "', " + densidad + ", " + leucocitos + ", " + hematies + ", '" + piocitos + "', '" + bacterias + "'"
                + ", " + e_plano + ", '" + proteinas + "', '" + glucosa + "', '" + hemoglobina + "', '" + c_cetonico + "', '" + p_biliares + "', '" + urobilinogelen + "', '" + bilirrubina + "', "
                + "'" + nitritos + "')");

        bd.desconectar();
    }

    public ArrayList ExamenesPendientes() {

        ArrayList lista = new ArrayList<>();
        int op = 0, sangre = 0, orina = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;
        PreparedStatement statement = null;
        ResultSet result = null;
        Connection connection;

        modelo m;
        connection = bd.getConexion();
        int idExamen = 0;

        try {

            if (connection != null) {

                result = bd.consultar("SELECT * FROM examenes e, usuario u WHERE e.estado=0 AND e.id_paciente=u.id");
                if (result == null) {
                    lista = null;
                }
                while (result.next()) {
                    m = new modelo();
                    m.setCedula(result.getString("u.cedula"));
                    m.setFecha(result.getString("e.fecha"));
                    idExamen = result.getInt("e.id");
                    sangre = existeExamen(idExamen, "sangre", bd);
                    orina = existeExamen(idExamen, "orina", bd);
                    if (sangre > 0) {
                        m.setSangre(true);
                    } else {
                        m.setSangre(false);
                    }

                    if (orina > 0) {
                        m.setOrina(true);
                    } else {
                        m.setOrina(false);
                    }
                    lista.add(m);
                }
            }
        } catch (SQLException e) {

            System.out.println(e);

        } finally {

            try {

                connection.close();
                bd.desconectar();

            } catch (SQLException e) {

                e.printStackTrace();
            }
        }
        return lista;
    }

    public int existeExamen(int idExamen, String tabla, BDConex bd) {

        ResultSet rs = null;
        int id = 0;
        rs = bd.consultar("SELECT id FROM " + tabla + " WHERE id_examen = " + idExamen + "");
        try {
            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return id;

    }

    public String ejecutar_archivo(int id) {

        BDConex bd = new BDConex();
        PreparedStatement ps = null;
        ResultSet rs = null;
        byte[] b = null;
        String tipo = null, examen = "";

        try {
            ps = bd.getConexion().prepareStatement("SELECT documento, tipo FROM examenes WHERE id = ? AND estado=0 ORDER BY id ASC;");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                b = rs.getBytes(1);
                tipo = rs.getString("tipo");
            }
            InputStream bos = new ByteArrayInputStream(b);

            int tamanoInput = bos.available();
            byte[] datos = new byte[tamanoInput];
            bos.read(datos, 0, tamanoInput);

            //Detectar Extension del Blob
            OutputStream out = new FileOutputStream("C:\\Resultados\\examen." + tipo + "");
            out.write(datos);
            examen = "examen." + tipo;

            //abrir archivo
            out.close();
            bos.close();
            ps.close();
            rs.close();
            bd.desconectar();

        } catch (IOException | NumberFormatException | SQLException ex) {
            System.out.println("Error al abrir archivo PDF " + ex.getMessage());
        }

        return examen;
    }

    public modelo BuscarExamen(int id_examen) {

        modelo m = new modelo();
        ResultSet rs = null;
        BDConex bd = new BDConex();
        int idsangre = existeExamen(id_examen, "sangre", bd);
        int idorina = existeExamen(id_examen, "orina", bd);

        if (idsangre > 0) {
            m.setSangre(true);
            rs = bd.consultar("SELECT * FROM sangre WHERE id_examen = " + id_examen + "");
            try {

                if (rs.next()) {

                    m.setS_hematies(rs.getFloat("hematies"));
                    m.setS_hemoglobina(rs.getFloat("hemoglobina"));
                    m.setS_hematocritos(rs.getFloat("hematocritos"));
                    m.setS_plaquetas(rs.getFloat("plaquetas"));
                    m.setS_leucocitos(rs.getFloat("leucocitos"));
                    m.setS_segmentados(rs.getFloat("segmentados"));
                    m.setS_linfocitos(rs.getFloat("linfocitos"));
                }
            } catch (SQLException e) {

                e.printStackTrace();
            }

        } else {
            m.setSangre(false);
        }

        rs = null;

        if (idorina > 0) {
            m.setOrina(true);
            rs = bd.consultar("SELECT * FROM orina WHERE id_examen = " + id_examen + "");
            try {

                if (rs.next()) {

                    m.setO_aspecto(rs.getString("aspecto"));
                    m.setO_color(rs.getString("color"));
                    m.setO_reaccion(rs.getString("reaccion"));
                    m.setO_densidad(rs.getFloat("densidad"));
                    m.setO_leucocitos(rs.getFloat("leucocitos"));
                    m.setO_hematies(rs.getFloat("hematies"));
                    m.setO_piocitos(rs.getString("piocitos"));
                    m.setO_bacterias(rs.getString("bacterias"));
                    m.setO_eplano(rs.getFloat("e_plano"));
                    m.setO_proteinas(rs.getString("proteinas"));
                    m.setO_glucosa(rs.getString("glucosa"));
                    m.setO_hemoglobina(rs.getString("hemoglobina"));
                    m.setO_cetonico(rs.getString("c_cetonico"));
                    m.setO_pbiliares(rs.getString("p_biliares"));
                    m.setO_urobilinogelen(rs.getString("urobilinogelen"));
                    m.setO_bilirrubina(rs.getString("bilirrubina"));
                    m.setO_nitritos(rs.getString("nitritos"));
                }
            } catch (SQLException e) {

                e.printStackTrace();
            }
        } else {
            m.setOrina(false);
        }

        return m;
    }
    
    public int ModificarSangre(int id_examen, float hematies, float hemoglobina, float hematocritos, float plaquetas, float leucocitos, float segmentados, float linfocitos) {

       
        BD.BDConex bd = new BD.BDConex();

        int op = 0;

        op = bd.ejecutar("UPDATE sangre SET hematies = "+ hematies +", hemoglobina = "+ hemoglobina +", hematocritos = "+ hematocritos +", plaquetas = "+ plaquetas +", "
                + "leucocitos = "+ leucocitos +", segmentados = "+ segmentados +", linfocitos = "+ linfocitos +"\n WHERE id_examen = "+ id_examen +"");
               
        if (op > 0) {

            JOptionPane.showMessageDialog(null, "¡Modificación Exitosa!", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
        } else {

            JOptionPane.showMessageDialog(null, "¡Error al Modificar! "
                    + "\n              Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        
        bd.desconectar();
        return op;
    }
    
    public int ModificarOrina(int id_examen, String aspecto, String color, String reaccion, float densidad, float leucocitos, float hematies, String piocitos, String bacterias, float e_plano,
            String proteinas, String glucosa, String hemoglobina, String c_cetonico, String p_biliares, String urobilinogelen, String bilirrubina, String nitritos) {

        
        BD.BDConex bd = new BD.BDConex();

        int op = 0;

        op = bd.ejecutar("UPDATE orina SET aspecto = '"+ aspecto +"', color = '"+ color +"', reaccion = '"+ reaccion +"', densidad = "+ densidad +", leucocitos = "+ leucocitos +", "
                + "hematies = "+ hematies +", piocitos = '"+ piocitos +"', bacterias = '"+ bacterias +"', e_plano = "+ e_plano +", proteinas = '"+ proteinas +"', "
                + "glucosa = '"+ glucosa +"', hemoglobina = '"+ hemoglobina +"', c_cetonico = '"+ c_cetonico +"', p_biliares = '"+ p_biliares +"', "
                + "urobilinogelen = '"+ urobilinogelen +"', bilirrubina = '"+ bilirrubina +"', nitritos = '"+ nitritos +"'\n");
        
        
        if (op > 0) {

            JOptionPane.showMessageDialog(null, "¡Modificación Exitosa!", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
        } else {

            JOptionPane.showMessageDialog(null, "¡Error al Modificar! "
                    + "\n              Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        
        bd.desconectar();
        return op;
    }

    public int cambiarEstado(int id_examen, int estado){
    
        BD.BDConex bd = new BD.BDConex();

        int op = 0;

        op = bd.ejecutar("UPDATE examenes SET estado = "+ estado +" WHERE id = "+ id_examen +"");
               
        
        bd.desconectar();
        return op;
        
    }
}
