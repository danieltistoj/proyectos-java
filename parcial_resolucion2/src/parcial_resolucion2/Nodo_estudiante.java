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
public class Nodo_estudiante {
   private Nodo_estudiante sig;
   private Estudiante estudiante;

    public Nodo_estudiante getSig() {
        return sig;
    }

    public void setSig(Nodo_estudiante sig) {
        this.sig = sig;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
   
   
}
