/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galeria;

/**
 *
 * @author Usuario
 */
public class Nodo {
    private Nodo sig, ant;
    private Imagen clase_img;

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }

    public Imagen getClase_img() {
        return clase_img;
    }

    public void setClase_img(Imagen clase_img) {
        this.clase_img = clase_img;
    }
    
    
}
