/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer.examen.parcial;

/**
 *
 * @author datos
 */
public class Pila {
    private Curso tope;
    private int size=0;
    
    public void Insertar(String nombre, int codigo){
        Curso nuevo = new Curso(codigo, nombre);
        if(Vacia()){
            tope = nuevo;
        }
        else{
            Curso aux = tope;
            nuevo.setSig(aux);
            tope=nuevo;
            
        }
        size++;
    }
    
    public void Mostrar(){
        Curso aux =tope;
        while(aux!=null){
            
            System.out.println("Nombre curso: "+aux.getNombre()+" Codigo: "+aux.getCodigo());
            System.out.println(aux.Mostrar());
            System.out.println("*******************************************************************************************");
            aux = aux.getSig();
        }
     
    }

    public Curso getTope() {
        return tope;
    }
    
    
    
    
    public boolean Vacia(){
        return(tope==null)?true:false;
    }
    
}
