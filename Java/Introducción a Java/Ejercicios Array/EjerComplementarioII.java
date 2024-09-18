import java.util.Arrays;
import java.util.Scanner;

public class EjerComplementarioII {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Variables
        int indIn=0, indFin;

        // Solicitar el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamano = scanner.nextInt();

        // Validar que el tamaño sea positivo
        if (tamano <= 0) {
            System.out.println("El tamaño del arreglo debe ser mayor que 0.");
            scanner.close();
            return;
        }

        int[] arreglo = new int[tamano];

        while (indIn < tamano) {
            // Solicitar un número para rellenar el arreglo
            System.out.print("Ingrese un número para rellenar el arreglo: ");
            int numero = scanner.nextInt();

            // Solicitar el índice hasta el cual quiere rellenar el arreglo
            do {
                System.out.print("Ingrese el índice hasta el cual quiere rellenar el arreglo: ");
                indFin = scanner.nextInt();

                if (indFin < indIn || indFin > tamano) {
                    System.out.println(
                            "El índice debe ser mayor que " + (indIn) + " y menor que " + tamano + ".");
                }
            } while (indFin < indIn || indFin > tamano);

            // Rellenar el arreglo con el número proporcionado hasta el índice ingresado
            Arrays.fill(arreglo, indIn, indFin, numero);

            indIn = indFin;
            
        }

        // Imprimir el arreglo completo
        System.out.println("El arreglo final es: " + Arrays.toString(arreglo));

        scanner.close();

    }

}
