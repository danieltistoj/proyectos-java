/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_resolucion;

/**
 *
 * @author Usuario
 */
public class Curso {
    private String nombre;
    private int codigo;
    private Cola_estudiante est;

    public Curso(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
    
    

    public Cola_estudiante getEst() {
        return est;
    }

    public void setEst(Cola_estudiante est) {
        this.est = est;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    
}
