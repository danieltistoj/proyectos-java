/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenlazada;

/**
 *
 * @author datos
 */
public class Lista {
    Nodo inicio;
    
    public void insertar(Integer numero){
        inicio = agregar(numero,inicio);
    }
    private Nodo agregar(Integer numero,Nodo actual)
    {
        if(actual==null){
            actual = new Nodo();
            actual.setValor(numero);
            actual.setSiguiente(null);
        }
        else{
            if(actual.getValor()<numero)
                actual.setSiguiente(agregar(numero, actual.getSiguiente()));
            else
            {
                Nodo aux = new Nodo();
                aux.setValor(numero);
                aux.setSiguiente(actual);
                actual=aux;
            }
        }       
        return actual;
    }
    
    public String Mostrar(){
        String cadena="";
        Nodo aux;
        aux=inicio;
        while(aux!=null){
            cadena=cadena+"-"+aux.getValor();
            aux=aux.getSiguiente();
        }
        return cadena;
    }
    
}
