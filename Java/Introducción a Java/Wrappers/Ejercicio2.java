package Wrappers;

import java.util.Scanner;

public class Ejercicio2 {


    public static void main(String[] args) {
        
        //Instanciar Scanner
        Scanner scanner = new Scanner(System.in);

        //Pedir al usuario que introduzca una cadena
        System.out.print("Introduce una cadena: ");
        String cadena = scanner.nextLine();

        //Intentar convertir la cadena a un número entero
        try {
            int numero = Integer.valueOf(cadena);
            System.out.println("El número introducido es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("La entrada no es un número válido.");
        }

        //Cerrar Scanner
        scanner.close();

    }

}
