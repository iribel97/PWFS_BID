package com.iri;

import com.iri.servicios.ServDiaSemana;

public class Main {
    public static void main(String[] args) {
        ServDiaSemana service = new ServDiaSemana();

        service.generarDias();
    }
}