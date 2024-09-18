package Bucles;

public class ConcatElem {
    
    public static void main(String[] args) {

        //Variable
        String cadenaConcat = "";

        //Declarar un array
        String[] palabras = { "Hola", "mundo", "desde", "Java" };

        //Concatenar los elementos del array
        for (String i : palabras) {
            cadenaConcat += i + " ";
        }

        //Imprimir la cadena concatenada
        System.out.println(cadenaConcat);

    }

}
