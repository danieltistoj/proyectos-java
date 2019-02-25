/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import javax.swing.JFrame; //libreria
public class Ventana extends  JFrame {
    public Ventana(){
        this.setSize(500, 500);//Establecer tamano de la ventana
        setLocation(650,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);//establecer un titulo
        setLocationRelativeTo(null);
        setTitle("PRUEBA VENTANA");
    }
    
}
