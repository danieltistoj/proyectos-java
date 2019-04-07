/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class Foto {
    private JLabel imagen;
    
    public Foto(String sexo){
        
      if(sexo=="Hombre"){
        ImageIcon img = new ImageIcon("C:\\Users\\Usuario\\Pictures\\perfil_h1.png");
        imagen = new JLabel(img);
        imagen.setBounds(250,0, 200, 200); 
      }
      if(sexo=="Mujer"){
         ImageIcon img = new ImageIcon("C:\\Users\\Usuario\\Pictures\\perfil_m1.png");
        imagen = new JLabel(img);
        imagen.setBounds(250,0, 200, 200);
      }
       
        
    }

    public JLabel getImagen() {
        return imagen;
    }

    public void setImagen(JLabel imagen) {
        this.imagen = imagen;
    }
    
}
