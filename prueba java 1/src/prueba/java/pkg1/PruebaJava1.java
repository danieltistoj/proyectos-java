
package prueba.java.pkg1;
import java.util.Scanner;
public class PruebaJava1 {
  //println es para que se pueda escribir abajo del texto y print es para que escriba a la par del texto.
  
    public static void main(String[] args) {
      int n=0;
      char m='k';
      boolean k=true;
      System.out.println("el valor booleana es: "+k);
      System.out.println("el caracter es: "+m);
      System.out.println("el numero es: "+n);
      
       System.out.print("\nIngrese una cadena: ");
       
      Scanner entrada=new Scanner(System.in);
      String cadena=entrada.nextLine();
      System.out.println("**esto es lo que ingrese** "+cadena);
      
     System.out.print("\nIngrese la cadena 2: ");

     Scanner entrada2=new Scanner(System.in);
      String cadena2=entrada2.nextLine();
      System.out.println("Esto es lo que ingres en la cadena 2: "+cadena2);
      
    }
    
}

  
