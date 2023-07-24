package Service;

import EntidadJugador.Jugador;
import EntidadRevolver.RevolverDeAgua;
import java.util.HashSet;

public class Juego {

    private HashSet<Jugador> jugadores;

    private RevolverDeAgua revolver;

    public Juego() {
    }

    public Juego(HashSet<Jugador> jugadores, RevolverDeAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public HashSet<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(HashSet<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }
    
    public void llenarJuego(HashSet<Jugador> jugadores, RevolverDeAgua r){
        this.jugadores = jugadores;
        this.revolver = r;
    }
    public void ronda(){
        boolean bandera = true;
        do{
        
            for (Jugador jugadore : jugadores) {
                System.out.println("Turno de: " + jugadore.getNombre());
                jugadore.disparo(this.revolver);
                if(jugadore.getMojado()){
                    System.out.println("Jugador Mojado");
                    System.out.println("Juego terminado  ----- FIN");
                    System.out.println(" " + jugadore.getNombre() + " MOJADO");
                    bandera = false;
                    break;
                }else{
                    System.out.println("Siguiente jugador");
                }
            }
        }while(bandera);
    }
}
