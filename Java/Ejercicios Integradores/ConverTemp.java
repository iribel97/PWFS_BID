import java.util.Scanner;

public class ConverTemp {

    public static void main(String[] args) {
        // Instanciar el objeto Scanner
        Scanner scan = new Scanner(System.in);

        // Variables
        double tempUsu, tempConver;
        int opc;

        System.out.print("|--------------------------------------------|"
                + "\n| 1. Convertir de Celsius a Fahrenheit       |"
                + "\n| 2. Convertir de Fahrenheit a Celsius       |"
                + "\n|--------------------------------------------|"
                + "\nIngrese la opción deseada: ");
        opc = scan.nextInt();

        try {
            switch (opc) {
                case 1:
                    System.out.print("Ingrese la temperatura en Celsius: ");
                    tempUsu = scan.nextDouble();
                    tempConver = (tempUsu * 9 / 5) + 32;
                    System.out.println("La temperatura en Fahrenheit es: " + tempConver);
                    break;
                case 2:
                    System.out.print("Ingrese la temperatura en Fahrenheit: ");
                    tempUsu = scan.nextDouble();
                    tempConver = (tempUsu - 32) * 5 / 9;
                    System.out.println("La temperatura en Celsius es: " + tempConver);
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error: Ingrese una temperatura válida.");
        }

        scan.close();
    }

}