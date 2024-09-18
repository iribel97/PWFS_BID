import java.util.Scanner;

public class DivSegura {

    public static void main(String[] args) {
        //Instanciar la clase Scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el dividendo: ");
        int dividendo = sc.nextInt();
        System.out.print("Introduce el divisor: ");
        int divisor = sc.nextInt();

        sc.close();

        try {
            int resultado = dividendo / divisor;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero");
        }
    }

}