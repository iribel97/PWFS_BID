package com.iri.entidades;

public class Triangulo {

    private double base;
    private double altura;
    static private int numTriangulos = 0;


    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public void mostrarArea() {
        System.out.println("El área del triángulo es: " + calcularArea());
    }

    public static int getNumTriangulos() {
        return numTriangulos;
    }

    //GETTERS Y SETTERS DE LOS ATRIBUTOS
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Imprimir datos de la figura
    public void imprimirDatos() {
        System.out.println("Base: " + base + " Altura: " + altura + " Área: " + calcularArea());
    }

}
