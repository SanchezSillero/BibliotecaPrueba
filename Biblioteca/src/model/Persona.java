package model;

public class Persona {
    private String nombre, dni;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }


}
