/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1.pkg1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Prueba11 {

   
    public static void main(String[] args) {
       Scanner Entrada1=new Scanner(System.in);
       Scanner Entrada2=new Scanner(System.in);
       Scanner Entrada3=new Scanner(System.in);
       Scanner Entrada4=new Scanner(System.in);
       Scanner Entrada5=new Scanner(System.in);
       
       Pila pila = new Pila();
       
        System.out.println("nombre curso: ");
        String nombre_c = Entrada3.nextLine();
        System.out.println("codigo: ");
        int codigo = Entrada4.nextInt();
        
        Curso curso = new Curso();
        curso.setNombre(nombre_c);
        curso.setCodigo(codigo);
       
        System.out.println("nombre: ");
        String nombre = Entrada1.nextLine();
        System.out.println("apellido: ");
        String apellido = Entrada2.nextLine(); 
        
        Estudiante nuevo_est = new Estudiante(nombre, apellido);
        NodoCo nodo_est = new NodoCo();
        nodo_est.setEst(nuevo_est);
        
        Colaes cola = new Colaes();
        cola.insertar(nodo_est);
        
        curso.setEstu(cola);
        Nodopila nuevo_curso = new Nodopila();
        nuevo_curso.setCurso(curso);
        
        pila.insertar(nuevo_curso);
        
        
        

        
        
        
      
        
       
    }
    
}
