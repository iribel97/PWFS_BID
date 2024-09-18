import java.util.Scanner;

public class LogintudCadena {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese una cadena de texto: ");
        String cadena = scan.nextLine();

        scan.close();

        System.out.println("La longitud de la cadena es: " + cadena.length());
    }

}
