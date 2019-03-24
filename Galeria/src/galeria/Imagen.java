/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galeria;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class Imagen {
    private JLabel imagen;
    
    public Imagen(int posicion){
        Imagen2 array_img = new Imagen2();
        ImageIcon img = new ImageIcon(array_img.getImagenes()[posicion]);
        imagen = new JLabel(img);
        imagen.setBounds(0, 0, 400, 400);
    }

    public JLabel getImagen() {
        return imagen;
    }

    public void setImagen(JLabel imagen) {
        this.imagen = imagen;
    }
    
}
