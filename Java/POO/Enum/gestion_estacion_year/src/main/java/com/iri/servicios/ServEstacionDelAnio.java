package com.iri.servicios;

import com.iri.enums.Estacion;
import com.iri.enums.Mes;

public class ServEstacionDelAnio {

    //Metodo para obtener la estacion del año a partir de un mes
     public static Estacion obtenerEstacion(Mes mes) {
        switch (mes) {
            case December, January, February -> {
                return Estacion.Winter;
            }
            case March, April, May -> {
                return Estacion.Spring;
            }
            case June, July, August -> {
                return Estacion.Summer;
            }
            case September, October, November -> {
                return Estacion.Autumn;
            }
            default -> {
                return null; // Nunca debería llegar aquí
            }
        }
    }

    //Metodo para imprimir las estaciones y los meses que pertenecen a cada una
    public static void imprimirEstaciones() {
        for (Estacion estacion : Estacion.values()) {
            System.out.println("Season: " + estacion);
            System.out.println("Months: ");
            for (Mes mes : Mes.values()) {
                if (obtenerEstacion(mes) == estacion) {
                    System.out.println(mes);
                }
            }
            System.out.println("");
        }
    }

}
