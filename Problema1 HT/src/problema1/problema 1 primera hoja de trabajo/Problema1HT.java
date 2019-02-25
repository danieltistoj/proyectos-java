/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1.ht;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Problema1HT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese el primer numero: ");
        Scanner entrada1 = new Scanner(System.in);
        int num1 = entrada1.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        Scanner entrada2 = new Scanner(System.in);
        int num2 = entrada2.nextInt();
        System.out.println("");
        Calculadora total = new Calculadora();
        total.Suma(num1, num2);
        total.Resta(num1, num2);
        total.Multiplicacion(num1, num2);
        total.Modulo_div_entera(num1, num2);
        
        
                
    }
    
}
