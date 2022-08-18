package modelos;

import BD.BDConex;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class operar_reportes {
    
    public ArrayList reporteExpertos() {
        
        ArrayList lista = new ArrayList<>();
        
        BDConex bd = new BDConex();
        PreparedStatement statement = null;
        ResultSet result = null;
        Connection connection;
        
        modelo m;
        connection = bd.getConexion();
        
        try {
            
            if (connection != null) {
                
                result = bd.consultar("SELECT * FROM `usuario` WHERE `tipo_usu`=1 AND borrado=0");
                if (result == null) {
                    lista = null;
                }
                while (result.next()) {
                    m = new modelo();
                    m.setNombre(result.getString("nombres"));
                    m.setApellido(result.getString("apellidos"));
                    m.setCedula(result.getString("cedula"));
                    m.setEdad(result.getInt("edad"));
                    m.setCorreo(result.getString("correo"));
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
    
    public ArrayList reportePacientes() {
        
        ArrayList lista = new ArrayList<>();
        
        BDConex bd = new BDConex();
        PreparedStatement statement = null;
        ResultSet result = null;
        Connection connection;
        
        modelo m;
        connection = bd.getConexion();
        
        try {
            
            if (connection != null) {
                
                result = bd.consultar("SELECT * FROM `usuario` WHERE `tipo_usu`=3 AND borrado=0");
                if (result == null) {
                    lista = null;
                }
                while (result.next()) {
                    m = new modelo();
                    m.setNombre(result.getString("nombres"));
                    m.setApellido(result.getString("apellidos"));
                    m.setCedula(result.getString("cedula"));
                    m.setEdad(result.getInt("edad"));
                    m.setCorreo(result.getString("correo"));
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
    
    public ArrayList reporteAsistentes() {
        
        ArrayList lista = new ArrayList<>();
        
        BDConex bd = new BDConex();
        PreparedStatement statement = null;
        ResultSet result = null;
        Connection connection;
        
        modelo m;
        connection = bd.getConexion();
        
        try {
            
            if (connection != null) {
                
                result = bd.consultar("SELECT * FROM `usuario` WHERE `tipo_usu`=2 AND borrado=0");
                if (result == null) {
                    lista = null;
                }
                while (result.next()) {
                    m = new modelo();
                    m.setNombre(result.getString("nombres"));
                    m.setApellido(result.getString("apellidos"));
                    m.setCedula(result.getString("cedula"));
                    m.setEdad(result.getInt("edad"));
                    m.setCorreo(result.getString("correo"));
                    m.setClave(result.getString("clave"));
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
    
    public ArrayList reporteDiagnosticos() {
        
        ArrayList lista = new ArrayList<>();
        
        BDConex bd = new BDConex();
        PreparedStatement statement = null;
        ResultSet result = null;
        Connection connection;
        
        modelo m;
        connection = bd.getConexion();
        
        try {
            
            if (connection != null) {
                
                result = bd.consultar("SELECT * FROM `diagnostico` WHERE borrado=0");
                if (result == null) {
                    lista = null;
                }
                while (result.next()) {
                    m = new modelo();
                    m.setD_nombre(result.getString("nombre"));
                    m.setD_descripcion(result.getString("descripcion"));
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
