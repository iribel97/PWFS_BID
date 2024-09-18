package Wrappers;

import java.util.Scanner;

public class Ejercicio4 {
    

    public static void main(String[] args) {
        
        //Instanciar Scanner
        Scanner scanner = new Scanner(System.in);

        //Pedir al usuario que introduzca una cadena
        System.out.print("Introduce una cadena: ");
        String cadena = scanner.nextLine();

        //Contar el número de espacios en blanco en la cadena
        int espacios = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isWhitespace(cadena.charAt(i))) {
                espacios++;
            }
        }

        //Mostrar el número de espacios en blanco
        System.out.println("La cadena contiene " + espacios + " espacios en blanco.");

        //Cerrar Scanner
        scanner.close();

    }

}
