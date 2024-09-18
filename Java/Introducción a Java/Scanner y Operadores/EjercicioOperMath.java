import java.util.Scanner;

public class EjercicioOperMath {
    
    public static void main(String[] args){
        //Instanciar el Scanner
        Scanner scanner = new Scanner(System.in);

        //Declaración de variables
        int a = 10;
        int b = 5;
        double resultado;

        //Operaciones
        resultado = a + b;
        System.out.println("Suma de las 2 variables: " + resultado);
        resultado = a - b;
        System.out.println("Resta de las 2 variables: " + resultado);
        resultado = a * b;
        System.out.println("Multiplicación de las 2 variables: " + resultado);
        resultado = a / b;
        System.out.println("División de las 2 variables: " + resultado);
        resultado = a % b;
        System.out.println("Módulo de las 2 variables: " + resultado);

        //Pedir al usuario
        System.out.println("Hora de que ingreses cantidades");
        System.out.print("Ingresa un numero: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa otro numero: ");
        double num2 = scanner.nextDouble();
        System.out.println("El resultado de la suma es: " + (num1 + num2));

        scanner.close();

    }
}
