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
public class Pila {
    Nodo tope=null;
    String cadena;
    int size=0;
   
    public void NuevoElemento(String n, int c){
        if(estaVacia()){
            tope = new Nodo(n,c);
        }
        else{
            Nodo aux = tope;
            Nodo nuevo = new Nodo(n,c);
            nuevo.enlazarSiguiente(aux);
            tope=nuevo;
        }
         size++;
    }
    
    public void MostrarElementos(){
        Nodo aux = tope;
        if(estaVacia()){
            System.out.println("No hay elementos en el sistema.");
        }
        else{
            while(aux!=null){
                System.out.println(aux.ObtenerNombre()+" - "+aux.ObtenerCarnet());   
                 aux=aux.ObtenerSiguiente();
            }
        }
    }
    public String RetornarNombre(){
        return cadena;
    }
            
    public void BuscarCarnet(int x){
        Nodo aux = tope;
        
        if(estaVacia()){
            System.out.println("El sistema no tiene elementos");
        }
        else{
            while(aux!=null){
                if(aux.ObtenerCarnet()== x){
                  System.out.println("El nombre es: "+aux.ObtenerNombre());
                  break;
                                    
                }
                else{
                aux = aux.ObtenerSiguiente();
                
                }
            }
          
            
        }
        
    }
    
    public boolean estaVacia(){
        return(tope==null)?true:false;
    }
    public void Eliminar(){
        Nodo aux = tope;
        if(estaVacia()){
            System.out.println("El sistema no tiene elementos");
        }
        else{
            System.out.println("Se a eliminado la persona: "+aux.ObtenerNombre()+", con el carnet: "+aux.ObtenerCarnet());
            aux=aux.ObtenerSiguiente();
            tope = aux;
            
        }
    }
}
