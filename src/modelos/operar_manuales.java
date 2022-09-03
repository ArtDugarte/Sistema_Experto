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


public class operar_manuales {
    
        public String ejecutar_archivo(int id) {

        BDConex bd = new BDConex();
        PreparedStatement ps = null;
        ResultSet rs = null;
        byte[] b = null;
        String  MANUAL = "";

        try {
            ps = bd.getConexion().prepareStatement("SELECT documento FROM manual WHERE id = ?;");
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                b = rs.getBytes(1);
            }
            if (b != null) {
                InputStream bos = new ByteArrayInputStream(b);

                int tamanoInput = bos.available();
                byte[] datos = new byte[tamanoInput];
                bos.read(datos, 0, tamanoInput);

                //CAMBIAR JPG POR PDF
                OutputStream out = new FileOutputStream("C:\\SEDIPG\\MANUAL.pdf"); 
                out.write(datos);
                MANUAL = "MANUAL.pdf";

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

        return MANUAL;
    }
    
}
