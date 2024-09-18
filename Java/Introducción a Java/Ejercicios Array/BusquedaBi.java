import java.util.Arrays;
import java.util.Scanner;

public class BusquedaBi {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //Variables
        int numUsu;
        int[] numeros = {2, 45, 55, 13, 20, 17};

        //Ordenar
        Arrays.sort(numeros);

        System.out.println("Arreglo ordenado: " + Arrays.toString(numeros));

        System.out.print("Introduce un número a buscar: ");
        numUsu = scanner.nextInt();
        scanner.close();

        //Buscar
        int indice = Arrays.binarySearch(numeros, numUsu);

        if (indice >= 0) {
            System.out.println("El número " + numUsu + " se encuentra en la posición " + indice);
        } else {
            System.out.println("El número " + numUsu + " no se encuentra en el arreglo");
        }

    }

}