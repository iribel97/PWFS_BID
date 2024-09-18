package com.iri;

import com.iri.entidades.Circulo;
import com.iri.entidades.Rectangulo;
import com.iri.entidades.Triangulo;

public class Main {
    public static void main(String[] args) {
        //CIRCULO
        Circulo circulo = new Circulo(5);

        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
        circulo.dibujar();

        //RECTANGULO
        Rectangulo rectangulo = new Rectangulo(5, 10);
        
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
        rectangulo.dibujar();

        //TRIANGULO
        Triangulo triangulo = new Triangulo(5, 5);
        
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
        triangulo.dibujar();
    }
}