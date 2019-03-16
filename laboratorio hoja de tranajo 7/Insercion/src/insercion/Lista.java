/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insercion;

/**
 *
 * @author Usuario
 */
public class Lista {
    private Nodo tope;
    public void Insertar(int dato){
        tope = Agregar(tope, dato);
    }
    public Nodo Agregar(Nodo nodo,int dato){
        if(nodo==null){
            nodo = new Nodo();
            nodo.setDato(dato);
            nodo.setSig(null);
        }
        else{
            if(nodo.getDato()>dato){
                Nodo aux = new Nodo();
                aux.setDato(dato);
                aux.setSig(nodo);
                nodo = aux;
            }
            else
            {
                nodo.setSig(Agregar(nodo.getSig(), dato));
            }
            
        }
        return nodo;
    }
    
    public  void Mostrar(){
        Nodo aux = tope;
        
        while(aux!=null){
            System.out.print(aux.getDato()+" ");
            aux = aux.getSig();
        }
        
    }
    
    
}
