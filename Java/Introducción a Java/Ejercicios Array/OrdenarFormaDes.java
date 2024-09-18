import java.util.Arrays;

public class OrdenarFormaDes {
    
    public static void main(String[] args) {
        //Instanciar el array
        int[] numeros = new int[10];
        
        //Llenar el array con num random
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100 + 1);
        }
        //Imprimir arreglo inicial
        System.out.println("Arreglo original: " + Arrays.toString(numeros));
        
        //Ordenar el arreglo de forma ascendente
        Arrays.sort(numeros);
        
        //Invertir el arreglo para que sea de forma descendente
        for (int i = 0; i < numeros.length / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temp;
        }

        System.out.println("Arreglo ordenado de forma descendente: " + Arrays.toString(numeros));
    }
}
