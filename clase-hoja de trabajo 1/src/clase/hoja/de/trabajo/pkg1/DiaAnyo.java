/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.hoja.de.trabajo.pkg1;

/**
 *
 * @author Usuario
 */
public class DiaAnyo {
    private int dia;
    private int mes;
    private int yeard;
    
    public DiaAnyo(){
        
    } 
    public void asignar_datos(int d, int m, int y){
        
    if(d>0&&d<=30){
        dia=d;
    }
    if(m>0&&m<=12){
       mes=m; 
    }
    yeard=y;
    
    }
    public void sumarMes(){
        if(mes<=12){
            mes++;
        }
        else if(mes==12){
            mes=1;
            yeard++;
        }
       
    }
    public void sumarYeard(){
        yeard++;
      
    }
    public void sumarDia(){
        if (mes==2){
        if(dia<=28){
        dia++;
    }
        else if(dia==28)
        {
            dia=1;
            mes++;
        }
        }
        else{
        if(dia<=30){
        dia++;
    }
        else if(dia==30)
        {
            dia=1;
            mes++;
        }
    }
    }
    
    public String RetornarFecha(){
        return dia+"-"+mes+"-"+yeard;
    }
    
}
