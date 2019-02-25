/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.pkg3.java;

/**
 *
 * @author Usuario
 */
public class Pila {
    String pila[];
    int nMax;
    int conta;
   
    public Pila(int n) {
        nMax = n;
        pila = new String[nMax];
        conta=0;
    }
    
    public boolean empty(){
        if (conta>0){
            return false;
        }
        else 
        {
            return true;
        }
    }
   public void push(String x){
       if (conta<nMax){
           pila[conta]=x;
           conta++;
       }
   }
   
   public String peek(){
       if(conta == 0)
       {
            return "la pila esta vacia";
       }
       else
       {
           return pila[conta-1];
       }
       
   }
   
   public String getPop(){
       String aux=null;
       if (conta>0)
       {
           aux = pila[conta-1];
           pila[conta-1]=null;
           conta--;
       }
       return aux;
       
   }
}
