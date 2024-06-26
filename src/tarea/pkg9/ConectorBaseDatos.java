/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg9;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.*;
import java.util.ArrayList;
import javax.management.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author amjpa
 */
public class ConectorBaseDatos {

    public ConectorBaseDatos() {
    }

    // C
    public int altas(int codigo, String nombre, int id_localizacion, int id_manager) {
        int resultado = 0;

        try {
            //Cargo el driver para establecer conexión con la BBDD.
            Class.forName("com.mysql.jdbc.Driver");

            //Creo la conexión con la BBDD
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/75139418M", "root", "");
            String sql = "insert into Departamentos values (?, ?, ?, ?) ";

            //Preparo el statement para ejecutar la sentencia SQL.
            PreparedStatement sentencia = cn.prepareStatement(sql);

            sentencia.setInt(1, codigo);
            sentencia.setString(2, nombre);
            sentencia.setInt(3, id_localizacion);
            sentencia.setInt(4, id_manager);

            //ejecuto la sentencia.
            resultado = sentencia.executeUpdate();

            //Cierro la conexion.
            sentencia.close();
            cn.close();

        } catch (Exception e) {
            System.out.println("Problema al conectar con la base de datos." + e.getMessage());
        }
        return resultado;
    }

    // R
    public ArrayList<persona> mostrar() {
        
        //ArrayList donde guardo los resultados de la consulta de la BBDD.  
        ArrayList<persona> respuesta = new ArrayList<persona>();

        try {
            
            //Cargo el driver para establecer conexión con la BBDD.
            Class.forName("com.mysql.jdbc.Driver");
            
            //Creo la conexión con la BBDD
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/75139418M", "root", "");
            
            //Defino la consulta de SQL y la ejecuto guardandola en resultado.
            Statement sentencia = conexion.createStatement();
            String query = "select * from Departamentos";

            ResultSet resultado = sentencia.executeQuery(query);

            while (resultado.next()) {
                persona d = new persona();
                
                //Establece los atributos del objeto persona usando los valores obtenidos del ResultSet.
                d.setCodigo(resultado.getInt(1));
                d.setNombre(resultado.getString(2));
                d.setId_localizacion(resultado.getInt(3));
                d.setId_manager(resultado.getInt(4));

                //Añade el objeto persona a la lista respuesta.
                respuesta.add(d);
            }

        } catch (SQLException e) {
            System.out.println("Error de Sql" + e.getMessage());
        } catch (ClassNotFoundException e) {
            Logger.getLogger(ConectorBaseDatos.class.getName()).log(Level.SEVERE, null, e);
        } catch (Exception e) {
            System.out.println("Error general" + e.getMessage());
        }
        return respuesta;
    }

    // U
    public int actualizar(int codigo, String nombre, int id_localizacion, int id_manager) {
        int filasAfectadas = 0;
        try {
            //Cargo el driver para establecer conexión con la BBDD.
            Class.forName("com.mysql.jdbc.Driver");
            
             //Creo la conexión con la BBDD
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/75139418M", "root", "");

            //Defino la consulta de SQL y la ejecuto guardandola en resultado.
            String query = "Update Departamentos set nombre = ?, id_localizacion = ?, id_manager =? where codigo = ?";
            PreparedStatement sentencia = conexion.prepareStatement(query);

             //Establece los parametros de la consulta.
            sentencia.setString(1, nombre);
            sentencia.setInt(2, id_localizacion);
            sentencia.setInt(3, id_manager);
            sentencia.setInt(4, codigo);

            //ejecuto la consulta de actualización.
            filasAfectadas = sentencia.executeUpdate();
            
            //cierro la sentencia y la conexión.
            sentencia.close();
            conexion.close();

        } catch (Exception e) {
            System.out.println("Error al actualizar");
        }
        return filasAfectadas;
    }

    public int borrado(int codigo) {
        int resultado = 0;
     
        //Verifica si el código es cero, y muestra un mensaje de error si es así, y retorna 0.
        if (codigo == 0) {
            JOptionPane.showMessageDialog(null, "Código inválido. Introduzca un número válido.");
            return 0;
        }

        try {
            //Cargo el driver para establecer conexión con la BBDD.
            Class.forName("com.mysql.jdbc.Driver");
            
            //Creo la conexión con la BBDD
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/75139418M", "root", "");
            
             //Defino la consulta de SQL .
            Statement sentencia = conexion.createStatement();
            
            //Verifica si el usuario quiere borrar el registro.
            String aviso = "¿Seguro que desea borrar?";
            int verificacion = JOptionPane.showConfirmDialog(null, aviso, "Advertencia", JOptionPane.OK_CANCEL_OPTION);

            //Si se pulsa ok en la ventana emergente y borra.
            if (verificacion == JOptionPane.OK_OPTION) {
                String query = "delete from Departamentos where codigo = " + codigo;
                resultado = sentencia.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Se ha borrado correctamente.");

                return resultado;

                //si cancelas el borrado no borra nada.
            } else {
                JOptionPane.showMessageDialog(null, "Se ha cancelado.");
            }
            //cierro la sentencia y la conexión.
            sentencia.close();
            conexion.close();

        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Formato inválido.");
            
        } catch (Exception e) {
            System.out.println("Error al borrar." + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al borrar el registro");
        }
        return 0;
    }

}

