/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola3;

/**
 *
 * @author Usuario
 */
public class Nodo {
    private String Producto;
    private int Codigo;
    
    Nodo siguiente;
    
    public Nodo(String a, int b){
        Producto = a;
        Codigo = b;
    }
    
    public String ObtenerProducto(){
        return Producto;
        
    }
   
    public int ObtenerCodigo(){
        return Codigo;
    }
    
    public Nodo ObtenerSiguiente(){
        return siguiente;
    }
    public void EnlazarSiguiente(Nodo x){
        siguiente = x;
    }
    
}
