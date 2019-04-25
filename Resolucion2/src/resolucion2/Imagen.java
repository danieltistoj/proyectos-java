/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucion2;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class Imagen {
    private JLabel label;
    private Image imagen;

    public Imagen(String n){
        Cargar(n);
        
        label = new JLabel(new ImageIcon(getImagen()));
        /*
      Image imagen = null;
      URL url = new URL(n);
      Image image = ImageIO.read(url);
     */
     
     /*
     JLabel label = new JLabel(new ImageIcon(image));
     imagen1.setIcon(label.getIcon());
*/
      
    }
    public void Cargar(String n){
        try{
            URL url =new URL(n);
            imagen = ImageIO.read(url);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

  
    
}
