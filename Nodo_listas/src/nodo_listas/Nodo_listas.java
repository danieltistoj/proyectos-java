/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodo_listas;

/**
 *
 * @author Usuario
 */
public class Nodo_listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Nodo primer = new Nodo("ejemplo");
       Nodo segundo = new Nodo(4);
       Nodo tercer = new Nodo("hola");
       
       primer.enlazarSiguinete(segundo);
       primer.obtenerSiguiente().enlazarSiguinete(tercer);
       
       System.out.println(primer
               .obtenerSiguiente()
               .obtenerValor()
       
       );
       
    }
    
}
