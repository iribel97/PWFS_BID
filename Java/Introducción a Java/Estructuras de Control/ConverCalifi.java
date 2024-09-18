import java.util.Scanner;

public class ConverCalifi {
    
    public static void main(String[] args) {
        // Instanciar un objeto de la clase Scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la calificación de 1 a 5: ");
        int calificacion = sc.nextInt();

        sc.close();

        switch (calificacion) {
            case 1 -> System.out.println("Muy deficiente");
            case 2 -> System.out.println("Deficiente");
            case 3 -> System.out.println("Suficiente");
            case 4 -> System.out.println("Notable");
            case 5 -> System.out.println("Sobresaliente");
            default -> System.out.println("Calificación inválida");
        }

    }
    
}
