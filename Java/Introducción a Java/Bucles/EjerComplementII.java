package Bucles;

import java.util.Scanner;

public class EjerComplementII {
    
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        
        //Variables
        String frase = "Hola Estudiantes de EGG, me encanta que esten aca";
        char letraUsu;
        int cont = 0;

        //Guardar la frase en un array de caracteres
        char[] fraseArray = frase.toCharArray();

        //Pedir una letra al usuario
        System.out.print("Ingrese una letra: ");
        letraUsu = scaner.next().charAt(0);

        scaner.close();

        //Recorrer el array de la frase para buscar la letra y la cantidad de veces que se repita
        for (char i : fraseArray) {
            if (i == letraUsu) {
                cont++;
            }
        }

        //Mostrar la cantidad de veces que se repite la letra
        System.out.println("Frase: " + frase);
        System.out.println(cont == 0 ? "La letra '" + letraUsu + "' no se encuentra en la frase." : "La letra '" + letraUsu + "' se repite " + cont + " veces.");

    }

}
