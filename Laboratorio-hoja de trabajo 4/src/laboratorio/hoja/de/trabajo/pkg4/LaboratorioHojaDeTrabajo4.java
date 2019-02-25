/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.hoja.de.trabajo.pkg4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class LaboratorioHojaDeTrabajo4 {

    /**
    
     */
    public static void main(String[] args) {
        Scanner Entrada1= new Scanner(System.in);
      Scanner Entrada2= new Scanner(System.in);
      Scanner Entrada3= new Scanner(System.in);
      Scanner Entrada4= new Scanner(System.in);
      Scanner Entrada5= new Scanner(System.in);
      Cola prioridad1 = new Cola();
      Cola prioridad2 = new Cola();
      Cola prioridad3 = new Cola();
      Cola prioridad4 = new Cola();
      
      int opc = 0;
     int  Antendidos =0;
     int no_Atendidos = 0;
    
      do{
          System.out.println("***MENU***");
          System.out.println("1-Ingreso de cliente.");
          System.out.println("2-Salida cliente.");
          System.out.println("3-Mostrar totales.");
          System.out.println("4-Salir.");
          System.out.print("ingrese una opcion: ");
          opc= Entrada1.nextInt();
          switch(opc){
              case 1:
                  int prioridad;
                  prioridad = (int)(Math.random()*4)+1;
                  System.out.println("Ingres el numero de cliente: ");
                  int numero_C = Entrada2.nextInt();
                  switch(prioridad){
                      case 1:
                          prioridad1.push(numero_C);
                          break;
                      case 2:
                          prioridad2.push(numero_C);                        
                                              
                          break;
                       case 3:
                         prioridad3.push(numero_C); 
                          break;
                     case 4:
                         prioridad4.push(numero_C); 
                          break;
                  }
                  System.out.println("prioridad: "+prioridad);
                  break;
              case 2:
                 System.out.println("Ingrese una prioridad: ");
                 int num_Prioridad = Entrada3.nextInt();
                 switch(num_Prioridad){
                      case 1:
                          if(prioridad1.Vacia()){
                              System.out.println("La prioridad esta vacia");
                          }
                          else{
                           System.out.println("Turno de: "+prioridad1.Tope());
                         prioridad1.Desapilar();
                          }
                          break;
                      case 2:  
                          if(prioridad2.Vacia()){
                              System.out.println("La prioridad esta vacia");
                          }
                          else{
                              System.out.println("Turno de: "+prioridad2.Tope());
                         prioridad2.Desapilar();
                          }
                          break;
                       case 3:
                           if(prioridad3.Vacia()){
                              System.out.println("La prioridad esta vacia");
                          }
                          else{
                                System.out.println("Turno de: "+prioridad3.Tope());
                         prioridad3.Desapilar();
                          }
                          break;
                     case 4:
                        if(prioridad4.Vacia()){
                              System.out.println("La prioridad esta vacia");
                          }
                          else{
                             System.out.println("Turno de: "+prioridad4.Tope());
                         prioridad4.Desapilar();
                          }
                          break;
                  }
                 int atencion = (int)(Math.random()*2)+1;
                 if(atencion==1){
                     Antendidos++;
                 }
                 else{
                     no_Atendidos++;
                 }
                  break;
                 
                //fin case 2 principal 
              case 3:
                  System.out.println("Atendidos: "+Antendidos);
                  System.out.println("No atendidos: "+no_Atendidos);
                  break;
              case 4:
         
                  break;
                  default:
                      System.out.println("Opcion erronea.");
                      break;
          }
          
      }while(opc!=4);
    }
    
    }
    

