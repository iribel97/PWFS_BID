package Servicios;

import java.util.Scanner;

import libreria.Libreria;
import libreria.Libro;
import libreria.Persona;

public class menu {
    public static void menuDeOpciones(){
        Libreria libreria = new Libreria();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        // Menu principal
        while (!salir) {
            System.out.println("Menú:");
            System.out.println("1. Agregar libro");
            System.out.println("2. Mostrar catálogo de libros");
            System.out.println("3. Prestar libro");
            System.out.println("4. Devolver libro");
            System.out.println("5. Mostrar los libros prestados por persona");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            // opciones del menu principal
            switch (opcion) {
                case 1:
                    Libro nuevoLibro = Libro.ingreso();
                    libreria.agregarLibro(nuevoLibro);
                    break;
                case 2:
                    libreria.mostrarCatalogo();
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del libro a prestar:");
                    String tituloPrestar = scanner.nextLine();
                    Libro libroPrestar = libreria.buscarLibro(tituloPrestar);
                    if (libroPrestar != null) {
                        System.out.println("Ingrese el nombre de la persona:");
                        String nombrePersona = scanner.nextLine();
                        System.out.println("Ingrese el apellido de la persona:");
                        String apellidoPersona = scanner.nextLine();

                        Persona persona = libreria.buscarPersona(nombrePersona, apellidoPersona);
                        if (persona == null) {
                            persona = new Persona(nombrePersona, apellidoPersona);
                            libreria.agregarPersona(persona);
                        }

                        libreria.prestarLibro(libroPrestar, persona);
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el nombre del libro a devolver:");
                    String tituloDevolver = scanner.nextLine();
                    Libro libroDevolver = libreria.buscarLibro(tituloDevolver);
                    if (libroDevolver != null) {
                        System.out.println("Ingrese el nombre de la persona que devuelve el libro:");
                        String nombrePersona = scanner.nextLine();
                        System.out.println("Ingrese el apellido de la persona que devuelve el libro:");
                        String apellidoPersona = scanner.nextLine();

                        Persona persona = libreria.buscarPersona(nombrePersona, apellidoPersona);
                        if (persona != null) {
                            libreria.devolverLibro(libroDevolver, persona);
                        } else {
                            System.out.println("Persona no encontrada. No se puede devolver el libro.");
                        }
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                    break;
                case 5:
                    System.out.println("Ingrese el nombre de la persona:");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el apellido de la persona:");
                    String apellido = scanner.nextLine();

                    Persona persona = libreria.buscarPersona(nombre, apellido);
                    if (persona != null) {
                        persona.mostrarLibrosPrestados();
                    } else {
                        System.out.println("Persona no encontrada.");
                    }
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                }
            }
        }


    
        
}

//No cerramos el scanner xq luego nos finalizaria el programa.


