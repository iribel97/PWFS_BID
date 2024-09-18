import java.util.Scanner;

public class TercerEjer {

    public static void main(String[] args) {
        // Instanciar la variable Scanner
        Scanner scanner = new Scanner(System.in);

        /**
         * Ejercicio #1: Verificación de Edad
         */

        // Declarar variables
        int anioNacimiento, anioActual = 2024, edad;

        // Pedir al usuario el año de nacimiento
        System.out.print("Ingrese su año de nacimiento: ");
        anioNacimiento = scanner.nextInt();

        edad = anioActual - anioNacimiento;

        System.out.println("Usted tiene " + edad + " años, por lo que es" +
                ((edad > 18) ? " mayor de edad" : " menor de edad"));

        /**
         * Ejercicio #2: Calculadora de Área y Perímetro
         */
        // Declarar variables
        double perimetro, area;

        // Pedir al usuario la base y altura del rectángulo
        System.out.println("Calculadora de Área y Perímetro de un Rectángulo");
        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        // Calcular el área y perímetro
        area = base * altura;
        perimetro = 2 * (base + altura);

        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro del rectángulo es: " + perimetro);

        scanner.close();
    }
}