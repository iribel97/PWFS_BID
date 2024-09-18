package Wrappers;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        //Instanciar Scanner
        Scanner scanner = new Scanner(System.in);

        //Pedir al usuario que introduzca un número
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        //Convertir el número a una cadena
        String cadena = String.valueOf(numero);

        //Contar el número de dígitos en la cadena
        int digitos = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isDigit(cadena.charAt(i))) {
                digitos++;
            }
        }

        //Mostrar el número de dígitos
        System.out.println("El número contiene " + digitos + " dígitos.");

        //Cerrar Scanner
        scanner.close();
    }


}
