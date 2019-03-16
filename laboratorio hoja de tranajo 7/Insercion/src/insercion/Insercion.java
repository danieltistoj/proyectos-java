/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insercion;

/**
 *
 * @author Usuario
 */
public class Insercion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.Insertar(200);
        lista.Insertar(6);
        lista.Insertar(9);
        
        lista.Mostrar();
        System.out.println("\n");
    }
    
}
