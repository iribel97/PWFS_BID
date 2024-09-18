import java.util.Scanner;

public class CalRaiz {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número entero positivo: ");
            int num = scan.nextInt();

            scan.close();

            if (num > 0) {
                System.out.println("La raíz cuadrada de '" + num + "' es: " + Math.sqrt(num));
            } else {
                throw new Exception();
            }

            
        } catch (Exception e) {
            System.out.println("Debe ingresar un número entero positivo.");
        }

    }

}
