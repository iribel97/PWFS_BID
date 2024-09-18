package Bucles;

import java.util.Scanner;

public class MenuInteractivoW {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //Variables
        int opc;

        //Menu
        System.out.print("|-------------------------------------|\n" +
                         "|            MENU INTERACTIVO         |\n" +
                         "|-------------------------------------|\n" +
                         "| 1. Comprar Producto                 |\n" +
                         "| 2. Realizar Devolucion              |\n" +
                         "| 3. Ver Mis Pedidos                  |\n" +
                         "| 4. Preguntas Frecuentes             |\n" +
                         "| 5. Salir                            |\n" +
                         "|-------------------------------------|\n" +
                         "Ingrese una opcion: ");
        opc = scanner.nextInt();

        while (opc != 5) {

            System.out.print("|-------------------------------------|\n" +
                             "|            MENU INTERACTIVO         |\n" +
                             "|-------------------------------------|\n" +
                             "| 1. Comprar Producto                 |\n" +
                             "| 2. Realizar Devolucion              |\n" +
                             "| 3. Ver Mis Pedidos                  |\n" +
                             "| 4. Preguntas Frecuentes             |\n" +
                             "| 5. Salir                            |\n" +
                             "|-------------------------------------|\n" +
                             "Ingrese una opcion: ");
            opc = scanner.nextInt();
            
        }

        System.out.println("Saliendo del programa...");
        scanner.close();
    }

}
