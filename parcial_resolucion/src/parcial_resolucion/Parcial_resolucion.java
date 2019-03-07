/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_resolucion;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Parcial_resolucion {


    public static void main(String[] args) {
       Scanner Entrada1=new Scanner(System.in);
       Scanner Entrada2=new Scanner(System.in);
       Scanner Entrada3=new Scanner(System.in);
       Scanner Entrada4=new Scanner(System.in);
       Scanner Entrada5=new Scanner(System.in);
       Scanner Entrada6=new Scanner(System.in);
       Scanner Entrada7=new Scanner(System.in);
       Scanner Entrada8=new Scanner(System.in);
       
       int opc = 0;
       Pila_curso pila = new Pila_curso();
       do{
           System.out.println("1-Nuevo curso. ");
           System.out.println("2-Mostrar cursos. ");
           System.out.println("3-Salir.");
           System.out.print("Ingrese una opcion: ");
                   opc = Entrada1.nextInt();
                   switch(opc){
                       case 1:
                           
                           System.out.print("Ingrese el nombre del curso: ");
                           String nombre_curso = Entrada2.nextLine();
                           System.out.print("Ingrese codigo: ");
                           int codigo = Entrada3.nextInt();
                           System.out.println("Ingrese la cantidad de estudiantes: ");
                           int cant = Entrada4.nextInt();
                           Curso curso = new Curso(nombre_curso,codigo);
                           Cola_estudiante cola_est = new Cola_estudiante();
                           int conta=0;
                           while(conta<cant){
                               
                               System.out.print("Ingrese nombre estudiante "+(conta+1)+": ");
                               String nombre_est = Entrada5.nextLine();
                               System.out.print("Ingrese apellido estudiante "+(conta+1)+": ");
                               String apellido_est = Entrada6.nextLine();
                               Estudiante estudiante = new Estudiante(nombre_est,apellido_est);
                               Nodo nuevo = new Nodo();
                               nuevo.setEst(estudiante);
                               cola_est.Insertar(nuevo);
                               conta++;
                               
                           }
                           curso.setEst(cola_est);
                           Nodo nuevo_curso = new Nodo();
                           nuevo_curso.setCurso(curso);
                           pila.Insertar(nuevo_curso);
                           break;
                       case 2:
                           System.out.println("**********CURSOS**********");
                           int conta1=1, conta2=1;
                           Nodo elemento = pila.Tope();
                           conta2=1;
                          while(elemento!=null){
                              System.out.println(conta2+")"+"Curso: "+pila.Tope().getCurso().getNombre());
                              Cola_estudiante aux = pila.Tope().getCurso().getEst(); 
                              Nodo elemento2 = aux.Cima();
                              conta1=1;
                              while(elemento2!=null){
                                  Nodo aux2 = aux.Cima();
                                  System.out.println("Estudiante "+conta1+" : "+elemento2.getEst().getNombre()+" "+elemento2.getEst().getApellido());
                                  aux.Desencolar();
                                  elemento2=aux.Cima();
                                  conta1++;
                              }
                              System.out.println("..................................................................");
                              pila.Desapilar();
                              elemento = pila.Tope();
                              conta2++;
                          }
                          opc =3;
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
