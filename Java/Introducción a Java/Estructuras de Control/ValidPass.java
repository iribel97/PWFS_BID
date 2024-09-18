import java.util.Scanner;

public class ValidPass {
    public static void main(String[] args) {
        
        //Instanciar la clase Scanner
        Scanner scanner = new Scanner(System.in);

        //Variables
        String passDef = "password", passUsu;

        //Solicitar al usuario una contraseña
        System.out.print("Ingrese una contraseña: ");
        passUsu = scanner.nextLine();

        //Si la contraseña ingresada es correcta, se mostrará un mensaje de "Acceso concedido"
        if (passUsu.equals(passDef)) {
            System.out.println("Acceso concedido");

            //Caso contrario se mostrará un mensaje de "Acceso denegado"
        } else {
            System.out.println("Acceso denegado");
        }

        //Cerrar el scanner
        scanner.close();
        
    }
}
