/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi1.pkg1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;


public class Ventana {
 
    private JFrame ventana;
    private JPanel panel, panel2, panel3, panel4;
    private JButton boton2_1, boton3_1,boton1_2,boton3_2,boton1_3,boton2_3,inicio,reiniciar,aceptar, instruccion, resolver;
    private Barra barra, barra2, barra3;
    
    private Pila pila1 =new Pila();
    private Pila pila2 =new Pila();
    private Pila pila3 =new Pila();
    private JTextField texto;
    private JLabel txtB1, txtB2, txtB3, txt, pasos, txt_destino, tus_pasos, pasos1;
    private boolean iniciar=false;
    private int conta_pasos=0, opcion_des=0, discos_ingre=0, pasos_nes=0,auxiliar, destino;
    private JScrollPane scrollLista;
    private DefaultListModel modelo;//declaramos el Modelo
    private JList listaPasos;
   // conta_pasos=0; llega el conteo de pasos realizado por el usuario, opcion_des indica con un numero que pila se eligio como destino
    private ComboBox combo = new ComboBox();
    private String cadena = "Tus pasos: ";
    public Ventana(){
        //inicializar la lista pasos*
         listaPasos = new JList();
        listaPasos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION );
        //inicializar scroll*
        scrollLista = new JScrollPane();//es para hacer una barra que pueda bajar para hacer y ver la lista completa...
        scrollLista.setBounds(950, 150,200, 80);
        scrollLista.setViewportView(listaPasos);  
        //inicializar el modelo
        modelo = new DefaultListModel();
        
 //*************//////************************////******************************||||||       
        //boton resolucion.........
        resolver = new JButton("Resolver");
        resolver.setBounds(540,200, 100, 30);
        //************************
        reiniciar = new JButton("reiniciar");
        reiniciar.setBounds(740, 100, 100, 30);
        //etiqueta tus pasos;
        tus_pasos = new JLabel();
        tus_pasos.setBounds(50,200,90,30);
        tus_pasos.setForeground(Color.BLUE);
        tus_pasos.setText(cadena+conta_pasos);

         // etiqueta destino...
         txt_destino = new JLabel("Destino");
         txt_destino.setBounds(130, 120, 70, 30);
         txt_destino.setForeground(Color.WHITE);
        //boton instrucciones.
        instruccion = new JButton("Instrucciones");
        instruccion.setBounds(330, 100, 120, 30);
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
        txt.setBounds(130, 80, 200, 30);
        
        txtB1 = new JLabel("Barra 1");
        txtB2 = new JLabel("Barra 2");
        txtB3 = new JLabel("Barra 3");
        
        txtB1.setBounds(183, 50, 80, 30);
        txtB2.setBounds(183, 50, 80, 30);
        txtB3.setBounds(183, 50, 80, 30);
        
        barra = new Barra();
        barra2 = new Barra();
        barra3= new Barra();
        inicio = new JButton("Jugar");
        inicio.setBounds(540, 100, 100, 30);//boton inicializar
        texto = new JTextField();
        texto.setBounds(50,85,50,20);
         
        
        ventana = new JFrame("Hanoi");
        ventana.setSize(1200, 800);
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
        panel2.setBackground(Color.WHITE);
        panel2.setLayout(null);
        panel2.setVisible(true);
        
        panel3 = new JPanel();
        panel3.setBounds(800,0,400,500);
        panel3.setBackground(Color.WHITE);
        panel3.setLayout(null);
        panel3.setVisible(true);
        
        panel4 = new JPanel();
        panel4.setBounds(0,500,1200,300);
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
        panel4.add(reiniciar);
        panel4.add(instruccion);
        panel4.add(combo.getCombo());
        panel4.add(txt_destino);
        panel4.add(resolver);
        panel4.add(scrollLista);
        //inicio acciones de botones
         // ACCIONES BOTON INSTRUCCIONES...
        instruccion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(ventana,"1) Solo se puede mover un disco a la vez. \n"+
                "2) Un disco de mayor tamaño no puede estar sobre uno más pequeño que él mismo. \n"+
                "3)Solo se puede desplazar el disco que se encuentre arriba en cada barra. ","Instrucciones",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        //ACCCION DEL BOTON INICIAR..............
        inicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
           if(texto.getText().length()!=0){// se ve si hay algo escrito en el texto
             if(iniciar==false){
             int conta=Integer.parseInt(texto.getText());//se convierten los valores de string a int 
             if(conta<=15&&conta!=0&&conta>0){//se ve que valores se han ingresado en el texto
              iniciar = true; // se indica que el juego ya ha iniciado
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
             int resultado = (int) Math.pow(2, conta);// para elevar una base dos a numero de discos 
             pasos_nes = resultado-1; // se agrega en la variable los pasos necesarios para completar el juego...
             pasos = new JLabel("Minimo de pasos: "+(resultado-1)); // se obtiene el numero de pasos para mover los discos a otra barra
             pasos.setBounds(50, 170, 150, 30);
             pasos.setForeground(Color.red);
             tus_pasos.setText(cadena+(conta_pasos));
             combo.getCombo().setEnabled(false);//desactivamos el combobox
             panel4.add(tus_pasos);
             panel4.add(pasos);
             panel4.repaint();
             if(combo.getCombo().getItemAt(combo.getCombo().getSelectedIndex())=="Barra 2"){
              auxiliar = 3;
              destino = 2;
              discos_ingre = conta;   
              opcion_des = 2;
              System.out.println(conta+"-"+opcion_des);
             }
             else{
              auxiliar = 2;
              destino = 3;
              discos_ingre = conta;   
              opcion_des = 3;
              System.out.println(conta+"-"+opcion_des);
             }
             
             
             
               }
             if(conta==0){
                JOptionPane.showMessageDialog(null,"El numero de discos debe ser distinto de 0","Error",JOptionPane.ERROR_MESSAGE); 
             }
             if(conta<0){
                JOptionPane.showMessageDialog(null,"El numero de discos debe mayor a 0","Error",JOptionPane.ERROR_MESSAGE); 
 
             }
                }//fin de la condicion. si ya se a iniciado el juego
                else{
                JOptionPane.showMessageDialog(null,"El juego esta en proceso","Error",JOptionPane.ERROR_MESSAGE);
            }
             //************
                }
                else{
                 JOptionPane.showMessageDialog(null,"Debe de Ingresar un cantidad de discos","Error",JOptionPane.ERROR_MESSAGE);    
                }//}
            }
        });
        
        //FIN DEL BOTON INICIAR**************
        //ACCION DE boton2_1 MOVER DISCO A BARRA 2 DESDE BARRA 1
        boton2_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(pila1.vacia()!=true){// la primera condicion es ver si la barra esta vacia 
                        Nodo nodo = new Nodo();//se crea un nuevo nodo
                        int x, y, ancho, alto, size, numero_color;
                        numero_color = pila1.getTope().getDisco().getNumero_color(); // se pasa el numero de color de la cima una variable
                        
                    if(pila2.vacia()){ // esta condicion ve si la barra a la que queremos pasarle un disco esta vacia
                        size = pila1.getTope().getSize(); // pasamos el tamano del disco a una variable
                        x = pila1.getTope().getDisco().getX(); // pasamos la cordenada en x
                        y = 475;// como esta condicione es de que la barra a la que pasamos esta vacia la posicion es y tendria que ser al final del panel.
                        ancho = pila1.getTope().getDisco().getAncho();//pasamos el ancho a una variable
                        alto = pila1.getTope().getDisco().getAlto();//pasamos el alto a una variable
                        
                        Disco disco = new Disco(x,y,ancho,alto); // al nuevo disco le pasamos todos los atributos de la cima de la primera pila
                        disco.setNumero_color(numero_color); // y le pasamos es numero de color para que tenga el mismo color que el de la cima
                        nodo.setSize(size);//le ingresamos el mismo tamano del disco de la cima al nodo
                        nodo.setDisco(disco);//ingresamos el disco al nodo
                        panel.remove(pila1.getTope().getDisco().getDisco());//removemos el label disco del panel
                        pila1.Desapilar();//desapilamos 
                        pila2.Insertar(nodo);//insertamos el nuevo nodo en la pila que queremos mover el disco
                        
                        panel2.add(disco.getDisco());//agregamos el disco al panel que queremos moverlo
                        panel2.add(barra2.getBarra());//volvemos a ingresar la barra correspondiente al panel para que el disco se vea que esta enfrente de la barra
                        panel.repaint();// volvemos a pintar el panel uno para que se vena los cambios
                        panel2.repaint();// pintamos la el panel dos para que se vean los cambios que se hicieron en este.
                        
                        tus_pasos.setText(cadena+(conta_pasos+=1)); // aumentamos el contador de los pasos del usuario
                        panel4.add(tus_pasos);
                        panel4.repaint();
                    }
                    else{// si la barra a la que queremos mover no esta vacia 
                        int numero_discos = pila2.getSize(); // ingresamos en una variable la contidad de discos que tiene la barra a la que queremos mover un disco
                        if(pila1.getTope().getSize()<pila2.getTope().getSize()){// vemos si el disco que queremos mover el menor a la cima de la barra destino.
                        size = pila1.getTope().getSize();
                        x = pila1.getTope().getDisco().getX();
                        y = 475-(25*numero_discos); // la posicion en "y" se obtiene de esta formula, que es multiplicar el alto de los discos por la cantidad de discos que tiene la barra destino y restarle 475 
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
                        
                        tus_pasos.setText(cadena+(conta_pasos+=1)); // aumentamos el contador de los pasos del usuario
                        panel4.add(tus_pasos);
                        panel4.repaint();
                            
                        }
                       
                         
                    }
                  
                   Evaluar_barra(discos_ingre);// ver si la barra destino ya se lleno...
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
                        
                        tus_pasos.setText(cadena+(conta_pasos+=1)); // aumentamos el contador de los pasos del usuario
                        panel4.add(tus_pasos);
                        panel4.repaint();
                        
                    }
                    else{
                        int numero_discos = pila3.getSize();
                        if(pila1.getTope().getSize()<pila3.getTope().getSize()){
                        size = pila1.getTope().getSize();
                        x = pila1.getTope().getDisco().getX();
                        y = 475-(25*numero_discos);
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
                        
                        tus_pasos.setText(cadena+(conta_pasos+=1)); // aumentamos el contador de los pasos del usuario
                        panel4.add(tus_pasos);
                        panel4.repaint();
                            
                        }
                         
                    }
                     Evaluar_barra(discos_ingre);// ver si la barra destino ya se lleno...
                }
                else{
                    System.out.println("vacia");
                }
            }
        });
        //FIN DEL BOTON...
        //FIN DE LOS BOTONES DE LA BARRA 1.
        //ACCIONES DE LOS BOTONES DE LA BARRA 2...
         boton1_2.addActionListener(new ActionListener() {//boton para mover a la barra 1 desde la barra 2
            @Override
            public void actionPerformed(ActionEvent e) {
                if(pila2.vacia()!=true){
                       Nodo nodo = new Nodo();
                        int x, y, ancho, alto, size, numero_color;
                        numero_color = pila2.getTope().getDisco().getNumero_color();
                        
                    if(pila1.vacia()){
                        size = pila2.getTope().getSize();
                        x = pila2.getTope().getDisco().getX();
                        y = 475;
                        ancho = pila2.getTope().getDisco().getAncho();
                        alto = pila2.getTope().getDisco().getAlto();
                        
                        Disco disco = new Disco(x,y,ancho,alto);
                        disco.setNumero_color(numero_color);
                        nodo.setSize(size);
                        nodo.setDisco(disco);
                        panel2.remove(pila2.getTope().getDisco().getDisco());
                        pila2.Desapilar();
                        pila1.Insertar(nodo);
                        
                        panel.add(disco.getDisco());
                        panel.add(barra.getBarra());
                        panel2.repaint();
                        panel.repaint();
                        
                        tus_pasos.setText(cadena+(conta_pasos+=1)); // aumentamos el contador de los pasos del usuario
                        panel4.add(tus_pasos);
                        panel4.repaint();
                        
                    }
                    else{
                        int numero_discos = pila1.getSize();
                  
                        if(pila2.getTope().getSize()<pila1.getTope().getSize()){
                          size = pila2.getTope().getSize();
                        x = pila2.getTope().getDisco().getX();
                        y = 475-(25*numero_discos);
                        ancho = pila2.getTope().getDisco().getAncho();
                        alto = pila2.getTope().getDisco().getAlto();
                        
                        Disco disco = new Disco(x,y,ancho,alto);
                        disco.setNumero_color(numero_color);
                        nodo.setSize(size);
                        nodo.setDisco(disco);
                        panel2.remove(pila2.getTope().getDisco().getDisco());
                        pila2.Desapilar();
                        pila1.Insertar(nodo);
                        
                        panel.add(disco.getDisco());
                        panel.add(barra.getBarra());
                        panel2.repaint();
                        panel.repaint();
                        
                        tus_pasos.setText(cadena+(conta_pasos+=1)); // aumentamos el contador de los pasos del usuario
                        panel4.add(tus_pasos);
                        panel4.repaint();
                            
                        }
                         
                    }
                     Evaluar_barra(discos_ingre);// ver si la barra destino ya se lleno...
                }
                else{
                    System.out.println("vacia");
                }
            }
        });
         //boton para mover a la barra 3 desde la barra 2
          boton3_2.addActionListener(new ActionListener() {//boton para mover a la barra 1 desde la barra 2
            @Override
            public void actionPerformed(ActionEvent e) {
                if(pila2.vacia()!=true){
                       Nodo nodo = new Nodo();
                        int x, y, ancho, alto, size, numero_color;
                        numero_color = pila2.getTope().getDisco().getNumero_color();
                        
                    if(pila3.vacia()){
                        size = pila2.getTope().getSize();
                        x = pila2.getTope().getDisco().getX();
                        y = 475;
                        ancho = pila2.getTope().getDisco().getAncho();
                        alto = pila2.getTope().getDisco().getAlto();
                        
                        Disco disco = new Disco(x,y,ancho,alto);
                        disco.setNumero_color(numero_color);
                        nodo.setSize(size);
                        nodo.setDisco(disco);
                        panel2.remove(pila2.getTope().getDisco().getDisco());
                        pila2.Desapilar();
                        pila3.Insertar(nodo);
                        
                        panel3.add(disco.getDisco());
                        panel3.add(barra3.getBarra());
                        panel2.repaint();
                        panel3.repaint();
                        
                        tus_pasos.setText(cadena+(conta_pasos+=1)); // aumentamos el contador de los pasos del usuario
                        panel4.add(tus_pasos);
                        panel4.repaint();
                        
                    }
                    else{
                        int numero_discos = pila3.getSize();
                        
                        if(pila2.getTope().getSize()<pila3.getTope().getSize()){
                          size = pila2.getTope().getSize();
                        x = pila2.getTope().getDisco().getX();
                        y = 475-(25*numero_discos);
                        ancho = pila2.getTope().getDisco().getAncho();
                        alto = pila2.getTope().getDisco().getAlto();
                        
                        Disco disco = new Disco(x,y,ancho,alto);
                        disco.setNumero_color(numero_color);
                        nodo.setSize(size);
                        nodo.setDisco(disco);
                        panel2.remove(pila2.getTope().getDisco().getDisco());
                        pila2.Desapilar();
                        pila3.Insertar(nodo);
                        
                        panel3.add(disco.getDisco());
                        panel3.add(barra3.getBarra());
                        panel2.repaint();
                        panel3.repaint();
                        
                        tus_pasos.setText(cadena+(conta_pasos+=1)); // aumentamos el contador de los pasos del usuario
                        panel4.add(tus_pasos);
                        panel4.repaint();
                            
                        }
                         
                    }
                    Evaluar_barra(discos_ingre);// ver si la barra destino ya se lleno...
                }
                else{
                    System.out.println("vacia");
                }
            }
        });
        //FIN DE LOS BOTONES DE LA BARRA 2.
        //ACCIONES DE LA BARRA 3...
        //boton para mover a la barra 1 desde la barra 3..
        
        boton1_3.addActionListener(new ActionListener() {//boton para mover a la barra 1 desde la barra 2
            @Override
            public void actionPerformed(ActionEvent e) {
                if(pila3.vacia()!=true){
                       Nodo nodo = new Nodo();
                        int x, y, ancho, alto, size, numero_color;
                        numero_color = pila3.getTope().getDisco().getNumero_color();
                        
                    if(pila1.vacia()){
                        size = pila3.getTope().getSize();
                        x = pila3.getTope().getDisco().getX();
                        y = 475;
                        ancho = pila3.getTope().getDisco().getAncho();
                        alto = pila3.getTope().getDisco().getAlto();
                        
                        Disco disco = new Disco(x,y,ancho,alto);
                        disco.setNumero_color(numero_color);
                        nodo.setSize(size);
                        nodo.setDisco(disco);
                        panel3.remove(pila3.getTope().getDisco().getDisco());
                        pila3.Desapilar();
                        pila1.Insertar(nodo);
                        
                        panel.add(disco.getDisco());
                        panel.add(barra.getBarra());
                        panel3.repaint();
                        panel.repaint();
                        
                        tus_pasos.setText(cadena+(conta_pasos+=1)); // aumentamos el contador de los pasos del usuario
                        panel4.add(tus_pasos);
                        panel4.repaint();
                        
                    }
                    else{
                        int numero_discos = pila1.getSize();
                      
                        if(pila3.getTope().getSize()<pila1.getTope().getSize()){
                         size = pila3.getTope().getSize();
                        x = pila3.getTope().getDisco().getX();
                        y = 475-(25*numero_discos);
                        ancho = pila3.getTope().getDisco().getAncho();
                        alto = pila3.getTope().getDisco().getAlto();
                        
                        Disco disco = new Disco(x,y,ancho,alto);
                        disco.setNumero_color(numero_color);
                        nodo.setSize(size);
                        nodo.setDisco(disco);
                        panel3.remove(pila3.getTope().getDisco().getDisco());
                        pila3.Desapilar();
                        pila1.Insertar(nodo);
                        
                        panel.add(disco.getDisco());
                        panel.add(barra.getBarra());
                        panel3.repaint();
                        panel.repaint();
                        
                        tus_pasos.setText(cadena+(conta_pasos+=1)); // aumentamos el contador de los pasos del usuario
                        panel4.add(tus_pasos);
                        panel4.repaint();
                            
                        }
                    }
                     Evaluar_barra(discos_ingre);// ver si la barra destino ya se lleno...
                }
                else{
                    System.out.println("vacia");
                }
            }
        });
        //boton para mover a la barra dos desde la barra 3.
        boton2_3.addActionListener(new ActionListener() {//boton para mover a la barra 1 desde la barra 2
            @Override
            public void actionPerformed(ActionEvent e) {
                if(pila3.vacia()!=true){
                       Nodo nodo = new Nodo();
                        int x, y, ancho, alto, size, numero_color;
                        numero_color = pila3.getTope().getDisco().getNumero_color();
                        
                    if(pila2.vacia()){
                        size = pila3.getTope().getSize();
                        x = pila3.getTope().getDisco().getX();
                        y = 475;
                        ancho = pila3.getTope().getDisco().getAncho();
                        alto = pila3.getTope().getDisco().getAlto();
                        
                        Disco disco = new Disco(x,y,ancho,alto);
                        disco.setNumero_color(numero_color);
                        nodo.setSize(size);
                        nodo.setDisco(disco);
                        panel3.remove(pila3.getTope().getDisco().getDisco());
                        pila3.Desapilar();
                        pila2.Insertar(nodo);
                        
                        panel2.add(disco.getDisco());
                        panel2.add(barra2.getBarra());
                        panel3.repaint();
                        panel2.repaint();
                        
                        tus_pasos.setText(cadena+(conta_pasos+=1)); // aumentamos el contador de los pasos del usuario
                        panel4.add(tus_pasos);
                        panel4.repaint();
                    }
                    else{
                        int numero_discos = pila2.getSize();// se ve cuantos discos tiene la barra a la que queremos mover el disco de la barra origen.
                     
                        if(pila3.getTope().getSize()<pila2.getTope().getSize()){
                        size = pila3.getTope().getSize();
                        x = pila3.getTope().getDisco().getX();
                        y = 475-(25*numero_discos);
                        ancho = pila3.getTope().getDisco().getAncho();
                        alto = pila3.getTope().getDisco().getAlto();
                        
                        Disco disco = new Disco(x,y,ancho,alto);
                        disco.setNumero_color(numero_color);
                        nodo.setSize(size);
                        nodo.setDisco(disco);
                        panel3.remove(pila3.getTope().getDisco().getDisco());
                        pila3.Desapilar();
                        pila2.Insertar(nodo);
                        
                        panel2.add(disco.getDisco());
                        panel2.add(barra2.getBarra());
                        panel3.repaint();
                        panel2.repaint();
                        
                        tus_pasos.setText(cadena+(conta_pasos+=1)); // aumentamos el contador de los pasos del usuario
                        panel4.add(tus_pasos);
                        panel4.repaint();
                            
                        }
                    }
                     Evaluar_barra(discos_ingre);// ver si la barra destino ya se lleno...
                }
                else{
                    System.out.println("vacia");
                }
            }
        });
        //FIN DE LOS BOTONES DE LA BARRA 3.
        //ACCION DEL BOTON REINICIAR.
        reiniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Reiniciar();
            }
        });
        //BOTON RESOLVER EL JUEGO................................
        resolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(iniciar==false){
                   JOptionPane.showMessageDialog(ventana,"El juego no se ha iniciado","Resolver",JOptionPane.ERROR_MESSAGE); 
                }
                else{
                    Solucion(discos_ingre,1,destino,auxiliar);
                    listaPasos.setModel(modelo);
                    panel4.repaint();
                }
            
            }
        });
       //fin resolver juego
        
           //fin accione de botones */*/*/*/*/*/*/*/*/*
        ventana.add(panel4);
        ventana.add(panel3);
        ventana.add(panel2);
        ventana.add(panel);
        ventana.setVisible(true);
        
    }
    
    
   private void Evaluar_barra(int discos){
       if(pila2.getSize()==discos&&opcion_des==2){
           JOptionPane.showMessageDialog(ventana,"Pasos a realizar: "+pasos_nes+"\n Pasos realizados: "+conta_pasos+"\n Pasos de mas: "+(conta_pasos-pasos_nes),"Fin  Del Juego",JOptionPane.INFORMATION_MESSAGE);
           Reiniciar();
       }
       if(pila3.getSize()==discos&&opcion_des==3){
           JOptionPane.showMessageDialog(ventana,"Pasos a realizar: "+pasos_nes+"\n Pasos realizados: "+conta_pasos+"\n Pasos de mas: "+(conta_pasos-pasos_nes),"Fin  Del Juego",JOptionPane.INFORMATION_MESSAGE);
           Reiniciar();
       }
      
   }
  
    
   private void Reiniciar(){
           if(pila1.vacia()!=true){
                    Nodo aux = pila1.getTope();
                    while(aux!=null){
                       panel.remove(aux.getDisco().getDisco());
                       pila1.Desapilar();
                       panel.repaint();
                       aux = pila1.getTope();
                    }
                }
                if(pila2.vacia()!=true){
                    Nodo aux = pila2.getTope();
                    while(aux!=null){
                       panel2.remove(aux.getDisco().getDisco());
                       pila2.Desapilar();
                       panel2.repaint();
                       aux = pila2.getTope();
                    }
                    
                }
                if(pila3.vacia()!=true){
                    Nodo aux = pila3.getTope();
                    while(aux!=null){
                       panel3.remove(aux.getDisco().getDisco());
                       pila3.Desapilar();
                       panel3.repaint();
                       aux = pila3.getTope();
                    }
                }
                if(iniciar==true){
                modelo.clear();//se limpia la lista de los pasos para resolver la torre.
                iniciar = false;
                conta_pasos=0;//contador de pasos se reinicia...
                pasos_nes=0;
                opcion_des=0;
                combo.getCombo().setEnabled(true);//activabos el combobox
                panel4.remove(tus_pasos);//se quita el label del contador de los pasos del usuario del panel
                panel4.remove(pasos);// se quita el label del numero de pasos minimos que debe hacer el usuario
                panel4.repaint();// se pinta nuevamente el panel para ver los cambios
                }
            }//find de reiniciar
    
   private void Solucion(int num_dis, int origen, int destino, int axiliar){
       if(num_dis==1){
           modelo.addElement("Mover de la barra "+origen+" a la barra "+destino);
       }
       else{
           Solucion(num_dis-1, origen,auxiliar,destino);
            modelo.addElement("Mover de la barra "+origen+" a la barra "+destino);
            Solucion(num_dis-1,auxiliar,destino,origen);
       }
   }
         
     
   } 
    
    
  

