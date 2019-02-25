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
public class Nodo {
    Object valor;
    Nodo siguiente;
    public Nodo(Object valor){
        this.valor = valor;
        this.siguiente = null;
    }
    
    public void enlazarSiguinete(Nodo n){
        siguiente  = n;
    }
    public Nodo obtenerSiguiente(){
        return siguiente; 
    }
    public Object obtenerValor(){
        return valor;
    }
    
}
