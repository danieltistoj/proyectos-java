/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Arboles2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
           Arbol arbol = new Arbol();
           arbol.Insertar(10);
           arbol.Insertar(3);
           arbol.Insertar(9);
           arbol.Insertar(7);
           arbol.Insertar(11);
                       
                       System.out.println("............altura del arbol..........");
                       int altura = arbol.getAltura(arbol.getRaiz());
                       System.out.println("la altura del arbol es: "+altura);
           
                       System.out.println("............................................");
                       System.out.println("se ingresa el numero 9 para ver a qur nivel esta");
                       Nodo aux = arbol.Buscar(9);
                       if(aux!=null){
                           System.out.println("la altura del numero es: "+arbol.getConta());
                       }
                       else{
                           System.out.println("El numero no existe");
                       }
                   
                      System.out.println("....................................................."); 
                      System.out.println("se ingresa 11 para ver la altura de sus hijos");
                      Nodo aux1 = arbol.Buscar(10);
                       if(aux1.getHijo_der()!=null){
                           System.out.println("La altura del hijo derecho es: "+aux1.getHijo_der().getAltura());
                       }
                       if(aux1.getHijo_izq()!=null){
                           System.out.println("La altura del hijo izquierdo es: "+aux1.getHijo_izq().getAltura());
                       }
          
        
    }
    
}
