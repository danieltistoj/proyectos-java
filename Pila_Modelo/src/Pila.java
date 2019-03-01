/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Pila {
    private Nodo tope;
    private int size;
    
    public void Insertar(int dato){
        Nodo nuevo=new Nodo();
        nuevo.setDato(dato);
        if(Vacia()){
            tope=nuevo;
        }
        else{
            Nodo aux = tope;
            nuevo.setSiguiente(aux);
            tope = nuevo;
        }
        size++;
    }
    
    public void Desapilar(){
        Nodo aux = tope;
        tope = aux.getSiguiente();
        aux = null;  
    }
    
    public void Mostrar(){
        Nodo aux = tope;
        while(aux!=null){
            System.out.print(aux.getDato()+" ");
            aux = aux.getSiguiente();
        }
        System.out.println("\n");
    }
    
    public int ObtenerCima(){
        return tope.getDato();
    }
    public boolean Vacia(){
        return(tope==null)?true:false;
    }
}
