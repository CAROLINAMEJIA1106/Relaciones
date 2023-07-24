package Entidad;

import java.util.Comparator;





public class Alumno {

    

    private String nombreCompleto;

    private Integer dni;

    private Integer cantidadDeVotos;

    public Alumno() {
    }

    public Alumno(String nombreCompleto, Integer dni, Integer cantidadDeVotos) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.cantidadDeVotos = cantidadDeVotos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getCantidadDeVotos() {
        return cantidadDeVotos;
    }

    public void setCantidadDeVotos(Integer cantidadDeVotos) {
        this.cantidadDeVotos = cantidadDeVotos;
    }

    public static Comparator<Alumno> getOrdenarVotos() {
        return ordenarVotos;
    }

    public static void setOrdenarVotos(Comparator<Alumno> ordenarVotos) {
        Alumno.ordenarVotos = ordenarVotos;
    }

    

    @Override
    public String toString() {
        return "Alumno{" + "nombreCompleto=" + nombreCompleto + ", dni=" + dni + ", cantidadDeVotos=" + cantidadDeVotos + '}';
    }

    public static Comparator<Alumno> ordenarVotos = new Comparator<Alumno>(){
        @Override
        public int compare(Alumno t, Alumno t1) {
            return t1.getCantidadDeVotos().compareTo(t.cantidadDeVotos);
        }
        
    };
        
    
}
