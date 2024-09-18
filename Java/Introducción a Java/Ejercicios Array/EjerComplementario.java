import java.util.Scanner;

public class EjerComplementario {
    
    public static void main(String[] args) {
        
        // EJERCICIO 1: Generando un número aleatorio entre dos límites -----------------------------------------

        //Variables del ejercicio
        int[] numArray = new int[6];
        int limSup = 100, limInf = 27;

        //Generar los números aleatorios
        numArray[0] = (int) (Math.random() * (limSup - limInf + 1) + limInf);
        numArray[1] = (int) (Math.random() * (limSup - limInf + 1) + limInf);
        numArray[2] = (int) (Math.random() * (limSup - limInf + 1) + limInf);
        numArray[3] = (int) (Math.random() * (limSup - limInf + 1) + limInf);
        numArray[4] = (int) (Math.random() * (limSup - limInf + 1) + limInf);
        numArray[5] = (int) (Math.random() * (limSup - limInf + 1) + limInf);

        //Imprimir el array
        System.out.println("Ejercicio #1");
        System.out.print("El array es: ");
        System.out.println(numArray[0] + " - " + numArray[1] + " - " + numArray[2] + " - " + numArray[3] + " - " + numArray[4] + " - " + numArray[5]);


        // EJERCICIO 2: Sumando elementos en posiciones pares --------------------------------------------------------

        //Variables del ejercicio
        int[] numArray2 = {4,7,6,8,2};
        int suma = 0;

        //Sumar los elementos en posiciones pares
        suma = numArray2[0] + numArray2[2] + numArray2[4];

        //Imprimir la suma
        System.out.println("\nEjercicio #2 ");
        System.out.println("La suma de los elementos en posiciones pares es: " + suma);


        // EJERCICIO 3: Ordenando Nombres Alfabéticamente -------------------------------------------------------
        Scanner scanner = new Scanner(System.in);

        //Variables del ejercicio
        String[] nombres = new String[4];

        //Pedir los nombres al usuario
        System.out.println("\nEjercicio #3");
        System.out.print("Ingrese primer nombre: ");
        nombres[0] = scanner.nextLine();
        System.out.print("Ingrese segundo nombre: ");
        nombres[1] = scanner.nextLine();
        System.out.print("Ingrese tercer nombre: ");
        nombres[2] = scanner.nextLine();
        System.out.print("Ingrese cuarto nombre: ");
        nombres[3] = scanner.nextLine();

        scanner.close();

        //Ordenar los nombres alfabéticamente usando if
        String temp = nombres[0];

        if (nombres[0].compareTo(nombres[1]) > 0) {
            nombres[0] = nombres[1];
            nombres[1] = temp;
        }

        if (nombres[1].compareTo(nombres[2]) > 0) {
            temp = nombres[1];
            nombres[1] = nombres[2];
            nombres[2] = temp;
        }

        if (nombres[2].compareTo(nombres[3]) > 0) {
            temp = nombres[2];
            nombres[2] = nombres[3];
            nombres[3] = temp;
        }

        if (nombres[0].compareTo(nombres[1]) > 0) {
            temp = nombres[0];
            nombres[0] = nombres[1];
            nombres[1] = temp;
        }

        if (nombres[1].compareTo(nombres[2]) > 0) {
            temp = nombres[1];
            nombres[1] = nombres[2];
            nombres[2] = temp;
        }

        if (nombres[0].compareTo(nombres[1]) > 0) {
            temp = nombres[0];
            nombres[0] = nombres[1];
            nombres[1] = temp;
        }

        //Imprimir los nombres ordenados
        System.out.println("Los nombres ordenados alfabéticamente son: ");
        System.out.println(nombres[0] + " - " + nombres[1] + " - " + nombres[2] + " - " + nombres[3]);




    }

}
