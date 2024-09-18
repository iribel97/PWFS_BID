import java.util.Scanner;

public class CalcularAbs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número entero: ");
            int num = scan.nextInt();

            scan.close();

            System.out.println("El valor absoluto de '" + num + "' es: " + Math.abs(num));
        } catch (Exception e) {
            System.out.println("Debe ingresar un número entero.");
        }

    }

}
