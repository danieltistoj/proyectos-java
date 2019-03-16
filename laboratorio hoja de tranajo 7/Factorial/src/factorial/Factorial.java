/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author Usuario
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=5;
        int []vector={9,3,4};
         int size = vector.length;
        System.out.println("***Factorial***");
        System.out.println(Factor(n));
        System.out.println("***Factores***");
        System.out.println(Factores(n,n));
        System.out.println("***Vector***");
        Mostrar_vector(vector, size,size);
    }
   static public int Factor(int actual){
        if(actual==1){
            actual=1;
        }
        else{
            actual=actual*(Factor(actual-1));
        }
        return actual;
    }
   
   static public String Factores(int actual,int num){
       String cadena="";
       int aux = actual;
       if(actual>0){
         if(num%aux==0){
             cadena = aux+" "+Factores(actual-1,num);
         }
         else{
             cadena = Factores(actual-1, num)+"  ";
         }
       }
       return cadena;
   }
   
   static public void Mostrar_vector(int []vector,int size,int u_posicion){
 
       if(size>0){
           System.out.println("posicion: "+(size-1)+" valor: "+vector[size-1]);
           Mostrar_vector(vector, size-1,u_posicion);
       }
       if(size==u_posicion){
           System.out.println("suma: "+Suma(vector, size));
       }
       
     }
   static public int Suma(int []vector,int size){
       int suma = 0;
       if(size>0){
           suma = vector[size-1]+Suma(vector, size-1);
       }
       return suma;
   }
}
  

  
