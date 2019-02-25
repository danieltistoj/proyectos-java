/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodo_pila;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Nodo {
    private int Edad;
    private String Nombre;
    private String Curso;
    private int Carnet;
    Nodo siguiente;
    
    public Nodo(int e, String n, String c, int x){ //CONSTRUCTOR
        this.Edad = e;
        this.Nombre = n;
        this.Curso = c;
        this.Carnet = x;
        this.siguiente = null;
    }
    
    public void cambiarNombre(String n){
        Nombre = n;
    }
    public void cambiarEdad(int e){
        Edad = e;
    }
    public void cambiarCurso(String c){
        Curso = c;
    }
    public void cambiarCarnet(int x){
        Carnet = x;
    }
    public Nodo obtenerSiguinete(){
      return siguiente;
    }
    public void enlazarSiguiente(Nodo x){
        siguiente = x;   
    }
    
    public String mostrarNombre(){
        return Nombre;
    }
    public int mostrarEdad(){
        return Edad;
    }
    public String mostrarCurso(){
        return Curso;
    }
    public int mostarCarnet(){
        return Carnet;
    }
    
   
}
