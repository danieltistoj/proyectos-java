/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola2;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Cola2 {

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
          System.out.println("1-Nuevo elemento.");
          System.out.println("2-Mostrar todos los elementos.");
          System.out.println("3-Buscar por carnet.");
          System.out.println("4-Borrar un elemento.");
          System.out.println("5-Salir.");
          System.out.print("Ingrese una opcion: ");
          opc= Entrada1.nextInt();
          switch(opc){
              case 1:
                  System.out.print("Ingrese el nombre: ");
                  String nombre=Entrada2.nextLine();
                  System.out.print("Ingrese el edad: ");
                  int edad = Entrada3.nextInt();
                  System.out.print("Ingrese el carnet: ");
                  int carnet = Entrada4.nextInt();
                  cola.NuevoNodo(nombre, edad, carnet);
                  break;
              case 2:
                  cola.MostrarElementos();
                  break;
              case 3:
                  System.out.print("Ingrese el carnet: ");
                  int carnet1 = Entrada5.nextInt();
                  cola.BuscarNombre(carnet1);
                  break;
              case 4:
                  cola.Borrar();
              default:
                  System.out.println("La opcion es invalida.");
                  break;
          }
          
      }while(opc!=5);
    }
    
}
