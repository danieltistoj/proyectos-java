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
public class Cola_estudiante {
    Nodo tope=null, fondo=null;
    
    public void Insertar(Nodo estudiante){
        if(Vacia()){
            tope=estudiante;
            fondo=estudiante;
        }
        else{
            Nodo aux =fondo;
            aux.setSig(estudiante);
            fondo = estudiante;
        }
    }
    
    public Nodo Cima(){
        return tope;
    }
    
    public void Desencolar(){
        Nodo aux = tope;
        tope=aux.getSig();
        aux=null;
    }
   
   public boolean Vacia(){
       return(tope==null)?true:false;
   }
}
