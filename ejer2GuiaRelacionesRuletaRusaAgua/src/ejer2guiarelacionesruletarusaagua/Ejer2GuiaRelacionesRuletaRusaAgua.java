/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer2guiarelacionesruletarusaagua;


import EntidadJugador.Jugador;
import EntidadRevolver.RevolverDeAgua;
import Service.Juego;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Ejer2GuiaRelacionesRuletaRusaAgua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("------ JUEGO DE LA RULETA RUSA DE AGUA ------");
        System.out.println("Empecemos a jugar");
        Juego j = new Juego();
        HashSet<Jugador> listajugadores = new HashSet();
        RevolverDeAgua r = new RevolverDeAgua();
        Integer aux;
        Integer aux2;
        
        System.out.print("Desea ingresar un número de jugadores?:(Y/N): ");
        String op = read.next();
        if(op.equalsIgnoreCase("Y")){
            System.out.println("Cuántos jugadores van a jugar?: ");
            System.out.print("Ingresa un número del 1 al 6:_ ");
            int cant = read.nextInt();

            if(cant >= 1 && cant <= 6){
                for (int i = 1; i <= cant; i++) {
                    aux = i;
                    listajugadores.add(new Jugador(aux,"Jugador "+String.valueOf(i),false));
                }
            }
        }else{
            System.out.println("Entonces serán seis(6) jugadores por defecto");
            
            for (int i = 1; i <= 6; i++) {
                aux2 = i;
                listajugadores.add(new Jugador(aux2,"Jugador "+String.valueOf(i),false));
            }
            
        }
        
        r.llenarRevolver();
        j.llenarJuego(listajugadores, r);
        j.ronda();
        
    }
    
}
