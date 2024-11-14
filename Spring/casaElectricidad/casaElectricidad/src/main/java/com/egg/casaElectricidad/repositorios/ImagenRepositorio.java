package com.egg.casaElectricidad.repositorios;


import java.util.UUID;

import com.egg.casaElectricidad.entidades.Imagen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagenRepositorio extends JpaRepository<Imagen, UUID> {
    
}
