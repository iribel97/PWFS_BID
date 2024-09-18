import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);

            /*
             * VARIABLES
             */
            //Numeros totales de la serie ahora ingrgesado por el susuario
            int cant;
            //Otras variables
            int ini = 0, sig = 1;
            //int cont = 0;

            System.out.print("Ingrese la cantidad de números de la serie Fibonacci: ");
            cant = scanner.nextInt();

            scanner.close();
    
            System.out.println("Serie de Fibonacci: ");
            fibonacci(ini, sig, cant);
            
        } catch (Exception e) {
            
            System.out.println("Error: " + e.getMessage());
        }
        

    }

    //Función recursiva 
    public static void fibonacci(int n1, int n2, int cant) {
        if (cant > 0) {
            System.out.print(n1 + " ");
            fibonacci(n2, n1 + n2, cant - 1);
        }
    }

}
