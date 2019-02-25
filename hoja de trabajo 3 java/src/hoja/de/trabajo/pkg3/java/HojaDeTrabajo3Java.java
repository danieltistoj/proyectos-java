/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja.de.trabajo.pkg3.java;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class HojaDeTrabajo3Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada1=new Scanner(System.in);
       Scanner entrada2=new Scanner(System.in);
       Scanner entrada3=new Scanner(System.in);
       Scanner entrada4=new Scanner(System.in);
       int opc=0;
        Pila pila = new Pila();
      do {
          System.out.println("***MENU***");
          System.out.println("1-Nuevo elemento.");
          System.out.println("2-Borrar un elemento");
          System.out.println("3-Mostrar cima.");
          System.out.println("4-Mostrar tamano.");
          System.out.println("5-Vaciar pila.");
          System.out.println("6-Mostrar todos los elementos.");
          System.out.println("7-Salir");
          System.out.print("Ingrese una opcion: ");
          opc = entrada1.nextInt();
          switch(opc){
                  case 1:
                  System.out.print("Ingres un elemento: ");
                  int n = entrada2.nextInt();
                  pila.nuevoElemento(n);
                  break;
                  case 2:
                      pila.Desapilar();
                  break;
                  case 3:
                  System.out.println(pila.getRetornarCima());
                  break;
                   case 4:
                 System.out.println(pila.Size());
                  break;
                   case 5:
                   pila.getVaciar();
                  break;
                   case 6:
                       pila.MostrarElementos();
                       break;
                   case 7:
                      System.out.print("Salir");
                     break;
                   default:
                   System.out.println("Ingreso una opcion incorrecta ");
                   break;
          }
          
      }while(opc!=7);
    }
    
}
