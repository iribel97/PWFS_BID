import java.util.Arrays;
import java.util.Scanner;

public class AdivinaPalabra {

    public static void main(String[] args) {
        String[] listaPalabras = {"casa", "perro", "gato", "computadora", "java", "programacion", "teclado"};
        String palabraSecreta = seleccionarPalabraAleatoria(listaPalabras);
        String pista = obtenerPista(palabraSecreta);
        int intentosMaximos = 10, intentosRealizados = 0;
        boolean adivinado = false;
        char[] progreso = new char[palabraSecreta.length()];
        Arrays.fill(progreso, '_');

        Scanner scan = new Scanner(System.in);

        System.out.println("Bienvenido al juego de adivinar la palabra!");
        System.out.println("Tienes " + intentosMaximos + " intentos para adivinar la palabra.");
        System.out.println("Pista: " + pista);

        while (intentosRealizados < intentosMaximos && !adivinado) {
            System.out.print("Ingresa una letra: ");
            char letra = scan.next().charAt(0);

            if (comprobarLetra(palabraSecreta, progreso, letra, 0)) {
                System.out.println("¡Correcto! La letra " + letra + " está en la palabra.");
            } else {
                System.out.println("La letra " + letra + " no está en la palabra o la está volviendo a repetir.");
            }

            intentosRealizados++;
            System.out.println("Progreso: " + new String(progreso));

            if (new String(progreso).equals(palabraSecreta)) {
                adivinado = true;
            }
        }

        if (adivinado) {
            System.out.println("¡Felicidades! Has adivinado la palabra: " + palabraSecreta);
        } else {
            System.out.println("Lo siento, no has adivinado la palabra. La palabra era: " + palabraSecreta);
        }

        scan.close();
    }

    // Método para seleccionar una palabra aleatoria del array
    public static String seleccionarPalabraAleatoria(String[] listaPalabras) {
        int indice = (int) (Math.random() * listaPalabras.length);
        return listaPalabras[indice];
    }

    // Método para obtener una pista de la palabra seleccionada
    public static String obtenerPista(String palabraSecreta) {
        char[] pista = new char[palabraSecreta.length()];
        Arrays.fill(pista, '_');
        return new String(pista);
    }

    // Método recursivo para comprobar si una letra está en la palabra y actualizar el progreso
    public static boolean comprobarLetra(String palabraSecreta, char[] progreso, char letra, int indice) {
        
        if (indice >= palabraSecreta.length()) {
            return false;
        }   

        for (int i = 0; i < palabraSecreta.length(); i++) {
            //Caso de que el usuario ingrese de nuevo la misma letra
            if (progreso[i] == letra) {
                return false;
            }
            if (palabraSecreta.charAt(i) == letra) {
                progreso[i] = letra;
            }
        }

        return comprobarLetra(palabraSecreta, progreso, letra, indice + 1);
    }

}
