import java.util.Scanner;

public class ClasifDeNota {
    
    public static void main(String[] args){

        //Instanciar la clase Scanner
        Scanner scanner = new Scanner(System.in);

        //Variables
        double nota;

        //Solicitar al usuario una nota
        System.out.print("Ingrese una nota (0 - 100): ");
        nota = scanner.nextDouble();

        //Si la puntuación está entre 90 y 100, se mostrará "A".
        if (nota >= 90 && nota <= 100) {
            System.out.println("A");

            //Si la puntuación está entre 80 y 89, se mostrará "B".
        } else if(nota >= 80 && nota <=89){
            System.out.println("B");

            //Si la puntuación está entre 70 y 79, se mostrará "C".
        } else if(nota >= 70 && nota <=79){
            System.out.println("C");

            //Si la puntuación está entre 60 y 69, se mostrará "D".
        } else if(nota >= 60 && nota <=69){
            System.out.println("D");

            //Si la puntuación está entre 0 y 59, se mostrará "F".
        } else if(nota >= 0 && nota <=59){
            System.out.println("F");

            //Si la puntuación no está en el rango de 0 a 100, se mostrará "Nota inválida".
        } else {
            System.out.println("Nota inválida");
        }

        //Cerrar el scanner
        scanner.close();
    }
}
