package com.iri.entidad;

public class Division {

    private int dividendo;
    private int divisor;

    //Constructores
    public Division() {
        this.dividendo = 10;
        this.divisor = 1;
    }

    public Division(int dividendo, int divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    //Getters y Setters
    public int getDividendo() {
        return dividendo;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

}
