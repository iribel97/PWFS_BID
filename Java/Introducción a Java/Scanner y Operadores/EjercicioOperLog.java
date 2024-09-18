import java.util.Scanner;

public class EjercicioOperLog {
    public static void main(String[] args) {
        //Instanciar la variable scanner
        Scanner scanner = new Scanner(System.in);

        //Pedir al usuario que ingrese dos cantidades
        System.out.println("Hora de que ingreses cantidades");
        System.out.print("Ingresa un numero: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa otro numero: ");
        double num2 = scanner.nextDouble();

        //Comparar que el primer valor es mayor que el segundo
        System.out.println("El número " + num1 + " es mayor que " + num2 + ": " + (num1 > num2));
        //El primer numero es distinto que el segundo
        System.out.println("El número " + num1 + " es distinto que " + num2 + ": " + (num1 != num2));
        //El primer numero es divisible para dos
        System.out.println("El número " + num1 + " es divisible para 2: " + (num1 % 2 == 0));

        //Pedir otros 2 números
        System.out.print("Ingresa un numero: ");
        double num3 = scanner.nextDouble();
        System.out.print("Ingresa otro numero: ");
        double num4 = scanner.nextDouble();

        //Si el número 1 es mayor al número 2 y si el número 3 es mayor al número 4.
        System.out.println("El número " + num1 + " es mayor que " + num2 + " y el número " + num3 + " es mayor que " + num4 + ": " + ((num1 > num2) && (num3 > num4)));
        //Si el número 1 es mayor al número 2 o si el número 3 es mayor al número 4.
        System.out.println("El número " + num1 + " es mayor que " + num2 + " o el número " + num3 + " es mayor que " + num4 + ": " + ((num1 > num2) || (num3 > num4)));

        scanner.close();
    }
}
