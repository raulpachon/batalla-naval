/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batallanaval;

import javax.swing.ImageIcon;


public class Buque  extends BarcoAbstracto{
    
   private Casilla casillas[]= new Casilla [2];
   private ImageIcon imagen1;
   private ImageIcon imagen2;

   
    public Buque() { 
        super();
    
    }

    public ImageIcon getImagen() {
        return imagen1;
    }

    public Casilla[] getCasillas() {
        return casillas;
    }

    public void setCasillas(Casilla[] casillas) {
        this.casillas = casillas;
    }

   
    @Override
    public ImageIcon definirGrafico(int i,String sentido) {
          ImageIcon imagen = null;;
    if(sentido.equals("vertical")){
    if(i==0){
         if(casillas[0].isAtacada()){
         imagen1= new ImageIcon(getClass().getResource("/imagenes/explosion.png"));  
         }else{
         imagen1= new ImageIcon(getClass().getResource("/imagenes/buqueV.png"));  
         }
         imagen= imagen1;
    }else if(i==1){
       if(casillas[1].isAtacada()){
         imagen2= new ImageIcon(getClass().getResource("/imagenes/explosion.png"));  
         }else{
         imagen2= new ImageIcon(getClass().getResource("/imagenes/buqueV1.png"));  
         } 
       imagen= imagen2;
    }
    }else if(sentido.equals("horizontal")){
    if(i==0){
         if(casillas[0].isAtacada()){
         imagen1= new ImageIcon(getClass().getResource("/imagenes/explosion.png"));  
         }else{
         imagen1= new ImageIcon(getClass().getResource("/imagenes/buqueH1.png"));  
         }
         imagen= imagen1;
    }else if(i==1){
       if(casillas[1].isAtacada()){
         imagen2= new ImageIcon(getClass().getResource("/imagenes/explosion.png"));  
         }else{
         imagen2= new ImageIcon(getClass().getResource("/imagenes/buqueH.png"));  
         } 
       imagen= imagen2;
    }
        
    }
    return imagen;
       
    }


}
