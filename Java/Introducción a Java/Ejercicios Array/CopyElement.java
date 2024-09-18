import java.util.Scanner;

public class CopyElement {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //Variables
        int[] num = {4,7,6};
        int[] num2 = new int[5];

        //Copiar los elementos del primer array al segundo
        num2[0] = num[0];
        num2[1] = num[1];
        num2[2] = num[2];

        //Pedir al usuario un número
        System.out.print("Ingrese un número: ");
        num2[3] = scanner.nextInt();
        System.out.print("Ingrese otro número: ");
        num2[4] = scanner.nextInt();

        scanner.close();

        //Imprimir el segundo array
        System.out.println("El segundo array es: ");
        System.out.println(num2[0] + " - " + num2[1] + " - " + num2[2] + " - " + num2[3] + " - " + num2[4]);

    }

}
