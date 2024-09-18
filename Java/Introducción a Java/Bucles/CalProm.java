package Bucles;

public class CalProm {
    
    public static void main(String[] args) {
        
        //Variable
        double promedio, suma = 0;

        //Array de 20 elementos
        double[] numeros = { 10, 5.3, 7.1, 3.4, 8, 2, 9.4, 1, 4, 6, 2.7, 5, 10, 10, 8, 7, 9, 6.23, 4.5, 6.8 };

        //Sumar todos los elementos del array
        for (double i : numeros) {
            suma += i;
        }

        //Calcular el promedio
        promedio = suma / numeros.length;

        //Imprimir el promedio con dos decimales
        System.out.printf("El promedio de los elementos del array es: %.2f\n", promedio);


    }

}
