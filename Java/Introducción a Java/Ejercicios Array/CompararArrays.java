import java.util.Arrays;

public class CompararArrays {
    
    public static void main(String[] args) {

        //Variables
        int[] arrayNum1 = new int[4];
        int[] arrayNum2 = new int[4];

        //Asignar valores
        for (int i = 0; i < arrayNum1.length; i++) {
            arrayNum1[i] = (int) (Math.random() * 10);
            arrayNum2[i] = (int) (Math.random() * 10);
        }

        //Comparar
        if (Arrays.equals(arrayNum1, arrayNum2)) {
            System.out.println("Los arreglos son iguales");
        } else {
            System.out.println("Los arreglos no son iguales");
        }

        //Mostrar Arrays
        System.out.println("Array 1: " + Arrays.toString(arrayNum1));
        System.out.println("Array 2: " + Arrays.toString(arrayNum2));

    }

}
