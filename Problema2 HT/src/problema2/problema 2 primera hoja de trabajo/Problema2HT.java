/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2.ht;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Problema2HT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Entrada1=new Scanner(System.in);
        Scanner Entrada2=new Scanner(System.in);
        Scanner Entrada3=new Scanner(System.in);
       System.out.println("1- Ingreso de Estudiate.");
       System.out.println("2- Ingreso de Curso.");
       System.out.print("\nIngres una opcion: ");
       int x=Entrada1.nextInt();
       switch (x){
           case 1:
               System.out.println("Ingrese el nombre del estudiante: ");
               String nombre = Entrada2.nextLine();
               Estudiante estudiante  = new Estudiante();
               estudiante.setRetornar(nombre);
               System.out.println("Se ha ingresado el estudiante "+estudiante.getRetornar());
               break;
           case 2:
               System.out.print("Ingrese el nombre del curso: ");
               String curso = Entrada3.nextLine();
               Curso curso1  = new Curso();
               curso1.setCurso(curso);
               System.out.println("Se ha ingresado el curso "+curso1.getCurso());
               break;
           default:
                   
               System.out.println("Ingrese una opcion no existente");
               break;
               
       }
       
    }
    
}
