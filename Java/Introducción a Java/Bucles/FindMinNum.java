package Bucles;

public class FindMinNum {

    public static void main(String[] args) {
        
        //Array de enteros
        int[] numeros = {27, 5, 71, 3, 8, 2, 9, 1, 4, 6};

        //Variables
        int min = numeros[0];

        //Encontrar el número menor
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }

        //Imprimir el número menor
        System.out.println("El número menor es: " + min);
    }

}
