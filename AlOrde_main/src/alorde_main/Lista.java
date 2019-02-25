/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alorde_main;

/**
 *
 * @author Usuario
 */
public class Lista {
    private Nodo tope=null;
   private int size=0;
 
   public void Inserta(int dato){
       Nodo nuevo = new Nodo();
       nuevo.setDato(dato);
       if(Vacia()){
           tope = nuevo;
           
       }else{
           Nodo aux = new Nodo();
          aux = tope;
          nuevo.setSig(aux);
          tope = nuevo;
           
       }
       size++;
   }
   public void Ordenar(){
       int conta=size;
       Nodo aux = tope;
       while(aux!=null){
           Nodo aux2 = aux.getSig();
          while(aux2!=null){
              if(aux.getDato()>aux2.getDato()){
                  int temp = aux.getDato();
                  aux.setDato(aux2.getDato());
                  aux2.setDato(temp);   
              }
                  aux2 = aux2.getSig();    
          }   
          aux = aux.getSig();
          
       }
       
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
           actual = actual.getSig();
       }else{
           actual.setSig(Quitar(dato, actual.getSig()));
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
           aux = aux.getSig();
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
               aux = aux.getSig();
           }
       }
       System.out.println("\n");
   }
   
    public boolean Vacia(){
        return(tope==null)?true:false;
    }
}
