package com.egg.casaElectricidad.servicios;

import com.egg.casaElectricidad.entidades.Fabrica;
import com.egg.casaElectricidad.excepciones.MiException;
import com.egg.casaElectricidad.repositorios.FabricaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class FabricaServicio {

    @Autowired
    private FabricaRepositorio fabricaRepositorio;

    @Transactional
    public Fabrica crear(String nombreFabrica) throws MiException {
        validar(nombreFabrica);

        Fabrica fabrica = new Fabrica();
        fabrica.setNombreFabrica(nombreFabrica);

        return fabricaRepositorio.save(fabrica);
    }

    @Transactional
    public Fabrica actualizar(UUID id, String nombreFabrica) throws MiException {
        validar(nombreFabrica);

        Optional<Fabrica> respuesta = fabricaRepositorio.findById(id);

        if(respuesta.isPresent()) {
            Fabrica fabrica = respuesta.get();
            fabrica.setNombreFabrica(nombreFabrica);

            return fabricaRepositorio.save(fabrica);
        } else {
            throw new MiException("No se encontró la fábrica con ID: " + id);
        }
    }

    @Transactional(readOnly = true)
    public Fabrica getOne(UUID id) throws MiException {
        return fabricaRepositorio.findById(id)
                .orElseThrow(() -> new MiException("No se encontró la fábrica con ID: " + id));
    }

    @Transactional(readOnly = true)
    public List<Fabrica> listarFabricas() {
        return fabricaRepositorio.findAll();
    }

    @Transactional
    public void eliminar(UUID id) throws MiException {
        Fabrica fabrica = getOne(id);
        fabricaRepositorio.delete(fabrica);
    }

    private void validar(String nombreFabrica) throws MiException {
        if (nombreFabrica == null || nombreFabrica.isEmpty()) {
            throw new MiException("El nombre de la fábrica no puede ser nulo o estar vacío");
        }
    }
}
