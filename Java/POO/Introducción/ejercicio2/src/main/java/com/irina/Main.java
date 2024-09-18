package com.irina;

import java.util.Scanner;

import com.irina.entidades.Auto;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Ford", "Fiesta", 2010);
        Auto auto2 = new Auto("Chevrolet", "Corsa");
        Auto auto3 = new Auto("Renault");
        Auto auto4 = new Auto();

        auto1.imprimirDatos();
        auto2.imprimirDatos();
        auto3.imprimirDatos();
        auto4.imprimirDatos();

        menuOpc();
    }

    public static void menuOpc() {
        Scanner sc = new Scanner(System.in);

        // Variables
        int opc;
        Auto auto = new Auto();

        do {
            System.out.println("|--------------------------------------|" +
                    "\n| 1. Ingresar marca                    |" +
                    "\n| 2. Ingresar modelo                   |" +
                    "\n| 3. Ingresar año                      |" +
                    "\n| 4. Imprimir datos                    |" +
                    "\n| 5. Salir                             |" +
                    "\n|--------------------------------------|");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Ingrese la marca: ");
                    auto.setBrand(sc.next());
                    break;
                case 2:
                    System.out.println("Ingrese el modelo: ");
                    auto.setModel(sc.next());
                    break;
                case 3:
                    System.out.println("Ingrese el año: ");
                    auto.setYear(sc.nextInt());
                    break;
                case 4:
                    auto.imprimirDatos();
                    break;
                default:
                    break;
            }
            
        } while (opc != 5);

        sc.close();
    }
}