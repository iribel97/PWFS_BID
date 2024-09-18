package Bucles;

import java.util.Scanner;

public class NumDigi {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //Variables
        int num, digitos = 0;

        //Ingreso de datos
        System.out.print("Ingrese un numero: ");
        num = scanner.nextInt();

        scanner.close();

        do {
            num = num / 10;
            digitos++;
        } while (num != 0);

        System.out.println("El numero tiene " + digitos + " digitos.");

    }

}