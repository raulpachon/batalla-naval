/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batallanaval;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Lancha extends BarcoAbstracto{
 private Casilla casilla;
 private ImageIcon imagen;

    
    public Lancha(){
        super();     
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public Casilla getCasilla() {
        return casilla;
    }

    public void setCasilla(Casilla casilla) {
        this.casilla = casilla;
    }


    @Override
    public ImageIcon definirGrafico(int i,String sentido) {
    if(sentido.equals("vertical")){
         if(casilla.isAtacada()){
         imagen= new ImageIcon(getClass().getResource("/imagenes/explosion.png"));  
         }else{
         imagen= new ImageIcon(getClass().getResource("/imagenes/lanchaV.png"));  
         } 
    
    }else if(sentido.equals("horizontal")){
    
         if(casilla.isAtacada()){
         imagen= new ImageIcon(getClass().getResource("/imagenes/explosion.png"));  
         }else{
         imagen= new ImageIcon(getClass().getResource("/imagenes/lanchaH.png"));  
         }
    }
        return imagen;
    }
   
    
}
