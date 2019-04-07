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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class Ventana {
    private JFrame ventana;
    private JLabel nombre1, apellido1, edad2, carnet2, sexo;
    private JButton ant, sig, ins, rec, busc, eliminar;
    private JPanel panel, panel_1, panel_2;
    private Lista lista = new Lista();
    private Estudiante auxiliar;
   
    
    public Ventana(){
        
        nombre1 = new JLabel("Nombre");
        apellido1 = new JLabel("Apellido");
        sexo = new JLabel("Sexo");
        edad2 = new JLabel("Edad");
        carnet2 = new JLabel("Carnet");
        
        nombre1.setBounds(0, 0, 100, 50);
        apellido1.setBounds(0, 50, 100, 50);
        sexo.setBounds(0, 100, 100, 50);
        edad2.setBounds(0, 150, 100, 50);
        carnet2.setBounds(0, 200, 100, 50);
        
        
        
        
        eliminar = new JButton("Eliminar");
        eliminar.setBounds(185, 120, 90, 30);
        
       
        busc = new JButton("Buscar");
        busc.setBounds(185, 70, 90, 30);
        
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
        panel.add(nombre1);
        panel.add(apellido1);
        panel.add(edad2);
        panel.add(carnet2);
        panel.add(sexo);
        
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
        panel_2.add(busc);
        panel_2.add(eliminar);
       
        ventana = new JFrame(); 
        ventana = new JFrame("Lista De Estudiantes");
        ventana.setSize(500, 700);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);
        ventana.setResizable(false);
        

        
        ins.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                 String[] Sexo = {
            "Hombre",
            "Mujer"
           
        };
              String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre");
              String apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido");
              String sexo1 = (String) JOptionPane.showInputDialog(null, "Seleccione una carrera a cursar", "Carrera", JOptionPane.DEFAULT_OPTION,null, Sexo, null);//es para dar multiples opciones
              String edad = JOptionPane.showInputDialog(null, "Ingrese la edad");
              String carnet = JOptionPane.showInputDialog(null, "Ingrese el carnet");
                  
             if(nombre==null||apellido==null||edad==null||carnet==null){
                  JOptionPane.showMessageDialog(null,"No ingreso algun dato"+"\n"+"Intente de nuevo","Error",JOptionPane.ERROR_MESSAGE); 
                 
             }
             else{
            
              int edad1 = Integer.parseInt(edad);
              int carnet1 = Integer.parseInt(carnet);
              
              Foto foto = new Foto(sexo1);
              Estudiante estudiante = new Estudiante();
              estudiante.setFoto(foto);
              estudiante.setNombre(nombre);
              estudiante.setApellido(apellido);
              estudiante.setSexo(sexo1);
              estudiante.setEdad(edad1);
              estudiante.setCarnet(carnet1); 
              lista.Inst_Fondo(estudiante);
              
              JOptionPane.showMessageDialog(null,"Se ha ingresado al estudiante: "+estudiante.getNombre()+" "+estudiante.getApellido(),"Mensaje",JOptionPane.INFORMATION_MESSAGE); 
              nombre1.setText("Nombre: "+lista.getTope().getNombre());
              sexo.setText("Sexo: "+lista.getTope().getSexo());
              apellido1.setText("Apellido: "+lista.getTope().getApellido());
              edad2.setText("Edad: "+lista.getTope().getEdad());
              carnet2.setText("Carnet: "+lista.getTope().getCarnet());
               
              auxiliar = lista.getTope();
              panel.add(auxiliar.getFoto().getImagen());
              panel.repaint();        
           }
              
            }
        });
        
        sig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(lista.Vacia()){
                JOptionPane.showMessageDialog(null,"La lista esta vacia","Error",JOptionPane.ERROR_MESSAGE); 
            }
                else{
                    
               if(auxiliar.getSiguiente()!=null){
               panel.remove(auxiliar.getFoto().getImagen());
               auxiliar = auxiliar.getSiguiente();
                    
              nombre1.setText("Nombre: "+auxiliar.getNombre());
              apellido1.setText("Apellido: "+auxiliar.getApellido());
              sexo.setText("Sexo: "+auxiliar.getSexo());
              edad2.setText("Edad: "+auxiliar.getEdad());
              carnet2.setText("Carnet: "+auxiliar.getCarnet());
              panel.add(auxiliar.getFoto().getImagen());
              panel.repaint();
               
               } 
                    
                }
            }
        });
        
        
        
        ant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(lista.Vacia()){
              JOptionPane.showMessageDialog(null,"La lista esta vacia","Error",JOptionPane.ERROR_MESSAGE); 
                }
                else{
                     if(auxiliar.getAnterior()!=null){
               panel.remove(auxiliar.getFoto().getImagen());     
               auxiliar = auxiliar.getAnterior();
                    
              nombre1.setText("Nombre: "+auxiliar.getNombre());
              apellido1.setText("Apellido: "+auxiliar.getApellido());
              sexo.setText("Sexo: "+auxiliar.getSexo());
              edad2.setText("Edad: "+auxiliar.getEdad());
              carnet2.setText("Carnet: "+auxiliar.getCarnet());
              panel.add(auxiliar.getFoto().getImagen());
              panel.repaint();
                    
                }
                }
               
            }
        });
        
        
        busc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(lista.Vacia()){
                    JOptionPane.showMessageDialog(null,"La lista esta vacia","Error",JOptionPane.ERROR_MESSAGE); 
                }
                else{

                   String carnet = JOptionPane.showInputDialog(null, "Escriba el carnet");
                   int carnet1 = Integer.parseInt(carnet);
                   Estudiante aux = lista.Buscar(carnet1);
                   JOptionPane.showMessageDialog(null, "1) Nombre: "+aux.getNombre()+"\n"+"2) Apellido: "+aux.getApellido()+"\n"+"3) Edad: "+aux.getEdad()+"\n"+"4) Carnet: "+aux.getCarnet(),"Estudiante",JOptionPane.INFORMATION_MESSAGE);
               

                }
            }
        });
        
       
        eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(lista.Vacia()){
                   JOptionPane.showMessageDialog(null,"La lista esta vacia","Error",JOptionPane.ERROR_MESSAGE); 
 
                }
                else{
                    
                    
                }
            }
        });
        
        
        
        ventana.add(panel_2);
        ventana.add(panel_1);
        ventana.add(panel);
        ventana.setVisible(true);   
    }
}
