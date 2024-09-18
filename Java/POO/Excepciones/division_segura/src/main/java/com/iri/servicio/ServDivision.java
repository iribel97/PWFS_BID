package com.iri.servicio;

import java.util.Scanner;

import com.iri.entidad.Division;

public class ServDivision {

    private Scanner scanner = new Scanner(System.in);

    private Division division;

    public void obtenerNumerador() {

        try {
            System.out.println("Dividendo guardado correctamente");
            System.out.println("Ingrese el divisor (# por el que quiere dividir): ");
            int divisor = scanner.nextInt();
            division = new Division();
            division.setDivisor(divisor);
            System.out.println("Divisor guardado correctamente");
            System.out.println("El resultado de la división es: " + division.getDividendo() / division.getDivisor());
        } catch (Exception e) {
            throw new ArithmeticException("No se puede dividir por 0");
        }

    }

}
