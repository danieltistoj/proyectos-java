/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucion2;


import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class Imagen {
    JLabel imagen = new JLabel("dfsaf");

    public Imagen(String n,int ancho, int alto){
      ImageIcon icon = new ImageIcon(n); 
      imagen.setIcon(icon);
      imagen.setBounds(0,0,icon.getIconWidth(),icon.getIconHeight());
      
    }
    
    public JLabel getImagen() {
        return imagen;
    }

    public void setImagen(JLabel imagen) {
        this.imagen = imagen;
    }
    
    
}
