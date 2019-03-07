/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1.pkg1;

/**
 *
 * @author Usuario
 */
public class Colaes {
    private NodoCo primero=null, fin=null;
    private int cantidad =0;
    
    public void insertar(NodoCo es){
        if(primero==null){
            primero=es;
            fin=es;
        }
        else{
            NodoCo aux = fin;
            aux.setSiguiente(es);
            fin = es;
            
        }
    }
    
    public NodoCo Primero(){
        return primero;
    }
    public void Eliminar(){
        NodoCo aux = primero;
        primero = aux.getSiguiente();
        aux =null;
    }
    
    
}
