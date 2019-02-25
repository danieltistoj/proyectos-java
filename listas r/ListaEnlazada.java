/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenlazada;

/**
 *
 * @author datos
 */
public class ListaEnlazada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista lista = new Lista();
        System.out.println("Listas Enlazadas");
        lista.insertar(5);
        System.out.println(lista.Mostrar());
        lista.insertar(1);
        System.out.println(lista.Mostrar());
        lista.insertar(6);
        System.out.println(lista.Mostrar());
        lista.insertar(2);
        System.out.println(lista.Mostrar());       
        lista.insertar(8);
        System.out.println(lista.Mostrar());
        lista.insertar(7);
        System.out.println(lista.Mostrar());
    }
    
}
