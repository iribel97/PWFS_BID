import java.util.Scanner;

public class BuscaCarct {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Variables
        String palabra;
        char caracter;

        System.out.print("Ingrese una palabra: ");
        palabra = scan.nextLine();

        System.out.print("Ingrese un caracter: ");
        caracter = scan.next().charAt(0);

        scan.close();

        if (palabra.indexOf(caracter) != -1) {
            System.out.println("El caracter " + caracter + " se encuentra en la palabra '" + palabra +"'");
        } else {
            System.out.println("El caracter " + caracter + " no se encuentra en la palabra '" + palabra +"'");
        }   
    }

}
