/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodo_pila;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Nodo_pila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Scanner entrada1=new Scanner(System.in);
        Scanner entrada2=new Scanner(System.in);
        Scanner entrada3=new Scanner(System.in);
        Scanner entrada4=new Scanner(System.in);
        Scanner entrada5=new Scanner(System.in);
        Pila pila = new Pila();
        int opc=0;
        do{
        System.out.println("***PILA DE ESTUDIANTES***");
        
        System.out.println("\n1-Ingresar un nuevo estudiante.");
        System.out.println("2-Buscar un estudiante.");
        System.out.println("3-Borrar un estudiante.");
        System.out.println("4-Modificar");
        System.out.println("5-salir");
        System.out.print("\nIngrese una opcion: ");
        opc = entrada.nextInt();
        switch(opc){
            case 1:
                System.out.print("Ingrese un nombre: ");
                String nombre = entrada4.nextLine();
                System.out.print("Ingrese la edad: ");
                int edad = entrada1.nextInt();
                System.out.print("Ingrese un curso: ");
                String curso = entrada2.nextLine();
                System.out.print("Ingrese el carnet: ");
                int carnet = entrada3.nextInt();
                
                pila.nuevoElemento(edad, nombre, curso, carnet);
                break;
            case 2:
                System.out.print("Ingrese el carnet: ");
                int carnet2 = entrada5.nextInt();
                pila.setbuscarEstudiante(carnet2);
                System.out.println(pila.getRetornarNombre());
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.out.println("\n\n\n\nSalir");
                break;
            default:
                break;     
        
    }
              
        
    }while(opc!=5);  
        
        
    }
    
}
