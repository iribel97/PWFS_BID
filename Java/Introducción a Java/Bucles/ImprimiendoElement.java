package Bucles;

public class ImprimiendoElement {
    
    public static void main (String[] args){

        //Array de enteros
        int[] numeros = {1, 2, 3, 4, 5};

        //Imprimir los elementos del array
        System.out.print("Imprimiendo elementos del array:  [");
        for (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + ( (i < numeros.length-1) ? " - " : ""));
        }
        System.out.println("]");

    }

}
