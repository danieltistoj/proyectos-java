/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola3;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Cola3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
         Scanner entrada3 = new Scanner(System.in);
          Scanner entrada4 = new Scanner(System.in);
           Scanner entrada5 = new Scanner(System.in);
           
           Cola cola = new Cola();
           int opc = 0;
           do{
               System.out.println("***MENU***");
               System.out.println("1-Nuevo producto.");
               System.out.println("2-Mostrar todos los productos.");
               System.out.println("3-Buscar por codigo.");
               System.out.println("4-Borrar el tope");
               System.out.println("5-Salir.");
               System.out.print("Ingrese una opcion: ");
               opc = entrada1.nextInt();
               switch(opc){
                   case 1:
                       System.out.print("Ingrese el nombre del producto: ");
                       String a = entrada2.nextLine();
                       System.out.print("Ingrese el codigo: ");
                       int b = entrada3.nextInt();
                       cola.Nuevo(a, b);
                       break;
                   case 2:
                       cola.MostrarTodo();
                       break;
                   case 3:
                       System.out.print("Ingrese el codigo: ");
                       int c = entrada4.nextInt();
                       cola.BuscarPorCodigo(c);
                       break;
                   case 4:
                       cola.BorrarTope();
                       break;
                   case 5:
                       break;
                   default:
                       System.out.println("La opcion es icorrecto");
                       break;
               }
           }while(opc!=5);
    }
    
}
