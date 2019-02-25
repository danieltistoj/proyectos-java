/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola1;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Cola1 {

    /**
     * @param args the command line arguments
     */
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
                           System.out.print("Ingrese un nombre: ");
                           String nombre = Entrada2.nextLine();
                           System.out.print("Ingrese el carnet: ");
                           int carnet = Entrada3.nextInt();
                           cola.NuevoElemento(nombre, carnet);
                           break;
                       case 2:
                           cola.RetornarElementos();
                           break;
                       case 3:
                           cola.Borrar();
                           break;
                       case 4:
                           System.out.println("Salir");
                           break;
                       default:
                           System.out.println("La opcion es incorrecte.");
                           break;
                           
                              
                   }
           
       }while(opc!=4);
    }
    
}
