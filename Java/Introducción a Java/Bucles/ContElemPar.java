package Bucles;

public class ContElemPar {
    
    public static void main(String[] args) {
        
        //Variables
        int pares = 0;

        //Instanciar un array de enteros con 10 elementos
        int[] numeros = new int[10];

        //Inicializar cada elemento con un número aleatorio menor a 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100);
        }

        //Imprimir todos los elementos del array en una única línea
        System.out.print("Array de 10 elementos: [");
        for (int i : numeros) {
            System.out.print(i + (i == numeros[numeros.length - 1] ? "]\n" : " - "));
        }

        //Recorrer el array para contar los elementos pares
        for (int i : numeros) {
            if (i % 2 == 0) {
                pares++;
            }
        }

        //Mostrar el total de elementos pares
        System.out.println("El total de elementos pares es: " + pares);

    }

}
