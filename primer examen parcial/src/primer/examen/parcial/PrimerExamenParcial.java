/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer.examen.parcial;

import java.util.Scanner;


public class PrimerExamenParcial {

  
    public static void main(String[] args) {
       Scanner Entrada1=new Scanner(System.in);
       Scanner Entrada2=new Scanner(System.in);
       Scanner Entrada3=new Scanner(System.in);
       Scanner Entrada4=new Scanner(System.in);
       Scanner Entrada5=new Scanner(System.in);
       Scanner Entrada6=new Scanner(System.in);
       int opc = 0;
       Pila Cursos = new Pila();
       do{
           System.out.println("1-Ingresar curso. ");
           System.out.println("2- Mostrar");
           System.out.println("3-Salir.");
           System.out.print("Ingrese una opcion: ");
                   opc = Entrada1.nextInt();
                   switch(opc){
                       case 1:
                           int conta=0;
                           System.out.print("Nombre Curso: ");
                           String nombreC = Entrada2.nextLine();
                           System.out.print("Codigo: ");
                           int codigoC = Entrada3.nextInt();
                           
                           System.out.print("Ingrese numero de estudiantes: ");
                           int cantiEstu = Entrada4.nextInt();
                           Cursos.Insertar(nombreC,codigoC);
                           System.out.println("\nDatos Estudiantes");
                           Curso curso_actual = Cursos.getTope();
                           while(conta<cantiEstu){
                               
                           System.out.print("Ingrese nombre estuiante "+(conta+1)+": ");
                           String nombreE = Entrada5.nextLine();
                           System.out.print("Ingrese apellido estudiante "+(conta+1)+": ");
                           String apellidoE = Entrada6.nextLine();
                           curso_actual.Insertar(nombreE, apellidoE);
                           conta++;
                           }
                           
                           break;
                       case 2:
                           if(Cursos.Vacia()){
                           System.out.println("no hay cursos en la pila");
                       }
                           else{
                           System.out.println("LISTA DE CURSOS");
                           System.out.println("*********************************************************************************");
                           Cursos.Mostrar();
                       }
                           break;
                       case 3:
                           
                           break;
                       case 4:
                          
                           break;
                       default:
                         
                           break;
                           
                              
                   }
           
       }while(opc!=3);
    } 
    }
    

