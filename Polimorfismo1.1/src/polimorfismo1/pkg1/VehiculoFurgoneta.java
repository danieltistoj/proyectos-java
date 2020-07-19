/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polimorfismo1.pkg1;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class VehiculoFurgoneta extends Vehiculo {
private int carga;   

    public VehiculoFurgoneta(int carga, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
@Override
    public String mostrarDatos(){
           return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"Carga: "+carga;
    }

}
