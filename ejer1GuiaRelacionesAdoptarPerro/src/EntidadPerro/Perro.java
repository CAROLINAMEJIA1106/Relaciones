/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadPerro;

/**
 *
 * @author Carolina
 */
public class Perro {
    private String nombrePerro;
    String raza;
    Integer edadPerro;
    String tamano;

    public Perro() {
    }

    public Perro(String nombrePerro, String raza, Integer edadPerro, String tamano) {
        this.nombrePerro = nombrePerro;
        this.raza = raza;
        this.edadPerro = edadPerro;
        this.tamano = tamano;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdadPerro() {
        return edadPerro;
    }

    public void setEdadPerro(Integer edadPerro) {
        this.edadPerro = edadPerro;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombrePerro=" + nombrePerro + ", raza=" + raza + ", edadPerro=" + edadPerro + ", tamano=" + tamano + '}';
    }

    
    
    
}
