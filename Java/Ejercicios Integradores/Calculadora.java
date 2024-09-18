import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        // Instanciar la clase Scanner
        Scanner scanner = new Scanner(System.in);

        // Variables
        int num1, num2;
        int opcion;

        // Pedir al usuario que ingrese dos números
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextInt();

        // Menu de opciones
        System.out.println("|------------------------------|" + "\n" +
                "|      MENU DE OPERACIONES     |" + "\n" +
                "|------------------------------|" + "\n" +
                "| 1. SUMA                      |" + "\n" +
                "| 2. RESTA                     |" + "\n" +
                "| 3. MULTIPLICACION            |" + "\n" +
                "| 4. DIVISION                  |" + "\n" +
                "|------------------------------|");
        System.out.print("Ingrese la opción deseada: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("La suma de los números es: " + sumar(num1, num2));
                break;
            case 2:
                System.out.println("La resta de los números es: " + restar(num1, num2));
                break;
            case 3:
                System.out.println("La multiplicación de los números es: " + multiplicar(num1, num2));
                break;
            case 4:
                System.out.println("La división de los números es: " + dividir(num1, num2));
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        // Cerrar el scanner
        scanner.close();

    }

    // Metodo para sumar
    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    // Metodo para restar
    public static int restar(int num1, int num2) {
        return num1 - num2;
    }

    // Metodo para multiplicar
    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    // Metodo para dividir
    public static int dividir(int num1, int num2) {
        try {
            return num1 / num2;
        } catch (Exception e) {
            return 0;
        }
    }
}
