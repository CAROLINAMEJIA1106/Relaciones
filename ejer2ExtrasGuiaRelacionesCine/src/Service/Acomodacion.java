package Service;

import Entidad.Cine;
import Entidad.Espectador;
import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

public class Acomodacion {

    private Cine salaDeCine = new Cine();
    
    private Pelicula pelicula = new Pelicula();

    private ArrayList<Espectador> listadoEspectadores = new ArrayList();
    
    private Espectador espectador;
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    private String[][] salaaux = new String[8][6];
    
    
    
    public void ingresarPelicula(){
        System.out.print("Por favor ingrese el título de la película: ");
        pelicula.setTitulo(read.next());
        System.out.print("Por favor ingrese la duración del filme en minutos: ");
        pelicula.setDuracion(read.nextInt());
        System.out.print("Por favor ingrese la edad mínima para esta película: ");
        pelicula.setEdadMinima(read.nextInt());
        System.out.print("Por favor ingrese el director de la pelicula: ");
        pelicula.setDirector(read.next());
        
        System.out.print("Por favor ingrese el precio de la entrada a la película: ");
        salaDeCine.setPrecioEntrada(read.nextInt());
        
        System.out.println("Pelicula Ingresada!!!");
        //inicializo sala de cine
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                salaaux[i][j] = " ";
            }
        }
        salaDeCine.setSala(salaaux);
        
    }
    public void ingresarEspectadores(){
        System.out.println("--------- Ingreso de espectadores a la Sala de Cine 1 ---------");
        
        //simulacro de lista de espectadores aleatorios
        int cantidad = (int)(Math.random()*48)+15;
        
        for(int i=0; i<cantidad; i++){
            listadoEspectadores.add(new Espectador(String.valueOf(i+1), (int)(Math.random()*(65-10)+10), (int)(Math.random()*(40000-15000)+15000)));
        }
        
        System.out.println("Cantidad: "+listadoEspectadores.size());
        System.out.println(" "+listadoEspectadores.toString());
        
    }
    public void OcupacionSala() {
        
        boolean flag = false;
        boolean au = false;
        System.out.println("Acomodación en la Sala de Cine");
        System.out.println(" ");
        //evaluo si hay asientos disponibles
        int cont = 0;
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 5; j++) {
                if(salaaux[i][j].equalsIgnoreCase(" ")){
                    cont += 1;
                } 
            }
            
        }
        //acomodo a los espectadores de forma aleatoria
        if(cont >= 1){
            for (Espectador listadoEspectadore : listadoEspectadores) {
                if(listadoEspectadore.getDineroDis()>= salaDeCine.getPrecioEntrada()&& listadoEspectadore.getEdad()>= pelicula.getEdadMinima()){
                    for (int i = 0; i <= 7; i++) {
                        for (int j = 0; j <= 5; j++) {
                            if(salaaux[i][j].equals(" ")){
                                salaaux[i][j] = "X";
                                flag = true;
                                break;
                            }
                        }
                        if(flag){
                            break;
                        }
            
                    }
                    
                }
                flag = false;
                
            }
            
             
        }else{
            System.out.println("!!!Sala de Cine Llena!!!");
            au= true;
        }
        if(au){
            
        }else{
            System.out.println("Acomodación lista!!!!");
        }
        salaDeCine.setSala(salaaux);
    }
        
        
    

    public void Mostrar() {
        System.out.println("Se muestra la Sala de Cine 1: ");
        System.out.println(" ");
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j <= 5; j++) {
                switch (j) {
                    case 0:
                        System.out.print(" "+(i+1)+"A [ "+ salaDeCine.getSala()[i][j]+" ]");
                        break;
                    case 1:
                        System.out.print(" "+(i+1)+"B [ "+ salaDeCine.getSala()[i][j]+" ]");
                        break;
                    case 2:
                        System.out.print(" "+(i+1)+"C [ "+ salaDeCine.getSala()[i][j]+" ]");
                        break;
                    case 3:
                        System.out.print(" "+(i+1)+"D [ "+ salaDeCine.getSala()[i][j]+" ]");
                        break;
                    case 4:
                        System.out.print(" "+(i+1)+"E [ "+ salaDeCine.getSala()[i][j]+" ]");
                        break;
                    case 5:
                        System.out.print(" "+(i+1)+"F [ "+ salaDeCine.getSala()[i][j]+" ]");
                        break;
                    default:
                        System.out.println("Asiento no existe");
                }
             
            }
            System.out.println(" ");
        }
        
    }
    
}
