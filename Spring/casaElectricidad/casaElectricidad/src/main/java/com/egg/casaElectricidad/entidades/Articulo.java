package com.egg.casaElectricidad.entidades;

import java.util.UUID;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Articulo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idArticulo;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Integer nroArticulo;

    @Column(nullable = false)
    @JoinColumn(name = "idFabrica", nullable = false)
    private String nombreArticulo;
    private String descripcionArticulo;
    
    @ManyToOne
    private Fabrica fabrica;

    @Override
    public String toString() {
        return "Articulo [idArticulo=" + idArticulo + ", nombreArticulo=" + nombreArticulo + ", nroArticulo=" + nroArticulo + ", descripcionArticulo=" + descripcionArticulo
                + ", Fabrica=" + fabrica + "]";
    }
}

