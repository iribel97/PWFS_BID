import java.util.Scanner;

public class Divisibilidad {
    
    public static void main(String[] args) {
        
        // Instanciar la clase Scanner
        Scanner scanner = new Scanner(System.in);

        // Variables
        int numero;
        String resultado;

        // Solicitar al usuario un número
        System.out.print("Ingrese un número entero: ");
        numero = scanner.nextInt();

        if( (numero % 3 == 0) && (numero % 5 == 0)){
            resultado = "Es divisible por 3 y 5";
        } else if ( (numero % 3) == 0){
            resultado = "Es divisible por 3";
        } else if ( (numero %5) == 0){
            resultado = "Es divisible por 5";
        } else {
            resultado = "No es divisible por 3 ni por 5";
        }

        System.out.println(resultado);

        // Cerrar el scanner
        scanner.close();

    }
}
