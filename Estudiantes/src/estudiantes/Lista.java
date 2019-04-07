/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes;

/**
 *
 * @author Usuario
 */
public class Lista {
    private Estudiante tope, fondo;
    private int size=0;
    public void Ingresar(Estudiante nuevo){
        if(Vacia()){
            tope=nuevo;
            fondo=nuevo;
            
            tope.setAnterior(null);
            tope.setSiguiente(null);
            
            fondo.setAnterior(null);
            fondo.setSiguiente(null);
        }
        else{
           Estudiante aux = tope;
           aux.setAnterior(nuevo);
           nuevo.setSiguiente(aux);
           nuevo.setAnterior(null);
           tope = nuevo;
        }
    }
    
    public void Inst_Fondo(Estudiante nuevo){
        if(Vacia()){
            tope = nuevo;
            fondo = nuevo;
            
            tope.setAnterior(null);
            tope.setSiguiente(null);
            
            fondo.setAnterior(null);
            fondo.setSiguiente(null);
            
        }
        else{
            Estudiante fin = fondo;
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            nuevo.setSiguiente(null);
            fondo = nuevo;
        }
    }
    
     public Estudiante Buscar(int dato){
        Estudiante aux = tope, nodo=null;
        
        boolean existe=false;
        while(aux!=null){
            if(dato==aux.getCarnet()){
                nodo=aux;
            }
            aux = aux.getSiguiente();
        }
        return nodo;
        
    }
    
    public Estudiante tope(){
        return tope;
    }

    public Estudiante getTope() {
        return tope;
    }

    public void setTope(Estudiante tope) {
        this.tope = tope;
    }

    public Estudiante getFondo() {
        return fondo;
    }

    public void setFondo(Estudiante fondo) {
        this.fondo = fondo;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean Vacia(){
        return(tope==null)?true:false;
    }
    
}
