package com.iri.servicios;

import java.util.Scanner;

import com.iri.entidades.Contacto;

public class ServicioP {

    private Scanner scan = new Scanner(System.in);
    private GestorDeContactos gestor = new GestorDeContactos();

    public void principal(){

        //Variables
        int opcion = 0;
        String nombre, telefono, correo;

        do {
            System.out.print( "|--------------------------------------|\n" +
                            "|                 Menu                 |\n" +
                            "|--------------------------------------|\n" + 
                            "| 1. Agregar contacto al ArrayList     |\n" +
                            "| 2. Eliminar contacto del ArrayList   |\n" +
                            "| 3. Agregar contacto al HashSet       |\n" +
                            "| 4. Eliminar contacto del HashSet     |\n" +
                            "| 5. Mostrar contactos del ArrayList   |\n" +
                            "| 6. Mostrar contactos del HashSet     |\n" +
                            "| 7. Salir                             |\n" +
                            "|--------------------------------------|\n" +
                            "  Ingrese una opción: ");
            opcion = scan.nextInt();
            scan.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del contacto: ");
                    nombre = scan.nextLine();
                    System.out.print("Ingrese el teléfono del contacto: ");
                    telefono = scan.nextLine();
                    System.out.print("Ingrese el correo del contacto: ");
                    correo = scan.nextLine();
                    gestor.agregarContactoArrayList(new Contacto(nombre, telefono, correo));
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del contacto: ");
                    nombre = scan.nextLine();
                    gestor.eliminarContactoArrayList(new Contacto(nombre, "", ""));
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del contacto: ");
                    nombre = scan.nextLine();
                    System.out.print("Ingrese el teléfono del contacto: ");
                    telefono = scan.nextLine();
                    System.out.print("Ingrese el correo del contacto: ");
                    correo = scan.nextLine();
                    gestor.agregarContactoHashSet(new Contacto(nombre, telefono, correo));
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del contacto: ");
                    nombre = scan.nextLine();
                    gestor.eliminarContactoHashSet(new Contacto(nombre, "", ""));
                    break;
                case 5:
                    gestor.mostrarContactosArrayList();
                    break;
                case 6:
                    gestor.mostrarContactosHashSet();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 7);

    }

}
