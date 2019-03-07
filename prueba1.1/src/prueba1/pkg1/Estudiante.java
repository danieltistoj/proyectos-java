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
public class Estudiante {
    private String nombre, ape;

    public Estudiante(String nombre, String ape) {
        this.nombre = nombre;
        this.ape = ape;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }
    
    
}
