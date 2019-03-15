/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 
 */
public class Ordenar {
    public Lista Ordenar(Lista lista){
        if(lista.getSize()>1){
           int pivote = lista.getTope().getDato();
           Lista izq, der;
           izq = Lista_menores(lista.getTope().getSig(), lista.getTope().getDato());
           der = Lista_mayor(lista.getTope().getSig(),lista.getTope().getDato());
           izq = Ordenar(izq);
           der = Ordenar(der);
           
              izq.Insertar(pivote);
              izq = Insertar_Lista(izq,der.getTope());
              lista = izq;
         
           
       }      
       return lista;
         
    }
 
    public Lista Insertar_Lista(Lista lista, Nodo nodo){
        Nodo aux = nodo;
        while(aux!=null){
            lista.Insertar(aux.getDato());
            aux = aux.getSig();
        }
        return lista;
    }
    
    public Lista Lista_nueva(Lista izq){
        Lista lista= izq;
      return lista;
    }
   
    public Lista Lista_menores(Nodo nodo_sig,int dato){
        Lista izq = new Lista();
        Nodo aux = nodo_sig;
           while(aux!=null){
               if(dato> aux.getDato()||dato==aux.getDato()){
                   izq.Insertar(aux.getDato());
               }
               aux = aux.getSig();
           }
        return izq;
    }
    public Lista Lista_mayor(Nodo nodo_sig, int dato){
        Lista der = new Lista();
         Nodo aux = nodo_sig;
           while(aux!=null){
               if(dato<aux.getDato()){
                   der.Insertar(aux.getDato());
               }
               aux = aux.getSig();
           }
       return der;   
    }
}
