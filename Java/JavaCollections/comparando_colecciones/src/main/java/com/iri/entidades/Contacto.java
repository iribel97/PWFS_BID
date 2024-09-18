package com.iri.entidades;

import java.util.Objects;

public class Contacto {

    //Atributos de la clase
    private String nombre;
    private String telefono;
    private String correo;

    //Constructor
    public Contacto(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }
    
    // Override de los métodos equals y hashCode para que el HashSet pueda comparar los objetos de tipo Contacto
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return nombre.equals(contacto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

}
