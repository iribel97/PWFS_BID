package com.egg.casaElectricidad.repositorios;
import java.util.UUID;
import java.util.List;

import com.egg.casaElectricidad.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, UUID> {

    List<Usuario> findByNombre(String name);

}
