/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_resolucion;

/**
 *
 * @author Usuario
 */
public class Pila_curso {
    private Nodo tope=null;
    public void Insertar(Nodo curso){
        if(Vacia()){
            tope = curso;
        }
        else{
            Nodo aux = tope;
            curso.setSig(aux);
            tope=curso;
        }
    }
    
   public Nodo Tope(){
       return tope;
   }
   
    public void Desapilar(){
        Nodo aux=tope;
        tope=aux.getSig();
        aux=null;
    }
    
     public boolean Vacia(){
       return(tope==null)?true:false;
   }
}
