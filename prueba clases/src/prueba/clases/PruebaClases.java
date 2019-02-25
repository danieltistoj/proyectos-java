/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.clases;

/**
 *
 * @author Usuario
 */
public class PruebaClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Carro toyota=new Carro(); // Esto se hace para crear un **objeto** con el cual podemos tener acceso a los atributos y metodos de la clase **Carro**
       toyota.apagar();
       toyota.avanzanr();
       toyota.encender();
       toyota.frenar();
       toyota.gasolina();
    }
    
}
