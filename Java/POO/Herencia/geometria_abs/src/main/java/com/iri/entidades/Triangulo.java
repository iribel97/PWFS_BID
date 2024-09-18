package com.iri.entidades;

import com.iri.entidades.interfaces.Dibujable;

public class Triangulo extends Figura implements Dibujable{

    //Atributos
    private double base;
    private double altura;

    //Constructor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //GETTER Y SETTER
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Métodos
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return base + (2 * Math.sqrt(Math.pow(base / 2, 2) + Math.pow(altura, 2)));
    }

    //Dibujar figura
    @Override
    public void dibujar() {
        System.out.println("Dibujando un triángulo");
        
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                if (i == this.altura - 1 || j == 0 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
