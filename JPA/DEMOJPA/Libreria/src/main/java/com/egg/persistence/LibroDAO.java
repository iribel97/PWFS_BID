package com.egg.persistence;

import java.util.List;
import com.egg.entidades.Autor;
import com.egg.entidades.Editorial;
import com.egg.entidades.Libro;

public class LibroDAO extends DAO<Libro> {

    @Override    
    public void guardar(Libro libro) throws Exception {
        super.guardar(libro);
    }

    public void eliminar(Long isbn) throws Exception {
        Libro libro = buscarLibrosPorISBN(isbn);
        super.eliminar(libro);
    }

    @Override
    public void modificar(Libro libro) throws Exception {
        super.modificar(libro);
    }

    public Libro buscarLibroPorId(Integer id) throws Exception {
        try {
            conectar();
            return em.find(Libro.class, id);
        } catch (Exception e) {
            System.out.println("Error al buscar libro por ID: " + e.getMessage());
            return null;
        } finally {
            desconectar();
        }
    }

    public List<Libro> listarLibros() {
        try {
            conectar();
            return em.createQuery("SELECT a FROM Libro a", Libro.class).getResultList();
        } catch (Exception e) {
            System.out.println("Error al listar libros: " + e.getMessage());
            return null;
        } finally {
            desconectar();
        }
    }

    public Libro buscarLibrosPorISBN(Long isbn) throws Exception {
        try {
            conectar();
            return em.find(Libro.class, isbn);
        } catch (Exception e) {
            return null;
        } finally {
            desconectar();
        }
    }
    

    public List<Libro> buscarLibrosPorTitulo(String titulo) throws Exception {
        try {
            conectar();
            return em.createQuery("SELECT a FROM Libro a WHERE a.titulo LIKE :titulo", Libro.class)
                    .setParameter("titulo", "%" + titulo + "%")
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Error al buscar libros por título: " + e.getMessage());
            return null;
        } finally {
            desconectar();
        }
    }

    public List<Libro> buscarLibrosPorAutor(Autor autor) throws Exception {
        try {
            conectar();
            return em.createQuery("SELECT a FROM Libro a WHERE a.autor = :autor", Libro.class)
                    .setParameter("autor", autor)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Error al buscar libros por autor: " + e.getMessage());
            return null;
        } finally {
            desconectar();
        }
    }

    public List<Libro> buscarLibrosPorEditorial(Editorial editorial) throws Exception {
        try {
            conectar();
            return em.createQuery("SELECT a FROM Libro a WHERE a.editorial = :editorial", Libro.class)
                    .setParameter("editorial", editorial)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Error al buscar libros por editorial: " + e.getMessage());
            return null;
        } finally {
            desconectar();
        }
    }
}
