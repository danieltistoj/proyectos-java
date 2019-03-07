/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1.pkg1;

/**
 *
 * @author Usuario
 */
public class Nodopila {
    private Nodopila siguiente;
    private Curso curso;

    public Nodopila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodopila siguiente) {
        this.siguiente = siguiente;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    
    
}
