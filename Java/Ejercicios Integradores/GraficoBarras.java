import java.util.Scanner;

public class GraficoBarras {
    
    public static void main(String[] args) {
        
        try {

            Scanner scanner = new Scanner(System.in);

            //VARIABLES
            int[] numeros = new int[4];

            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Ingrese el " + (i + 1) + "° número entre el 1 y 20 : ");
                numeros[i] = scanner.nextInt();

                if (numeros[i] < 1 || numeros[i] > 20) {
                    System.out.println("El número ingresado no es válido");
                    i--;
                }
            }

            scanner.close();

            for (int i = 0; i < numeros.length; i++) {
                System.out.print((i + 1) + "°: ");
                for (int j = 0; j < numeros[i]; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }   

        } catch (Exception e) {
            
            System.out.println("Error: " + e.getMessage());

        }

    }

}
