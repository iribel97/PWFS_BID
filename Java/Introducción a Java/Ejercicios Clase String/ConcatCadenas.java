import java.util.Scanner;

public class ConcatCadenas {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        //Variables
        String nombre, apellido;


        System.out.print("Ingrese su nombre: ");
        nombre = scan.nextLine();
        System.out.print("Ingrese su apellido: ");
        apellido = scan.nextLine();

        scan.close();

        nombre = nombre.concat(" ").concat(apellido);

        System.out.println("Su nombre completo es: " + nombre);

    }

}
