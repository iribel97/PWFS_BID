import java.util.Scanner;

public class PomedioElements {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //Declarar variables una que sea un array de 4 elementos y otra que guarde el promedio
        int[] numeros = new int[4];
        int promedio = 0;

        //Pedir al usuario 4 numeros
        System.out.print("Ingrese el primer número: ");
        numeros[0] = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        numeros[1] = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        numeros[2] = scanner.nextInt();
        System.out.print("Ingrese el cuarto número: ");
        numeros[3] = scanner.nextInt();

        scanner.close();
        
        //Promedio
        promedio = (numeros[0] + numeros[1] + numeros[2] + numeros[3]) / 4;

        //Imprimir el promedio
        System.out.println("El promedio de los elementos del array es: " + promedio);

    }

}
