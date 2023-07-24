/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadPersona;

import EntidadPerro.Perro;

/**
 *
 * @author Carolina
 */
public class Persona {
    private String nombre;
    private String apellido;
    Integer edad;
    Integer documento;
    private Perro perro;
    private String adoptar;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, Integer documento, Perro perro, String adoptar) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
        this.adoptar = adoptar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public String getAdoptar() {
        return adoptar;
    }

    public void setAdoptar(String adoptar) {
        this.adoptar = adoptar;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", perro=" + perro + ", adoptar=" + adoptar + '}';
    }

    
    
}
