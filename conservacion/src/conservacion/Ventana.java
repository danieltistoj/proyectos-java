/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conservacion;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Usuario
 */
public class Ventana {
    private JFrame ventana;
    private JPanel panel_1, panel_2;
    private JLabel imagen,formula1,formula2,formula3;
    private JButton iniciar;
    
    public Ventana(){ 
        formula1 = new JLabel();
        formula2 = new JLabel();
        formula3 = new JLabel();
        
        iniciar = new JButton("Iniciar");
        iniciar.setBounds(300, 0, 70, 30);

        
        ComboBox  combo = new ComboBox(); 
        ImageIcon img = new ImageIcon("C:\\Users\\Usuario\\Pictures\\palntilla_conservacion.png");
        imagen = new JLabel(img);
        imagen.setBounds(100, 0, 600, 400);
        
        panel_1 = new JPanel();
        panel_1.setBounds(0,0,800,400);
        panel_1.setBackground(Color.WHITE);
        panel_1.setLayout(null);
        panel_1.setVisible(true);
        panel_1.add(imagen);
          
        panel_2 = new JPanel();
        panel_2.setBounds(0,400,800,400);
        panel_2.setBackground(Color.WHITE);
        panel_2.setLayout(null);
        panel_2.setVisible(true);
        panel_2.add(combo.getCombo());
        panel_2.add(iniciar);
       
        
        ventana = new JFrame("Conservacion De La Energia");     
        ventana.setSize(800,800);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);
        ventana.setResizable(false);
        
        iniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(combo.getCombo().getItemAt(combo.getCombo().getSelectedIndex())=="(D) distancia"){
                 float  masa = Float.parseFloat(JOptionPane.showInputDialog("(m) Ingrese la masa"));
                 float K = Float.parseFloat(JOptionPane.showInputDialog("K N/m Ingrese constante de fuerza"));
                 float X = Float.parseFloat(JOptionPane.showInputDialog("(X) Ingrese Lo que se comprime el resorte"));
                 float coF = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el coeficiente de friccion cinetica"));
                 float vf = Float.parseFloat(JOptionPane.showInputDialog("(Vf) Ingrese la velocidad al final de la rampa"));
                 
                 float vf1 = (float) Math.pow(vf,2);
                 float X1 = (float) Math.pow(X,2);
                 
                 float D1 = (masa*vf1-K*X1);
                 float D2 = (float) (2*9.8*masa*coF);
                 float D = D1/D2;
                 JOptionPane.showMessageDialog(null,"La distancia entre la rampa y el resorte es : "+D+" m ","",JOptionPane.INFORMATION_MESSAGE);
                 ImageIcon img1 = new ImageIcon("C:\\Users\\Usuario\\Pictures\\cap5.png");
                 ImageIcon img2 = new ImageIcon("C:\\Users\\Usuario\\Pictures\\cap7.png");
                 ImageIcon img3 = new ImageIcon("C:\\Users\\Usuario\\Pictures\\D.png");
                 formula1.setIcon(img1);
                 formula2.setIcon(img2);
                 formula3.setIcon(img3);
                 formula1.setBounds(0, 60, 496, 55);
                 formula2.setBounds(0, 115, 296, 65);
                 formula3.setBounds(0, 180, 197, 74);
                 panel_2.add(formula1);
                 panel_2.add(formula2);
                 panel_2.add(formula3);
                 panel_2.repaint();
                 //resultado D
                    
                         
                }
                if(combo.getCombo().getItemAt(combo.getCombo().getSelectedIndex())=="(Vf)Velocidad al final de la rampa"){
                    float  Y = Float.parseFloat(JOptionPane.showInputDialog("(Y) Ingrese la altura de la rampa"));
                    float  v0 = Float.parseFloat(JOptionPane.showInputDialog("(V0) Ingrese la velociada inicial"));
                    
                    float v01 = (float) Math.pow(v0,2);
                    float r1 = (float) ((2*9.8*Y)+v01);
                    float r2 = (float) Math.sqrt(r1);
                    JOptionPane.showMessageDialog(null,"La velocidad al finale de la rampa es: "+r2+" m/s ","",JOptionPane.INFORMATION_MESSAGE);
                    ImageIcon img1 = new ImageIcon("C:\\Users\\Usuario\\Pictures\\cap3.png");
                    ImageIcon img2 = new ImageIcon("C:\\Users\\Usuario\\Pictures\\cap4.png");
                    ImageIcon img3 = new ImageIcon("C:\\Users\\Usuario\\Pictures\\velocidadF.png");
                    
                    formula1.setIcon(img1);
                    formula1.setBounds(0, 60, 690,57);
                    formula2.setIcon(img2);
                    formula2.setBounds(0, 117, 487, 58);
                    formula3.setIcon(img3);
                    formula3.setBounds(0, 175, 188, 69);
                    panel_2.add(formula3);
                    panel_2.add(formula2);
                    panel_2.add(formula1);
                    panel_2.repaint();
                    //resultado r2
                    
                  
                }
                if(combo.getCombo().getItemAt(combo.getCombo().getSelectedIndex())=="(V) Velocidad inicial"){
                    float  Y = Float.parseFloat(JOptionPane.showInputDialog("(Y) Ingrese la altura de la rampa"));
                    float  vf = Float.parseFloat(JOptionPane.showInputDialog("(Vf) Ingrese la velociada final"));
                    
                    float vf1 = (float) Math.pow(vf,2);
                    float r1 = (float) (vf1-(2*9.8*Y));
                    float r2 = (float) Math.sqrt(r1);
                    System.out.println(r2);
                    JOptionPane.showMessageDialog(null,"La velocidad inicial es: "+r2+" m/s ","",JOptionPane.INFORMATION_MESSAGE);
                    ImageIcon img1 = new ImageIcon("C:\\Users\\Usuario\\Pictures\\cap3.png");
                    ImageIcon img2 = new ImageIcon("C:\\Users\\Usuario\\Pictures\\cap4.png");
                    ImageIcon img3 = new ImageIcon("C:\\Users\\Usuario\\Pictures\\velocidad0.png");
                    formula1.setIcon(img1);
                    formula2.setIcon(img2);
                    formula3.setIcon(img3);
                    formula1.setBounds(0, 60, 690, 57);
                    formula2.setBounds(0, 117, 487, 58);
                    formula3.setBounds(0, 175, 201, 47);
                    panel_2.add(formula1);
                    panel_2.add(formula2);
                    panel_2.add(formula3);
                    panel_2.repaint();
                    
                    //resultado r2
                }
                if(combo.getCombo().getItemAt(combo.getCombo().getSelectedIndex())=="(X) Compresion del resorte"){
                    float masa = Float.parseFloat(JOptionPane.showInputDialog("(m) Ingrese la masa"));
                    float vf = Float.parseFloat(JOptionPane.showInputDialog("(vf)Ingrese velocidad al final de la rampa"));
                    float coF = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el coeficiente de friccion cinetica"));
                    float D = Float.parseFloat(JOptionPane.showInputDialog("(D) Ingrese la distancia entre la rampa y el resorte"));
                    float K = Float.parseFloat(JOptionPane.showInputDialog("K N/m Ingrese constante de fuerza"));
                    
                    float vf1 = (float) Math.pow(vf,2);
                    float X1 =(float) ((float) (masa*vf1)-(masa)*2*9.8*D*(coF));
                    System.out.println(X1);
                    float X2 = X1/K;
                    float X3 = (float) Math.sqrt(X2);
                    JOptionPane.showMessageDialog(null,"La longitud que se comprime el resorte es: "+X3+" m ","",JOptionPane.INFORMATION_MESSAGE);
                    ImageIcon img1 = new ImageIcon("C:\\Users\\Usuario\\Pictures\\cap5.png");
                    ImageIcon img2 = new ImageIcon("C:\\Users\\Usuario\\Pictures\\cap6.png");
                    ImageIcon img3 = new ImageIcon("C:\\Users\\Usuario\\Pictures\\X.png");
                    formula1.setIcon(img1);
                    formula2.setIcon(img2);
                    formula3.setIcon(img3);
                    formula1.setBounds(0, 60, 496,55);
                    formula2.setBounds(0, 115, 324,66);
                    formula3.setBounds(0, 181, 240, 94);
                    panel_2.add(formula1);
                    panel_2.add(formula2);
                    panel_2.add(formula3);
                    panel_2.repaint();
                    
                    //resultada X3
                }
                if(combo.getCombo().getItemAt(combo.getCombo().getSelectedIndex())=="Coificiente de friccion entre la rampa y el resorte"){
                    float masa = Float.parseFloat(JOptionPane.showInputDialog("(m) Ingrese la masa"));
                    float vf = Float.parseFloat(JOptionPane.showInputDialog("(vf) Ingrese la velociada al final de la rampa"));
                    float X = Float.parseFloat(JOptionPane.showInputDialog("(X) Ingrese lo que se comprime el resorte"));
                    float D = Float.parseFloat(JOptionPane.showInputDialog("(D) Ingrese la distancia entre la rampa y el resorte"));
                    float K = Float.parseFloat(JOptionPane.showInputDialog("K N/m Ingrese constante de fuerza"));
                    
                    float vf1  = (float) Math.pow(vf,2);
                    float X1 = (float) Math.pow(X,2);
                    float coF1 = masa*vf1-X1;
                    float coF2 =(float) (2*9.8*D*masa);
                    float coF3 = coF1/coF2;
                    JOptionPane.showMessageDialog(null,"El coeficiente de friccion entre la rampa y el resorte es: "+coF3+"","",JOptionPane.INFORMATION_MESSAGE);
                     ImageIcon img1 = new ImageIcon("C:\\Users\\Usuario\\Pictures\\cap5.png");
                    ImageIcon img2 = new ImageIcon("C:\\Users\\Usuario\\Pictures\\cap7.png");
                    ImageIcon img3 = new ImageIcon("C:\\Users\\Usuario\\Pictures\\Uc.png");
                    formula1.setIcon(img1);
                    formula2.setIcon(img2);
                    formula3.setIcon(img3);
                    formula1.setBounds(0, 60, 496, 55);
                    formula2.setBounds(0, 115, 296, 65);
                    formula3.setBounds(0, 180,212,82);
                    panel_2.add(formula1);
                    panel_2.add(formula2);
                    panel_2.add(formula3);
                    panel_2.repaint();
                    //resultado coF3
                             
                    
                }
                
                if(combo.getCombo().getItemAt(combo.getCombo().getSelectedIndex())=="K N/m constante de fuerza"){
                    float masa = Float.parseFloat(JOptionPane.showInputDialog("(m) Ingrese la masa"));
                    float vf = Float.parseFloat(JOptionPane.showInputDialog("(vf) Ingrese la velociada al final de la rampa"));
                    float X = Float.parseFloat(JOptionPane.showInputDialog("(X) Ingrese lo que se comprime el resorte"));
                    float coF = Float.parseFloat(JOptionPane.showInputDialog("Ingrese le coeficiente de friccion cinetica"));
                    float D = Float.parseFloat(JOptionPane.showInputDialog("D Ingrese la distancia entre la rampa y el resorte"));
                    
                    float vf1  = (float) Math.pow(vf,2);
                    float X1 = (float) Math.pow(X,2);
                    
                    float K1 =(float) (masa*(vf1-(2*9.8*coF*D)));
                    float K2 = K1/X1;
                    JOptionPane.showMessageDialog(null,"La constante de fuerza es: "+K2+" N/m ","",JOptionPane.INFORMATION_MESSAGE);
                     ImageIcon img1 = new ImageIcon("C:\\Users\\Usuario\\Pictures\\cap5.png");
                    ImageIcon img2 = new ImageIcon("C:\\Users\\Usuario\\Pictures\\cap6.png");
                    ImageIcon img3 = new ImageIcon("C:\\Users\\Usuario\\Pictures\\K.png");
                    formula1.setIcon(img1);
                    formula2.setIcon(img2);
                    formula3.setIcon(img3);
                    formula1.setBounds(0, 60, 496, 55);
                    formula2.setBounds(0, 115, 324, 66);
                    formula3.setBounds(0, 181,230,65);
                    panel_2.add(formula1);
                    panel_2.add(formula2);
                    panel_2.add(formula3);
                    panel_2.repaint();
                    //resultado es K2
                }
                    
                    
            }

            
        });
        
  
        
        
        ventana.add(panel_2);
        ventana.add(panel_1);
        ventana.setVisible(true);
    }
       
    
}
