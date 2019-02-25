/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_main;

/**
 *
 * @author Usuario
 */
public class Lista {
    Nodo Inicio = null;
    int size=0;
    
    public void Insertar(int valor){
         Nodo nuevo = new Nodo();
         nuevo.setValor(valor);
        if(Vacia()){
           Inicio = nuevo;
        }
        else{
           Nodo aux=Inicio;
           int conta = size;
           if(size==1){
               if(aux.getValor()>nuevo.getValor()){
                   nuevo.setSig(aux);
                   Inicio = nuevo;
               }
               else{
                   aux.setSig(nuevo);
               }
           }
           else{
               if(aux.getValor()>nuevo.getValor()){
                   nuevo.setSig(aux);
                   Inicio = nuevo;
               }
               else{
               while(aux!=null){
                   if(conta==2&&aux.getSig().getValor()>nuevo.getValor()){
                       nuevo.setSig(aux.getSig());
                       aux.setSig(nuevo);
                       break;
                   }
                   if(conta==1&&aux.getValor()<nuevo.getValor()){
                       aux.setSig(nuevo);
                       break;
                   }
                   if(aux.getSig().getValor()>nuevo.getValor()){
                       nuevo.setSig(aux.getSig());
                       aux.setSig(nuevo);
                       break;
                   }
                   conta--;
                   aux = aux.getSig();
               }
               }
           }
               }
         size++;
    }
    public void MostrarSize(){
        System.out.println(size);
    }
    
    public void Buscar(int valor){
        Nodo aux = Inicio;
        int conta=0;
        while(aux!=null){
            if(valor == aux.getValor()){
                conta++;
            }
           aux = aux.getSig();
        }
        if(conta>0){
            System.out.println("El valor "+valor+" existe");
        }
        else{
            System.out.println("El valor "+valor+" no existe");
        }
        
    }
    
    
    public void Mostrar(){
        Nodo aux = Inicio;
        int conta = size;
       if(Vacia()){
           System.out.println("Vacia");
       }
       else{
           while(aux!=null){
               System.out.print(aux.getValor()+" ");
               aux = aux.getSig();
               
           }
           System.out.println("\n");
       }
    }
    
   public void Extraer(int valor){
       Nodo aux = Inicio;
       int conta = size, aux2=0;
       if(aux.getValor()==valor){
           aux = aux.getSig();
           Inicio = aux;
           size--;
       }
       else{
          while(conta!=1){
              if(aux.getSig().getValor()==valor){
                  System.out.println("Se esxatrajo: "+valor);
                  aux.setSig(aux.getSig().getSig());
                  aux2=1;
                  size--;
                  break;
              }
              aux = aux.getSig();
              conta--;
                  
          }
          if(aux2==0){
          System.out.println("El valor no existe");
          }
       }
   }
    
    public boolean Vacia(){
        return (Inicio==null)?true:false;
    }
}
