package libreria;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellido;
    private ArrayList<Libro> librosPrestados;

    // Constructor
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.librosPrestados = new ArrayList<>();
    }

    // Métodos para prestar y devolver libros
    public void tomarPrestado(Libro libro) {
        
        librosPrestados.add(libro);
        System.out.println(nombre + " ha tomado prestado el libro: " + libro.getTitulo());
    
    }

    public void devolverLibro(Libro libro) {
        if (librosPrestados.contains(libro)) {
            librosPrestados.remove(libro);
            System.out.println(nombre + " ha devuelto el libro: " + libro.getTitulo());
        } else {
            System.out.println("Este libro no fue tomado prestado por " + nombre + ".");
        }
    }

    // Método para mostrar los libros prestados
    public void mostrarLibrosPrestados() {
        System.out.println("Libros prestados a " + nombre + " " + apellido + ":");
        if (librosPrestados.isEmpty()) {
            System.out.println("No hay libros prestados.");
        } else {
            for (Libro libro : librosPrestados) {
                libro.imprimirDetalles();
            }
        }
    }

    // Getters para nombre y apellido si es necesario
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}
