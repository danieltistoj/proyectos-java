/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodo_pila;

/**
 *
 * @author Usuario
 */
public class Pila {
    String n;
    Nodo tope;
    int size;
    public Pila(){
        tope = null;
    }
    public void nuevoElemento(int e, String n, String c, int x){
        if (tope == null){
            tope = new Nodo(e,n,c,x);
        }
        else {
            Nodo aux = tope;
            Nodo nuevo = new Nodo(e,n,c,x);
            nuevo.enlazarSiguiente(aux);
        }
        size++;
    }
    public boolean estaVacia(){
        return (tope == null)?true:false;
    }
    
    public String getRetornarNombre(){
        return n;
        
    }
    
    public void setbuscarEstudiante(int x){
        Nodo aux = tope;
        if(size == 1){
            if(aux.mostarCarnet()==x){
                n=aux.mostrarNombre();
            }
            else {
                n=null;
            }
            
        }
        else{
          
         do{
             aux=aux.obtenerSiguinete();
             if(aux.mostarCarnet()==x){
                 n=aux.mostrarNombre();
                 break;
             }
         }while(aux.obtenerSiguinete()!=null);
          
        }
       
    }
    
    
}
