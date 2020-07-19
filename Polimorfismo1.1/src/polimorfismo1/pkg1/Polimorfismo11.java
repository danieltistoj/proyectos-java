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
public class Polimorfismo11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*El polimorfismo son las distintas formas en las que una superclase o una clase padre puede instanciar, con respecto a sus clases hijas.
        A si mismo las clases hijas puede sobreescribir los metodos de la clase padre, para lo que le convenga a la clase hija
        */
        Vehiculo misVehiculos[] = new Vehiculo[4]; 
        
        misVehiculos[0] = new Vehiculo("GH63", "Ferrari","A89");
        misVehiculos[1] = new VehiculoTurismo(4, "78HJ","Audi","P14");
        misVehiculos[2] = new VehiculoDeportivo(500,"45GH","Toyota","KJ8");
        misVehiculos[3] = new VehiculoFurgoneta(2000,"J18","Toyota","J9");
        
        for(Vehiculo vehiculo:misVehiculos){
            System.out.println(vehiculo.mostrarDatos());
            System.out.println("");
        }
    }
    
}
