/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author Usuario
 */
public class Lista {
    private Nodo tope, fondo;
    private int size=0;
   
    
    public void Insertar(int dato){
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);
        if(Vacia()){
            tope = nuevo;
            fondo = nuevo;
        }
        else{
            Nodo aux = fondo;
            aux.setSig(nuevo);
            fondo = nuevo;
        }
        
        size++;
    }

    public void setTope(Nodo tope) {
        this.tope = tope;
    }
     
     public void Mostrar(){
         String cadena="";
         Nodo aux = tope;
         while(aux!=null){
             System.out.print(aux.getDato()+" ");
             aux = aux.getSig();
         }
         
     }

    public Nodo getFondo() {
        return fondo;
    }

    public void setFondo(Nodo fondo) {
        this.fondo = fondo;
    }
    
     
   public int getSize(){
       return size;
   } 
    
    public Nodo getTope(){
        return tope;
    }
    
    public boolean Vacia(){
        return(tope==null)?true:false;
    }
}
