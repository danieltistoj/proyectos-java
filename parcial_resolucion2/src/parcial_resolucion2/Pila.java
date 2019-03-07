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
    private  Nodo_curso tope=null;
    public void Insertar(Nodo_curso nuevo_curso){
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
    
    public Nodo_curso Tope(){
        return tope;
    }
    
    public void Desapilar(){
        Nodo_curso aux = tope;
        tope=aux.getSig();
        aux=null;
    }
}
