/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.main;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class OrgMain {

    
    public static void main(String[] args) {
      Scanner Entrada1= new Scanner(System.in);
      Scanner Entrada2= new Scanner(System.in);
      Scanner Entrada3= new Scanner(System.in);
      Scanner Entrada4= new Scanner(System.in);
      Scanner Entrada5= new Scanner(System.in);
      Lista lista = new Lista();
      int opc = 0;
      
      do{
          System.out.println("***MENU***");
          System.out.println("1-Insertar.");
          System.out.println("2-Mostrar.");
          System.out.println("3-Ordenar Metodo Burbuja.");
          System.out.println("4-Ordenar Metodo Insercion");
          System.out.println("5-Salir.");
          
          System.out.print("Ingrese una opcion: ");
          opc= Entrada1.nextInt();
          switch(opc){
              case 1:
                   System.out.print("Ingrese un valor: ");
                   int valor = Entrada2.nextInt();
                   lista.Insertar(valor);
                  break;
              case 2:
                  if(lista.Vacia()){
                      System.out.println("La lista esta vacia");
                  }
                  else{
                  lista.Mostrar();
                  }
                  break;
              case 3:
                  if(lista.Vacia()){
                      System.out.println("La lista esta vacia");
                  }
                  else{
                  lista.Ordenar_Burbuja();
                  }
                 break;
              case 4:
                  if(lista.Vacia()){
                      System.out.println("La lista esta vacia");
                  }
                  else{
                   lista.Ordenar_Insercion();
                  }
                  
                  break;
              case 5:
                  break;
              default:
                 
                  break;
          }
          
      }while(opc!=5);
    }
        
    }
    

