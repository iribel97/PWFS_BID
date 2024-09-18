package com.iri.entidades;

import com.iri.entidades.interfaces.Dibujable;

public class Rectangulo extends Figura implements Dibujable{

    //Atributos
    private double base;
    private double altura;

    //Constructor
    public Rectangulo(double base, double altura) {
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
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    //Dibujar figura
    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectángulo");
        
        for (int i = 0; i < this.base; i++) {
            for (int j = 0; j < this.altura; j++) {
                if (i == 0 || i == this.base - 1 || j == 0 || j == this.altura -1 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
