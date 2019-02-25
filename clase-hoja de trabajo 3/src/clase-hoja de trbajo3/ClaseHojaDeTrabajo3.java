/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.hoja.de.trabajo.pkg3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ClaseHojaDeTrabajo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner Entrada1= new Scanner(System.in);
      Scanner Entrada2= new Scanner(System.in);
      Scanner Entrada3= new Scanner(System.in);
      Scanner Entrada4= new Scanner(System.in);
      Scanner Entrada5= new Scanner(System.in);
      Cola cola = new Cola();
      Pila pila = new Pila();
      int opc = 0;
    
      do{
          System.out.println("***MENU***");
          System.out.println("1-Ingresar numero.");
          System.out.println("2-Vaciar pila.");
          System.out.println("3-Salir.");
          System.out.print("ingrese una opcion: ");
          opc= Entrada1.nextInt();
          switch(opc){
              case 1:
                  System.out.print("Ingrese un elemento: ");
                  int num = Entrada1.nextInt();
                  pila.push(num);
      
                  break;
              case 2:
                  if(pila.Vacia()){
                      System.err.println("no hay elementos en la pila");
                  }
                  else{
                      int total=0;
                      while(pila.Vacia()!=true){
                          total+=pila.Tope();
                          pila.Desapilar();
                      }
                      cola.push(total);
                  }
                  break;
              case 3:
                  System.out.println("Elementos de la cola");;
                  while(cola.Vacia()!=true){
                      System.out.println(cola.Tope());
                      cola.Desapilar();
                  }
                  System.out.println("Elementos de la pila");
                    while(pila.Vacia()!=true){
                      System.out.println(pila.Tope());
                      pila.Desapilar();
                  }
                  
                  break;
          }
          
      }while(opc!=3);
    }
    
    }
    

