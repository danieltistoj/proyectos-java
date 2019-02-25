/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l.h3;
import java.util.Scanner;
/**
 *
 * Alfredo Ivan Ordo;ez Colop y Jose Daniel Tistoj Reyes.
 */
public class LH3 {

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
      int opc = 0;
      
      do{
          System.out.println("***MENU***");
          System.out.println("1-Encolar.");
          System.out.println("2-Desencolar.");
          System.out.println("3-Mostrar frente");
          System.out.println("4-Vaciar.");
          System.out.println("5-Mostrar tamano");
          System.out.println("6-Salir.");
          System.out.print("Ingrese una opcion: ");
          opc= Entrada1.nextInt();
          switch(opc){
              case 1:
                  System.out.print("Ingrese un dato: ");
                  int dato = Entrada1.nextInt();
                  cola.Encolar(dato);
                  break;
              case 2:
                  cola.Desencolar();
                  break;
              case 3:
                  cola.Frente();
                  break;
              case 4:
                  cola.Vaciar();
              case 5:
                  System.out.println(cola.size());
                  break;
              case 6:
                  break;
              default:
                  System.out.println("La opcion es invalida.");
                  break;
          }
          
      }while(opc!=6);
    }
    }
    

