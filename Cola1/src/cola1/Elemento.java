/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola1;

/**
 *
 * @author Usuario
 */
public class Elemento {
    private String Nombre;
    private int Carnet;
    Elemento siguiente;
    
    public Elemento(String nombre, int carnet){
        Nombre = nombre;
        Carnet = carnet;
        
    }
    
    public String ObtenerNombre(){
        return Nombre;
    }
    public int ObtenerCarnet(){
        return Carnet;
    }
    public Elemento ObtenerSiguiente(){
        return siguiente;
    }
    public void EnlazarSiguiente(Elemento x){
        siguiente = x;
    }
    
    
}
