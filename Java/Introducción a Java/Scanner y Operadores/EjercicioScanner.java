import java.util.Scanner;

public class EjercicioScanner {
    
    public static void main(String[] args) {
        //Instaciar variable que va a leer lo que el ususario ingrese por consola
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        System.out.println("Hola " + nombre + " tu edad es " + edad);
        
        scanner.close();
    }

}
