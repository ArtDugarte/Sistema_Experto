package modelos;

import javax.swing.JOptionPane;

public class operar_usuarios {

    public void Crear(String ci, String nombre, String apellido, String pregunta, String respuesta, String clave, int tipo_usu) {
        
        BD.BDConex bd = new BD.BDConex();
        
        int op = 0, id;
        id = 0;
        

        op = bd.ejecutar("INSERT INTO usuario (nombre_usu, nombres, apellidos, cedula, clave, pregunta_segu, respuesta_segu, tipo_usu, borrado)\n" +
                        "SELECT * FROM (SELECT '"+ ci +"' as nombre_usu, '"+ nombre +"' as nombres, '"+ apellido +"' as apellidos, '"+ ci +"' as cedula,"
                        + "'"+ clave +"' as clave, '"+ pregunta +"' as pregunta_segu, '"+ respuesta +"' as respuesta_segu, "+ tipo_usu +" as tipo, 0 as borrado)"
                        + "AS tmp WHERE NOT EXISTS (SELECT cedula FROM usuario WHERE cedula = '"+ ci +"') LIMIT 1;");

        if (op > 0) {

            JOptionPane.showMessageDialog(null, "     ¡Creación Exitosa!", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "¡Ocurrio un error en la operación! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }

        bd.desconectar();
    }
}
