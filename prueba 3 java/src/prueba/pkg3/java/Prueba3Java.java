/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.pkg3.java;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Prueba3Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       Pila pila=new Pila(3);
       System.out.println(pila.empty());
       pila.push("jose");
       System.out.println(pila.peek());
       System.out.println(pila.empty());
       System.out.println(pila.getPop());
       System.out.println(pila.empty());
       
    }
    
}
