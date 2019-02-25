/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_recursiva;

/**
 *
 * @author Usuario
 */
public class Lista {
   private Nodo tope=null;
   private int size=0;
   
   public void Push(int dato){
       tope = Agregar(dato,tope);
       size++;
   }
   
   public Nodo Agregar(int dato, Nodo actual){
       if(actual==null){
           actual = new Nodo();
           actual.setDato(dato);
           actual.setSiguiente(null);
       }else{
           if(actual.getDato()<dato){
               actual.setSiguiente(Agregar(dato,actual.getSiguiente()));
           }else{
               Nodo aux = new Nodo();
               aux.setDato(dato);
               aux.setSiguiente(actual);
               actual = aux;
           }
       }
       return actual;
   }
   
   public void Extraer(int dato){
       if(Vacia()){
           System.out.println("la lista esta vacia");
       }
       else{
           if(Buscar(dato)){
              tope = Quitar(dato, tope);
              System.out.println("Se extrajo: "+dato);
              size--;
           }else{
               System.out.println("el valor no existe");
           }
       }
   }
   
   public Nodo Quitar(int dato,Nodo actual){
       if(actual.getDato()==dato){
           actual = actual.getSiguiente();
       }else{
           actual.setSiguiente(Quitar(dato, actual.getSiguiente()));
       }
       return actual; 
   }
   
   
   
   public boolean Buscar(int dato){
       Nodo aux = tope;
       int conta = 0;
       while(aux!=null){
           if(aux.getDato()==dato){
               conta++;
           }
           aux = aux.getSiguiente();
       }
       return(conta!=0)?true:false;
   }
   
   public void Mostrar(){
       Nodo aux = tope;
       if(Vacia()){
           System.out.println("la lista esta vacia");
       }else{
           while(aux!=null){
               System.out.print(aux.getDato()+" ");
               aux = aux.getSiguiente();
           }
       }
       System.out.println("\n");
   }
   
    public boolean Vacia(){
        return(tope==null)?true:false;
    }
    
}
