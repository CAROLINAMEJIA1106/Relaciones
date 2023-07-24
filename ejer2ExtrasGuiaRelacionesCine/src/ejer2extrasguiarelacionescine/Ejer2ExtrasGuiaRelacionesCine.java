/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer2extrasguiarelacionescine;

import Service.Acomodacion;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Ejer2ExtrasGuiaRelacionesCine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        Acomodacion ac = new Acomodacion();
        System.out.println("----- SALA DE CINE  -----");
        
        
        
        boolean flag = true;
        int opcion;
        
        do{
            System.out.println("MENÚ");
            System.out.println("1. Ingresar Película");
            System.out.println("2. Ingresar Espectadores");
            System.out.println("3. Ocupación de la Sala");
            System.out.println("4. Mostrar Sala de Cine");
            System.out.println("5. Exit");
            System.out.print("Ingrese opción:_ ");
        
            opcion = read.nextInt();
            switch (opcion) {
                case 1: 
                    ac.ingresarPelicula();
                    break;
                case 2: 
                    ac.ingresarEspectadores();
                    break;
                case 3: 
                    ac.OcupacionSala();
                    break;
                case 4: 
                    ac.Mostrar();
                    break;
                
                case 5: 
                    flag = false;
                    System.out.println("EXIT --- GRACIAS!!!");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
            
            
        }while(flag);
       
    }
    
}
