/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 Jose Daniel Tistoj
 */
public class Quicksort {

    /**
     * @param args the command
     */
    public static void main(String[] args) {
        Lista lista = new Lista();
        Ordenar ordenar = new Ordenar();
        lista.Insertar(0);
        lista.Insertar(1);
        lista.Insertar(100);
        lista.Insertar(0);
        lista.Insertar(7);
        lista.Insertar(100);
                   
       lista.Mostrar();
       System.out.println("\n");
       lista = ordenar.Ordenar(lista);
       lista.Mostrar();
       System.out.println("\n");
       
    }
    
}
