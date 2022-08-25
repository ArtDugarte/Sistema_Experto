package modelos;

import BD.BDConex;
import globales.mensajes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.YEARS;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class operar_usuarios {
    
    private mensajes m = new mensajes();

    public int BuscarID(String usuario) {

        ResultSet rs = null;
        BDConex bd = new BDConex();
        int id = 0;

        rs = bd.consultar("SELECT * FROM usuario WHERE nombre_usu = '" + usuario + "' AND borrado=0");

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

    public String Ingresar(String usuario, String clave) {

        ResultSet rs = null;
        BDConex bd = new BDConex();
        String tipo = "";

        rs = bd.consultar("SELECT tipo_usu, nombres, id FROM usuario WHERE nombre_usu = '" + usuario + "' AND clave = '" + clave + "' AND borrado=0");

        try {
            if (rs.next()) {

                tipo = rs.getInt("id") + "-";
                tipo = tipo + rs.getInt("tipo_usu") + "-";
                tipo = tipo + rs.getString("nombres");
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        bd.desconectar();
        return tipo;
    }

    public void Crear(String ci, String nombre, String apellido, String correo, String fecha, String pregunta, String respuesta, String clave, int tipo_usu) {

        BD.BDConex bd = new BD.BDConex();

        int op = 0, id;
        id = 0;

        op = bd.ejecutar("INSERT INTO usuario (nombre_usu, nombres, apellidos, correo, fecha_nacimiento, cedula, clave, pregunta_segu, respuesta_segu, tipo_usu, borrado)\n"
                + "SELECT * FROM (SELECT '" + ci + "' as nombre_usu, '" + nombre + "' as nombres, '" + apellido + "' as apellidos, '" + correo + "' as correo, '"
                + fecha + "' as fecha_nacimiento, '" + ci + "' as cedula,'" + clave + "' as clave, '" + pregunta + "' as pregunta_segu, '" + respuesta + "' as respuesta_segu, "
                + tipo_usu + " as tipo, 0 as borrado) AS tmp WHERE NOT EXISTS (SELECT cedula FROM usuario WHERE cedula = '" + ci + "') LIMIT 1;");

        if (op > 0) {

            m.mensaje("¡Creación exitosa!", "exito");
        } else {
            m.mensaje("¡Ocurrio un error en la operación!", "error");
        }

        bd.desconectar();
    }

    public modelo Buscar(String usuario) {

        ResultSet rs = null;
        BDConex bd = new BDConex();
        modelo m = new modelo();
        int edad = 0;

        rs = bd.consultar("SELECT * FROM usuario WHERE nombre_usu = '" + usuario + "' AND borrado=0");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        try {
            if (rs.next()) {
                
                m.setNombre(rs.getString("nombres"));
                m.setApellido(rs.getString("apellidos"));
                m.setPregunta(rs.getString("pregunta_segu"));
                m.setTipo_usuario(rs.getInt("tipo_usu"));
                Date date = null;
                try {
                    date = format.parse(rs.getString("fecha_nacimiento"));
                } catch (ParseException ex) {
                    Logger.getLogger(operar_usuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
                String date2 = format.format(date);
                LocalDate currentDate = LocalDate.now();
                LocalDate myDate = LocalDate.parse(date2);
                edad = (int) YEARS.between(myDate, currentDate);
                m.setEdad(edad);
                m.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
                m.setCorreo(rs.getString("correo"));

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

            m.mensaje("¡Contraseña modificada con éxito!", "exito");
        } else {

            m.mensaje("¡La respuesta de seguridad no es correcta!", "error");
        }

        bd.desconectar();
    }

    public void Modificar(String usuario, String correo, String respuesta, String clave_vieja, String clave_nueva, String pregunta) {
        int op = 0;
        BDConex bd = new BDConex();

        op = bd.ejecutar("UPDATE usuario SET clave='" + clave_nueva + "', pregunta_segu = '" + pregunta + "', respuesta_segu = '" + respuesta + "',"
                + "correo = '" + correo + "' "
                + "WHERE nombre_usu = '" + usuario + "' AND clave ='" + clave_vieja + "' AND borrado = 0");

        if (op > 0) {

            m.mensaje("¡Usuario modificado con Éxito!", "exito");
        } else {

            m.mensaje("¡Contraseña actual incorrecta!", "error");
        }

        bd.desconectar();
    }

    public void Modificar(String usuario, String nombre, String apellido, String correo, String fecha, String pregunta, String respuesta, String clave, int tipo_usu) {
        int op = 0;
        BDConex bd = new BDConex();

        op = bd.ejecutar("UPDATE usuario SET clave='" + clave + "', pregunta_segu = '" + pregunta + "', respuesta_segu = '" + respuesta + "', "
                + "nombres='" + nombre + "', apellidos='" + apellido + "', tipo_usu=" + tipo_usu + ", correo='" + correo + "', fecha_nacimiento='" + fecha + "' "
                + "WHERE nombre_usu = '" + usuario + "' AND borrado = 0");
        if (op > 0) {

            m.mensaje("¡Usuario modificado con Éxito!", "exito");
        } else {

            m.mensaje("¡Usuario no encontrado! ", "error");
        }

        bd.desconectar();
    }

    public void Borrar(String usuario) {
        int op = 0;
        BDConex bd = new BDConex();

        op = bd.ejecutar("UPDATE usuario SET borrado=1 WHERE nombre_usu = '" + usuario + "' AND borrado = 0");

        if (op > 0) {

            m.mensaje("¡Usuario borrado con exito!", "exito");
        } else {

            m.mensaje("¡El usuario no existe o ya esta borrado! ", "error");
        }

        bd.desconectar();
    }

    public modelo BuscarUsuarioConExamenPendiente(String cedula) {
        ResultSet rs = null;
        BDConex bd = new BDConex();
        modelo m = new modelo();

        rs = bd.consultar("SELECT u.nombres, u.apellidos, e.id FROM usuario u, examenes e  WHERE e.estado=0 AND e.id_paciente=u.id AND u.cedula='" + cedula + "'");

        try {
            if (rs.next()) {

                m.setNombre(rs.getString("nombres"));
                m.setApellido(rs.getString("apellidos"));
                m.setId_examen(rs.getInt("e.id"));

            } else {
                m = null;
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }

        bd.desconectar();
        return m;
    }

    public modelo BuscarUsuarioConExamenPendienteExperto(String cedula) {
        ResultSet rs = null;
        BDConex bd = new BDConex();
        modelo m = new modelo();

        rs = bd.consultar("SELECT u.nombres, u.apellidos, e.id, u.id, e.fecha FROM usuario u, examenes e  WHERE e.estado=1 AND e.id_paciente=u.id AND u.cedula='" + cedula + "'");

        try {
            if (rs.next()) {

                m.setNombre(rs.getString("nombres"));
                m.setApellido(rs.getString("apellidos"));
                m.setId_usuario(rs.getInt("u.id"));
                m.setId_examen(rs.getInt("e.id"));
                m.setFecha(rs.getString("e.fecha"));

            } else {
                m = null;
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }

        bd.desconectar();
        return m;
    }

}
