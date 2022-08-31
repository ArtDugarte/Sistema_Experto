package modelos;

import BD.BDConex;
import globales.mensajes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class operar_diagnosticos {

    mensajes msg = new mensajes();

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

            msg.mensaje("        ¡Creación exitosa!", "exito");
        } else {
            msg.mensaje("¡Ocurrió un error en la operación!", "error");
        }

        bd.desconectar();
        return op;
    }

    public int Modificar(int id, String nombre, String descripcion, ArrayList<String> valores, ArrayList<Boolean> resultado_seleccionado) {
        int op = 0;
        BDConex bd = new BDConex();

        op = bd.ejecutar("UPDATE diagnostico SET nombre='" + nombre + "', descripcion='" + descripcion + "' "
                + "WHERE id = " + id + " AND borrado = 0");
        if (op > 0) {
            op = 0;
            for (int i = 0; i < valores.size(); i++) {
                int aux;
                if (resultado_seleccionado.get(i)) {
                    aux = 1;
                } else {
                    aux = 0;
                }
                if (i < 7) {
                    op = bd.ejecutar("UPDATE parametros_diagnostico SET valor='" + valores.get(i) + "', resultado_seleccionado=" + resultado_seleccionado.get(i) + " "
                            + "WHERE id_diagnostico = " + id + " AND parametro='s" + (i + 1) + "'");
                } else {
                    op = bd.ejecutar("UPDATE parametros_diagnostico SET valor='" + valores.get(i) + "', resultado_seleccionado=" + resultado_seleccionado.get(i) + " "
                            + "WHERE id_diagnostico = " + id + " AND parametro='o" + (i - 6) + "'");
                }
            }
        }

        if (op > 0) {

            msg.mensaje("      ¡Modificación exitosa!", "exito");
        } else {

            msg.mensaje("     ¡Error en la modificación!", "error");
        }

        bd.desconectar();
        return op;
    }

    public int Borrar(int id) {
        int op = 0;
        BDConex bd = new BDConex();

        op = bd.ejecutar("UPDATE diagnostico SET borrado=1 "
                + "WHERE id = " + id + " AND borrado = 0");

        if (op > 0) {

            msg.mensaje("         ¡Borrado exitoso!", "exito");
        } else {

            msg.mensaje("      ¡Error en el borrado!", "error");
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

            result = bd.consultar("SELECT " + campo + " FROM parametros_diagnostico WHERE id_diagnostico=" + id + "");

            while (result.next()) {

                lista.add(result.getString(campo));
            }

        } catch (SQLException e) {

            System.out.println(e);

        }
        return lista;
    }

    public ArrayList<String> obtener_arraylist(String campo, BDConex bd, int id, int inicio, int fin) {

        ArrayList<String> aux = new ArrayList<String>();
        ArrayList<String> lista = new ArrayList<String>();
        ResultSet result = null;

        try {

            result = bd.consultar("SELECT " + campo + " FROM parametros_diagnostico WHERE id_diagnostico=" + id + "");

            while (result.next()) {

                aux.add(result.getString(campo));
            }

            for (int i = inicio; i < fin; i++) {
                lista.add(aux.get(i));
            }

        } catch (SQLException e) {

            System.out.println(e);

        }
        return lista;
    }

    public ArrayList<modelo> obtener_posibles_diagnosticos_sangre() {

        ArrayList<modelo> lista = new ArrayList<modelo>();
        BDConex bd = new BDConex();
        ResultSet result = null;
        Connection connection;
        ArrayList<String> aux = null;

        modelo m;
        connection = bd.getConexion();

        try {

            if (connection != null) {

                result = bd.consultar("SELECT * FROM diagnostico WHERE borrado = 0");

                while (result.next()) {
                    m = new modelo();

                    aux = obtener_arraylist("resultado_seleccionado", bd, result.getInt("id"));
                    for (int i = 7; i < 24; i++) {
                        if (Integer.parseInt(aux.get(i)) == 1) {
                            m = null;
                        }
                    }
                    if (m != null) {
                        m.setD_nombre(result.getString("nombre"));
                        m.setD_descripcion(result.getString("descripcion"));
                        m.setIdDiagnostico(result.getInt("id"));
                        m.setD_seleccionados(obtener_arraylist("resultado_seleccionado", bd, result.getInt("id"), 0, 7));
                        m.setD_valores(obtener_arraylist("valor", bd, result.getInt("id"), 0, 7));
                        lista.add(m);
                    }

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

    public ArrayList<modelo> obtener_posibles_diagnosticos_orina() {

        ArrayList<modelo> lista = new ArrayList<modelo>();
        BDConex bd = new BDConex();
        ResultSet result = null;
        Connection connection;
        ArrayList<String> aux = null;

        modelo m;
        connection = bd.getConexion();

        try {

            if (connection != null) {

                result = bd.consultar("SELECT * FROM diagnostico WHERE borrado = 0");

                while (result.next()) {
                    m = new modelo();

                    aux = obtener_arraylist("resultado_seleccionado", bd, result.getInt("id"));
                    for (int i = 0; i < 7; i++) {
                        if (Integer.parseInt(aux.get(i)) == 1) {
                            m = null;
                        }
                    }
                    if (m != null) {
                        m.setD_nombre(result.getString("nombre"));
                        m.setD_descripcion(result.getString("descripcion"));
                        m.setIdDiagnostico(result.getInt("id"));
                        m.setD_seleccionados(obtener_arraylist("resultado_seleccionado", bd, result.getInt("id"), 7, 24));
                        m.setD_valores(obtener_arraylist("valor", bd, result.getInt("id"), 7, 24));
                        lista.add(m);
                    }

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

    public ArrayList<modelo> obtener_posibles_diagnosticos() {

        ArrayList<modelo> lista = new ArrayList<modelo>();
        BDConex bd = new BDConex();
        ResultSet result = null;
        Connection connection;
        ArrayList<String> aux = null;

        modelo m;
        connection = bd.getConexion();

        try {

            if (connection != null) {

                result = bd.consultar("SELECT * FROM diagnostico WHERE borrado = 0");

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
}
