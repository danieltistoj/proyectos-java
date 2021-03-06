/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles2;

/**
 *
 * @author Usuario
 */
public class Arbol {
    private Nodo raiz;
    private String cadena = "";
    private int conta, altura;
  
    
    public void Insertar(int dato){
        raiz = Agregar(raiz,dato);
    }

    
    public Nodo Agregar(Nodo nodo, int dato){
        if(nodo==null){
            nodo = new Nodo();
            nodo.setDato(dato);
            nodo.setHijo_der(null);
            nodo.setHijo_izq(null);
        nodo.setAltura(nodo.getAltura()+1);
        }
        else{
            if(dato<nodo.getDato()){
                nodo.setHijo_izq(Agregar(nodo.getHijo_izq(), dato));
                nodo.setAltura(nodo.getAltura()+1);
                
            }
            if(dato>nodo.getDato()){
                nodo.setHijo_der(Agregar(nodo.getHijo_der(), dato));
                nodo.setAltura(nodo.getAltura()+1);
            }
            
        }
        return nodo;
    }
    
   public Nodo Buscar(int dato){
   Nodo aux = raiz;
   conta=0;
       while(aux.getDato()!=dato){
           if(aux.getDato()>dato){
               aux = aux.getHijo_izq();
               conta++;
           }
           else{
               aux = aux.getHijo_der();
               conta++;
           }
           if(aux==null){
            break;
           }
          
       }
      
      return aux; 
   }
   
   
    public int getConta() {
        return conta;
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
    public void Altura(Nodo actual, int altura){
        if(actual!=null){
            Altura(actual.getHijo_izq(), altura+1);
            if(altura>this.altura){
                this.altura = altura;
            }
            Altura(actual.getHijo_der(), altura+1);
        }
    }
    public int getAltura(Nodo nodo){
        Altura(nodo,1);
        return altura;
    }
}
