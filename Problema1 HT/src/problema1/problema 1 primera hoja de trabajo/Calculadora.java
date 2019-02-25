/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1.ht;

/**
 *
 * @author Usuario
 */
public class Calculadora {
    public Calculadora(){
        
    }
    int t;
    int m, n;
    public void Suma(int x, int y){
        
        t=x+y;
                System.out.println(t);
    } 
     public void Resta(int x, int y){
        t=x+y;
                System.out.println(t);
    } 
      public void Multiplicacion(int x, int y){
        t=x+y;
                System.out.println(t);
    } 
       public void Modulo_div_entera(int x, int y){
        m=x%y;
        n=x/y;
        System.out.println("modulo :"+m+" division entera: "+n);
    } 
}
