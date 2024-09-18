package com.iri.servicios;

import java.util.Scanner;

import com.iri.enums.Mes;

public class ServMenu {

    private Scanner scan = new Scanner(System.in);


    public void mostrarMenu() {
        System.out.println(" Menú de opciones");
        System.out.println(" 1. Obtener estación del año");
        System.out.println(" 2. Imprimir estaciones y meses");
        System.out.println(" 3. Salir");
        System.out.println("|---------------------------------|");
        System.out.print(" Seleccione una opción: ");
    }

    public void gestionEstaciones(){
        int opc;

        do {

            mostrarMenu();
            opc = scan.nextInt();
            scan.nextLine();

            switch (opc) {
                case 1:
                    System.out.print("Ingrese el número de mes: ");
                    int numMes = scan.nextInt();
                    if (numMes < 1 || numMes > 12) {
                        System.out.println("Número de mes no válido");                        
                    }else{
                        System.out.println("The season of the month " + Mes.values()[numMes-1] + " is: " + ServEstacionDelAnio.obtenerEstacion(Mes.values()[numMes-1]));
                    }
                    break;
                case 2:
                    ServEstacionDelAnio.imprimirEstaciones();
                    break;
                case 3:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            
        } while (opc != 3);
    }
}
