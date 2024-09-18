import java.util.Scanner;

public class ExtraerSubCade {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Variables
        String cadena;
        int indiceIni, indiceFin;

        System.out.print("Ingrese una cadena de texto: ");
        cadena = scan.nextLine();

        System.out.print("Ingrese el índice inicial: ");
        indiceIni = scan.nextInt();

        System.out.print("Ingrese el índice final: ");
        indiceFin = scan.nextInt();

        scan.close();

        System.out.println("La subcadena es: " + cadena.substring(indiceIni, indiceFin));
    }

}
