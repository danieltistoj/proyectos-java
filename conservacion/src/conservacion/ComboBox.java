/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conservacion;

import javax.swing.JComboBox;


public class ComboBox {
    private JComboBox combo;
    
    public ComboBox(){
        combo = new JComboBox();
        
        combo.setBounds(0, 0, 278, 30);
        combo.addItem("(D) distancia");//ya
        combo.addItem("(Vf)Velocidad al final de la rampa");//ya
        combo.addItem("(V) Velocidad inicial");//ya
        combo.addItem("Coificiente de friccion entre la rampa y el resorte");//ya
        combo.addItem("K N/m constante de fuerza");//ya
        combo.addItem("(X) Compresion del resorte");//ya
        
        
    }

    public JComboBox getCombo() {
        return combo;
    }
    
    
}
