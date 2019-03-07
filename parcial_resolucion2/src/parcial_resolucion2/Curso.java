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
public class Curso {
    private int codigo;
    private String nombre;
    private Cola_est cola;

    public Curso(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Cola_est getCola() {
        return cola;
    }

    public void setCola(Cola_est cola) {
        this.cola = cola;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
}
