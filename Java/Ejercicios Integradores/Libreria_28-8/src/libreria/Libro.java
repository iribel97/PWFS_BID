package libreria;

import java.util.Scanner;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;
    private boolean prestado;

    // Constructor con parámetros
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.prestado = false;
    }

    // Constructor vacío
    public Libro() {
    }

    // Setters y Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void prestar() {
        this.prestado = true;
    }

    public void devolver() {
        this.prestado = false;
    }

    // Método para imprimir los detalles del libro
    public void imprimirDetalles() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.paginas);
        System.out.println("Estado: " + (this.prestado ? "Prestado" : "Disponible"));
    }

    // Método para ingresar los detalles del libro desde el usuario y devolver el libro creado
    public static Libro ingreso() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor, ingrese el título del libro.");
        String titulo = leer.nextLine();
        System.out.println("Por favor, ingrese el número de páginas del libro.");
        int numeroIngresado = leer.nextInt();
        leer.nextLine();
        System.out.println("Por favor, ingrese el autor del libro.");
        String autor = leer.nextLine();

        // Crear y retornar la instancia de Libro
        Libro miLibro = new Libro(titulo, autor, numeroIngresado);
        return miLibro;
    }
    
}
