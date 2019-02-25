/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l.h3;

/**
 *
 //A
 */
public class Cola {
    Nodo tope=null;
    Nodo fondo=null;
    int size=0;
    public void Encolar(int x){
        Nodo nuevo = new Nodo(x);
        if(Vacia()){
            tope = nuevo;
            fondo = nuevo;
            
        }
        else{
            fondo.setSiguiente(nuevo);
            fondo = nuevo;
        }
        size++;
    }
    public void Frente(){
        if(Vacia()){
             System.out.println("Vacia");
        }
        else{
        System.out.println(tope.getDato());
        }
    }
    public int size(){
        return size;
    }
    public void Vaciar(){
        if(Vacia()){
            System.out.println("Vacia");
        }
        else{
            while(size!=0){
                Desencolar();
            }
        }
    }
    public void Desencolar(){
        if(Vacia()){
            System.out.println("Vacia");
        }
        else{
           Nodo aux = tope;
           tope = aux.getSiguiente();
           aux =null;
           size--;
        }
    }
    
    public boolean Vacia(){
        return(tope==null)?true:false;
    }
     
}
