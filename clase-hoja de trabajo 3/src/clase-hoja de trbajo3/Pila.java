/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.hoja.de.trabajo.pkg3;

/**
 *
 * @author Usuario
 */
public class Pila {
    
    Nodo tope = null;
    int size=0;
    
    
     public void push(int e){
        if (tope == null){
            tope = new Nodo(e);
        }
        else {
            Nodo aux = tope;
            Nodo nuevo = new Nodo(e);
            nuevo.setSiguiente(aux);
            tope = nuevo;
        }
        size++;
    }
     
     public int Tope(){
         return tope.getDato();
     }
   
     public void Desapilar(){
         Nodo aux = tope;
         tope = aux.getSiguiente();
         aux = null;
     }
     
    public boolean Vacia(){
        return (tope == null)?true:false;
    }
    
    
   
    
}
