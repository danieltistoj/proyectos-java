/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi1.pkg1;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class Disco {
    private JLabel disco;
    int x, y, ancho, alto, numero_color;

    public Disco( int x,int y, int ancho, int alto) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
        disco = new JLabel();
        disco.setBounds(x,y,ancho,alto);
        disco.setOpaque(true);
         numero_color = (int)(Math.random()*6)+1;
        switch(numero_color){
            case 1:
                disco.setBackground(Color.red);
                break;
            case 2:
                disco.setBackground(Color.BLUE);
                break;
            case 3:
                disco.setBackground(Color.GREEN);
                break;
            case 4:
                disco.setBackground(Color.YELLOW);
                break;
            case 5:
                disco.setBackground(Color.ORANGE);
                break;
            case 6:
                disco.setBackground(Color.PINK);
                break;    
        }
    }

    public int getNumero_color() {
        return numero_color;
    }

    public void setNumero_color(int numero_color) {
        this.numero_color = numero_color;
        switch(numero_color){
            case 1:
                disco.setBackground(Color.red);
                break;
            case 2:
                disco.setBackground(Color.BLUE);
                break;
            case 3:
                disco.setBackground(Color.GREEN);
                break;
            case 4:
                disco.setBackground(Color.YELLOW);
                break;
            case 5:
                disco.setBackground(Color.ORANGE);
                break;
            case 6:
                disco.setBackground(Color.PINK);
                break;    
        }
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    

    public JLabel getDisco() {
        return disco;
    }

    public void setDisco(JLabel disco) {
        this.disco = disco;
    }
    
    
}
