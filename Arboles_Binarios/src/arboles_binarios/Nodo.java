/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles_binarios;

/**
 *
 * @author Usuario
 */
public class Nodo {
    private int dato;
    private Nodo hijo_der, hijo_izq;

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getHijo_der() {
        return hijo_der;
    }

    public void setHijo_der(Nodo hijo_der) {
        this.hijo_der = hijo_der;
    }

    public Nodo getHijo_izq() {
        return hijo_izq;
    }

    public void setHijo_izq(Nodo hijo_izq) {
        this.hijo_izq = hijo_izq;
    }
    
    
}
