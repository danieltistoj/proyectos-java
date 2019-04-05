/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class Ventana {
    private JFrame ventana;
    private JButton ant, sig, ins, rec, busc, crear;
    private JPanel panel, panel_1, panel_2;
    private Lista lista;
    private boolean creada=false;
    
    public Ventana(){
        
        crear = new JButton("Crear");
        crear.setBounds(185, 190, 90, 30);
        
        busc = new JButton("Buscar");
        busc.setBounds(185, 120, 90, 30);
        
        rec = new JButton("Recorrer");
        rec.setBounds(185, 70, 90, 30);
        
        ins = new JButton("Insertar");
        ins.setBounds(185, 20, 90, 30);
        
        ant = new JButton("Anterior");
        ant.setBounds(100, 0, 80, 30);
        
        sig = new JButton("Siguiente");
        sig.setBounds(280, 0, 90, 30);
        
        panel = new JPanel();
        panel.setBounds(20, 20, 450, 300);
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        panel.setVisible(true);
        
        panel_1 = new JPanel();
        panel_1.setBounds(20, 320, 450, 30);
       // panel_1.setBackground(Color.BLUE);
        panel_1.setLayout(null);
        panel_1.setVisible(true);
        panel_1.add(ant);
        panel_1.add(sig);
        
           
        panel_2 = new JPanel();
        panel_2.setBounds(20, 351, 450, 300);
        //panel_2.setBackground(Color.CYAN);
        panel_2.setLayout(null);
        panel_2.setVisible(true);
        panel_2.add(ins);
        panel_2.add(rec);
        panel_2.add(busc);
        panel_2.add(crear);
       
        ventana = new JFrame(); 
        ventana = new JFrame("Lista De Estudiantes");
        ventana.setSize(500, 700);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);
        ventana.setResizable(false);
        
        crear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(creada){
                    JOptionPane.showMessageDialog(null,"Ya se a creado una lista","Error",JOptionPane.ERROR_MESSAGE); 
                }
                else
                {
                  lista = new Lista();
                  JOptionPane.showMessageDialog(null,"Se a creado una lista","Mensaje",JOptionPane.INFORMATION_MESSAGE); 
                  creada = true;
                }
                
            }
        });
        
        ins.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(creada){
                   JOptionPane.showMessageDialog(null,"El numero de discos debe ser distinto de 0","Error",JOptionPane.ERROR_MESSAGE); 
               }
               else{
                   JOptionPane.showMessageDialog(null,"Cree antes una lista","Error",JOptionPane.ERROR_MESSAGE); 
               }
            }
        });
        
        busc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(creada){
                    if(lista.Vacia()){
                        JOptionPane.showMessageDialog(null,"La lista esta vacia","Error",JOptionPane.ERROR_MESSAGE); 
                    }
                    else{
                        
                    }
                    
                }
                else{
                   JOptionPane.showMessageDialog(null,"Cree antes una lista","Error",JOptionPane.ERROR_MESSAGE);  
                }
            }
        });
        
        rec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(creada){
                    if(lista.Vacia()){
                        JOptionPane.showMessageDialog(null,"La lista esta vacia","Error",JOptionPane.ERROR_MESSAGE); 
                    }
                    else{
                        
                    }
                    
                }
                else{
                   JOptionPane.showMessageDialog(null,"Cree antes una lista","Error",JOptionPane.ERROR_MESSAGE);  
                }
            }
        });
        
        
        
        
        ventana.add(panel_2);
        ventana.add(panel_1);
        ventana.add(panel);
        ventana.setVisible(true);   
    }
}
