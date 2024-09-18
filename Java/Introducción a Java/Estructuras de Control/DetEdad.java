import java.util.Scanner;

public class DetEdad {

    public static void main(String[] args) {
        
        // Instanciar la clase Scanner
        Scanner scanner = new Scanner(System.in);

        // Variables
        int edad;

        // Solicitar al usuario la edad
        System.out.print("Ingrese su edad: ");
        edad = scanner.nextInt();

        if (edad < 18) {
            System.out.println("Eres menor de edad");
        } else if ( edad >= 18 && edad <= 64){
            System.out.println("Eres mayor de edad");
        } else if(edad >= 65){
            System.out.println("Eres un adulto mayor");
        }

        // Cerrar el scanner
        scanner.close();
    }

}
