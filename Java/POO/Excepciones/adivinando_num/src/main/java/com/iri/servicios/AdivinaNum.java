package com.iri.servicios;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class AdivinaNum {
    
    public void adivina() {
        Scanner scanner = new Scanner(System.in);

        // Atributos / Variables
        // Intancia de la clase Random para generar un número aleatorio
        Random random = new Random();
        int numeroAdivinar = random.nextInt(50) + 1; // Número aleatorio entre 1 y 50

        int intentos = 0;
        boolean numeroAdivinado = false;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Estoy pensando en un número entre 1 y 50. ¿Puedes adivinar cuál es?");

        // Mientras el número no haya sido adivinado aún se sigue pidiendo intentos
        while (!numeroAdivinado) {
            try {
                System.out.print("Introduce tu adivinanza: ");
                int intento = scanner.nextInt(); // Obtiene el intento del usuario
                intentos++; // Incrementa el contador de intentos

                if (intento < 1 || intento > 50) {
                    System.out.println("Error: El número debe estar entre 1 y 50.");
                    continue; // Continúa con la siguiente iteración
                }

                if (intento < numeroAdivinar) {
                    System.out.println("El número que buscas es mayor.");
                } else if (intento > numeroAdivinar) {
                    System.out.println("El número que buscas es menor.");
                } else {
                    System.out.println("¡Felicidades! Has adivinado el número " + numeroAdivinar + " en " + intentos + " intentos.");
                    numeroAdivinado = true; // Termina el bucle
                }

            } catch (InputMismatchException e) {
                // Manejo de excepción si el usuario no ingresa un número
                System.out.println("Entrada inválida. Por favor, introduce un número.");
                scanner.next(); // Limpiar la entrada no válida
                intentos++;
            }
        }
        scanner.close();
    }

}
