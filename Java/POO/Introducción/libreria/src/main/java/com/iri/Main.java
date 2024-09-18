package com.iri;

import com.iri.entidades.Libro;

public class Main {

    private static Libro[] libros = new Libro[4];

    public static void main(String[] args) {
        inicializarLibros();
        imprimirLibros();
        imprimirTitulos();
    }

    public static void inicializarLibros() {
        libros[0] = new Libro("El principito", "Antoine de Saint-Exupéry", 100);
        libros[1] = new Libro("El señor de los anillos", "J.R.R. Tolkien", 200);
        libros[2] = new Libro("Harry Potter", "J.K. Rowling", 300);
        libros[3] = new Libro("Cien años de soledad", "Gabriel García Márquez", 400);
    }

    public static void imprimirLibros() {
        for (Libro libro : libros) {
            libro.imprimirDetalles();
            System.out.println("---------------------------------------------------------");
        }
    }

    public static void imprimirTitulos() {
        int cont = 1;
        for (Libro libro : libros) {
            System.out.println("Libro " + cont + " ---------------------------------------------------------");
            libro.imprimirTitulo();
            cont++;
        }
    }

}