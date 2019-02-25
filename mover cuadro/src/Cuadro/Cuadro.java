/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuadro;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Cuadro {
    private String cuadro;
    private int dis_x;//movimiento
    private int dis_y;//movimiento
    private int x=0;//posicion
    private int y=0;//posicioin
    private Image imagen;//mapa de bits
    
    public Cuadro(){
        cuadro = "cuadro.png";
        ImageIcon img = new ImageIcon(this.getClass().getResource(cuadro));
        imagen = img.getImage();
        
    }
    
    public void KeyPressed(KeyEvent n){
       int tecla = n.getKeyCode();
       if(tecla == KeyEvent.VK_LEFT){
           dis_x = -1;
           dis_y=0;
       }
        
         if(tecla == KeyEvent.VK_RIGHT){
           dis_x = 1;
           dis_y=0;
       }
          if(tecla == KeyEvent.VK_UP){
           dis_y = -1;
           dis_x=0;
       }
            if(tecla == KeyEvent.VK_DOWN){
           dis_y = 1;
           dis_x=0;
       }
    }
    
        public void Mover(){
       if(x==-1){
          x=0;
          y=0;
           dis_x=0;
           dis_y=0;
       }
       if(y==-1){
            x=0;
            y=0;
           dis_x=0;
           dis_y=0;
       }
       if(y==455){
            x=0;
            y=0;
           dis_x=0;
           dis_y=0;
       }
       if(x==485){
            x=0;
            y=0;
           dis_x=0;
           dis_y=0;
       }
       
       else
       {
        x+=dis_x;
        y+=dis_y; 
       }
    }
    public int ObtenerX(){
        return x;
    }
    public int ObtenerY(){
        return y;
    }
    public Image ObtenerImagen(){
        return imagen;
    }
    
}
