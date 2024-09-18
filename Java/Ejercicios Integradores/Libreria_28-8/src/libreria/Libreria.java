package libreria;

import java.util.ArrayList;

public class Libreria {
    //atributos: un array para guardar los libros ingresados en catalogo
    // y otro array para guardar las personas que solicitaran prestamos o devoluciones.
    private ArrayList<Libro> catalogo;
    private ArrayList<Persona> personas;

    //Constructor: inicializa los dos arrays vacíos.
    public Libreria() {
        this.catalogo = new ArrayList<>();
        this.personas = new ArrayList<>();
    }

    //Métodos para agregar libros y personas.
    public void agregarLibro(Libro libro) {
        catalogo.add(libro);
    }

    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    //Métodos para prestar y devolver libros.
    public boolean prestarLibro(Libro libro, Persona persona) {
        if (!libro.isPrestado()) {
            libro.prestar();
            persona.tomarPrestado(libro);
            return true;
        } else {
            System.out.println("El libro " + libro.getTitulo() + " ya está prestado.");
            return false;
        }
    }

    public boolean devolverLibro(Libro libro, Persona persona) {
        if (libro.isPrestado()) {
            libro.devolver();
            persona.devolverLibro(libro);
            return true;
        } else {
            System.out.println("El libro " + libro.getTitulo() + " no está prestado.");
            return false;
        }
    }
    //Metodo para mostrar iterando sobre catalogo
    public void mostrarCatalogo() {
        for (Libro libro : catalogo) {
            libro.imprimirDetalles();
        }
    }

    public ArrayList<Libro> getCatalogo() {
        return catalogo;
    }

    
    //metodo para buscar persona por nombre y apellido
    public Persona buscarPersona(String nombre, String apellido) {
        for (Persona persona : personas) {
            if (persona.getNombre().equalsIgnoreCase(nombre) && persona.getApellido().equalsIgnoreCase(apellido)) {
                return persona;
            }
        }
        return null;
    }
    //metodo para buscar libro por titulo
    public Libro buscarLibro(String titulo) {
        for (Libro libro : catalogo) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }
}
