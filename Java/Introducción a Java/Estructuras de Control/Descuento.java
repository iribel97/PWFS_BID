import java.util.Scanner;

public class Descuento {

    public static void main(String[] args) {
        
        //Instanciar la clase Scanner
        Scanner scanner = new Scanner(System.in);

        //Variables
        double precio, precioFinal;

        //Solicitar al usuario el precio del producto
        System.out.print("Ingrese el precio del producto: $");
        precio = scanner.nextDouble();

        if (precio >= 100) {
            precioFinal = precio * 0.9;
        } else {
            precioFinal = precio;
        }

        System.out.println("El precio final es: $" + precioFinal);

        //Cerrar el scanner
        scanner.close();
    }
}
