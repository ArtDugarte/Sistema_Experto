package modelos;

import BD.BDConex;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
                + "VALUES (" + id_paciente + "," + id_experto + " , '" + diagnostico + "',CURDATE(), '"+fecha_envio+"')");

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

}
