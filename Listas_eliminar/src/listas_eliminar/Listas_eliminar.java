/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_eliminar;

/**
 *
 * @author Usuario
 */
public class Listas_eliminar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista = new Lista();
        
         lista.InsertarFondo(1);
         lista.InsertarFondo(5);
         lista.InsertarFondo(7);
         lista.InsertarFondo(2);
         lista.InsertarFondo(0);
         
         lista.Mostrar();
         System.out.println("\n");
         lista.Eliminar(7);
         lista.Mostrar();
         System.out.println("\n");
         lista.Eliminar(1);
         lista.Mostrar();
         System.out.println("\n");
         lista.Eliminar(0);
         lista.Mostrar();
         System.out.println("\n");
         lista.Eliminar(5);
         lista.Mostrar();
         System.out.println("\n");
         lista.Eliminar(2);
         if(lista.Vacia()){
             System.out.println("La lista esta vacia");
         }
         System.out.println("\n");
    }
    
}
