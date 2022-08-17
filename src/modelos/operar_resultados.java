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

public class operar_resultados {

    public int idUltimoResultado() {

        ResultSet rs = null;
        BDConex bd = new BDConex();
        int id = 0;

        rs = bd.consultar("SELECT MAX(id) AS id FROM resultados");

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

    public void Crear(int id_paciente, int id_experto, String diagnostico, String fecha_envio) {

        BD.BDConex bd = new BD.BDConex();

        int op = 0, id;
        id = 0;

        op = bd.ejecutar("INSERT INTO resultados (id_paciente, id_experto, diagnosticos, fecha, fecha_envio) "
                + "VALUES (" + id_paciente + "," + id_experto + " , '" + diagnostico + "',CURDATE(), '" + fecha_envio + "')");

        if (op > 0) {

            JOptionPane.showMessageDialog(null, "¡Diagnostico Procesado y Enviado al Paciente!", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "¡Ocurrio un error en la operación! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }

        bd.desconectar();
    }

    public void subirDocumentoDelExamen(byte[] documento, String tipo) {

        BD.BDConex bd = new BD.BDConex();

        int op = 0, id;
        id = 0;
        PreparedStatement ps = null;
        String sql = "INSERT INTO documento_resultado (id_resultado, documento, tipo) values(?, ?, ?)";

        try {

            ps = bd.getConexion().prepareStatement(sql);
            ps.setInt(1, idUltimoResultado());
            ps.setBytes(2, documento);
            ps.setString(3, tipo);

            ps.executeUpdate();

        } catch (SQLException ex) {

            System.out.println(ex.getMessage());

        } catch (Exception ex) {

            System.out.println(ex.getMessage());

        } finally {
            try {
                ps.close();
                bd.desconectar();
            } catch (Exception ex) {
            }
        }
    }

    public modelo Buscar(int id) {

        ResultSet rs = null;
        BDConex bd = new BDConex();
        modelo m = new modelo();

        rs = bd.consultar("SELECT * FROM resultados r, usuario u WHERE r.id_paciente = " + id + " and u.id = r.id_experto ORDER BY r.id desc");

        try {
            if (rs.next()) {

                m.setNombre(rs.getString("u.nombres"));
                m.setApellido(rs.getString("u.apellidos"));
                m.setCorreo(rs.getString("u.correo"));
                m.setFecha_envio(rs.getString("r.fecha_envio"));
                m.setFecha_diagnostico(rs.getString("r.fecha"));
                m.setDiagnostico_final(rs.getString("r.diagnosticos"));
                m.setId_resultado(rs.getInt("r.id"));

            } else {
                m = null;
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        bd.desconectar();
        return m;

    }

    public String ejecutar_archivo(int id) {

        BDConex bd = new BDConex();
        PreparedStatement ps = null;
        ResultSet rs = null;
        byte[] b = null;
        String tipo = null, examen = "";

        try {
            ps = bd.getConexion().prepareStatement("SELECT documento, tipo FROM documento_resultado WHERE id_resultado = ?;");
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                b = rs.getBytes(1);
                tipo = rs.getString("tipo");
            }
            if (b != null) {
                InputStream bos = new ByteArrayInputStream(b);

                int tamanoInput = bos.available();
                byte[] datos = new byte[tamanoInput];
                bos.read(datos, 0, tamanoInput);

                //Detectar Extension del Blob
                OutputStream out = new FileOutputStream("C:\\Resultados\\examen." + tipo + "");
                out.write(datos);
                examen = "examen." + tipo;

                out.close();
                bos.close();
            }

            //abrir archivo
            ps.close();
            rs.close();
            bd.desconectar();

        } catch (IOException | NumberFormatException | SQLException ex) {
            System.out.println("Error al abrir archivo PDF " + ex.getMessage());
        }

        return examen;
    }

    public boolean existe_archivo(int id) {

        BDConex bd = new BDConex();
        PreparedStatement ps = null;
        ResultSet rs = null;
        byte[] b = null;
        String tipo = null, examen = "";
        boolean existe = false;

        try {
            ps = bd.getConexion().prepareStatement("SELECT documento, tipo FROM documento_resultado WHERE id_resultado = ?;");
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                existe = true;
            }
            //abrir archivo
            ps.close();
            rs.close();
            bd.desconectar();

        } catch (NumberFormatException | SQLException ex) {

        }

        return existe;
    }

    public ArrayList historial(int id) {

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

                result = bd.consultar("SELECT * FROM resultados r, usuario u WHERE r.id_paciente = " + id + " AND r.id_experto = u.id");
                if (result == null) {
                    lista = null;
                }
                while (result.next()) {
                    m = new modelo();
                    m.setNombre(result.getString("u.nombres"));
                    m.setApellido(result.getString("u.apellidos"));
                    m.setDiagnostico_final(result.getString("r.diagnosticos"));
                    m.setFecha_envio(result.getString("r.fecha_envio"));
                    m.setFecha_diagnostico(result.getString("r.fecha"));
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

    public modelo Buscar(String usuario) {

        ResultSet rs = null;
        BDConex bd = new BDConex();
        modelo m = new modelo();

        rs = bd.consultar("SELECT * FROM usuario WHERE nombre_usu = '" + usuario + "' and borrado = 0");

        try {
            if (rs.next()) {

                m.setNombre(rs.getString("nombres"));
                m.setApellido(rs.getString("apellidos"));
                m.setId_usuario(rs.getInt("id"));

            } else {
                m = null;
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        bd.desconectar();
        return m;

    }

    public void borrarDocumentosViejos() {
        BD.BDConex bd = new BD.BDConex();

        ArrayList<Integer> lista  = idDocumentosViejos(bd);

        if(lista!=null){
            for (int i = 0; i < lista.size(); i++) {
                bd.ejecutar("DELETE FROM documento_resultado WHERE id_resultado ="+lista.get(i)+"");
            }
        }
        
        

        bd.desconectar();

    }

    public ArrayList<Integer> idDocumentosViejos(BDConex bd) {

       ArrayList<Integer> lista = null;
       ResultSet result = null;

        try {

            result = bd.consultar("SELECT * FROM resultados WHERE DATEDIFF( CURDATE( ) , `fecha` ) > 15");
            if (result == null) {
                lista = null;
            }else{
                lista = new ArrayList<Integer>();
            }
            while (result.next()) {
                lista.add(result.getInt("id"));
            }
            

        } catch (SQLException e) {

            System.out.println(e);

        }
        return lista;
    }

}
