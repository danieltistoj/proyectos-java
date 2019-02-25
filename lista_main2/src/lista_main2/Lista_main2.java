/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_main2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Lista_main2 {

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
      int opc = 0, numero = 0, aux=0;
      
      do{
          System.out.println("***MENU***");
          System.out.println("1-Generar aleatorio.");
          System.out.println("2-Anular.");
          System.out.println("3-Mostrar datos.");
          System.out.println("4-Buscar numeros.");
          System.out.println("5-Salir.");
          
          System.out.print("Ingrese una opcion: ");
          opc= Entrada1.nextInt();
          switch(opc){
              case 1:
           numero = (int)(Math.random()*100)+1;
               if(lista.Vacia()){
                   lista.Insertar(numero);
                   aux=1;
               }
               else{
                   if(lista.Buscar(numero)){
                       System.out.println("el numero ya existe intente nuevamente");
                   }
                   else{
                       lista.Insertar(numero);
                       aux=1;
                   }
                   
               }
                  break;
              case 2:
                  if(aux==0){
                      System.out.println("Ya ha eliminado el ultimo elemento ingresado");
                  }
                  else{
                     lista.Extraer(numero);
                     aux=0;
                  }
                
                  break;
              case 3:
               lista.Mostrar();
                 break;
              case 4:
                 if(lista.Vacia()){
                     System.out.println("la lista esta vacia");
                 }
                 else{
                     System.out.println("Ingrese el numero: ");
                     int num = Entrada4.nextInt();
                     if(lista.Buscar(num)){
                         System.out.println("El numero: "+num+" existe en la lista.");
                     }
                     else{
                         System.out.println("El numero: "+num+" no existe en la lista.");
                     }
                 }
                  break;
              case 5:
                  break;
              default:
                 System.out.print("Opcion incorrecta");
                  break;
          }
          
      }while(opc!=5);
    }
    }
    

