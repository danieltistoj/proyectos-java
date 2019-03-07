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
public class Pila {
    private Nodopila principio=null;
    int cantidad=0;
    public void insertar(Nodopila est){
        if(principio==null){
            principio = est;
        }
        else{
            Nodopila aux = principio;
            est.setSiguiente(aux);
            principio = est;
            
        }
        cantidad++;
    }
    public Nodopila Principio(){
        return principio;
    }
    public void Eliminar(){
        Nodopila aux = principio;
        principio = aux.getSiguiente();
        aux = null;
    }
}
