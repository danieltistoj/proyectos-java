/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola3;

/**
 *
 * @author Usuario
 */
public class Cola {
    Nodo tope=null;
    Nodo fondo=null;
    int size=0;
    
    public void Nuevo(String a, int b){
        if(Vacia()){
            Nodo nuevo = new Nodo(a,b);
            tope = nuevo;
            fondo = nuevo;
            size++;
        }
        else{
            if(BuscarP(a)||BuscarC(b)){
                System.out.println("El producto o el codigo ya existe.");
            }
            else{
                Nodo nuevo = new Nodo(a,b);
                fondo.EnlazarSiguiente(nuevo);
                fondo = nuevo;
                size++;
            }
            
        }
    }
    
    public void MostrarTodo(){ //MOSTRAR TODOS LOS PRODUCTOS.
        Nodo aux = tope;
        if(Vacia()){
            System.out.println("El sistema esta vacio");
        }
        else{
            while(aux!=null){
                System.out.println("Producto: "+aux.ObtenerProducto()+" Codigo: "+aux.ObtenerCodigo()+" Existencias: ");
                aux = aux.ObtenerSiguiente();
            }
        }
    }
    
    public void BuscarPorCodigo(int x){ //BUSCAR UN PRODUCTO EN ESPECIFICO.
        Nodo aux = tope;
        if(Vacia()){
            System.out.println("El sistema esta vacio");
        }
        else{
            if(BuscarC(x)){
                while(aux != null){
                    if(aux.ObtenerCodigo()==x){
                        System.out.println("Producto: "+aux.ObtenerProducto());
                        break;
                    }
                    aux = aux.ObtenerSiguiente();
                }
            }
            else{
                System.out.println("El producto no existe.");
            }
        }
    }
    
    public boolean BuscarP(String x){ //BUSCAR EL PRODUCTO.
        Nodo aux = tope;
        boolean aux1 = false;
        while(aux!=null){
            if(aux.ObtenerProducto()==x){
                aux1=true;
            }
            aux = aux.ObtenerSiguiente();
        }
        return aux1;
    }
    
     public boolean BuscarC(int x){   //BUSCAR EL CODIGO.
        Nodo aux = tope;
        boolean aux1 = false;
        while(aux!=null){
            if(aux.ObtenerCodigo()==x){
                aux1=true;
            }
            aux = aux.ObtenerSiguiente();
        }
        return aux1;
    }
     
     public void BorrarTope(){
         if(Vacia()){
             System.out.println("El sistema esta vacio");
         }
         else{
         tope = tope.ObtenerSiguiente();
         size--;
                 }
     }
     
     
     
    public boolean Vacia(){  //SI ESTA VACIA LA COLA.
        return(tope==null)?true:false;
    }
}
