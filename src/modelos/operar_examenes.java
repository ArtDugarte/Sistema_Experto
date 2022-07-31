package modelos;

import java.sql.Date;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class operar_examenes {

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
}
