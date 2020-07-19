/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.abstraccion;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Abstraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Solo las clases hijas pueden instanciarse.
        */
        
        Planta planta = new Planta();
        AnimalCarnivoro  animalC = new AnimalCarnivoro();
        
        
        planta.alimentarse();
        animalC.alimentarse();
    }
    
}
