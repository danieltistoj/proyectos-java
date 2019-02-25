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
public class Pila {
    Nodo tope=null;
    int size=0;
    boolean vacia = true;
    
     public void nuevoElemento(int x){
        if (tope == null){
            tope = new Nodo(x);
        }
        else {
            Nodo aux = tope;
            Nodo nuevo = new Nodo(x);
            nuevo.enlazarSiguiente(aux);
            tope = nuevo;
        }
        size++;
    }
     public void Desapilar(){
         Nodo aux = tope;
         tope=aux.obtenerSiguiente();
         aux=null;
     }
     public int getRetornarCima(){
         Nodo aux = tope;
         return aux.obtenerValor();
     }
    
     public void getVaciar(){
         Nodo aux = tope;
         do{
            Desapilar();
            size--;
         }while(size!=0);
         tope=aux;
     }
     
     public int Size(){
         return size;
     }
     public void MostrarElementos(){
        Nodo aux = tope;
        if(estaVacia()){
            System.out.println("No hay elementos");
        }
        else if(Size()==1){
           System.out.println(aux.obtenerValor());
        }
        else {
            while(aux!=null){
                System.out.println(aux.obtenerValor());
                aux=aux.obtenerSiguiente();
            }
        }
                
     }
   
     public boolean estaVacia(){
        return (tope == null)?true:false;
    }
    
}
