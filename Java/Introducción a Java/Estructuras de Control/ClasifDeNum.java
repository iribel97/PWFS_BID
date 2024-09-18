import java.util.Scanner;

public class ClasifDeNum {

    public static void main(String[] args){

        //Instanciar la clase Scanner
        Scanner scanner = new Scanner(System.in);

        //Variables
        double num;

        //Solicitar al usuario un número
        System.out.print("Ingrese un número: ");
        num = scanner.nextDouble();

        //Determinar si el número es positivo, negativo o cero
        if (num == 0) {
            System.out.println("El número ingresado es cero");
        } else if (num > 0){
            System.out.println("El número ingresado es positivo");
        } else {
            System.out.println("El número ingresado es negativo");
        }

        //Cerrar el scanner
        scanner.close();

    }
}