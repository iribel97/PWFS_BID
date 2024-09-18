package com.iri.entidades;

public class Jugador {

    //Atributos
    private String nombre;
    private Equipo equipo;

    //Constructores
    public Jugador() {
    }

    public Jugador(String nombre, Equipo equipo) {
        this.nombre = nombre;
        this.equipo = equipo;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    //Metodo para mostrar jugadores
    public static void mostrarJugadores(Jugador[] jugadores){
        System.out.println(  "|-----------------------------------------------------------|"
                         + "\n|------------------------ JUGADORES ------------------------|"
                         + "\n|-----------------------------------------------------------|"
                         + "\n|__No.__|__Nombre_del_jugador_____|__Equipo_________________|");
        int espacioNombre = "  Nombre del jugador     ".length();
        int espacioEquipo = "  Equipo                 ".length();
        for(int i = 0; i < jugadores.length; i++){
            if(jugadores[i] != null){
                if (i+1 < 10) {
                    System.out.print("|  0" + (i+1) + "   ");
                } else {
                    System.out.print("|  " + (i+1) + "   ");
                }
                System.out.print("|  " + jugadores[i].getNombre());
                
                for(int j = 0; j < espacioNombre - jugadores[i].getNombre().length()-2; j++){
                    System.out.print(" ");
                }
                System.out.print("|  " + (jugadores[i].getEquipo() != null ? jugadores[i].getEquipo().getNombre() : "Sin equipo"));
                for(int j = 0; j < espacioEquipo - (jugadores[i].getEquipo() != null ? jugadores[i].getEquipo().getNombre().length() : "Sin equipo".length())-2; j++){
                    System.out.print(" ");
                }
                System.out.println("|");

            }
        }
        System.out.println("|-----------------------------------------------------------|");
    }

    //Mostrar jugadores por equipo
    public static void mostrarJugadoresPorEquipo(Jugador[] jugadores, Equipo equipo){
        int cont = 0;
        for(int i = 0; i < jugadores.length; i++){
            if(jugadores[i] != null && jugadores[i].getEquipo() != null && jugadores[i].getEquipo().getNombre().equals(equipo.getNombre())){
                cont++;
                System.out.println( cont + ".- " + jugadores[i].getNombre());
            }
        }
    }

    //Eliminar jugador
    public static void eliminarJugador(Jugador[] jugadores, int posicion){
        for(int i = posicion; i < jugadores.length - 1; i++){
            jugadores[i] = jugadores[i + 1];
        }
    }
}
