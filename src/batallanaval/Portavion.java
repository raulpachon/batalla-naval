/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batallanaval;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Portavion  extends BarcoAbstracto{
    private Casilla casillas[]= new Casilla [3];
   private ImageIcon imagen1;
   private ImageIcon imagen2;
   private ImageIcon imagen3;
   public Portavion() {
     super();
    }

    public Casilla[] getCasillas() {
        return casillas;
    }

    public ImageIcon getImagen1() {
        return imagen1;
    }

    public ImageIcon getImagen2() {
        return imagen2;
    }

    public ImageIcon getImagen3() {
        return imagen3;
    }

    @Override
    public ImageIcon definirGrafico(int i,String sentido) {
        ImageIcon imagen = null;
    if(sentido.equals("vertical")){
    if(i==0){
         if(casillas[0].isAtacada()){
         imagen1= new ImageIcon(getClass().getResource("/imagenes/explosion.png"));  
         }else{
         imagen1= new ImageIcon(getClass().getResource("/imagenes/portavionV.png"));  
         }
         imagen= imagen1;
    }else if(i==1){
       if(casillas[1].isAtacada()){
         imagen2= new ImageIcon(getClass().getResource("/imagenes/explosion.png"));  
         }else{
         imagen2= new ImageIcon(getClass().getResource("/imagenes/portavionV1.png"));  
         } 
       imagen= imagen2;
    }else if(i==2){
        if(casillas[2].isAtacada()){
         imagen3= new ImageIcon(getClass().getResource("/imagenes/explosion.png"));  
         }else{
         imagen3= new ImageIcon(getClass().getResource("/imagenes/portavionV2.png"));  
         }
        imagen= imagen3;
    }
    }else if(sentido.equals("horizontal")){
    if(i==0){
         if(casillas[0].isAtacada()){
         imagen1= new ImageIcon(getClass().getResource("/imagenes/explosion.png"));  
         }else{
         imagen1= new ImageIcon(getClass().getResource("/imagenes/portavionH2.png"));  
         }
         imagen= imagen1;
    }else if(i==1){
       if(casillas[1].isAtacada()){
         imagen2= new ImageIcon(getClass().getResource("/imagenes/explosion.png"));  
         }else{
         imagen2= new ImageIcon(getClass().getResource("/imagenes/portavionH1.png"));  
         } 
       imagen= imagen2;
    }else if(i==2){
        if(casillas[2].isAtacada()){
         imagen3= new ImageIcon(getClass().getResource("/imagenes/explosion.png"));  
         }else{
         imagen3= new ImageIcon(getClass().getResource("/imagenes/portavionH.png"));  
         }
        imagen= imagen3;
    }
    }
        return imagen;
       
    }

    void setCasillas(Casilla[] casillas) {
        this.casillas=casillas;
    }

   

   
}
