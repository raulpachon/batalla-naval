/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batallanaval;

import javax.swing.ImageIcon;


public abstract class BarcoAbstracto {
  
    protected String estado;
    protected String sentido;

    public BarcoAbstracto() {
        this.estado = "Activo";
    }

  
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSentido() {
        return sentido;
    }

    public void setSentido(String sentido) {
        this.sentido = sentido;
    }
    
    public abstract ImageIcon definirGrafico(int i,String sentido);
    
    
}
