package com.iri.entidades;

import com.iri.enums.Color;

public class ConvertidorColor {

    private Color color;

    //Constructores
    public ConvertidorColor() {
    }

    public ConvertidorColor(Color color) {
        this.color = color;
    }

    //Getters y Setters
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //Metodos
    //Metodo para convertir un color hexadecimal a un color
    public Color convertirHexadecimal(String codigo) {
        for (Color c : Color.values()) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

}
