/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_recursiva;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Lista_recursiva {

    /**
     * @param args the command line arguments
     */
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
          System.out.println("3-Extraer.");
          System.out.println("4-Buscar.");
          System.out.println("5-Salir.");
          
          System.out.print("Ingrese una opcion: ");
          opc= Entrada1.nextInt();
          switch(opc){
              case 1:
                   System.out.print("Ingrese un valor: ");
                   int valor = Entrada2.nextInt();
                   lista.Push(valor);
                  break;
              case 2:
                  lista.Mostrar();
                  break;
              case 3:
                  System.out.print("Ingrese un valor: ");
                  int valor1 = Entrada3.nextInt();
                  lista.Extraer(valor1);
                 break;
              case 4:
                  
                  break;
              case 5:
                  break;
              default:
                 
                  break;
          }
          
      }while(opc!=5);
    }
    
}
