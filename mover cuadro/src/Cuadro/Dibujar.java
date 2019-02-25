 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuadro;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Dibujar extends JPanel implements ActionListener {
    Cuadro cuadro = new Cuadro();
    Timer timer = new Timer(5,this);
    public Dibujar(){
        setBackground(Color.WHITE);
        setFocusable(true);
        addKeyListener(new teclado());
        timer.start();
        
    }
    
    public void paint(Graphics grafica){
        super.paint(grafica);
        Graphics2D g2 = (Graphics2D)grafica;
        g2.drawImage(cuadro.ObtenerImagen(), cuadro.ObtenerX(), cuadro.ObtenerY(),null);
        
    }

    
    public void actionPerformed(ActionEvent n){
        cuadro.Mover();
        repaint();
    }
    
    private class teclado extends KeyAdapter
    {
    public void keyPressed(KeyEvent n){
        cuadro.KeyPressed(n);
    }
        }
}
