/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galeria;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Ventana {
    private JFrame ventana;
    private JPanel panel_img, panel_flechas, panel_cargar;
    private JButton boton_izq, boton_der, boton_cargar;
    private JLabel prueba;
    private Nodo auxiliar;
    private boolean Inicio=false;
    private Lista lista = new Lista();
    
    public Ventana(){
        
        //inicializar botones...
        ImageIcon flecha_der = new ImageIcon("flecha1.png");
        boton_der = new JButton(flecha_der);
        boton_der.setBounds(400, 50, 70, 30);
        
        ImageIcon flecha_izq = new ImageIcon("flecha2.png");
        boton_izq = new JButton(flecha_izq);
        boton_izq.setBounds(120, 50, 70, 30);
        
        boton_cargar = new JButton("Cargar");
        boton_cargar.setBounds(30, 20, 80, 30);
        //inicializar paneles
        panel_img = new JPanel();
        panel_img.setBounds(100, 80, 400, 400);
        panel_img.setBackground(Color.WHITE);
        panel_img.setLayout(null);
        panel_img.setVisible(true);
        
        panel_flechas = new JPanel();
        panel_flechas.setBounds(0, 480, 600,220);
        panel_flechas.setLayout(null);
        panel_flechas.setVisible(true);
        
        
        panel_cargar = new JPanel();
        panel_cargar.setBounds(0,0, 600,80);
        panel_cargar.setLayout(null);
        panel_cargar.setVisible(true);
        
        //agregar a panel botones
        panel_flechas.add(boton_der);
        panel_flechas.add(boton_izq);
        panel_cargar.add(boton_cargar);
         
        //inicializar ventana
     ventana = new JFrame("Galeria");
     ventana.setSize(600, 700);
     ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     ventana.setLocationRelativeTo(null);
     ventana.setLayout(null);
     ventana.setResizable(false);
     
     // *** ACCION DE BOTONES ***
     //boton cargar
     boton_cargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Inicio==false){
                    Inicio=true;
                    int conta=0;
                    while(conta<10){
                        Imagen nuva_img = new Imagen(conta);
                        Nodo nodo = new Nodo();
                        nodo.setClase_img(nuva_img);
                        lista.Inst_tope(nodo);
                        conta++;
                    }
                    auxiliar = lista.getTope();//el tope de la lista se iguala al nodo auxiliar
                    panel_img.setBackground(Color.BLACK);
                    panel_img.add(lista.getTope().getClase_img().getImagen());//se agrega la imagen del tope en el panel
                    panel_img.repaint();
                }
                
            }
        });
     //boton para mover a la derecha
     boton_der.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Inicio){
                    if(auxiliar.getSig()!=null){
                    panel_img.remove(auxiliar.getClase_img().getImagen());
                    auxiliar = auxiliar.getSig();
                    panel_img.add(auxiliar.getClase_img().getImagen());
                    panel_img.repaint();
                    }
                }
                
            }
        });
     //boton para mover a la izquierda
     boton_izq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Inicio){
                    if(auxiliar.getAnt()!=null){
                    panel_img.remove(auxiliar.getClase_img().getImagen());
                    auxiliar = auxiliar.getAnt();
                    panel_img.add(auxiliar.getClase_img().getImagen());
                    panel_img.repaint();
                    }
                }
                
            }
        });
     
     //FIN ACCION DE BOTONES
     
      ventana.add(panel_cargar);
      ventana.add(panel_flechas);
      ventana.add(panel_img);
      ventana.setVisible(true);
    }
    
}
