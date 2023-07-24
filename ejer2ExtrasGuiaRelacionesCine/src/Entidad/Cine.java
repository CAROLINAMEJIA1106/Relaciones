package Entidad;

public class Cine {

    private Pelicula pelicula;

    private String[][] sala = new String[8][6];

    private int precioEntrada;

    public Cine() {
        
    }

    public Cine(Pelicula pelicula, String[][] sala, int precioEntrada) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.precioEntrada = precioEntrada;
        
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public String[][] getSala() {
        return sala;
    }

    public void setSala(String[][] sala) {
        this.sala = sala;
    }

    public int getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(int precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", sala=" + sala + ", precioEntrada=" + precioEntrada + '}';
    }
    
    
}
