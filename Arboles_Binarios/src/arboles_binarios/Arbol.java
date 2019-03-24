/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles_binarios;

/**
 *
 * @author Usuario
 */
public class Arbol {
    private Nodo raiz;
    private String cadena = "";
    public void Insertar(int dato){
        raiz = Agregar(raiz,dato);
    }
    public Nodo Agregar(Nodo nodo, int dato){
        if(nodo==null){
            nodo = new Nodo();
            nodo.setDato(dato);
            nodo.setHijo_der(null);
            nodo.setHijo_izq(null);
        }
        else{
            if(dato<nodo.getDato()){
                nodo.setHijo_izq(Agregar(nodo.getHijo_izq(), dato));
                
            }
            if(dato>nodo.getDato()){
                nodo.setHijo_der(Agregar(nodo.getHijo_der(), dato));
            }
            
        }
        return nodo;
    }
    
    public Nodo getRaiz() {
        return raiz;
    }
  
    public String Ordenar_Pos(){
        cadena = "";
        Nodo aux = raiz;
        Posorden(aux);
        return cadena;
        
    }
    public String Ordenar_Pre(){
        cadena ="";
        Nodo aux = raiz;
        Preorden(aux);
        return cadena;
        
    }
    public String Ordenar_In(){
        cadena = "";
        Nodo aux = raiz;
        Inorden(aux);
        return cadena;
    }
    
    private void Preorden(Nodo nodo_raiz){
        if(nodo_raiz!=null){
            cadena+=nodo_raiz.getDato()+" ";
            Preorden(nodo_raiz.getHijo_izq());
            Preorden(nodo_raiz.getHijo_der());
        }
        
    }
    private void Posorden(Nodo nodo_raiz){
        if(nodo_raiz!=null){
            Posorden(nodo_raiz.getHijo_izq());
            Posorden(nodo_raiz.getHijo_der());
            cadena+=nodo_raiz.getDato()+" ";
        }
        
    }
    private void Inorden(Nodo nodo_raiz){
        if(nodo_raiz!=null){
            Inorden(nodo_raiz.getHijo_izq());
            cadena += nodo_raiz.getDato()+" ";
            Inorden(nodo_raiz.getHijo_der());
        }
        
    }
    
}
