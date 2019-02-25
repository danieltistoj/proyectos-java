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
public class Cola {
     Nodo tope=null;
    Nodo fondo = null;
    int size=0;
    
    public void push(int x){
      
        if(Vacia()){
            Nodo nuevo = new Nodo(x);
            tope = nuevo;
            fondo = nuevo;
             size++;
        }
        else{
          
            Nodo nuevo = new Nodo(x);
            fondo.setSiguiente(nuevo);
            fondo = nuevo;
              size++;
            }
     
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
        return(tope==null)?true:false;
    }
    
}
