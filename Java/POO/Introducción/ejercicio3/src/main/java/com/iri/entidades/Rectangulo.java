package com.iri.entidades;

public class Rectangulo {

    private double ancho;
    private double alto;
    static private int numRectangulos = 0;

    public Rectangulo(){}
    
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
        numRectangulos++;
    }

    public double area() {
        return ancho * alto;
    }

    public double perimetro() {
        return 2 * (ancho + alto);
    }

    public void imprimirArea() {
        System.out.println("El área del rectángulo es: " + area());
    }

    public void imprimirPerimetro() {
        System.out.println("El perímetro del rectángulo es: " + perimetro());
    }

    public static int getNumRectangulos() {
        return numRectangulos;
    }

    //GETTERS Y SETTERS DE LOS ATRIBUTOS
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    //Imprimir datos de la figura
    public void imprimirDatos() {
        System.out.println("Ancho: " + ancho + " Alto: " + alto + " Área: " + area() + " Perímetro: " + perimetro());
    }

}
