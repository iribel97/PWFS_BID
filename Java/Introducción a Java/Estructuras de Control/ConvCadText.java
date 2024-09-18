import java.util.Scanner;

public class ConvCadText {
    
    public static void main(String[] args) {

        //Instanciar la clase Scanner
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        String num = leer.nextLine();

        leer.close();

        try {
            int numero = Integer.parseInt(num);
            System.out.println("El número ingresado es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: Debes ingresar un número entero");
        }
    }

}
