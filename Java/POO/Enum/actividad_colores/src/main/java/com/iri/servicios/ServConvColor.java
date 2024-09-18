package com.iri.servicios;

import java.util.ArrayList;
import java.util.Scanner;

import com.iri.entidades.ConvertidorColor;

public class ServConvColor {

    private ArrayList<ConvertidorColor> listaColores;

    // Constructores
    public ServConvColor() {
        listaColores = new ArrayList<>();
    }

    // Getters y Setters
    public ArrayList<ConvertidorColor> getListaColores() {
        return listaColores;
    }

    public void setListaColores(ArrayList<ConvertidorColor> listaColores) {
        this.listaColores = listaColores;
    }

    // Metodos
    // Metodo para agregar un color a la lista
    public void agregarColor() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Cuantos codigos de colores desea agregar?");
        int cantidad = scan.nextInt();

        // Limpiar el buffer
        scan.nextLine();

        // Bucle para agregar los colores
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el codigo del color: ");
            String codigo = scan.nextLine();

            ConvertidorColor c = new ConvertidorColor();
            c.setColor(c.convertirHexadecimal(codigo));
            listaColores.add(c);

            probarColores(c);
        }

        scan.close();
    }

    public void probarColores(ConvertidorColor c) {

        if (c.getColor() != null) {
            System.out.println(c.getColor().name());
        } else {
            System.out.println("No es un color primario");
        }

    }

}
