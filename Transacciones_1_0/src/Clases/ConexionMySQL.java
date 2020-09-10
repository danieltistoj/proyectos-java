/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ConexionMySQL extends ConexionBD{
public ConexionMySQL(String puerto,String baseDatos,String usuario,String password){
    //com.mysql.cj.jdbc.Driver
        super("com.mysql.jdbc.Driver","jdbc:mysql://localhost"+":"+puerto+"/"+baseDatos,usuario,password);
    }
    public ConexionMySQL(String baseDatos,String usuario,String password){
        super("com.mysql.jdbc.Driver","jdbc:mysql://localhost"+"/"+baseDatos);
    }
}