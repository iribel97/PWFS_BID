package com.iri.servicio;

import java.util.Scanner;

public class ServUser {

    public void solicitarNombre() throws Exception {
        // try-with-resources para asegurar que el Scanner se cierre automáticamente
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Por favor, ingrese su nombre: ");
            String nombre = scanner.nextLine();

            // Lanzar excepción si el nombre tiene menos de 2 caracteres
            if (nombre.length() < 2) {
                throw new Exception("El nombre debe tener al menos 2 caracteres.");
            }

            // Imprimir el saludo si el nombre es válido
            System.out.println("¡Hola, " + nombre + "!");
        }
    }

}
