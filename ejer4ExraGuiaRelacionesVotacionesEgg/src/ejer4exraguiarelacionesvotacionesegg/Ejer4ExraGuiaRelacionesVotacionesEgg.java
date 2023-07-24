/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer4exraguiarelacionesvotacionesegg;

import Service.Simulador;

/**
 *
 * @author Carolina
 */
public class Ejer4ExraGuiaRelacionesVotacionesEgg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int listV[][];
        
        Simulador simu = new Simulador();
        listV = simu.Votacion(simu.ListadoAlumnos(simu.GenerarNombreCompleto(), simu.GenerarDNI()));
        
        simu.MostrarAlumnosconvotos(listV);
       
        simu.facilitadores(simu.RecuentodeVotos());
    }
    
}
