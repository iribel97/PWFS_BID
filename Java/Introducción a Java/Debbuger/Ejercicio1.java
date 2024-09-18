package Debbuger;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        //Array de numeros
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Mostrar por consola
        System.out.println("La suma de los numeros del array es: " + sumarNumeros(numeros));
    }

    //Metodo para sumar los numeros del array
    public static int sumarNumeros(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma;
    }

}
