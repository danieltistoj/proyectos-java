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
public class Cola_est {
    private Nodo_estudiante tope=null, fondo=null;
    public void Insertar(Nodo_estudiante nuevo_estudiante){
        if(tope==null){
            tope = nuevo_estudiante;
            fondo = nuevo_estudiante;
        }
        else{
            Nodo_estudiante aux = fondo;
            aux.setSig(nuevo_estudiante);
            fondo = nuevo_estudiante;
            
        }
    }
    
    public Nodo_estudiante Tope(){
        return tope;
    }
    
    public void Desencola(){
        Nodo_estudiante aux = tope;
        tope = aux.getSig();
        aux = null;
    }
}
