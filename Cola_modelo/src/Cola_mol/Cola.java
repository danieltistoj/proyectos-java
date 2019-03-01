/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cola_mol;

/**
 *
 * @author Usuario
 */
public class Cola {
    private Nodo tope, fondo;
    private int size;
    
    public void Insertar(int dato){
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);
        if(Vacia()){
            fondo = nuevo;
            tope = nuevo;
        }
        else{
            Nodo aux = fondo;
            aux.setSiguiente(nuevo);
            fondo = nuevo;
            
        }
        size++;
    }
    
    public void Eliminar(){
        Nodo aux =tope;
        tope = aux.getSiguiente();
        aux = null;
        size--;
    }
    
    public void Mostrar(){
        Nodo aux = tope;
        while(aux!=null){
            System.out.println(aux.getDato()+" ");
            aux = aux.getSiguiente();
        }
        System.out.println("\n");
    }
    
    
    public boolean Vacia(){
      return(tope==null)?true:false;
    }
    
}
