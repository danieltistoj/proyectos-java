/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi1.pkg1;

import javax.swing.JComboBox;

/**
 *
 * @author Usuario
 */
public class ComboBox {
    private JComboBox combo;
      public ComboBox(){
        combo = new JComboBox();
        combo.setBounds(50, 100, 70, 30);
        int conta=1;
        while(conta<=15){
           
            combo.addItem("");
            conta++;
        }
       
      }

    public JComboBox getCombo() {
        return combo;
    }
}
