package com.egg.casaElectricidad.repositorios;

import java.util.UUID;

import com.egg.casaElectricidad.entidades.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticuloRepositorio extends JpaRepository<Articulo, UUID> {

}
