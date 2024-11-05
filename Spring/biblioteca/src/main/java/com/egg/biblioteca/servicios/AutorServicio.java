package com.egg.biblioteca.servicios;

import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.repositorios.AutorRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AutorServicio {

    private final AutorRepositorio autorRepositorio;

    @Autowired
    public AutorServicio(AutorRepositorio autorRepositorio) {
        this.autorRepositorio = autorRepositorio;
    }

    @Transactional
    public void crearAutor(String nombre) throws MiException{
        
        validar(nombre);
        
        Autor autor = new Autor();
        autor.setNombre(nombre);
        autorRepositorio.save(autor);

    }
    
    @Transactional(readOnly = true)
    public List<Autor> listarAutores() {

        return autorRepositorio.findAll();
    }
    
    @Transactional
    public void modificarAutor(String nombre, UUID id) throws MiException{
        
        validar(nombre);
        Optional<Autor> respuesta = autorRepositorio.findById(id);

        if (respuesta.isPresent()) {
            Autor autor = respuesta.get();
            autor.setNombre(nombre);
            autorRepositorio.save(autor);

        } else {
            throw new MiException("No se encontró un autor con el ID especificado");
        }
    }
    
    @Transactional
    public void eliminar(UUID id) throws MiException{
        Optional<Autor> autorOpt = autorRepositorio.findById(id);
        if (autorOpt.isPresent()) {
            autorRepositorio.delete(autorOpt.get());
        } else {
            throw new MiException("El autor con el ID especificado no existe");
        }

    }
    
    private void validar(String nombre) throws MiException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new MiException("El nombre no puede ser nulo o estar vacío");
        }
    }

    @Transactional(readOnly = true)
    public Autor getOne(UUID id) {
        return autorRepositorio.getReferenceById(id);
    }
    
}
