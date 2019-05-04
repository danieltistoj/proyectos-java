/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol_avl;

/**
 *
 * @author Usuario
 */
public class Arbol_AVL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Arbol arbol = new Arbol();
            Arbol arbol2 = new Arbol();
            
           arbol2.Insertar(10);
           arbol2.Insertar(3);
           arbol2.Insertar(5);
            
           arbol.Insertar(10);
           arbol.Insertar(15);
           arbol.Insertar(12);
          // arbol.Insertar(1);
          // arbol.Insertar(11);
                       
                       System.out.println("............altura del arbol..........");
                       System.out.println("Arbol 1: 10, 15, 12");
                       System.out.println("Arbol 2: 10, 3, 5\n");
                       int altura = arbol.getAltura(arbol.getRaiz());
                       System.out.println("la altura del arbol 1 es: "+altura);
                       System.out.println("la altura del arbol 2 es "+arbol2.getRaiz().getAltura());
           
                       System.out.println("............................................");
                     //  System.out.println("se ingresa el numero 9 para ver a qur nivel esta");
                       /*
                       Nodo aux = arbol.Buscar(9);
                       if(aux!=null){
                           System.out.println("la altura del numero es: "+arbol.getConta());
                       }
                       else{
                           System.out.println("El numero no existe");
                       }
                   */
                      System.out.println(".....................................................");
                     
                  System.out.println("*******Equilibrio Arbol 1 D.I******\n");
                  System.out.println("nodo raiz: "+arbol.getRaiz().getDato());
                  System.out.println("nodo izquierdo: "+arbol.getRaiz().getHijo_der().getDato());
                  System.out.println("nodo derecho: "+arbol.getRaiz().getHijo_izq().getDato()+"\n");
                  System.out.println(arbol.Ordenar_In());
                  
                  System.out.println("\n*******Equilibrio Arbol 2 I.D******\n");
                  System.out.println("nodo raiz: "+arbol2.getRaiz().getDato());
                  System.out.println("nodo izquierdo: "+arbol2.getRaiz().getHijo_der().getDato());
                  System.out.println("nodo derecho: "+arbol2.getRaiz().getHijo_izq().getDato()+"\n");
                  System.out.println(arbol2.Ordenar_In());
                 // System.out.println(arbol.getRaiz().getHijo_izq().getHijo_der().getHijo_izq().getDato());
    }
    
}
