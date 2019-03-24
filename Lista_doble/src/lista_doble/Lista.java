/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_doble;

/**
 *
 * @author Usuario
 */
public class Lista {
    private Nodo tope, fondo;
    int size=0;
    public void Inst_tope(int dato){
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);
        if(Vacia()){
            tope = nuevo;
            fondo = nuevo;
            
            tope.setAnt(null);
            tope.setSig(null);  
            
            fondo.setAnt(null);
            fondo.setSig(null);
        }
        else{
            Nodo aux = tope;
            aux.setAnt(nuevo);
          //aux.setSig(null);
            nuevo.setSig(aux);
            nuevo.setAnt(null);
            tope = nuevo;
        }
        
    }
    public void Inst_fondo(int dato){
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);
        if(Vacia()){
            tope = nuevo;
            fondo=nuevo;
            tope.setAnt(null);
            tope.setSig(null);
            
            fondo.setAnt(null);
            fondo.setSig(null);
            
        }
        else{
            
            Nodo aux  = fondo;
            //aux.setAnt(null);
            aux.setSig(nuevo);
            nuevo.setAnt(aux);
            nuevo.setSig(null);
            fondo = nuevo;
            
        }
                
        size++;
        
    }
    
    public void Mostrar(){
          Nodo aux = tope;
        while(aux!=null){
            System.out.print(aux.getDato()+" ");
            aux = aux.getSig();
        }
    }
    
    public void Mostrar_ant_sig(){
        Nodo aux = tope;
        while(aux!=null){
            if(aux.getAnt()==null&&aux.getSig()!=null){
                System.out.println("Anterior: null"+" Actual: "+aux.getDato()+" Siguiente: "+aux.getSig().getDato());
                
            }
            if(aux.getAnt()!=null&&aux.getSig()==null){
                System.out.println("Anterior: "+aux.getAnt().getDato()+" Actual: "+aux.getDato()+" Siguiente: null");
                
            }
            if(aux.getAnt()!=null&&aux.getSig()!=null){
                System.out.println("Anterior: "+aux.getAnt().getDato()+" Actual: "+aux.getDato()+" Siguiente: "+aux.getSig().getDato());
            }
            aux = aux.getSig();
        }
    }
    public void Eliminar(){
        Nodo aux  = tope;
        tope = aux.getSig();
        aux = null;
    }
    public boolean Vacia(){
        return(tope==null)?true:false;
    }
             
}
