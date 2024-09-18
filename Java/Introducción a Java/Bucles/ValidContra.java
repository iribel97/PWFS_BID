package Bucles;

import java.util.Scanner;

public class ValidContra {
    
    public static void main(String[] args) {
        
        Scanner scaner = new Scanner(System.in);

        //Variables
        String contra = "secreto", contraUsu;

        do {
            
            //Pedir una contraseña al usuario
            System.out.print("Ingrese una contraseña: ");
            contraUsu = scaner.nextLine();

            //Comparar la contraseña del usuario con la contraseña secreta
            if (!contraUsu.equals(contra)) {
                System.out.println("Contraseña incorrecta.");
            }

        } while (!contraUsu.equals(contra));

        System.out.println("Contraseña correcta.");

        scaner.close();
    }

}
