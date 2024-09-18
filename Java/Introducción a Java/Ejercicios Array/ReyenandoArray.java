import java.util.Arrays;
import java.util.Scanner;

public class ReyenandoArray {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamaño = scanner.nextInt();

        int[] array = new int[tamaño];

        rellenarArray(array);

        System.out.println("Arreglo completo: " + Arrays.toString(array));

        scanner.close();

    }

    public static void rellenarArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        int lastIndex = -1; 
        

        while (lastIndex >= array.length - 1) {
            System.out.print("Ingrese el número para rellenar el arreglo: ");
            int numero = scanner.nextInt();

            System.out.print("Ingrese el índice hasta el cual desea rellenar el arreglo: ");
            int index = scanner.nextInt();

            
            if (index >= 0 && index < array.length && index > lastIndex) {
                Arrays.fill(array, lastIndex + 1, index + 1, numero);
                lastIndex = index;

            } else {
                System.out.println("Índice inválido. Asegúrese de que el índice sea mayor que " + lastIndex + " y menor que " + (array.length - 1));
            }
        }

        scanner.close();
    }

}
