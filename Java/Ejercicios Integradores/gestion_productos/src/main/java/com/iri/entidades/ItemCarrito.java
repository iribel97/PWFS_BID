package com.iri.entidades;

public class ItemCarrito {
    // Atributos
    private Producto producto;
    private int cantidad;
    private double descuento;

    // Constructor
    public ItemCarrito(Producto producto, int cantidad, double descuento) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.descuento = descuento;
    }

    // Getters y Setters
    public Producto getProducto() {
        return this.producto;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public double getDescuento() {
        return this.descuento;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
