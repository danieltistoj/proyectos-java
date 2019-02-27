/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.main;

/**
 *
 * @author Usuario
 */
public class Lista {
    private Nodo tope=null;
    private int size=0;
    
    public void Insertar(int dato){
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);
        if(Vacia()){
            tope = nuevo;
            nuevo.setSiguiente(null);
            
        }
        else{
            Nodo aux = new Nodo();
            aux = tope;
            nuevo.setSiguiente(aux);
            tope = nuevo;
            size++;
        }
    }
    public void Ordenar_Burbuja(){
        Nodo aux;
        int conta=1, conta2=0;
        while(conta!=0){//ciclo 1 
            aux = tope;
            conta2=0;//el conta2 tiene la funcion de repetir el ciclo hasta que no se el ciclo 2 no haya hecho ningun intercambio de valores
            while(aux.getSiguiente()!=null){//ciclo 2
                if(aux.getDato()>aux.getSiguiente().getDato()){ //la condicion dice que si el valor actual es mayor al siguiente. si es haci se intercambia los valores y se pasa al siguiente nodo
                    int temp = aux.getSiguiente().getDato();
                    aux.getSiguiente().setDato(aux.getDato());
                    aux.setDato(temp);
                    conta2++;
                }
               aux = aux.getSiguiente();
            }
           if(conta2==0){//si se realizaron intercambios esta condicion no se cumple el ciclo 1 se tenria que repetir lo que implicaria recorrer nuevamente la lista.
               conta=0;
           }
        }
         System.out.println("Ordenado por metodo burbuja.");
    }
    public void Ordenar_Insercion(){
        Nodo aux=tope, actual, aux2;
        while(aux!=null){
            actual = aux;
            aux2=aux;
            while(aux2!=null){
                if(aux2.getDato()==BuscarMenor(actual)){
                    int temp = aux2.getDato();
                    aux2.setDato(aux.getDato());
                    aux.setDato(temp);
                }
                aux2 = aux2.getSiguiente();
            }
            aux = aux.getSiguiente();
            
        }
        System.out.println("Ordenado por metodo de insercion.");
    }
    
    public int BuscarMenor(Nodo actual){//busca el nuemer mas pequeno de una lista y lo retorna para guscarlo.
        int temp=actual.getDato();
        actual=actual.getSiguiente();
     while(actual!=null){
        if(temp>actual.getDato()){
          temp=actual.getDato();
        }
        actual = actual.getSiguiente();
         
     }
        return temp;
    }
    
    public void Mostrar(){
        Nodo aux=tope;
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
