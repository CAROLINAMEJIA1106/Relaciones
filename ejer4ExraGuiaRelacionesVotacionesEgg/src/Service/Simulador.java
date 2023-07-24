package Service;

import Entidad.Alumno;
import static Entidad.Alumno.ordenarVotos;
import Entidad.Voto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Simulador {

    private int cantidadAlumnos;
    
    private ArrayList<Alumno> listadoFinalAlumnos = new ArrayList();
    Alumno alumno;
    Voto vot = new Voto();
    int lv[][];

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<String> GenerarNombreCompleto() {
        ArrayList<String> nombres = new ArrayList();
        ArrayList<String> apellidos = new ArrayList();
        ArrayList<String> listadoNombreCompleto = new ArrayList();
        String nom;
        String ap;
        String nc;
        nombres.add("Maria");
        nombres.add("Alejandro");
        nombres.add("Fernando");
        nombres.add("Luz Angela");
        nombres.add("Andres");
        nombres.add("Carlos");
        nombres.add("Pablo");
        nombres.add("Camilo");
        nombres.add("Stella");
        nombres.add("Maria");
        apellidos.add("Meneses");
        apellidos.add("Zuluaga");
        apellidos.add("Jimenez");
        apellidos.add("Satizabal");
        apellidos.add("Sepulveda");
        apellidos.add("Fernandez");
        apellidos.add("Lucumi");
        apellidos.add("Zapata");
        apellidos.add("Garcia");
        apellidos.add("Ruiz");
        
        for (int i = 0; i < 100; i++) {
            nom = nombres.get((int)(Math.random()*(9+1)-0)+0);
            ap = apellidos.get((int)(Math.random()*(9+1)-0)+0);
            nc = nom.concat(" "+ap);
            listadoNombreCompleto.add(i, nc);
        }
        
        
        return listadoNombreCompleto;
        
    }
    

    public ArrayList<Integer> GenerarDNI() {
        ArrayList<Integer> Dnivarios = new ArrayList();
        int aux;
        for (int i = 0; i < 100; i++) {
            aux = (int)(Math.random()*(999999999+1)-1)+1;
            Dnivarios.add(i,aux);
        }
        return Dnivarios;
        
    }
    
    public HashMap<Integer,String> ListadoAlumnos(ArrayList<String> listNC, ArrayList<Integer> listDni){
        System.out.println("Por favor ingrese una cantidad de Alumnos que desee(max. 100): ");
        cantidadAlumnos = read.nextInt();
        HashMap<Integer,String> listadoAlumnos = new HashMap();
        //generamos el listado de alumnos en un mapa
        for (int i = 0; i < cantidadAlumnos; i++) {
            listadoAlumnos.put(listDni.get(i), listNC.get(i));
        }
        //mostramos el listado de alumnos
        for (Map.Entry<Integer, String> entry : listadoAlumnos.entrySet()) {
            System.out.println("DNI: " + entry.getKey() + " / " + entry.getValue());
            
            
        }
        
        return listadoAlumnos;
    }

    public int[][] Votacion(HashMap<Integer,String> listAlumnos) {
        
        int listVotaciones[][] = new int[cantidadAlumnos][3];
        ArrayList<String> votosaEst = new ArrayList();
        int num1,num2,num3;
        int indice;
        
        
        //ArrayList<Alumno> auxlistA = new ArrayList();
        
        //paso el HashMap a un ArrayList
        for (Map.Entry<Integer, String> entry : listAlumnos.entrySet()) {
            alumno = new Alumno(entry.getValue(), entry.getKey(), 0);
            listadoFinalAlumnos.add(alumno);
            
        }
        
        
        //genero las votaciones 
        for (int i = 0; i < cantidadAlumnos; i++) {
            for (int j = 0; j < 3; j++) {
                do{
                    num1 = (int)(Math.random()*(((cantidadAlumnos-1)+1)-0)+0);
                    
                }while(i==num1);
                
                listVotaciones[i][j]= num1;
            }
 
        }  
        
        //verifico que solamente voten una vez por un estudiante
        int k = 0;
        for (int i = 0; i < cantidadAlumnos; i++) {
            
                if(listVotaciones[i][k]== listVotaciones[i][k+1]){
                    listVotaciones[i][k] = -1;
                }else{
                    if(listVotaciones[i][k]==listVotaciones[i][k+2]){
                        listVotaciones[i][k] = -1;
                    }else{
                        if(listVotaciones[i][k+1]==listVotaciones[i][k+2]){
                            listVotaciones[i][k+1] = -1;
                        }
                    }
                }
            
            k=0;
        }
        
        for (int i = 0; i < cantidadAlumnos; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" "+listVotaciones[i][j]);
            }
            System.out.println(" ");
        }
        
        //coloco los votos en cada estudiante
        for (int i = 0; i < cantidadAlumnos; i++) {
            for (int j = 0; j < 3; j++) {
                if(listVotaciones[i][j]== -1){
                    
                }else{
                    indice = listVotaciones[i][j];
                    listadoFinalAlumnos.get(indice).setCantidadDeVotos(listadoFinalAlumnos.get(indice).getCantidadDeVotos()+1);
                }
                
                
            }
        }
        for (int i = 0; i < cantidadAlumnos; i++) {
            for (int j = 0; j < 3; j++) {
                if(listVotaciones[i][j]== -1){
                    
                }else{
                    votosaEst.add(listadoFinalAlumnos.get(listVotaciones[i][j]).getNombreCompleto());
                }
                
                
            }
        }
        
        //coloco los alumnos votados en la clase Voto
        vot.setAlumnosvotados(votosaEst);
        
        return listVotaciones;
        
        
    }

    public void MostrarAlumnosconvotos(int lV[][]) {
        int auxiliar;
        System.out.println("Alumnos por los cuales se votó: ");
        System.out.println(" "+vot.getAlumnosvotados());
        System.out.println(" ");
        System.out.println(" ");
        
        System.out.println(" ");
        System.out.println("Listado de alumnos con sus votaciones y con los votos dados");
        //muestro los dos listados
        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println(" " + listadoFinalAlumnos.get(i));
            System.out.println("Votó por: ");
            for (int j = 0; j < 3; j++) {
                if(lV[i][j]== -1){
                    
                }else{
                    auxiliar = lV[i][j];
                    System.out.println(" " +listadoFinalAlumnos.get(auxiliar).getNombreCompleto()+ " "+listadoFinalAlumnos.get(auxiliar).getDni());
                }
                
                
            }
            
        }
    }

    public ArrayList RecuentodeVotos() {
        //ordeno el listado final de alumnos segun la cantidad de votos recibidos
        ArrayList<Alumno> ListAlmFO = new ArrayList();
        for (Alumno listadoFinalAlumno : listadoFinalAlumnos) {
            ListAlmFO.add(listadoFinalAlumno);
        }
        
        
        ListAlmFO.sort(ordenarVotos);
        System.out.println("RECUENTO DE VOTOS!!!  LISTADO: ");
        for (Alumno alumno1 : ListAlmFO) {
            System.out.println(" "+alumno1);
        }
        
        return ListAlmFO;        
        
    }

    public void facilitadores(ArrayList<Alumno> ListFiAl) {
        System.out.println("Los cinco(5) facilitadores principales son: ");
        int cont = 0;
        
        for (Alumno alumno1 : ListFiAl) {
            System.out.println(" " + alumno1);
            cont += 1;
            if(cont==5){
                System.out.println("Los cinco(5) facilitadores suplentes son: ");
            }
            if(cont==10){
                break;
            }
        }
        
    }


}
