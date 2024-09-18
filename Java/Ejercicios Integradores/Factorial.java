import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);

            //Variables
            int numUsu, factorial = 1;

            System.out.print("Ingrese un número: ");
            numUsu = scanner.nextInt();

            scanner.close();

            if (numUsu != 0) {
                
                factorial = factorial(numUsu);

                System.out.println("El factorial de " + numUsu + "! es " + factorial);

            } else {
                System.out.println("El factorial de 0 es 1");
            }

        } catch (Exception e) {
            
            System.out.println("Error: " + e.getMessage());

        }

    }

    // Función recursiva
    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

}
