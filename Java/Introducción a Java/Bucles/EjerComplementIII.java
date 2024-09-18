package Bucles;

import java.util.Scanner;

public class EjerComplementIII {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // EJERCICIO 1: Tabla de multiplicar ------------------------------------------------------------

        // Variables
        int num, i = 1;

        System.out.print("Ingrese un numero: ");
        num = scanner.nextInt();

        while (i<=10) {
            System.out.println(num + " x " + i + " = " + num*i);
            i++;
        }

        // EJERCICIO 2: Contador de números pares e impares ----------------------------------------------

        // Variables
        int numA, pares = 0, impares = 0;

        System.out.print("Cuantos numeros va a ingresar: ");
        numA = scanner.nextInt();

        // Definiendo el arreglo
        int numeros[] = new int[numA];
        i = 0;

        for (int j = 0; j < numA; j++) {
            System.out.print("Ingrese el numero "+ j +": ");
            numeros[j] = scanner.nextInt();
        }

        while (i != numeros.length) {
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            i++;
        }


        System.out.println("Numeros pares: " + pares);
        System.out.println("Numeros impares: " + impares);

        // EJERCICIO 3: Calculadora de suma acumulada ---------------------------------------------------

        // Variables
        int numB, suma = 0;
        char opc;

        do{
            System.out.print("Ingrese un numero: ");
            numB = scanner.nextInt();
            suma += numB;

            System.out.print("Desea ingresar otro numero? (S/N): ");
            opc = scanner.next().charAt(0);
        } while (opc != 'N' && opc != 'n');

        System.out.println("La suma acumulada es: " + suma);


        scanner.close();
        
    }

}
