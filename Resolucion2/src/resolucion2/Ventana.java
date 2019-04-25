/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucion2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class Ventana {
     private JFrame ventana;
    private JPanel panel_img, panel_flechas, panel_cargar, informacion;
    private JButton boton_izq, boton_der, boton_cargar,boton_ordenar,boton_borrar;
    private JLabel url1,nombre1,size1,numero1, url2,nombre2,size_2,numero_2;
    private JTextField url, nombre, size, numero;
    private Nodo auxiliar;
    private boolean Inicio=false;
    private Lista lista = new Lista();
    
    public Ventana(){
        nombre2  = new JLabel("Nombre:");
        size_2 = new JLabel("Size:");
        numero_2 = new JLabel("Numero:");
        
        nombre2.setBounds(350, 20, 100, 20);
        size_2.setBounds(350, 100, 100, 20);
        numero_2.setBounds(350,160, 100, 20);
        
  
        url1 = new JLabel("URL");
        url1.setBounds(0, 0, 100, 20);
        url = new JTextField();
        url.setBounds(0, 20, 70, 20);
        
        nombre1 = new JLabel("NOMBRE");
        nombre1.setBounds(0, 80, 100, 20);
        nombre = new JTextField();
        nombre.setBounds(0, 100, 70, 20);
        
        size1 = new JLabel("SIZE");
        size1.setBounds(0, 160, 70, 20);
        size = new JTextField();
        size.setBounds(0, 180, 70, 20);
        
        numero1 = new JLabel("NUMERO");
        numero1.setBounds(0, 240, 70, 20);
        numero = new JTextField();
        numero.setBounds(0, 260, 70, 20);


        boton_der = new JButton("sig");
        boton_der.setBounds(210,0, 70, 30);
      
        boton_izq = new JButton("ant");
        boton_izq.setBounds(70, 0, 70, 30);
        
        boton_cargar = new JButton("Cargar");
        boton_cargar.setBounds(60,320, 80, 30);
        
        boton_ordenar = new JButton("Ordenar");
        boton_ordenar.setBounds(100,0,100,50);
        boton_borrar = new JButton("Eliminar");
        boton_borrar.setBounds(100, 100, 100, 50);
       
        //inicializar paneles
        informacion = new JPanel();
        informacion.setBounds(0, 430,600, 270);
        informacion.setLayout(null);
        informacion.setVisible(true);
        informacion.add(numero_2);
        informacion.add(nombre2);
        informacion.add(size_2);
        informacion.add(boton_ordenar);
        informacion.add(boton_borrar);

        
        panel_img = new JPanel();
        panel_img.setBounds(200, 0, 400, 400);
        panel_img.setBackground(Color.WHITE);
        panel_img.setLayout(null);
        panel_img.setVisible(true);
        
        panel_flechas = new JPanel();
        panel_flechas.setBounds(200,400, 400,30);
        panel_flechas.setLayout(null);
        panel_flechas.setVisible(true);
        
        
        panel_cargar = new JPanel();
        panel_cargar.setBounds(0,0, 200,400);
        panel_cargar.setBackground(Color.LIGHT_GRAY);
        panel_cargar.setLayout(null);
        panel_cargar.setVisible(true);
        panel_cargar.add(url);
        panel_cargar.add(url1);
        panel_cargar.add(nombre);
        panel_cargar.add(nombre1);
        panel_cargar.add(size1);
        panel_cargar.add(size);
        panel_cargar.add(numero);
        panel_cargar.add(numero1);
        panel_cargar.add(boton_cargar);
        
        //agregar a panel botones
        panel_flechas.add(boton_der);
        panel_flechas.add(boton_izq);
       // panel_cargar.add(boton_cargar);
         
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
            Inicio = true;
            
            String text1 = url.getText();
       
            String text2 = nombre.getText();
          
            String text3 = size.getText();
            int size2 = Integer.parseInt(text3);
            
            String text4 = numero.getText();
            int numero2 = Integer.parseInt(text4);
            
            Imagen nueva_img = new Imagen(text1,panel_cargar.getWidth(),panel_cargar.getHeight());
            Nodo nuevo_nodo = new Nodo();
            nuevo_nodo.setUrl(text1);
            nuevo_nodo.setNombre(text2);
            nuevo_nodo.setSize(size2);
            nuevo_nodo.setNumero(numero2);
            nuevo_nodo.setClase_img(nueva_img);
            lista.Inst_fondo(nuevo_nodo);
            
               if(lista.getSize()==1){
                auxiliar = lista.getTope();   
                panel_img.add(lista.getTope().getClase_img().getImagen());
                nombre2.setText("Nombre: "+auxiliar.getNombre());
                numero_2.setText("Numero: "+auxiliar.getNumero());
                size_2.setText("Size: "+auxiliar.getSize());
                informacion.repaint();
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
                    Datos(auxiliar);
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
                    Datos(auxiliar);
                    panel_img.add(auxiliar.getClase_img().getImagen());
                    panel_img.repaint();
                    }
                }
                
            }
        });
     boton_ordenar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(lista.Vacia()){
                    JOptionPane.showMessageDialog(null,"La lista esta vacia","Error",JOptionPane.ERROR_MESSAGE); 
                }
                else{
                    lista.Ordenar();
                    auxiliar = lista.getTope();
                    
                    nombre2.setText("Nombre: "+auxiliar.getNombre());
                    numero_2.setText("Numero: "+auxiliar.getNumero());
                    size_2.setText("Size: "+auxiliar.getSize());
                }
            }
        });
     
     boton_borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(lista.Vacia()){
                  JOptionPane.showMessageDialog(null,"La lista esta vacia","Error",JOptionPane.ERROR_MESSAGE);  
                }
               JOptionPane.showMessageDialog(null,"El numero de discos debe ser distinto de 0","Error",JOptionPane.ERROR_MESSAGE); 
            }
        });
     //FIN ACCION DE BOTONES
     
      ventana.add(panel_cargar);
      ventana.add(panel_flechas);
      ventana.add(panel_img);
      ventana.add(informacion);
      ventana.setVisible(true);
    }
    public void Datos(Nodo aux){
        nombre2.setText("Nombre: "+aux.getNombre());
        numero_2.setText("Numero: "+aux.getNumero());
        size_2.setText("Size: "+aux.getSize());
       informacion.repaint();
    }
}
