package com.egg.casaElectricidad.entidades;

import jakarta.persistence.*;
import com.egg.casaElectricidad.enumeraciones.Rol;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotNull(message = "El nombre del usuario no puede estar vacio.")
    @Column(nullable = false, unique = true)
    private String nombre;

    @NotNull(message = "El email no puede estar vacio.")
    @Column(nullable = false)
    private String email;

    @NotNull(message = "La contraseña no puede estar vacia.")
    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Rol rol;

    @OneToOne
    private Imagen imagen;
    
}
