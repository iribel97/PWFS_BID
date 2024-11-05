package com.egg.biblioteca.servicios;

import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.entidades.Editorial;
import com.egg.biblioteca.entidades.Libro;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.repositorios.AutorRepositorio;
import com.egg.biblioteca.repositorios.EditorialRepositorio;
import com.egg.biblioteca.repositorios.LibroRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class LibroServicio {

    private final LibroRepositorio libroRepositorio;
    private final AutorRepositorio autorRepositorio;
    private final EditorialRepositorio editorialRepositorio;

    @Autowired
    public LibroServicio(LibroRepositorio libroRepositorio, AutorRepositorio autorRepositorio, EditorialRepositorio editorialRepositorio) {
        this.libroRepositorio = libroRepositorio;
        this.autorRepositorio = autorRepositorio;
        this.editorialRepositorio = editorialRepositorio;
    }

    @Transactional
    public void crearLibro(Long isbn, String titulo, Integer ejemplares, UUID idAutor, UUID idEditorial) throws MiException {

        validar(isbn, titulo, ejemplares, idAutor, idEditorial);

        Optional<Autor> respuestaAutor = autorRepositorio.findById(idAutor);
        Optional<Editorial> respuestaEditorial = editorialRepositorio.findById(idEditorial);

        if (respuestaAutor.isEmpty()) {
            throw new MiException("El autor especificado no existe.");
        }

        if (respuestaEditorial.isEmpty()) {
            throw new MiException("La editorial especificada no existe.");
        }

        Libro libro = new Libro();
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setEjemplares(ejemplares);
        libro.setAlta(new Date());
        libro.setAutor(respuestaAutor.get());
        libro.setEditorial(respuestaEditorial.get());

        libroRepositorio.save(libro);
    }

    @Transactional(readOnly = true)
    public List<Libro> listarLibros() {
        return libroRepositorio.findAll();
    }

    @Transactional
    public void modificarLibro(Long isbn, String titulo, Integer ejemplares, UUID idAutor, UUID idEditorial) throws MiException {

        validar(isbn, titulo, ejemplares, idAutor, idEditorial);

        Optional<Libro> respuesta = libroRepositorio.findById(isbn);
        Optional<Autor> respuestaAutor = autorRepositorio.findById(idAutor);
        Optional<Editorial> respuestaEditorial = editorialRepositorio.findById(idEditorial);

        if (respuesta.isEmpty()) {
            throw new MiException("El libro especificado no existe.");
        }

        if (respuestaAutor.isEmpty()) {
            throw new MiException("El autor especificado no existe.");
        }

        if (respuestaEditorial.isEmpty()) {
            throw new MiException("La editorial especificada no existe.");
        }

        Libro libro = respuesta.get();
        libro.setTitulo(titulo);
        libro.setEjemplares(ejemplares);
        libro.setAutor(respuestaAutor.get());
        libro.setEditorial(respuestaEditorial.get());

        libroRepositorio.save(libro);
    }

    private void validar(Long isbn, String titulo, Integer ejemplares, UUID idAutor, UUID idEditorial) throws MiException {

        if (isbn == null) {
            throw new MiException("El ISBN no puede ser nulo.");
        }
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new MiException("El título no puede ser nulo o estar vacío.");
        }
        if (ejemplares == null) {
            throw new MiException("La cantidad de ejemplares no puede ser nula.");
        }
        if (idAutor == null) {
            throw new MiException("El ID del autor no puede ser nulo o estar vacío.");
        }
        if (idEditorial == null) {
            throw new MiException("El ID de la editorial no puede ser nulo o estar vacío.");
        }
    }

    @Transactional(readOnly = true)
    public Libro getOne(Long isbn) {
        return libroRepositorio.getReferenceById(isbn);
    }

}
