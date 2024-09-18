package com.iri.enums;

public enum Color {

    Rojo("#FF0000"),
    Amarillo("#FFFF00"),
    Azul("#0000FF");

    //Atributos
    private String codigo;

    //constructor
    Color(String codigo) {
        this.codigo = codigo;
    }

    //get
    public String getCodigo() {
        return codigo;
    }

}
