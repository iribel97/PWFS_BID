package com.egg.biblioteca.entidades;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Editorial {
@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String nombre;
    

    public Editorial() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Editorial [id=" + id + ", nombre=" + nombre + "]";
    }



    
}
