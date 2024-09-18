package com.iri;

import com.iri.servicio.ServUser;

public class Main {
    public static void main(String[] args) {
        //Instanciar la clase ServUser
        ServUser servUser = new ServUser();

        //Llamar al método solicitarNombre() y manejar la excepción
        try {
            servUser.solicitarNombre();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Programa finalizado. Gracias por usar nuestra aplicación.");
        }
    }
}