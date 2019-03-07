/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_resolucion2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Parcial_resolucion2 {


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
       Pila pila = new Pila();
       do{
           System.out.println("1-Nuevo curso. ");
           System.out.println("2-Mostrar cursos. ");
           System.out.println("3-salir. ");
           System.out.print("Ingrese una opcion: ");
                   opc = Entrada1.nextInt();
                   switch(opc){
                       case 1:
                           System.out.print("Ingrese nombre curso: ");
                           String nombre_curso = Entrada2.nextLine();
                           
                           System.out.print("Ingrese codigo: ");
                           int codigo =Entrada3.nextInt();
                           Curso curso = new Curso(codigo,nombre_curso);//creo el objeto curso y le mando los atributos
                           Cola_est cola = new Cola_est(); // creo un objeto cola 
                           
                           System.out.print("Ingrese No. estudiante: "); // pido cuantos estudiantes desean ingresar a la cola
                           int cantidad = Entrada4.nextInt(); // la cantidad de estudiantes
                           int conta=0;
                           
                           while(conta<cantidad){ // hago un ciclo para ingresar todos los estudiantes a la cola
                               System.out.print("Ingrese nombre: ");
                               String nombre1 = Entrada5.nextLine();
                               System.out.print("Ingrese apellido: ");
                               String apellido = Entrada6.nextLine(); 
                               
                              Estudiante estudiante =new Estudiante(nombre1, apellido); // creo el objeto estudiante y le mando los atributos que necesita
                              Nodo_estudiante nuevo = new Nodo_estudiante(); // creo un nodo de tipo estudiante
                              nuevo.setEstudiante(estudiante);//ingrese el objeto estudiante al nodo estudiante 
                              
                              cola.Insertar(nuevo); //inserto el nodo estudiante a la cola
                              conta++;
                           }
                           curso.setCola(cola); //ingrese a la coda al objeto curso
                           Nodo_curso nuevo_curso = new Nodo_curso(); //creo un nodo curso
                           nuevo_curso.setCurso(curso);// ingreso el curso al nodo curso
                           pila.Insertar(nuevo_curso);//inserto el nodo a la pila 
                           
                           break;
                           // Mostrar*******************
                       case 2:
                           Nodo_curso nodo_curso = pila.Tope();//digo que el tope de la pila va ser nodo_curso
                           while(nodo_curso!=null){//el ciclo termina se el nodo curso es igual a nulo
                               System.out.println("curso: "+nodo_curso.getCurso().getNombre());//nodo curso va a contener a un curso y ese curso el nombre del curso.
                               Cola_est cola_est = nodo_curso.getCurso().getCola();// hago un objeto cola para poner la cola de estudaintes que contiene curso
                               Nodo_estudiante nodo_estudiante = cola_est.Tope();//digo que el tope de la cola sera igual a un nodo llamado nodo_estudiantes
                                while(nodo_estudiante!=null){ // este ciclo termina hasta que se "recorra" la cola, que en realidad se esta desencolando
                                    
                                    System.out.println("nombre: "+nodo_estudiante.getEstudiante().getNombre()+"apellido: "+nodo_estudiante.getEstudiante().getApellido());
                                    cola_est.Desencola(); // desencolo despues de a ver mostrado los datos de estudiante 
                                    nodo_estudiante=cola_est.Tope();  // ahora el nodo sera igual al nuevo tope que seria el siguiente del tope anterior 
                                   break;   
                                }   
                                
                                pila.Desapilar();//al terminar el ciclo de estudiantes desapilo
                                nodo_curso = pila.Tope();//ahora el nodo curso sera igual al nuevo tope de la pila.
                           }
                           
                           break;
                       
                       default:
                          
                           break;
                           
                              
                   }
           
       }while(opc!=3);
        
    }
    
}
