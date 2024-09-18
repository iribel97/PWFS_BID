import java.util.Scanner;

public class NumPrimos {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            
            //VARIABLES
            int numUsu, temp, contP;

            do {

                System.out.print("Ingrese la cantidad de números primos a hallar (0 en caso de querer salir): ");
                numUsu = scanner.nextInt();

                temp = 2;
                contP = 0;

                if (numUsu != 0) {
                
                    hallarPrimos(numUsu, temp, contP);
                    System.out.println();
                    
                }

                
            } while (numUsu != 0);

            scanner.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    //Funcion recursiva
    public static void hallarPrimos(int numUsu, int temp, int contP) {
        int cont = 0;

        if (contP < numUsu) {
            for (int i = 1; i <= temp; i++) {
                if (temp % i == 0) {
                    cont++;
                } 
            }
            
            if (cont == 2) {
                System.out.print(temp + " ");
                contP++;
            }

            hallarPrimos(numUsu, temp + 1, contP);
        }
    }

}
