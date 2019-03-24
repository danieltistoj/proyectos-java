/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_doble;

/**
 *
 * @author Usuario
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Lista lista = new Lista();
    Lista lista2 = new Lista();
    
    lista.Inst_tope(5);
    lista.Inst_fondo(6);
    lista.Inst_tope(7);
    lista.Inst_tope(8);
    
    lista.Mostrar();
    System.out.println("\n");
    lista.Mostrar_ant_sig();
    
    System.out.println("\n");
    lista2.Inst_fondo(5);
    lista2.Inst_fondo(6);
    lista2.Inst_fondo(7);
    lista2.Inst_fondo(8);
    
    
    lista2.Mostrar();
    System.out.println("\n");
    lista2.Mostrar_ant_sig();
    }
    
}
