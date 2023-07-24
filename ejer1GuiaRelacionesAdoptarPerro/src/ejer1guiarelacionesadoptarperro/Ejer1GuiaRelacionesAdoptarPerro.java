/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer1guiarelacionesadoptarperro;

import EntidadPerro.Perro;
import EntidadPersona.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Ejer1GuiaRelacionesAdoptarPerro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        String op, aux;
        Perro adoptar = null;
        
        Persona p1 = new Persona("CARLOS","QUINTERO",42,6135941,null,"n");
        
        Persona p2 = new Persona("JUAN PABLO","MENESES",13,1110048319,null,"n");
        
        Perro perro1 = new Perro("MAX","callejero",1,"mediano");
        
        Perro perro2 = new Perro("COQUITO","Maltes",2,"pequeño");
        
        ArrayList<Persona> listadopersonas = new ArrayList();
        ArrayList<Perro> listadoperros = new ArrayList();
        
        listadopersonas.add(p1);
        listadopersonas.add(p2);
        listadoperros.add(perro1);
        listadoperros.add(perro2);
        
        for (Persona listadopersona : listadopersonas) {
            System.out.println(" " + listadopersona.getNombre() + " " + listadopersona.getApellido());
            System.out.print("Deseas adoptar un perro?(Y/N): ");
            listadopersona.setAdoptar(read.next());
        }
        
        for (Persona listadopersona : listadopersonas) {
            if(listadopersona.getAdoptar().equalsIgnoreCase("Y")){
                System.out.println(" " + listadopersona.getNombre() + " " + listadopersona.getApellido());
                
                System.out.println("Revisa el listado de perros para adoptar ");
                
                for (Perro listadoperro : listadoperros) {
                    
                    System.out.println(listadoperro);
                    
                }
                for (Perro listadoperro : listadoperros) {
                    System.out.println("Ahora iniciemos....");
                    System.out.println(listadoperro);
                    System.out.print("Me deseas adoptar?(Y/N): ");
                    aux = read.next();
                    if(aux.equalsIgnoreCase("Y")){
                        listadopersona.setPerro(listadoperro);
                        adoptar = listadoperro;
                        break;
                    }
                }
                listadoperros.remove(adoptar);
            }
            
        }
        
        System.out.println("Listado de personas con sus perros: ");
        for (Persona listadopersona : listadopersonas) {
            System.out.println(" " + listadopersona.toString());
        }
        
           
    }    
        
  
}   
