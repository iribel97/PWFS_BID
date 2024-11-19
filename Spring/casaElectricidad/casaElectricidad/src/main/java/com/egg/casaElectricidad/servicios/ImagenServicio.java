package com.egg.casaElectricidad.servicios;

import com.egg.casaElectricidad.entidades.Imagen;
import com.egg.casaElectricidad.excepciones.MiException;
import com.egg.casaElectricidad.repositorios.ImagenRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;
import java.util.UUID;

@Service
public class ImagenServicio {

    @Autowired
    private ImagenRepositorio imagenRepositorio;

    @Transactional
    public Imagen guardar(MultipartFile archivo) throws MiException {
        if (archivo != null && !archivo.isEmpty()) {
            try {
                Imagen imagen = new Imagen();
                imagen.setMime(archivo.getContentType());
                imagen.setNombreImagen(archivo.getOriginalFilename());
                imagen.setContenido(archivo.getBytes());

                return imagenRepositorio.save(imagen);
            } catch (IOException e) {
                throw new MiException("Error al procesar la imagen: " + e.getMessage());
            }
        }
        return null;
    }

    @Transactional
    public Imagen actualizar(UUID id, MultipartFile archivo) throws MiException {
        if (archivo != null) {
            try {
                Imagen imagen = new Imagen();

                if (id != null) {
                    Optional<Imagen> respuesta = imagenRepositorio.findById(id);
                    if (respuesta.isPresent()) {
                        imagen = respuesta.get();
                    }
                }

                imagen.setMime(archivo.getContentType());
                imagen.setNombreImagen(archivo.getOriginalFilename());
                imagen.setContenido(archivo.getBytes());

                return imagenRepositorio.save(imagen);
            } catch (IOException e) {
                throw new MiException("Error al procesar la imagen: " + e.getMessage());
            }
        }
        return null;
    }

    @Transactional(readOnly = true)
    public Imagen getOne(UUID id) throws MiException {
        return imagenRepositorio.findById(id)
                .orElseThrow(() -> new MiException("No se encontró la imagen con ID: " + id));
    }

    @Transactional
    public void eliminar(UUID id) throws MiException {
        Imagen imagen = getOne(id);
        imagenRepositorio.delete(imagen);
    }
}
