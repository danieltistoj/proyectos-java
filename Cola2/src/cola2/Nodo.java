/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola2;

/**
 *
 * @author Usuario
 */
public class Nodo {
    private String Nombre;
    private int Edad;
    private int Carnet;
    Nodo siguiente;
    
    public Nodo(String nombre, int edad, int carnet){
        Nombre = nombre;
        Carnet = carnet;
        Edad = edad;
    }
    
    public String ObtenerNombre(){
        return Nombre;
    }
    public int ObtenerEdad(){
        return Edad;
    }  
    public int ObtenerCarnet(){
        return Carnet;
    }
    public Nodo ObtenerSiguiente(){
        return siguiente;
    }
    public void EnlazarSiguiente(Nodo x){
        siguiente = x;
    }
   
}
