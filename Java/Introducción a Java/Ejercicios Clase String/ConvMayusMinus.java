import java.util.Scanner;

public class ConvMayusMinus {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String cadena;

        System.out.print("Ingrese una cadena de texto: ");
        cadena = scan.nextLine();

        scan.close();

        System.out.println("La cadena en mayúsculas es: '" + cadena.toUpperCase() + "'");
        System.out.println("La cadena en minúsculas es: '" + cadena.toLowerCase() + "'");


    }

}
