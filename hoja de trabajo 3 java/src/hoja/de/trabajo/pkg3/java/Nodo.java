/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja.de.trabajo.pkg3.java;

/**
 *
 * @author Usuario
 */
public class Nodo {
    private int valor;
    Nodo siguiente;
    public Nodo(int x){
        valor = x;
    }
    public Nodo obtenerSiguiente(){
        return siguiente;
    }
    public int obtenerValor(){
        return valor;
    }
    public void enlazarSiguiente(Nodo x){
        siguiente=x;
    }
   
}
