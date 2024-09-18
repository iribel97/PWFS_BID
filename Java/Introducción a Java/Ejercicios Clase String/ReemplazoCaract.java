import java.util.Scanner;

public class ReemplazoCaract {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Variables
        String frase;
        char caracter1, caracter2;

        System.out.print("Ingrese una frase: ");
        frase = scan.nextLine();

        System.out.print("Ingrese el caracter a reemplazar: ");
        caracter1 = scan.next().charAt(0);

        System.out.print("Ingrese el caracter por el que va a ser reemplazado: ");
        caracter2 = scan.next().charAt(0);

        scan.close();

        System.out.println("La frase resultante es: " + frase.replace(caracter1, caracter2));

    }

}
