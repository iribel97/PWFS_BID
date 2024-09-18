package com.iri;

import java.util.Scanner;

import com.iri.entidades.Punto;

public class Main {

    private static Punto[] puntos = new Punto[3];

    public static void main(String[] args) {
        actividad();
    }

    public static void actividad(){

        Scanner leer = new Scanner(System.in);

        //Llenar el array
        for (int i = 0; i < puntos.length; i++) {
            System.out.println("Ingrese el punto " + (i + 1));
            System.out.print("Ingrese la coordenada x: ");
            double x = leer.nextDouble();
            System.out.print("Ingrese la coordenada y: ");
            double y = leer.nextDouble();
            puntos[i] = new Punto(x, y);
        }

        //Mostar metodos
        for (Punto punto : puntos) {
            //Mostrar distancia desde el origen
            System.out.println("Punto: (" + punto.getX() + ", " + punto.getY() + ")");
            System.out.println("Distancia desde el origen: " + punto.distanciaDesdeOrigen());
            System.out.println("-------------------------------------------------");
        }

        //Calcular la distancia entre dos puntos
        System.out.println("La distancia entre los puntos 1 y 2 es: " + Punto.calcularDistancia(puntos[0], puntos[1]));
        System.out.println("La distancia entre los puntos 2 y 3 es: " + Punto.calcularDistancia(puntos[1], puntos[2]));
        System.out.println("La distancia entre los puntos 1 y 3 es: " + Punto.calcularDistancia(puntos[0], puntos[2]));

        //Verificar si los puntos estan alineados
        System.out.println("Los puntos estan alineados: " + Punto.estanAlineados(puntos[0], puntos[1], puntos[2]));

        leer.close();
    }
}