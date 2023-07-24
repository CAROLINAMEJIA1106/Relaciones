package Entidad;

public class Espectador {

    private String nombre;

    private int edad;

    private int dineroDis;

    public Espectador() {
    }

    public Espectador(String nombre, int edad, int dineroDis) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDis = dineroDis;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDineroDis() {
        return dineroDis;
    }

    public void setDineroDis(int dineroDis) {
        this.dineroDis = dineroDis;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dineroDis=" + dineroDis + '}';
    }
    
    
    
}
