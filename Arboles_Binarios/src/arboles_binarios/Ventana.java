/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles_binarios;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Usuario
 */
public class Ventana {
    private JFrame ventana;
    private JPanel panel_1, panel_2;
    private JButton insertar, Recorrer, vacia, raiz, Esvacio, Crear_Arb;
    private JScrollPane scrollLista;
    private DefaultListModel modelo;//declaramos el Modelo
    private JList lista_recorrido;
    private JTextField texto;
    private JComboBox combo;
    private Arbol arbol=null;
    private boolean creado=false;
    public Ventana(){
      Crear_Arb = new JButton("Crear Arbol");
      Crear_Arb.setBounds(0, 270, 100, 30);
        
      Esvacio = new JButton("EsVacio");
      Esvacio.setBounds(200, 230, 100, 30);
        
      raiz = new JButton("Raiz");
      raiz.setBounds(200, 190, 100, 30);
        
      Recorrer = new JButton("Recorrer");
      Recorrer.setBounds(200, 150, 100, 30);
        
      texto = new JTextField();
      texto.setBounds(100, 110, 70, 30);
      
      combo = new JComboBox();
      combo.addItem("Preorden");
      combo.addItem("Posorden");
      combo.addItem("Inorden");
      combo.setBounds(100, 150, 80, 30);
      
      lista_recorrido= new JList();
      lista_recorrido.setSelectionMode(ListSelectionModel.SINGLE_SELECTION );
     
      scrollLista = new JScrollPane();
      scrollLista.setBounds(0, 0,360, 100);
      scrollLista.setViewportView(lista_recorrido);  
      modelo = new DefaultListModel();
        
     insertar = new JButton("Insertar");
     insertar.setBounds(200, 110, 100, 30);
     
      
     panel_1 = new JPanel();
     panel_1.setBounds(17, 20, 360, 300);
     panel_1.setBackground(Color.LIGHT_GRAY);
     panel_1.setVisible(true);
     panel_1.setLayout(null);
     panel_1.add(insertar);
     panel_1.add(scrollLista);
     panel_1.add(texto);
     panel_1.add(combo);
     panel_1.add(Recorrer);
     panel_1.add(raiz);
     panel_1.add(Esvacio);
     panel_1.add(Crear_Arb);
     
     //ACCION DE BOTONES...
     //boton crear
     Crear_Arb.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              if(creado==false){
                  arbol = new Arbol();
                  creado=true;
                  JOptionPane.showMessageDialog(null,"Arbol creado!","Arbol",JOptionPane.INFORMATION_MESSAGE);
                  
              }
              else{
                   JOptionPane.showMessageDialog(null,"Ya se ha creado un arbol","Error",JOptionPane.ERROR_MESSAGE);
              }
              
          }
      });
     //fin boton crear
     //boton si eta vacia
     
     Esvacio.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              if(arbol==null){
                  JOptionPane.showMessageDialog(null,"El arbol esta vacio","Vacio?",JOptionPane.INFORMATION_MESSAGE);
              }
              else{
                  JOptionPane.showMessageDialog(null,"El arbol no esta vacio","Vacio?",JOptionPane.INFORMATION_MESSAGE);
              }
          }
      });
     //fin del boton de si esta vacia
     insertar.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              if(creado){
                  if(texto.getText().length()!=0){
                  int dato = Integer.parseInt(texto.getText()); // pasar un string a entero  * * * * * * * * * * * 
                  arbol.Insertar(dato); 
                  }
                  else{
                    JOptionPane.showMessageDialog(null,"Ingrese antes un valor","Error",JOptionPane.ERROR_MESSAGE);  
                  }
              }
              else{
                  JOptionPane.showMessageDialog(null,"Cree antes un arbol","Error",JOptionPane.ERROR_MESSAGE);
              }
          }
      });
     //boton recorer el arbol
     Recorrer.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              if(creado){
                    if(arbol!=null){
                  if(combo.getItemAt(combo.getSelectedIndex())=="Preorden"){
                      modelo.addElement(arbol.Ordenar_Pre());
                  }
                  if(combo.getItemAt(combo.getSelectedIndex())=="Posorden"){
                      modelo.addElement(arbol.Ordenar_Pos());
                  }
                  if(combo.getItemAt(combo.getSelectedIndex())=="Inorden"){
                      modelo.addElement(arbol.Ordenar_In());
                  }
                    lista_recorrido.setModel(modelo);
                    panel_1.repaint();
                    }
                    else{
                      JOptionPane.showMessageDialog(null,"El arbol esta vacio","Error",JOptionPane.ERROR_MESSAGE);  
                    }
              }
              else{
                   JOptionPane.showMessageDialog(null,"Cree antes un arbol","Error",JOptionPane.ERROR_MESSAGE);
              }
          }
      });
     //***boton retornar raiz***
     raiz.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
               if(creado){
                   if(texto.getText().length()!=0){
                    modelo.addElement(arbol.getRaiz().getDato());
                    lista_recorrido.setModel(modelo);
                    panel_1.repaint();
                       
                   }
                   else{
                        JOptionPane.showMessageDialog(null,"Ingrese antes un valor","Error",JOptionPane.ERROR_MESSAGE);  
                   }
                   
               }
               else{
                  JOptionPane.showMessageDialog(null,"Cree antes un arbol","Error",JOptionPane.ERROR_MESSAGE); 
               }
          }
      });
 
     ventana = new JFrame("Arbol Binario");
     ventana.setSize(400, 400);
     ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     ventana.setLocationRelativeTo(null);
     ventana.setLayout(null);
     ventana.setResizable(false);
     
     
     
     ventana.add(panel_1);
     ventana.setVisible(true);
    }
    
}
