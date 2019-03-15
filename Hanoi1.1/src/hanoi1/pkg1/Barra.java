/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi1.pkg1;

import java.awt.Color;
import javax.swing.JLabel;


public class Barra {
    JLabel barra;
    
   public Barra(){
        barra = new JLabel();
        barra.setBounds(185, 100, 30, 400);
        barra.setOpaque(true);
        barra.setBackground(Color.DARK_GRAY);
   }

    public JLabel getBarra() {
        return barra;
    }

    public void setBarra(JLabel barra) {
        this.barra = barra;
    }
    
    
}
