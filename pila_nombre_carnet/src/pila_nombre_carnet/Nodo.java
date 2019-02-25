/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila_nombre_carnet;

/**
 *
 * @author Usuario
 */
public class Nodo {
    private String Nombre;
    private int Carnet;
    Nodo siguiente;
    public Nodo(String nombre, int carnet){
        Nombre = nombre;
        Carnet = carnet;
        
    }
    public void enlazarSiguiente(Nodo x){
        siguiente = x;
    }
    public String ObtenerNombre(){
        return Nombre;
    }
    public int ObtenerCarnet(){
        return Carnet;
    }
    public Nodo ObtenerSiguiente(){
        return siguiente;
    }
}
