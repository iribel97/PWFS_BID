package com.iri.servicios;

import com.iri.entidades.CuentaBancaria;

public class ServiceP {

    private CuentaBancaria cuentaBancaria;

    public void principal() {
        cuentaBancaria = new CuentaBancaria(1000);
        try {
            cuentaBancaria.retirar(500);
            System.out.println("Retiro exitoso");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
