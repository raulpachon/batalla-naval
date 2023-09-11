/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batallanaval;

public class Jugador {

    private String nombre;
    private String contraseña;
    TableroPropio tp;
    TableroEnemigo te;
    private int puntaje;
    
    public Jugador(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        puntaje=0;
    }

    Jugador() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public int getTamaño() {
    return getNombre().length()*2 + getContraseña().length()*2;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public TableroPropio getTp() {
        return tp;
    }

    public void setTp(TableroPropio tp) {
        this.tp = tp;
    }

    public TableroEnemigo getTe() {
        return te;
    }

    public void setTe(TableroEnemigo te) {
        this.te = te;
    }
    
}
