package com.egg.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "oficina")
public class Oficina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_oficina")
    private int idOficina;

    @Column(name = "codigo_oficina", length = 10)
    private String codigodOficina;

    @Column(name = "ciudad", length = 30)
    private String ciudad;

    @Column(name = "pais", length = 50)
    private String pais;

    @Column(name = "region", length = 50)
    private String region;

    @Column(name = "telefono", length = 20)
    private String telefono;

    @Column(name = "codigo_postal", length = 10)
    private String codigoPostal;

    public Oficina() {
    }

       public int getIdOficina() {
        return idOficina;
    }

    public void setIdOficina(int idOficina) {
        this.idOficina = idOficina;
    }

    public String getCodigodOficina() {
        return codigodOficina;
    }

    public void setCodigodOficina(String codigodOficina) {
        this.codigodOficina = codigodOficina;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

}
