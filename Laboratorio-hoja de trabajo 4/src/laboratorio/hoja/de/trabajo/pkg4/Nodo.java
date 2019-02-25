/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.hoja.de.trabajo.pkg4;

/**
 *
 * @author Usuario
 */
public class Nodo {
    private int num;
    private Nodo siguiente;

    public int getNum() {
        return num;
    }

    public Nodo(int num) {
        this.num = num;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
