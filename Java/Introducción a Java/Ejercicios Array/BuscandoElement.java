import java.util.Scanner;

public class BuscandoElement {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //Variables
        int[] numeros = {5, 100, 27};
        int numUsu;

        //Pedir al usuario un número
        System.out.print("Ingrese un número: ");
        numUsu = scanner.nextInt();

        scanner.close();

        //Buscar el número en el array
        if (numUsu == numeros[0] || numUsu == numeros[1] || numUsu == numeros[2]) {
            System.out.println("El número " + numUsu + " se encuentra en el array.");
        } else {
            System.out.println("El número " + numUsu + " no se encuentra en el array.");
        }

    }

}
