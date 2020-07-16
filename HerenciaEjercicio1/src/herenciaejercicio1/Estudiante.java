/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package herenciaejercicio1;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Estudiante extends Persona{ // con exteds Persona, indicamos que esta clase va ha heredar los atributos y metodos de la clase persona. Esta clase seria una hija de Persona.
private int codigoEstudiante;
private float notaFinal;

//constructor 
public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal){
    super(nombre,apellido,edad); //con esto indicamos que estos atributos ya estan inicializados, ya que son heredados de la clase padre. 
    this.codigoEstudiante = codigoEstudiante;
    this.notaFinal = notaFinal;
}

public void mostrarDatos(){
    //Esta clase hereda los metodos de la clase Persona, por eso utilizamos guetes (get) para obtener: nombre, apellido y persona
    System.out.println("Nombre: "+getNombre()+
            "\nApellido: "+getApellido()+"\nEdad: "+getEdad()+
            "\nCodigo Estudiante: "+codigoEstudiante+"\nNota Final: "+notaFinal);
}
}
