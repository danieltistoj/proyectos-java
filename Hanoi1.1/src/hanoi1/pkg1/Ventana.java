/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi1.pkg1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Ventana {
    private JFrame ventana;
    private JPanel panel, panel2, panel3, panel4;
    private JButton boton2_1, boton3_1,boton1_2,boton3_2,boton1_3,boton2_3,inicio;
    private Barra barra, barra2, barra3;
    
    private Pila pila1 =new Pila();
    private Pila pila2 =new Pila();
    private Pila pila3 =new Pila();
    private JTextField texto;
    private JLabel txtB1, txtB2, txtB3, txt;
    
    
    public Ventana(){
        //botones de barras***
        boton2_1=new JButton("2");
        boton3_1=new JButton("3");
        
        boton1_2=new JButton("1");
        boton3_2=new JButton("3");
        
        boton2_3=new JButton("2");
        boton1_3=new JButton("1");
        
        boton2_1.setBounds(50, 25, 45, 45);
        boton3_1.setBounds(290, 25, 45, 45);
        
        boton1_2.setBounds(450, 25,45,45);
        boton3_2.setBounds(690, 25,45,45);
        
        boton1_3.setBounds(850, 25,45,45);
        boton2_3.setBounds(1090, 25,45,45);
        
        //fin botones de barras 
        txt = new JLabel("Numero De Discos");
        txt.setForeground(Color.WHITE);
        txt.setBounds(130, 90, 200, 30);
        
        txtB1 = new JLabel("Barra 1");
        txtB2 = new JLabel("Barra 2");
        txtB3 = new JLabel("Barra 3");
        
        txtB1.setBounds(183, 50, 80, 30);
        txtB2.setBounds(183, 50, 80, 30);
        txtB3.setBounds(183, 50, 80, 30);
        
        barra = new Barra();
        barra2 = new Barra();
        barra3= new Barra();
        inicio = new JButton("Iniciar");
        inicio.setBounds(555, 100, 100, 30);//boton inicializar
        texto = new JTextField();
        texto.setBounds(50,100,50,20);
         
        
        ventana = new JFrame("Hanoi");
        ventana.setSize(1200, 700);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);
        ventana.setResizable(false);
        
        panel = new JPanel();
        panel.setSize(400,500);
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        panel.setVisible(true);
        
        panel2 = new JPanel();
        panel2.setBounds(400,0,400,500);
        panel2.setBackground(Color.LIGHT_GRAY);
        panel2.setLayout(null);
        panel2.setVisible(true);
        
        panel3 = new JPanel();
        panel3.setBounds(800,0,400,500);
        panel3.setBackground(Color.WHITE);
        panel3.setLayout(null);
        panel3.setVisible(true);
        
        panel4 = new JPanel();
        panel4.setBounds(0,500,1200,200);
        panel4.setBackground(Color.DARK_GRAY);
        panel4.setLayout(null);
        panel4.setVisible(true);
        
        panel.add(barra.getBarra());
        panel.add(txtB1);
        
        panel2.add(barra2.getBarra());
        panel2.add(txtB2);
        
        panel3.add(barra3.getBarra());
        panel3.add(txtB3);
        
        panel4.add(inicio);
        panel4.add(texto);
        panel4.add(txt);
        panel4.add(boton2_1);
        panel4.add(boton3_1);
        panel4.add(boton1_2);
        panel4.add(boton3_2);
        panel4.add(boton1_3);
        panel4.add(boton2_3);
        
        //ACCCION DEL BOTON INICIAR..............
        inicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
             int conta=Integer.parseInt(texto.getText());
             if(conta<=15){
             int conta2=1,x=0,y=475,alto=25,ancho=400, size=conta, aux=20;  
             while(conta2<=conta){
                            Disco disco = new Disco(x,y,ancho,alto);
                            Nodo nodo = new Nodo();
                            nodo.setDisco(disco);
                            nodo.setSize(size);
                            pila1.Insertar(nodo);
                            panel.add(disco.getDisco());
                            panel.add(barra.getBarra());
                            panel.repaint();
                            y-=alto;
                            x+=10;
                            ancho-=aux;
                            size--;
                            conta2++;
                        }  
               }
            }
        });
        
        //FIN DEL BOTON INICIAR**************
        //ACCION DE boton2_1 MOVER DISCO A BARRA 2 DESDE BARRA 1
        boton2_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(pila1.vacia()!=true){
                     Nodo nodo = new Nodo();
                        int x, y, ancho, alto, size, numero_color;
                        numero_color = pila1.getTope().getDisco().getNumero_color();
                        
                    if(pila2.vacia()){
                        size = pila1.getTope().getSize();
                        x = pila1.getTope().getDisco().getX();
                        y = 475;
                        ancho = pila1.getTope().getDisco().getAncho();
                        alto = pila1.getTope().getDisco().getAlto();
                        
                        Disco disco = new Disco(x,y,ancho,alto);
                        disco.setNumero_color(numero_color);
                        nodo.setSize(size);
                        nodo.setDisco(disco);
                        panel.remove(pila1.getTope().getDisco().getDisco());
                        pila1.Desapilar();
                        pila2.Insertar(nodo);
                        
                        panel2.add(disco.getDisco());
                        panel2.add(barra2.getBarra());
                        panel.repaint();
                        panel2.repaint();
                        
                    }
                    else{
                        int numeo_discos = pila2.getSize();
                        if(pila1.getTope().getSize()<pila2.getTope().getSize()){
                        size = pila1.getTope().getSize();
                        x = pila1.getTope().getDisco().getX();
                        y = 475-(25*numeo_discos);
                        ancho = pila1.getTope().getDisco().getAncho();
                        alto = pila1.getTope().getDisco().getAlto();
                        
                        Disco disco = new Disco(x,y,ancho,alto);
                        disco.setNumero_color(numero_color);
                        nodo.setSize(size);
                        nodo.setDisco(disco);
                        panel.remove(pila1.getTope().getDisco().getDisco());
                        pila1.Desapilar();
                        pila2.Insertar(nodo);
                        
                        panel2.add(disco.getDisco());
                        panel2.add(barra2.getBarra());
                        panel.repaint();
                        panel2.repaint();
                            
                        }
                    }
                }
                else{
                    System.out.println("vacia");
                }
            }
        });
        //FIN DEL BOTON...
        //boton mover a la barra 3 desde la barra 1 boton3_1...
        boton3_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(pila1.vacia()!=true){
                       Nodo nodo = new Nodo();
                        int x, y, ancho, alto, size, numero_color;
                        numero_color = pila1.getTope().getDisco().getNumero_color();
                        
                    if(pila3.vacia()){
                        size = pila1.getTope().getSize();
                        x = pila1.getTope().getDisco().getX();
                        y = 475;
                        ancho = pila1.getTope().getDisco().getAncho();
                        alto = pila1.getTope().getDisco().getAlto();
                        
                        Disco disco = new Disco(x,y,ancho,alto);
                        disco.setNumero_color(numero_color);
                        nodo.setSize(size);
                        nodo.setDisco(disco);
                        panel.remove(pila1.getTope().getDisco().getDisco());
                        pila1.Desapilar();
                        pila3.Insertar(nodo);
                        
                        panel3.add(disco.getDisco());
                        panel3.add(barra3.getBarra());
                        panel.repaint();
                        panel3.repaint();
                        
                    }
                    else{
                        int numeo_discos = pila2.getSize();
                        if(pila1.getTope().getSize()<pila2.getTope().getSize()){
                        size = pila1.getTope().getSize();
                        x = pila1.getTope().getDisco().getX();
                        y = 475;
                        ancho = pila1.getTope().getDisco().getAncho();
                        alto = pila1.getTope().getDisco().getAlto();
                        
                        Disco disco = new Disco(x,y,ancho,alto);
                        disco.setNumero_color(numero_color);
                        nodo.setSize(size);
                        nodo.setDisco(disco);
                        panel.remove(pila1.getTope().getDisco().getDisco());
                        pila1.Desapilar();
                        pila3.Insertar(nodo);
                        
                        panel3.add(disco.getDisco());
                        panel3.add(barra3.getBarra());
                        panel.repaint();
                        panel3.repaint();
                            
                        }
                    }
                }
                else{
                    System.out.println("vacia");
                }
            }
        });
        //FIN DEL BOTON...
        //FIN DE LOS BOTONES DE LA BARRA 1.
        
    
             
        ventana.add(panel4);
        ventana.add(panel3);
        ventana.add(panel2);
        ventana.add(panel);
        ventana.setVisible(true);
        
    }
}
