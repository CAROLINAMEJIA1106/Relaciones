package Entidad;

import java.util.ArrayList;

public class Voto {

    private Alumno alumnoqueVota;

    private ArrayList<String> alumnosvotados;

    public Voto() {
    }

    public Voto(Alumno alumnoqueVota, ArrayList<String> alumnosvotados) {
        this.alumnoqueVota = alumnoqueVota;
        this.alumnosvotados = alumnosvotados;
    }

    public Alumno getAlumnoqueVota() {
        return alumnoqueVota;
    }

    public void setAlumnoqueVota(Alumno alumnoqueVota) {
        this.alumnoqueVota = alumnoqueVota;
    }

    public ArrayList<String> getAlumnosvotados() {
        return alumnosvotados;
    }

    public void setAlumnosvotados(ArrayList<String> alumnosvotados) {
        this.alumnosvotados = alumnosvotados;
    }

    @Override
    public String toString() {
        return "Voto{" + "alumnoqueVota=" + alumnoqueVota + ", alumnosvotados=" + alumnosvotados + '}';
    }

    

    
    
}
