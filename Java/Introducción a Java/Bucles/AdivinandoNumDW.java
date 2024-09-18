package Bucles;

import java.util.Scanner;

public class AdivinandoNumDW {
    
    public static void main(String[] args) {
        
        Scanner scaner = new Scanner(System.in);

        //Variables
        int numAleatorio, numUsu, limInf, limSup;

        //Pedir valores
        System.out.print("Ingrese el límite inferior: ");
        limInf = scaner.nextInt();
        System.out.print("Ingrese el límite superior: ");
        limSup = scaner.nextInt();

        //Llamar funcion
        numAleatorio = numAleatorio(limInf, limSup);
        do {
            
            //Pedir un numero al usuario
            System.out.print("Ingrese un numero: ");
            numUsu = scaner.nextInt();

            //Comparar el numero del usuario con el numero aleatorio
            if (numUsu < numAleatorio) {
                System.out.println("El numero ingresado es menor al numero aleatorio.");
            } else if (numUsu > numAleatorio) {
                System.out.println("El numero ingresado es mayor al numero aleatorio.");
            } else {
                System.out.println("Felicidades, ha adivinado el numero aleatorio.");
            }

        } while (numUsu != numAleatorio);

        scaner.close();

    }


    public static int numAleatorio(int limInf, int limSup){
        int numA = 0;

        if (limInf < limSup) {
            numA = (int) (Math.random() * (limSup - limInf + 1) + limInf);
        }

        return numA;
        
    }

}
