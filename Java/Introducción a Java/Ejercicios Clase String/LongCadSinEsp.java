import java.util.Scanner;

public class LongCadSinEsp {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String cadena;

        System.out.print("Ingrese una frase: ");
        cadena = scan.nextLine();

        scan.close();

        //Hacer que la variable cadena guarde la cadena sin espacios
        cadena = cadena.replace(" ", "");

        System.out.println("La longitud de la cadena sin espacios es: " + cadena.length());
    }

}
