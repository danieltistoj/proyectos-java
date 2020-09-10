/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ConexionBD {
    private Connection conexion;//Se utiliza para instanciar un objeto en el cual se inviara la cadena de conexion
    private Statement sentencia;//Se utiliza para ejecutar la instruccion o consulta
    private ResultSet resultSet;//Se utiliza para recibir los datos resultado de la instruccion o consulta 
    /*Este constructor es utilizado cuando el usuario necesita conectarse al motor de base de datos con un nombre de usuario y una contrasena*/
    public ConexionBD(String claseNombre, String cadenaConexion, String usuario, String contrasena) {
        try {
            Class.forName(claseNombre);
            conexion = DriverManager.getConnection(cadenaConexion, usuario, contrasena);

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("error");
            System.out.println(ex.getMessage());
        }
    }

    /*Este constructor es utilizado cuando el usuario no necesita un nombre de usuario ni una contrasena, solo la direccion de Driver y la cadena de conexion*/
    public ConexionBD(String claseNombre, String cadenaConexion) {
        try {
            Class.forName(claseNombre);
            conexion = DriverManager.getConnection(cadenaConexion);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("error");
            System.out.println(ex.getMessage());
        }
    }

    public void EjecutarConsulta(String consulta) {
        try {
            sentencia = conexion.createStatement();//Se crea el objeto sentencia que es el encargado de enviar la consulta. 
            resultSet = sentencia.executeQuery(consulta);// se hace la consulta y el resultSet lo guarda. Se debe de usar el Query es solo para consultas "SELECT"
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
        }
    }

    public void EjecutarInstruccion(String Instruccion) {
        int filas = 0;
        try {
            sentencia = conexion.createStatement();//Se crea el objeto sentencia que es el encargado de inviar la instruccion
            filas = sentencia.executeUpdate(Instruccion);//Se enviar la instruccion y el resultSet guarda los datos. Se debe de enviar el Update que se utiliza para: INSERT, DELETE, UPDATE, REPLACE y TRUNCATE
            //El .executeUpdate devuelve el numero de registros modificados. 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
        }
    }
 

}
