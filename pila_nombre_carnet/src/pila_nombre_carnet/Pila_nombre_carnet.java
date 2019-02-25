/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila_nombre_carnet;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Pila_nombre_carnet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);
        Scanner entrada4 = new Scanner(System.in);
        
        Pila pila = new Pila();
        int opc=0;
        do{
            System.out.println("***MENU***");
            System.out.println("1-Ingresar nuevo elemento.");
            System.out.println("2-Mostrar todos los nombres.");
            System.out.println("3-Buscar por carnet.");
            System.out.println("4-Eliminar Elemento.");
            System.out.println("5-salir");
            System.out.print("Ingrese una opcion: ");
            opc = entrada.nextInt();
            switch(opc){
                case 1:
                    System.out.print("Ingrese un nombre: ");
                    String nombre = entrada2.nextLine();
                    System.out.print("Ingrese un carnet: ");
                    int carnet = entrada3.nextInt();
                    pila.NuevoElemento(nombre, carnet);
                    break;
                case 2: 
                    pila.MostrarElementos();
                    break;
                case 3:
                    System.out.print("Ingrese un carnet: ");
                    int carnet1 = entrada4.nextInt();
                    pila.BuscarCarnet(carnet1);
                    break;
                case 4:
                    pila.Eliminar();
                    break;
                case 5:
                    System.out.println("Salir");
                    break;
                default:
                    break;
            }
            
        }while(opc!=5);
        
    }
    
}
