package modelos;

import BD.BDConex;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class operar_usuarios {

    public int Ingresar(String usuario, String clave) {

        ResultSet rs = null;
        BDConex bd = new BDConex();
        int tipo = 0;

        rs = bd.consultar("SELECT tipo_usu FROM usuario WHERE nombre_usu = '" + usuario + "' AND clave = '" + clave + "' AND borrado=0");

        try {
            if (rs.next()) {
                tipo = rs.getInt("tipo_usu");
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        bd.desconectar();
        return tipo;

    }

    public void Crear(String ci, String nombre, String apellido, String pregunta, String respuesta, String clave, int tipo_usu) {

        BD.BDConex bd = new BD.BDConex();

        int op = 0, id;
        id = 0;

        op = bd.ejecutar("INSERT INTO usuario (nombre_usu, nombres, apellidos, cedula, clave, pregunta_segu, respuesta_segu, tipo_usu, borrado)\n"
                + "SELECT * FROM (SELECT '" + ci + "' as nombre_usu, '" + nombre + "' as nombres, '" + apellido + "' as apellidos, '" + ci + "' as cedula,"
                + "'" + clave + "' as clave, '" + pregunta + "' as pregunta_segu, '" + respuesta + "' as respuesta_segu, " + tipo_usu + " as tipo, 0 as borrado)"
                + "AS tmp WHERE NOT EXISTS (SELECT cedula FROM usuario WHERE cedula = '" + ci + "') LIMIT 1;");

        if (op > 0) {

            JOptionPane.showMessageDialog(null, "     ¡Creación Exitosa!", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "¡Ocurrio un error en la operación! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }

        bd.desconectar();
    }

    public modelo Buscar(String usuario) {

        ResultSet rs = null;
        BDConex bd = new BDConex();
        int tipo = 0;
        modelo m = new modelo();

        rs = bd.consultar("SELECT * FROM usuario WHERE nombre_usu = '" + usuario + "' AND borrado=0");

        try {
            if (rs.next()) {
                
                m.setNombre(rs.getString("nombres"));
                m.setApellido(rs.getString("apellidos"));
                m.setPregunta(rs.getString("pregunta_segu"));

            } else {
                m = null;
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        bd.desconectar();
        return m;

    }

    public void Modificar(String usuario, String respuesta, String clave) {
        int op = 0;
        BDConex bd = new BDConex();

        op = bd.ejecutar("UPDATE usuario SET clave='" + clave + "' WHERE nombre_usu = '" + usuario + "' AND respuesta_segu ='" + respuesta + "' AND borrado = 0");

        if (op > 0) {

            JOptionPane.showMessageDialog(null, "¡Contraseña modificada con Éxito!", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
        } else {

            JOptionPane.showMessageDialog(null, "¡La respuesta de seguridad no es correcta! "
                    + "\n              Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }

        bd.desconectar();
    }
    
        public void Modificar(String usuario, String respuesta, String clave_vieja, String clave_nueva, String pregunta) {
        int op = 0;
        BDConex bd = new BDConex();

        op = bd.ejecutar("UPDATE usuario SET clave='" + clave_nueva + "', pregunta_segu = '"+ pregunta +"', respuesta_segu = '"+ respuesta +"' "
                + "WHERE nombre_usu = '" + usuario + "' AND clave ='" + clave_vieja + "' AND borrado = 0");

        if (op > 0) {

            JOptionPane.showMessageDialog(null, "¡Usuario modificado con Éxito!", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
        } else {

            JOptionPane.showMessageDialog(null, "¡Contraseña actual incorrecta! "
                    + "\n          Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }

        bd.desconectar();
    }
}
