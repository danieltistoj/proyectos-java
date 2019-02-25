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
public class Nodo {
    private Integer valor;
    private Nodo siguiente;
    
    public void setValor(Integer numero){
        valor=numero;
    }
    
    public void setSiguiente(Nodo sig){
        siguiente=sig;
    }
    
    public Integer getValor(){
        return valor;
    }
    
    public Nodo getSiguiente(){
        return siguiente;
    }
}
