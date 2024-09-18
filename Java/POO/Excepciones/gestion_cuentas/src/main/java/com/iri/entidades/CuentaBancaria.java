package com.iri.entidades;

import com.iri.exceptions.SaldoInsuficienteException;

public class CuentaBancaria {

    private double saldoInicial;

    // Constructor
    public CuentaBancaria(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    // getter y setter
    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    // Método para retirar dinero
    public void retirar(double cantidad) throws SaldoInsuficienteException {
        if (cantidad > saldoInicial) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        } else {
            saldoInicial -= cantidad;
        }
    }

}
