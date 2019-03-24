/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galeria;

/**
 *
 * @author Usuario
 */
public class Lista {
    private Nodo tope, fondo;
    int size=0;
     public void Inst_tope(Nodo nuevo){
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
            nuevo.setSig(aux);
            nuevo.setAnt(null);
            tope = nuevo;
        }
        
    }
     
    public void Inst_fondo(Nodo nuevo){
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

    public Nodo getTope() {
        return tope;
    }

    public void setTope(Nodo tope) {
        this.tope = tope;
    }

    public Nodo getFondo() {
        return fondo;
    }

    public void setFondo(Nodo fondo) {
        this.fondo = fondo;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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
