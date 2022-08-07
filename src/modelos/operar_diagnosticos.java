package modelos;

import BD.BDConex;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class operar_diagnosticos {

    public int idUltimoDiagnostico() {

        ResultSet rs = null;
        BDConex bd = new BDConex();
        int id = 0;

        rs = bd.consultar("SELECT MAX(id) AS id FROM diagnostico");

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

    public int Crear(String nombre, String descripcion) {

        BD.BDConex bd = new BD.BDConex();

        int op = 0, id;
        id = 0;

        op = bd.ejecutar("INSERT INTO diagnostico (nombre, descripcion, borrado)\n"
                + "SELECT * FROM (SELECT '" + nombre + "' as nombre, '" + descripcion + "' as descripcion, 0 as borrado)"
                + "AS tmp WHERE NOT EXISTS (SELECT nombre FROM diagnostico WHERE nombre = '" + nombre + "' AND borrado=0) LIMIT 1;");

        if (op > 0) {

            JOptionPane.showMessageDialog(null, "     ¡Creación Exitosa!", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "¡Ocurrio un error en la operación! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }

        bd.desconectar();
        return op;
    }

    public void parametros_diagnostico_sangre(ArrayList<String> valores, ArrayList<Boolean> resultado_seleccionado) { //Cuando algunos valores no importan

        int op = 0, id;
        id = idUltimoDiagnostico();
        BD.BDConex bd = new BD.BDConex();
        for (int i = 0; i < valores.size(); i++) {

            op = bd.ejecutar("INSERT INTO parametros_diagnostico(id_diagnostico, parametro, valor, resultado_seleccionado) VALUES "
                    + "(" + id + ",'s" + (i + 1) + "','" + valores.get(i) + "', " + resultado_seleccionado.get(i) + ")");
        }

        bd.desconectar();
    }

    public void parametros_diagnostico_orina(ArrayList<String> valores, ArrayList<Boolean> resultado_seleccionado) { //Cuando algunos valores no importan

        int op = 0, id;
        id = idUltimoDiagnostico();
        BD.BDConex bd = new BD.BDConex();
        for (int i = 0; i < valores.size(); i++) {

            op = bd.ejecutar("INSERT INTO parametros_diagnostico(id_diagnostico, parametro, valor, resultado_seleccionado) VALUES "
                    + "(" + id + ",'o" + (i + 1) + "','" + valores.get(i) + "', " + resultado_seleccionado.get(i) + ")");
        }

        bd.desconectar();
    }

    public ArrayList<modelo> diagnosticosExistentes() {

        ArrayList<modelo> lista = new ArrayList<modelo>();
        BDConex bd = new BDConex();
        ResultSet result = null;
        Connection connection;

        modelo m;
        connection = bd.getConexion();

        try {

            if (connection != null) {

                result = bd.consultar("SELECT * FROM diagnostico WHERE borrado=0");
                m = new modelo();
                m.setD_nombre("--DIAGNOSTICOS EXISTENTES--");
                m.setD_descripcion("");
                m.setIdDiagnostico(0);
                lista.add(m);

                while (result.next()) {
                    m = new modelo();
                    m.setD_nombre(result.getString("nombre"));
                    m.setD_descripcion(result.getString("descripcion"));
                    m.setIdDiagnostico(result.getInt("id"));
                    m.setD_seleccionados(obtener_arraylist("resultado_seleccionado", bd, result.getInt("id")));
                    m.setD_valores(obtener_arraylist("valor", bd, result.getInt("id")));
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

    public ArrayList<String> obtener_arraylist(String campo, BDConex bd, int id) {

        ArrayList<String> lista = new ArrayList<String>();
        ResultSet result = null;

        try {

            result = bd.consultar("SELECT "+ campo +" FROM parametros_diagnostico WHERE id_diagnostico="+id+"");

            while (result.next()) {
                
               lista.add(result.getString(campo)); 
            }

        } catch (SQLException e) {

            System.out.println(e);

        }
        return lista;
    }
}
