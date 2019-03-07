/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_resolucion2;

/**
 *
 * @author Usuario
 */
public class Pila {
    private  Nodo_curso tope=null; //hago el tope como un objeto del nodo curso
    public void Insertar(Nodo_curso nuevo_curso){ // recivo un parametro de tipo nodo curso
        if(tope==null){
            tope = nuevo_curso;
            nuevo_curso.setSig(null);
        }
        else{
            Nodo_curso aux = tope;
            nuevo_curso.setSig(aux);
            tope = nuevo_curso;
        }
    }
    
    public Nodo_curso Tope(){ //envio el nodo tope, que es de tipo nodo curso
        return tope;
    }
    
    public void Desapilar(){
        Nodo_curso aux = tope;//hago un axiliar de tipo nodo curso que sera igual al tope
        tope=aux.getSig(); //digo que el siguiente de el auxiliar sera ahora el tope 
        aux=null;//elimino el que estaba anteriormente como tope
    }
}
