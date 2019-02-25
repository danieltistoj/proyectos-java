/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola2;

/**
 *
 * @author Usuario
 */
public class Cola {
    Nodo tope=null;
    Nodo fondo = null;
    int size=0;
    public void NuevoNodo(String nombre, int edad, int carnet){
      
        if(Vacia()){
            Nodo nuevo = new Nodo(nombre,edad,carnet);
            tope = nuevo;
            fondo = nuevo;
             size++;
        }
        else{
            if(ExisteCarnet(carnet)){
                System.out.println("El carnet "+carnet+" ya existe.");
            }
            else{
            Nodo nuevo = new Nodo(nombre,edad,carnet);
            fondo.EnlazarSiguiente(nuevo);
            fondo = nuevo;
              size++;
            }
        }
           
    }
    
    public void MostrarElementos(){
        Nodo aux = tope;
        if(Vacia()){
            System.out.println("No hay elementos en el sistema.");
        }
        else{
            while(aux!=null){
                System.out.println("Nombre: "+aux.ObtenerNombre()+" Carnet: "+aux.ObtenerCarnet()+" Edad: "+aux.ObtenerEdad());
                aux = aux.ObtenerSiguiente();
            }
        }
    }
    
    public void Borrar(){
        Nodo aux = tope;
        tope = aux.ObtenerSiguiente();
    }
    
    public void BuscarNombre(int x){
        Nodo aux = tope;
        if(Vacia()){
            System.out.println("No hay elementos en el sistema.");
        }
        else{
            if(ExisteCarnet(x)){
            while(aux!=null){
                if(aux.ObtenerCarnet()==x){
                    System.out.println("Nombre: "+aux.ObtenerNombre()+" Carnet: "+aux.ObtenerCarnet());
                    break;
                }
                aux=aux.ObtenerSiguiente();
            }
            }
            else{
                System.out.println("El carnet "+x+" no existe.");
            }
        }
    }
    
    
       public boolean ExisteCarnet(int x){
            boolean y=false;
            Nodo aux = tope;
            while(aux!=null){
                if(aux.ObtenerCarnet()==x){
                    y=true;
                    
                }
                aux=aux.ObtenerSiguiente();
            }
            return y;
        }
    
    public boolean Vacia(){
        return(tope==null)?true:false;
    }
}
