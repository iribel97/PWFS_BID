package com.iri.entidades;

public class Circulo {

    private double radio;
    static private int numCirculos = 0;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public void mostrarArea() {
        System.out.println("El área del círculo es: " + calcularArea());
    }

    public void mostrarPerimetro() {
        System.out.println("El perímetro del círculo es: " + calcularPerimetro());
    }

    public static int getNumCirculos() {
        return numCirculos;
    }

    //GETTERS Y SETTERS DE LOS ATRIBUTOS
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Imprimir datos de la figura
    public void imprimirDatos() {
        System.out.println("Radio: " + radio + " Área: " + calcularArea() + " Perímetro: " + calcularPerimetro());
    }

}
