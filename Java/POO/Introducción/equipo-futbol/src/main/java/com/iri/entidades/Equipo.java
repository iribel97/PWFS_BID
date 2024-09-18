package com.iri.entidades;

public class Equipo {

    //Atributos
    private String nombre;

    //Constructores
    public Equipo() {
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodo para mostrar equipos
    public static void mostrarEquipo(Equipo[] equipos){
        System.out.println(  "|---------------------------------|"
                         + "\n|----------- EQUIPOS -------------|"
                         + "\n|---------------------------------|"
                         + "\n|__No.__|__Nombre_del_equipo______|");
        for(int i = 0; i < equipos.length; i++){
            if(equipos[i] != null){
                if (i < 10) {
                    System.out.print("|  0" + (i+1) + "   ");
                } else {
                    System.out.print("|  " + i + "   ");
                }
                System.out.print("|  " + equipos[i].getNombre());
                for(int j = 0; j < 23 - equipos[i].getNombre().length(); j++){
                    System.out.print(" ");
                }
                System.out.println("|");
            }
        }
        System.out.println("|---------------------------------|");
    }

    //Eliminar equipo
    public static void eliminarEquipo(Equipo[] equipos, int posicion){
        for(int i = posicion; i < equipos.length - 1; i++){
            equipos[i] = equipos[i + 1];
        }
    }
}
