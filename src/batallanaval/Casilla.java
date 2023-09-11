/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batallanaval;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Familia Pachon
 */
public class Casilla extends JLabel {

    private int x;
    private int y;
    private boolean atacada;
    private ImageIcon imagen;
  
    
    public Casilla(int x, int y){
        super();
        this.x=x;
        this.y=y;
        atacada=false;
       this.setSize(40, 40);
       casillaEnBlanco();
        
    }
    public void casillaEnBlanco(){
     imagen= new ImageIcon(getClass().getResource("/imagenes/casilla.png"));  
        Image imgEscalada = imagen.getImage().getScaledInstance(this.getWidth(),this.getHeight(), Image.SCALE_SMOOTH);
       Icon iconoEscalado = new ImageIcon(imgEscalada);
       this.setIcon(iconoEscalado);
    }
    public void casillaAtacada(){
     imagen= new ImageIcon(getClass().getResource("/imagenes/Bomb.gif"));  
     Image imgEscalada = imagen.getImage().getScaledInstance(this.getWidth(),this.getHeight(), Image.SCALE_SMOOTH);
       Icon iconoEscalado = new ImageIcon(imgEscalada);
       this.setIcon(iconoEscalado);
       imagen.setImageObserver(this); 
     
       AudioClip audio = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/Bomb.wav"));
       audio.play();
       
    }
    public void señalarCasilla(){
     imagen= new ImageIcon(getClass().getResource("/imagenes/casillaV.png"));  
        Image imgEscalada = imagen.getImage().getScaledInstance(this.getWidth(),this.getHeight(), Image.SCALE_SMOOTH);
       Icon iconoEscalado = new ImageIcon(imgEscalada);
       this.setIcon(iconoEscalado);
    }
     public boolean atacada(){
         return false;
     }
     public void señalarACasilla(){
     imagen= new ImageIcon(getClass().getResource("/imagenes/casillaF.png"));  
        Image imgEscalada = imagen.getImage().getScaledInstance(this.getWidth(),this.getHeight(), Image.SCALE_SMOOTH);
       Icon iconoEscalado = new ImageIcon(imgEscalada);
       this.setIcon(iconoEscalado);
    }
    public boolean isAtacada() {
        return atacada;
    }

    public void setAtacada(boolean atacada) {
        this.atacada = atacada;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    public void setPosicionX(int x) {
        this.x = x;
    }

    public void setPosicionY(int y) {
        this.y = y;
    }

    public int getPosicionX() {
        return x;
    }

    public int getPosicionY() {
        return y;
    }

}
