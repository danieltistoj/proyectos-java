/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cola_mol;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class main {
    public static void main(String[] args) {
         Scanner Entrada1=new Scanner(System.in);
       Scanner Entrada2=new Scanner(System.in);
       Scanner Entrada3=new Scanner(System.in);
       Scanner Entrada4=new Scanner(System.in);
       Scanner Entrada5=new Scanner(System.in);
       int opc = 0;
       Cola cola = new Cola();
       do{
           System.out.println("1-Nuevo elemento: ");
           System.out.println("2-Mostrar elementos: ");
           System.out.println("3-Borrar elemento: ");
           System.out.println("4-Salir.");
           System.out.print("Ingrese una opcion: ");
                   opc = Entrada1.nextInt();
                   switch(opc){
                       case 1:
                           
                           break;
                       case 2:
                           
                           break;
                       case 3:
                           
                           break;
                       case 4:
                          
                           break;
                       default:
                         
                           break;
                           
                              
                   }
           
       }while(opc!=4);
    }
    }

