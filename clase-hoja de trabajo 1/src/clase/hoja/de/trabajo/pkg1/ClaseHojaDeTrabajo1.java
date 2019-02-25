/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.hoja.de.trabajo.pkg1;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ClaseHojaDeTrabajo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada1=new Scanner(System.in);
        Scanner entrada2=new Scanner(System.in);
        Scanner entrada3=new Scanner(System.in);
        Scanner entrada4=new Scanner(System.in);
        int opc=0;
        
        System.out.print("Ingrese el dia: ");
        int dia=entrada1.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes=entrada2.nextInt();
        System.out.print("Ingrese el ano: ");
        int yeard=entrada3.nextInt();
        
        DiaAnyo fecha = new DiaAnyo();
        fecha.asignar_datos(dia, mes, yeard);
        System.out.println("\n\n\n");
        
        do{
            System.out.println("***MENU***");
            System.out.println("1-sumar mes.");
            System.out.println("2-sumar dia.");
            System.out.println("3-sumar ano.");
            System.out.println("4-mostrar fecha.");
            System.out.println("5-salir.");
            System.out.print("Ingrese una opcion: ");
            opc = entrada4.nextInt();
            System.out.println("\n");
           switch(opc){
               case 1:
                   fecha.sumarMes();
                   break;
               case 2:
                     fecha.sumarDia();
                   break;
               case 3:
                  fecha.sumarYeard();
                  break;
               case 4:
                   System.out.println(" "+fecha.RetornarFecha()+" \n");
                   break;
               case 5:
                   System.out.println("salir");
                   break;
                 default:
                     System.out.println("***Ingrese un dato erroneo***");
                 break;
                   
           
           }
        }while(opc!=5);
        
    } 
    
}
