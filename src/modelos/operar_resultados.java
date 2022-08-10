package modelos;

import BD.BDConex;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
                m.setFecha_envio(rs.getString("r.fecha_envio"));
                m.setFecha_diagnostico(rs.getString("r.fecha"));
                m.setDignostico_final(rs.getString("r.diagnosticos"));
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
}
