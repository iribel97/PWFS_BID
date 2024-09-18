import java.util.Scanner;

public class ExcepResta {
    
    public static void main(String[] args) {
        
        //Instanciar la clase Scanner
        Scanner sc = new Scanner(System.in);

        //Variables
        int num1, num2;

        try {
            System.out.print("Introduce el primer número: ");
            num1 = sc.nextInt();
            System.out.print("Introduce el segundo número: ");
            num2 = sc.nextInt();
            sc.close();
            System.out.println("La resta de los números es: " + (num1 - num2));
        } catch (Exception e) {
            System.out.println("Error: Debes ingresar números enteros");
        }
        
        
    }

}
