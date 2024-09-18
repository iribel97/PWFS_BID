package com.iri.entidades;

public class ProduRopa extends Producto{

    // Atributos 
    private String talla;
    private String color;
    private String material;

    // Constructor
    public ProduRopa(String nombre, double precio, int cantidadStock, String descripcion, String talla, String color, String material) {
        super(nombre, precio, cantidadStock, descripcion);
        this.talla = talla;
        this.color = color;
        this.material = material;
    }

    // Getters y Setters
    public String getTalla() {
        return this.talla;
    }

    public String getColor() {
        return this.color;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    // Metodo para calcular el precio de un producto con un descuento y que cuenta con un impuesto de 10%
    @Override
    public double calcularPrecio(double descuento) {
        return (getPrecio() - (getPrecio() * descuento / 100)) * 1.1;
    }

}
