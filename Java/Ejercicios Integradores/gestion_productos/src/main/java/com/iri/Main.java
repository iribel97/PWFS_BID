package com.iri;

import com.iri.servicio.ServGestionProdu;

public class Main {
    public static void main(String[] args) {
        ServGestionProdu serv = new ServGestionProdu();

        serv.gestionProductos();
    }
}