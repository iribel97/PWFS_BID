package com.iri.servicios;

import java.util.ArrayList;
import java.util.HashSet;

import com.iri.entidades.Contacto;

public class GestorDeContactos {

    // Array de tipo Contacto
    private ArrayList<Contacto> contactos = new ArrayList<>();

    // HashSet de tipo Contacto
    private HashSet<Contacto> contactosSet = new HashSet<>();

    /** METODOS **/
    // Método para añadir un contacto al ArrayList
    public void agregarContactoArrayList(Contacto contacto) {
        // Si el arraylist no contiene el contacto, lo añade
        if (!contactos.contains(contacto)) {
            contactos.add(contacto);
            System.out.println("Contacto añadido a la lista");
        } else {
            System.out.println("El contacto ya existe en la lista");
        }
    }

    //Metodo para eliminar un contacto del ArrayList
    public void eliminarContactoArrayList(Contacto contacto) {
        // Si el contacto se elimina del arraylist, muestra un mensaje
        if (contactos.remove(contacto)) {
            System.out.println("Contacto eliminado de la lista");
        } else {
            System.out.println("El contacto no existe en la lista");
        }
    }

    // Método para añadir un contacto al HashSet
    public void agregarContactoHashSet(Contacto contacto) {
        // Si el contacto se añade al HashSet, muestra un mensaje
        if (contactosSet.add(contacto)) {
            System.out.println("Contacto añadido al HashSet");
        } else {
            System.out.println("El contacto ya existe en el HashSet");
            
        }
    }

    // Método para eliminar un contacto del HashSet
    public void eliminarContactoHashSet(Contacto contacto) {
        // Si el contacto se elimina del HashSet, muestra un mensaje
        if (contactosSet.remove(contacto)) {
            System.out.println("Contacto eliminado del HashSet");
        } else {
            System.out.println("El contacto no existe en el HashSet");
        }
    }

    // Método para mostrar los contactos del ArrayList
    public void mostrarContactosArrayList() {
        // Si el arraylist no está vacío, muestra los contactos
        if (!contactos.isEmpty()) {
            System.out.println("Contactos del ArrayList:");
            for (Contacto contacto : contactos) {
                System.out.println( " - " + contacto.getNombre());
            }
        } else {
            System.out.println("El ArrayList está vacío");
        }
    }

    // Método para mostrar los contactos del HashSet
    public void mostrarContactosHashSet() {
        // Si el HashSet no está vacío, muestra los contactos
        if (!contactosSet.isEmpty()) {
            System.out.println("Contactos del HashSet:");
            for (Contacto contacto : contactosSet) {
                System.out.println(" - " + contacto.getNombre());
            }
        } else {
            System.out.println("El HashSet está vacío");
        }
    }

}
