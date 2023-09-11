package batallanaval;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import batallanaval.Jugador;
import java.util.ArrayList;

//import java.util.Scanner;

public class Almacenamiento {
 
    protected static RandomAccessFile flujo;
    protected static int numeroRegistros;
    protected static int tamañoRegistros=84;

    public static int getNumeroRegistros() {
        return numeroRegistros;
    }
    public static void creaArchivoAleatorio(File archivo)throws IOException{
        if (archivo.exists()&&!archivo.isFile()){
            throw new IOException(archivo.getName()+"no es un archivo");
        }
        flujo = new RandomAccessFile(archivo,"rw");
        numeroRegistros=(int)Math.ceil((double)flujo.length()/(double)tamañoRegistros);
        
        }
        public static void cerrar() throws IOException{
            flujo.close();
        }
        public static boolean setJugador(int i ,Jugador jugador)throws IOException{
             if(i >= 0 && i <= getNumeroRegistros()) {
            if(jugador.getTamaño() > tamañoRegistros) {
                System.out.println("\nTamaño de registro excedido.");
            }else{
                flujo.seek(i*tamañoRegistros);
                flujo.writeUTF(jugador.getNombre());
                flujo.writeUTF(jugador.getContraseña());
                flujo.writeInt(jugador.getPuntaje());
                return true;
            }
            }else {
            System.out.println("\nNúmero de registro fuera de límites."+jugador.getTamaño());
            }
               return false;
        }
        public static void añadirJugador(Jugador jugador)throws IOException{
          if (setJugador(numeroRegistros,jugador)){
                numeroRegistros ++;
            }
        }
        public static Jugador getJugador (int i) throws IOException{
            if (i>=0 && i<=getNumeroRegistros()){
                flujo.seek(i*tamañoRegistros);
                return new Jugador(flujo.readUTF(),flujo.readUTF());
        }
        else{
            System.out.println("\n limite excedido");
            return null;
            }
 
        }
          public static ArrayList getJugadores () throws IOException{
             ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
              for(int i=0; i<getNumeroRegistros(); i++) {
            flujo.seek(i * tamañoRegistros);
            Jugador jugador = getJugador(i);
            jugadores.add(jugador);
            }
        return jugadores;  
        }
              
        public static int buscarRegistro(String buscado)throws IOException{
        Jugador jugador;
        if (buscado == null) {
            return -1;
        }
        for(int i=0; i<getNumeroRegistros(); i++) {
            flujo.seek(i * tamañoRegistros);
            jugador = getJugador(i);
            if(jugador.getNombre().equals(buscado)) {
                return i;
            }
        }
        return -1;
    }
        
        
}
       
        
   
    



