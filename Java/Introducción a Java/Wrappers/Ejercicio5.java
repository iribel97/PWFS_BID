package Wrappers;

import java.util.Scanner;

public class Ejercicio5 {
    

    public static void main(String[] args) {
        
        //Instanciar Scanner
        Scanner scanner = new Scanner(System.in);

        //Pedir al usuario que introduzca una cadena que represente un número entero
        System.out.print("Introduce un número entero: ");
        String entero = scanner.nextLine();

        //Pedir al usuario que introduzca una cadena que represente un número decimal
        System.out.print("Introduce un número decimal: ");
        String decimal = scanner.nextLine();

        //Convertir las cadenas a los tipos de dato correspondientes
        int numeroEntero = Integer.valueOf(entero);
        double numeroDecimal = Double.valueOf(decimal);

        //Sumar los valores y mostrar el resultado
        double suma = numeroEntero + numeroDecimal;
        System.out.println("La suma de los números es: " + suma);

        //Cerrar Scanner
        scanner.close();

    }

}
