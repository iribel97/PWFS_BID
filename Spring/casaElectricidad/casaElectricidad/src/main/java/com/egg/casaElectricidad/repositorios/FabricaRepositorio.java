package com.egg.casaElectricidad.repositorios;
import java.util.UUID;

import com.egg.casaElectricidad.entidades.Fabrica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FabricaRepositorio extends JpaRepository<Fabrica, UUID> {
    
}
