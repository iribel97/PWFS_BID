package Bucles;

public class EjerComplementI {
    
    public static void main(String[] args) {
        
        // Array de enteros
        int[] numeros = {27, 5, 71, 3, 8, 2};
        //Variable
        int acumulador = 0;

        // Instanciar un array de enteros con la misma longitud que el array original
        int[] numerosInvertidos = new int[numeros.length];

        // Invertir el array
        for (int i = 0; i < numeros.length; i++) {
            numerosInvertidos[i] = numeros[numeros.length - 1 - i];
            acumulador += numerosInvertidos[i];
        }

        //Imprimir por consola
        System.out.print("Array invertido: [");
        for (int i = 0; i < numerosInvertidos.length; i++) {
            System.out.print(numerosInvertidos[i] + (i == numerosInvertidos.length - 1 ? "]\n" : " - "));
        }
        System.out.println("La suma de los elementos del array es: " + acumulador);

    }

}
