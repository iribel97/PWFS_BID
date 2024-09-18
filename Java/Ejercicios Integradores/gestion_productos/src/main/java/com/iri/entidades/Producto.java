package com.iri.entidades;

import com.iri.exceptions.ProductoAgotadoException;
import com.iri.interfaces.Comprable;

public abstract class Producto implements Comprable{

    // Atributos
    private String nombre;
    private double precio;
    private int cantidadStock;
    private String descripcion;

    // Constructores
    public Producto() {
    }

    public Producto(String nombre, double precio, int cantidadStock, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public int getCantidadStock() {
        return this.cantidadStock;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //Manejo de stock
    public void reducirStock(int cantidad) throws ProductoAgotadoException {
        if (cantidad > cantidadStock) {
            throw new ProductoAgotadoException("Producto agotado: " + nombre);
        }
        cantidadStock -= cantidad;
    }


    @Override
    public abstract double calcularPrecio(double descuento);

}
