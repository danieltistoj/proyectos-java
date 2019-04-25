/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucion2;

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
        size++;
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
    
    
     public void EliminarTope(){
        Nodo aux  = tope;
        tope = aux.getSig();
        aux = null;
    }
     
     
      public Nodo Buscar(int carnet){
        Nodo aux = tope, nodo=null;
        
        boolean existe=false;
        while(aux!=null){
            if(carnet==aux.getNumero()){
                nodo=aux;
            }
            aux = aux.getSig();
        }
        return nodo;
        
    }
     //eliminar por referencia
      public void Eliminar(int numero){
        if(size==1){
            tope=null;
            fondo=null;
        }
        else{
        if(numero==tope.getNumero()){
            Nodo aux = tope;
            tope = aux.getSig();
            aux=null;
            
        }
        if(numero==fondo.getNumero()){
            Nodo aux = fondo;
            fondo = aux.getAnt();
            fondo.setSig(null);
            aux = null;    
           
        }
        if(numero!=fondo.getNumero()&&numero!=tope.getNumero()){
            Nodo aux = tope;
            while(aux.getSig()!=null){
                if(numero==aux.getNumero()){
                    Nodo anterior = aux.getAnt();
                    Nodo siguiente = aux.getSig();
                    anterior.setSig(aux.getSig());
                    siguiente.setAnt(anterior);
                    aux = null;
                    break;
                }
                aux = aux.getSig();
            }
        }
        }
        size--;
        
    }
      
      //ordenar ***
      public void Ordenar(){
       int conta=size;
       Nodo aux = tope;
       while(aux!=null){
           Nodo aux2 = aux.getSig();
          while(aux2!=null){
              if(aux.getSize()>aux2.getSize()){
                  int num_temp = aux.getNumero();
                  int size_temp = aux.getSize();
                  String nombre_temp = aux.getNombre();
                  String url_temp = aux.getUrl();
                  Imagen img_temp = aux.getClase_img();
                          
                  aux.setNumero(aux2.getNumero());
                  aux.setSize(aux2.getSize());
                  aux.setNombre(aux2.getNombre());
                  aux.setUrl(aux2.getUrl());
                  aux.setClase_img(aux2.getClase_img());
                  
                  aux2.setNumero(num_temp);
                  aux2.setSize(size_temp);
                  aux2.setNombre(nombre_temp);
                  aux2.setUrl(url_temp);
                  aux2.setClase_img(img_temp);
                  
              }
                  aux2 = aux2.getSig();    
          }   
          aux = aux.getSig();
          
       }
       
   }
      //fin ordenar
    
    
    public boolean Vacia(){
        return(tope==null)?true:false;
    }
    
}
