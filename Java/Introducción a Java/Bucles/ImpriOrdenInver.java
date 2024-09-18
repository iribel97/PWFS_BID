package Bucles;

public class ImpriOrdenInver {
    
    public static void main(String[] args) {
        
        //Array de enteros
        int[] numeros = {27, 5, 71, 3, 8, 2, 9, 1, 4, 6};

        //Imprimir los números en orden
        System.out.print("Orden inicial: [");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + (i == numeros.length - 1 ? "]\n" : " - "));
        }

        //Imprimir los números en orden inverso
        System.out.print("Orden inverso: [");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + (i == 0 ? "]\n" : " - " ));
        }

    }

}
