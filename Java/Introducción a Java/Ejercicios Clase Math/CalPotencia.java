import java.util.Scanner;

public class CalPotencia {
    
    public static void main(String[] args) {
        
        Scanner scaner = new Scanner(System.in);

        int resultado;

        try {
            System.out.print("Ingrese la base: ");
            int num = scaner.nextInt();

            System.out.print("Ingrese el exponente: ");
            int potencia = scaner.nextInt();

            scaner.close();

            resultado = (int) Math.pow(num, potencia);

            System.out.println("El resultado de elevar '" + num + "' a la potencia de '" + potencia + "' es: " + resultado);
        } catch (Exception e) {
            System.out.println("Debe ingresar un número entero.");
        }

    }

}
