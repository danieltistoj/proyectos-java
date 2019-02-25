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
public class Cola {
    Elemento tope=null;
    Elemento fondo=null;
    int size=0;
    
    public void NuevoElemento(String nombre, int carnet){
        Elemento nuevo = new Elemento(nombre,carnet);
        if(EstaVacia()){
            tope = nuevo;
            fondo = nuevo;
        }
        else{
          Elemento aux = fondo;
          aux.EnlazarSiguiente(nuevo);
          fondo = nuevo;
        }
        size++;
    }
    public void RetornarElementos(){
        if(EstaVacia()){
            System.out.println("No hay elementos en el sistema.");    
        }
        else{
            Elemento aux=tope;
            while(aux!=null){
                System.out.println("Nombre: "+aux.ObtenerNombre()+" Carnet: "+aux.ObtenerCarnet());
                aux = aux.ObtenerSiguiente();
            }
            
        }
        
    }
    public void Borrar(){
        Elemento aux = tope;
        if(EstaVacia()){
            System.out.println("No hay elementos en el sistema.");
        }
        else{
            System.out.println("Se ha eliminado el elemento: "+tope.ObtenerNombre());
            tope = aux.ObtenerSiguiente();
            size--;
        }
    }
    
    public boolean EstaVacia(){
        return(tope==null)?true:false;
    }
    
}
