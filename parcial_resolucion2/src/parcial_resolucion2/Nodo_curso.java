/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_resolucion2;

/**
 *
 * @author Usuario
 */
public class Nodo_curso {
    private Nodo_curso sig;
    private Curso curso;

    public Nodo_curso getSig() {
        return sig;
    }

    public void setSig(Nodo_curso sig) {
        this.sig = sig;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    
}
