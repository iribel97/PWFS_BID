package com.egg.casaElectricidad.servicios;

import com.egg.casaElectricidad.entidades.Articulo;
import com.egg.casaElectricidad.repositorios.ArticuloRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ArticuloServicio {

    @Autowired
    private ArticuloRepositorio articuloRepositorio;

    // Obtener todos los artículos
    public List<Articulo> obtenerTodosLosArticulos() {
        return articuloRepositorio.findAll();
    }

    // Obtener un artículo por ID
    public Optional<Articulo> obtenerArticuloPorId(UUID id) {
        return articuloRepositorio.findById(id);
    }

    // Obtener un articulo por nombre
    public List<Articulo> obtenerPorNombre(String nombreArticulo){
        return articuloRepositorio.findByNombreArticulo(nombreArticulo);
    }

    // Guardar un nuevo artículo
    public Articulo guardarArticulo(Articulo articulo) {
        return articuloRepositorio.save(articulo);
    }

    // Actualizar un artículo existente
    public Articulo actualizarArticulo(Articulo articulo) {
        return articuloRepositorio.save(articulo);
    }

    // Eliminar un artículo por ID
    public void eliminarArticulo(UUID id) {
        articuloRepositorio.deleteById(id);
    }
}
