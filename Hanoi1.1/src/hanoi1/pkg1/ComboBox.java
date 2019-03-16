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
        combo.setBounds(50, 120, 70, 30);
        
            combo.addItem("Barra 2");
            combo.addItem("Barra 3");
      }

    public JComboBox getCombo() {
        return combo;
    }
}
