/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer.examen.parcial;


public class Curso {
    private Estudiante tope, fondo;
    private Curso sig;
    private String nombre;
    private int size=0, codigo;

    public Curso(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSig(Curso sig) {
        this.sig = sig;
    }

    public Curso getSig() {
        return sig;
    }
    
    
    
     public void Insertar(String nombre, String apellido){
        Estudiante nuevo = new Estudiante(nombre, apellido);
        if(Vacia()){
            tope = nuevo;
            fondo=nuevo;
        }
        else{
            Estudiante aux = fondo;
            aux.setSig(nuevo);
            fondo = nuevo;
        }
        
        size++;
    }
    
    public String Mostrar(){
        Estudiante aux = tope;
        int conta=0;
        String cadena="";
        while(aux!=null){
           cadena+="Estudiante "+(conta+1)+": "+aux.getNombre()+" - ";
            aux = aux.getSig();
            conta++;
        }
       return cadena;
    }
    
   
    
    public void Eliminar(){
        Estudiante aux = tope;
        tope = aux.getSig();
        aux = null;
    }
    
    public boolean Vacia(){
        return(tope==null)?true:false;
    }
    
}
