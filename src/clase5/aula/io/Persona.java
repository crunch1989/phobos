package clase5.aula.io;

import java.io.Serializable;

public class Persona implements Serializable {

    private String nombre;
    private int edad;

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " Edad: " + this.edad;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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
}
