package Wrappers;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        //Instanciar Scanner
        Scanner scanner = new Scanner(System.in);

        //Pedir al usuario que introduzca una cadena
        System.out.print("Introduce una cadena: ");
        String cadena = scanner.nextLine();

        //Comprobar si la cadena contiene solo letras
        boolean soloLetras = true;
        for (int i = 0; i < cadena.length(); i++) {
            if (!Character.isLetter(cadena.charAt(i))) {
                soloLetras = false;
                break;
            }
        }

        //Mostrar mensaje al usuario
        if (soloLetras) {
            System.out.println("La cadena contiene solo letras.");
        } else {
            System.out.println("La cadena no contiene solo letras.");
        }

        //Cerrar Scanner
        scanner.close();
    }

}
