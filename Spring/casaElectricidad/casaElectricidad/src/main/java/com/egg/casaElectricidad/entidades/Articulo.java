package com.egg.casaElectricidad.entidades;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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

    private static final AtomicInteger atomicInteger = new AtomicInteger(0);
    private Integer nroArticulo;

    @NotNull(message = "El nombre del artículo no puede ser nulo.")
    @Column(nullable = false)
    private String nombreArticulo;

    private String descripcionArticulo;

    @ManyToOne
    @JoinColumn(name = "idFabrica", nullable = false)
    private Fabrica fabrica;

    @PrePersist
    protected void onPrePersist() {
        this.nroArticulo = atomicInteger.getAndIncrement();
    }

    @Override
    public String toString() {
        return "Articulo [idArticulo=" + idArticulo + ", nombreArticulo=" + nombreArticulo + ", nroArticulo=" + nroArticulo + ", descripcionArticulo=" + descripcionArticulo
                + ", Fabrica=" + fabrica + "]";
    }
}
