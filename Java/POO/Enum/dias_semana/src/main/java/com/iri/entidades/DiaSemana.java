package com.iri.entidades;

import com.iri.enums.DiaSemanal;

public class DiaSemana {

    private DiaSemanal dia;

    //Constructores
    public DiaSemana() {
    }

    public DiaSemana(DiaSemanal dia) {
        this.dia = dia;
    }

    //Getters y Setters
    public DiaSemanal getDia() {
        return dia;
    }

    public void setDia(DiaSemanal dia) {
        this.dia = dia;
    }

    //Metodos
    //Comprobar que sea un dia laboral
    public boolean esDiaLaboral() {
        return dia != DiaSemanal.Sabado && dia != DiaSemanal.Domingo;
    }

}
