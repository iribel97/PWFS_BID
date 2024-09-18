import java.util.Scanner;

public class EjerComplement {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        //EJERCICIO 1: Generando un número aleatorio entre dos límites --------------------------------------------

        try {
            System.out.print("Ingrese el límite inferior: ");
            int limInf = scan.nextInt();

            System.out.print("Ingrese el límite superior: ");
            int limSup = scan.nextInt();

            if (limInf < limSup) {
                int numAleatorio = (int) (Math.random() * (limSup - limInf + 1) + limInf);
                System.out.println("El número aleatorio entre '" + limInf + "' y '" + limSup + "' es: " + numAleatorio);
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Debe ingresar dos números enteros, donde el límite inferior sea menor al límite superior.");
        }

        // EJERCICIO 2: Generación aleatoria y análisis de raíz cuadrada -------------------------------------------

        try {
            
            System.out.print("Ingrese un número entero positivo entre el 1 y 30: ");
            int numLimite = scan.nextInt();

            if (numLimite > 0 && numLimite <= 30) {
                int numAleatorio = (int) (Math.random() * numLimite + 1);
                System.out.println("El número aleatorio entre 1 y " + numLimite + " es: " + numAleatorio);
                System.out.println("La raíz cuadrada de '" + numAleatorio + "' es: " + Math.sqrt(numAleatorio));
            } else {
                throw new Exception();
            }

        } catch (Exception e) {

            System.out.println("Debe ingresar un número entero positivo entre el 1 y 30.");
            
        }

    }

}
