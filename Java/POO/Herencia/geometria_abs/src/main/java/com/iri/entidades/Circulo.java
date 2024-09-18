package com.iri.entidades;

import com.iri.entidades.interfaces.Dibujable;

public class Circulo extends Figura implements Dibujable{

    //Atributos
    private double radio;

    //Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    //GETTER Y SETTER
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Métodos
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    

    //Dibujar figura
    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo");
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                double distancia = Math.sqrt(Math.pow(i - 5, 2) + Math.pow(j - 5, 2));
                if (distancia < 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
