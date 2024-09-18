package com.iri.entidades;

public class ProduElectronico extends Producto{

    // Atributos
    private String marca;
    private String modelo;
    private String tipo;

    // Constructor
    public ProduElectronico(String nombre, double precio, int cantidadStock, String descripcion, String marca, String modelo, String tipo) {
        super(nombre, precio, cantidadStock, descripcion);
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    // Getters y Setters
    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Metodo para calcular el precio de un producto con un descuento y con impuesto de 15%
    @Override
    public double calcularPrecio(double descuento) {
        return Math.round((this.getPrecio() - (this.getPrecio() * (descuento / 100))) * 1.15 );
    }

}
