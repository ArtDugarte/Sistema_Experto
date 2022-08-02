package modelos;

import BD.BDConex;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

    public void Crear(int id_paciente, byte[] archivo_subido) {

        BD.BDConex bd = new BD.BDConex();

        int op = 0, id;
        id = 0;
        PreparedStatement ps = null;
        String sql = "INSERT INTO examenes (id_paciente, documento, estado, fecha) values(?, ?, ?, ?)";

        try {

            ps = bd.getConexion().prepareStatement(sql);
            ps.setInt(1, id_paciente);
            ps.setBytes(2, archivo_subido);
            ps.setInt(3, 0);
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
                + "VALUES("+ ultimo_id +", "+ hematies +", "+ hemoglobina +", "+ hematocritos +", "+ plaquetas +", "+ leucocitos +", "+ segmentados +", "+ linfocitos +")");

        if (op > 0) {

            JOptionPane.showMessageDialog(null, "     ¡Creación Exitosa!", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "¡Ocurrio un error en la operación! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }

        bd.desconectar();
    }
    
    public void SubirOrina(String aspecto, String color, String reaccion, float densidad, float leucocitos, float hematies, String piocitos, String bacterias, float e_plano, 
        String proteinas, String glucosa, String c_cetonico, String p_biliares, String urobilinogelen, String bilirrubina, String nitritos) {

        int ultimo_id = idUltimoExamen();
        BD.BDConex bd = new BD.BDConex();

        int op = 0;

        op = bd.ejecutar("INSERT INTO orina (aspecto, color, reaccion, densidad, leucocitos, hematies, piocitos, bacterias, e_plano, \n" +
"        proteinas, glucosa, c_cetonico, p_biliares, urubilinogelen, bilirrubina, nutritos)\n"
                + "VALUES("+ ultimo_id +", "+ aspecto +", "+ color +", "+ reaccion +", "+ densidad +", "+ leucocitos +", "+ hematies +", "+ piocitos +", "+ bacterias +")"
                + ", "+ e_plano +", "+ proteinas +", "+ glucosa +", "+ c_cetonico +", "+ p_biliares +", "+ urobilinogelen +", "+ bilirrubina +", "+ nitritos +"");

        if (op > 0) {

            JOptionPane.showMessageDialog(null, "     ¡Creación Exitosa!", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "¡Ocurrio un error en la operación! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }

        bd.desconectar();
    }
}
