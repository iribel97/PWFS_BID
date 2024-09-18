import java.util.Scanner;

public class EncontrarMax {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //Variables
        int[] numeros = new int[5];
        int max = 0;

        //Pedir al usuario 5 numeros
        /*
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        */

        System.out.print("Ingrese el primer número: ");
        numeros[0] = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        numeros[1] = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        numeros[2] = scanner.nextInt();
        System.out.print("Ingrese el cuarto número: ");
        numeros[3] = scanner.nextInt();
        System.out.print("Ingrese el quinto número: ");
        numeros[4] = scanner.nextInt();

        scanner.close();

        //Encontrar el número mayor
        max = numeros[0];

        if (numeros[1] > max) {
            max = numeros[1];
        }
        if (numeros[2] > max) {
            max = numeros[2];
        }
        if (numeros[3] > max) {
            max = numeros[3];
        }
        if (numeros[4] > max) {
            max = numeros[4];
        }

        //Imprimir el número mayor
        System.out.println("El número mayor es: " + max);



    }

}
