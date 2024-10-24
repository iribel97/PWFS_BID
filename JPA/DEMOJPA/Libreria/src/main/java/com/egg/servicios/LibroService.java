package com.egg.servicios;

import java.util.List;
import java.util.Scanner;

import com.egg.entidades.Autor;
import com.egg.entidades.Editorial;
import com.egg.entidades.Libro;
import com.egg.persistence.LibroDAO;

public class LibroService {
    private final LibroDAO dao;
    AutorService as = new AutorService();
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public LibroService() {
        this.dao = new LibroDAO();
    }

    public void crearLibro(Long isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Boolean alta, Autor autor, Editorial editorial) {
        try {
            Libro libro = new Libro(isbn, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, alta, autor, editorial);
            libro.setAlta(Boolean.TRUE);
            dao.guardar(libro);
        } catch (Exception e) {
            System.out.println("Error al crear libro: " + e.getMessage());
        }
    }

    public boolean eliminarLibro(Long isbn) {
        try {
            dao.eliminar(isbn);
            return true;
        } catch (Exception e) {
            System.out.println("Error al eliminar libro: " + e.getMessage());
            return false;
        }
    }

    public void modificarLibro() {
        try {
            System.out.print("INGRESE ISBN DEL LIBRO: ");
            Long isbn = Long.parseLong(leer.nextLine());
            
    
            // Buscar el libro por ISBN
            Libro libro = buscarLibroPorISBN(isbn);
            
            if (libro != null) {
                System.out.println("INGRESE LOS NUEVOS DATOS");
                System.out.print("TITULO: ");
                libro.setTitulo(leer.nextLine());
                System.out.print("AÑO: ");
                libro.setAnio(Integer.parseInt(leer.nextLine()));
                System.out.print("EJEMPLARES: ");
                libro.setEjemplares(Integer.parseInt(leer.nextLine()));
                System.out.print("EJEMPLARES PRESTADOS: ");
                libro.setEjemplaresprestados(Integer.parseInt(leer.nextLine()));
                System.out.print("EJEMPLARES RESTANTES: ");
                libro.setEjemplaresrestantes(Integer.parseInt(leer.nextLine()));
                System.out.println("AUTOR: ");
                libro.setAutor(as.buscarPorNombre(leer.nextLine()));
    
                // Modificar el libro en la base de datos
                dao.modificar(libro);
                System.out.println("LIBRO EDITADO");
            } else {
                System.out.println("ISBN NO ENCONTRADO");
            }
        } catch (Exception e) {
            System.out.println("Error al modificar libro: " + e.getMessage());
        }
    }

    public Libro buscarLibroPorISBN(Long isbn) {
        try {
            return dao.buscarLibrosPorISBN(isbn);
        } catch (Exception e) {
            System.out.println("Error al buscar libro por ISBN: " + e.getMessage());
            return null;
        }
    }

    public List<Libro> buscarLibroPorTitulo(String titulo) {
        try {
            return dao.buscarLibrosPorTitulo(titulo);
        } catch (Exception e) {
            System.out.println("Error al buscar libro por título: " + e.getMessage());
            return null;
        }
    }

    public List<Libro> buscarLibroPorAutor(Autor autor) {
        try {
            return dao.buscarLibrosPorAutor(autor);
        } catch (Exception e) {
            System.out.println("Error al buscar libro por autor: " + e.getMessage());
            return null;
        }
    }

    public List<Libro> buscarPorEditorial(Editorial editorial) {
        try {
            return dao.buscarLibrosPorEditorial(editorial);
        } catch (Exception e) {
            System.out.println("Error al buscar libro por editorial: " + e.getMessage());
            return null;
        }
    }

    public List<Libro> listarTodos() {
        try {
            return dao.listarLibros();
        } catch (Exception e) {
            System.out.println("Error al listar libros: " + e.getMessage());
            return null;
        }
    }
}
