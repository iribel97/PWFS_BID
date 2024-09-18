import java.util.Scanner;

public class RedonNum {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número decimal: ");
            double num = scan.nextDouble();

            scan.close();

            System.out.println("El número '" + num + "' redondeado es: " + Math.round(num));
        } catch (Exception e) {
            System.out.println("Debe ingresar un número decimal.");
        }
    }

}
