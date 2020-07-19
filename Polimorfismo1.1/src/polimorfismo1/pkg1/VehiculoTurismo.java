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
public class VehiculoTurismo extends Vehiculo {
private int nPuertas;

    public VehiculoTurismo(int nPuertas,String matricula, String marca, String modelo) {
        super(matricula,marca,modelo);
        this.nPuertas = nPuertas;
    }

    public int getnPuertas() {
        return nPuertas;
    }
    
    /*Esto es para sobre escribir el metodo de la clase padre o la superclase, para agregarle un apributo particular de la clase hija,
      en este caso le vamoa a agregar al metodo, mostrar el numero de puertas.
    */
    
@Override
    public String mostrarDatos(){
           return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\nNumero de puertas: "+nPuertas;
    }

}
