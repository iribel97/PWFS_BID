import java.util.Arrays;
import java.util.Scanner;

public class CopiandoArrays {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        //Variables
        int[] arrayNum = new int[5];

        //Asignar valores
        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = (int) (Math.random() * 10);
        }

        //Mostrar Array
        System.out.println("Array:   " + Arrays.toString(arrayNum));
        System.out.println("Indices: [0, 1, 2, 3, 4]");
        
        //Solicitar índices
        System.out.print("Introduce el índice inicial: ");
        int indiceIni = scanner.nextInt();
        System.out.print("Introduce el índice final: ");
        int indiceFin = scanner.nextInt();
        scanner.close();

        //Validar índices
        if (indiceIni < indiceFin && indiceIni >= 0 && indiceFin < arrayNum.length) {
            //Copiar
            int[] arrayCopia = Arrays.copyOfRange(arrayNum, indiceIni, indiceFin + 1);
            System.out.println("Array copiado: " + Arrays.toString(arrayCopia));
        } else {
            System.out.println("Los índices no son válidos");
        }
    }

}
