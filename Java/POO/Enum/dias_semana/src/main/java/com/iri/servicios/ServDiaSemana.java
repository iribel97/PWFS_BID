package com.iri.servicios;

import com.iri.entidades.DiaSemana;
import com.iri.enums.DiaSemanal;

public class ServDiaSemana {

    private DiaSemana[] semana = new DiaSemana[10];

    //Constructores
    public ServDiaSemana() {
    }

    //Metodo para asignar un día de la semana a cada elemento del arreglo
    public void generarDias() {
        for (int i = 0; i < semana.length; i++) {
            //Genera un número aleatorio entre 0 y 6
            int dia = (int) (Math.random() * 7);
            //Asigna el día de la semana al arreglo
            semana[i] = new DiaSemana(DiaSemanal.values()[dia]);

            System.out.print((i+1) + ".-" + semana[i].getDia() + " - ");

            //Llamada al metodo para imprimir si el día es laboral o no
            imprimirDiaLaboral(semana[i]);
        }
    }

    //Metodo para imprimir si un día es laboral o no
    public void imprimirDiaLaboral(DiaSemana dia) {
        if (dia.esDiaLaboral()) {
            System.out.println("Día laboral");
        } else {
            System.out.println("No es día laboral");
        }
    }



}
