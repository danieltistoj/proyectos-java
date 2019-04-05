/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol_avl;

/**
 *
 * @author Usuario
 */
public class Nodo {
    private int dato, altura=0;
    private Nodo hijo_izq, hijo_der;
    private int equilibrio;
    
    

    public int getEquilibrio() {
        return equilibrio;
    }

    public void setEquilibrio(int equilibrio) {
        this.equilibrio = equilibrio;
    }
    
    
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
      
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getHijo_izq() {
        return hijo_izq;
    }

    public void setHijo_izq(Nodo hijo_izq) {
        this.hijo_izq = hijo_izq;
    }

    public Nodo getHijo_der() {
        return hijo_der;
    }

    public void setHijo_der(Nodo hijo_der) {
        this.hijo_der = hijo_der;
    }

    
}
