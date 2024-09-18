import java.util.Scanner;

public class ElimEspBlanc {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String cadena;

        System.out.print("Ingrese una frase: ");
        cadena = scan.nextLine();

        scan.close();

        System.out.println("La frase sin espacios en blanco es: " + cadena.replace(" ", ""));

    }

}
