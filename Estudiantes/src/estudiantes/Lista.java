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
        size++;
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
        size++;
    }
    
     public Estudiante Buscar(int carnet){
        Estudiante aux = tope, nodo=null;
        
        boolean existe=false;
        while(aux!=null){
            if(carnet==aux.getCarnet()){
                nodo=aux;
            }
            aux = aux.getSiguiente();
        }
        return nodo;
        
    }
     
     
      public void Eliminar(int dato){
        if(size==1){
            tope=null;
            fondo=null;
        }
        else{
        if(dato==tope.getCarnet()){
            Estudiante aux = tope;
            tope = aux.getSiguiente();
            aux=null;
            
        }
        if(dato==fondo.getCarnet()){
            Estudiante aux = fondo;
            fondo = aux.getAnterior();
            fondo.setSiguiente(null);
            aux = null;    
           
        }
        if(dato!=fondo.getCarnet()&&dato!=tope.getCarnet()){
            Estudiante aux = tope;
            while(aux.getSiguiente()!=null){
                if(dato==aux.getCarnet()){
                    Estudiante anterior = aux.getAnterior();
                    anterior.setSiguiente(aux.getSiguiente());
                    aux = null;
                    break;
                }
                aux = aux.getSiguiente();
            }
        }
        }
        size--;
        
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
