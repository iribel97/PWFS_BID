package com.iri;

import java.util.Scanner;

import com.iri.entidades.Equipo;
import com.iri.entidades.Jugador;

public class Main {

    private static Jugador[] jugadores = new Jugador[20];
    private static Equipo[] equipos = new Equipo[4];
    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        llenarArregloEquipo();
        llenarArregloJugador();
        actividad();
    }

    //Instanciar el arreglo de jugadores y equipos con datos
    public static void llenarArregloEquipo(){
        equipos[0] = new Equipo("Ecuador");
        equipos[1] = new Equipo("Colombia");
        equipos[2] = new Equipo("Peru");
        equipos[3] = new Equipo("Argentina");
    }

    public static void llenarArregloJugador(){
        jugadores[0] = new Jugador("Juan Echeverria", equipos[0]);
        jugadores[1] = new Jugador("Pedro Perez", equipos[1]);
        jugadores[2] = new Jugador("Carlos Sanchez", equipos[2]);
        jugadores[3] = new Jugador("Luis Suarez", equipos[3]);
        jugadores[4] = new Jugador("Jorge Rodriguez", equipos[0]);
        jugadores[5] = new Jugador("Andres Perez", equipos[1]);
        jugadores[6] = new Jugador("Carlos Rodriguez", equipos[2]);
        jugadores[7] = new Jugador("Luis Suarez", equipos[3]);
        jugadores[8] = new Jugador("Jorge Rodriguez", equipos[0]);
        jugadores[9] = new Jugador("Andres Perez", equipos[1]);
        jugadores[10] = new Jugador("Carlos Rodriguez", equipos[2]);
    }

    //Metodo general
    public static void actividad(){

        //Variables
        int opcion = 0;

        //Ciclo para mostrar el menu de opciones
        do{
            menuPrincipal();
            opcion = leer.nextInt();
            leer.nextLine();
            
            switch(opcion){
                case 1:
                    crearJugador();
                    break;
                case 2:
                    crearEquipo();
                    break;
                case 3:
                    asignarJugadorAEquipo();
                    break;
                case 4:
                    Jugador.mostrarJugadores(jugadores);
                    break;
                case 5:
                    Equipo.mostrarEquipo(equipos);
                    break;
                case 6:
                    eliminarJugador();
                    break;
                case 7:
                    eliminarEquipo();
                    break;
                case 8:
                    seleccionarJugador();
                    break;
                case 9:
                    seleccionarEquipo();
                    break;
                case 10:
                    System.out.println("Saliendo del programa ...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(opcion != 10);

    }

    //Metodo para crear un jugador
    public static void crearJugador(){

        //Variables
        String nombre = "";
        int posicion = 0;
        
        //Validar si hay equipos disponibles
        if(equipos[0] != null){

            //Ciclo para buscar un espacio en el arreglo de jugadores
            for(int i = 0; i < jugadores.length; i++){
                //Si encuentra un espacio vacio, pide los datos del jugador
                if(jugadores[i] == null){
    
                    System.out.print("Ingrese el nombre del jugador: ");
                    nombre = leer.nextLine();
                    System.out.println("Equipos disponibles:");
    
                    //Si hay equipos disponibles, muestra los equipos
                    if(equipos[0] != null){
    
                        Equipo.mostrarEquipo(equipos);
                        System.out.print("Seleccione el equipo al que pertenece el jugador: ");
                        posicion = leer.nextInt();
                        jugadores[i] = new Jugador(nombre, posicion != 0 ? equipos[posicion - 1] : null);
    
                    }else{
    
                        System.out.println("No hay equipos disponibles");
                        //Como no hay equipos disponibles, crea el jugador sin equipo
                        jugadores[i] = new Jugador(nombre, null);
                    }
    
                    break;
                }
            }
        } else {
            System.out.println("No puede crear un jugador si no hay equipos disponibles");
            return;
        }

    }

    //Metodo para crear un equipo
    public static void crearEquipo(){

        //Variables
        String nombre = "";

        //Ciclo para buscar un espacio en el arreglo de equipos
        for(int i = 0; i < equipos.length; i++){
            //Si encuentra un espacio vacio, pide los datos del equipo
            if(equipos[i] == null){

                System.out.print("Ingrese el nombre del equipo: ");
                nombre = leer.nextLine();
                equipos[i] = new Equipo(nombre);
                break;
            }
        }
    }

    //Metodo para asignar un jugador a un equipo
    public static void asignarJugadorAEquipo(){

        //Variables
        int jugador = 0;
        int equipo = 0;

        //Si hay jugadores y equipos disponibles, muestra los jugadores y equipos
        if(jugadores[0] != null && equipos[0] != null){

            Jugador.mostrarJugadores(jugadores);
            System.out.print("Seleccione el jugador: ");
            jugador = leer.nextInt();
            System.out.println("Equipos disponibles -------------------------|");
            Equipo.mostrarEquipo(equipos);
            System.out.print("Seleccione el equipo: ");
            equipo = leer.nextInt();
            jugadores[jugador - 1].setEquipo(equipos[equipo - 1]);

        }else{

            System.out.println("No hay jugadores o equipos disponibles");
        }

    }

    //Metodo para eliminar un jugador
    public static void eliminarJugador(){

        //Variables
        int jugador = 0;

        //Si hay jugadores disponibles, muestra los jugadores
        if(jugadores[0] != null){

            Jugador.mostrarJugadores(jugadores);
            System.out.print("Seleccione el jugador a eliminar: ");
            jugador = leer.nextInt();
            Jugador.eliminarJugador(jugadores, jugador - 1);

        }else{

            System.out.println("No hay jugadores disponibles");
        }

    }

    //Metodo para eliminar un equipo
    public static void eliminarEquipo(){

        //Variables
        int equipo = 0;

        //Si hay equipos disponibles, muestra los equipos
        if(equipos[0] != null){

            Equipo.mostrarEquipo(equipos);
            System.out.print("Seleccione el equipo a eliminar: ");
            equipo = leer.nextInt();

            //Primero eliminar los jugadores del equipo
            for(int i = 0; i < jugadores.length; i++){
                if(jugadores[i] != null && jugadores[i].getEquipo() != null && jugadores[i].getEquipo().getNombre().equals(equipos[equipo - 1].getNombre())){
                    Jugador.eliminarJugador(jugadores, i);
                }
            }
            //Eliminar el equipo
            Equipo.eliminarEquipo(equipos, equipo - 1);

        }else{

            System.out.println("No hay equipos disponibles");
        }

    }

    //Metodo para seleccionar un jugador
    public static void seleccionarJugador(){

        //Variables
        int jugador = 0;
        int opcion = 0;

        //Si hay jugadores disponibles, muestra los jugadores
        if(jugadores[0] != null){

            Jugador.mostrarJugadores(jugadores);
            System.out.print("Seleccione el jugador: ");
            jugador = leer.nextInt();
            do{
                menuSelecJugador();
                opcion = leer.nextInt();
                leer.nextLine();
                switch(opcion){
                    case 1:
                        System.out.println("Nombre: " + jugadores[jugador - 1].getNombre());
                        System.out.println("Equipo: " + (jugadores[jugador - 1].getEquipo() != null ? jugadores[jugador - 1].getEquipo().getNombre() : "Sin equipo"));
                        break;
                    case 2:
                        System.out.print("Ingrese el nuevo nombre: ");
                        jugadores[jugador - 1].setNombre(leer.nextLine());
                        break;
                    case 3:
                        Equipo.mostrarEquipo(equipos);
                        System.out.print("Seleccione el equipo: ");
                        jugadores[jugador - 1].setEquipo(equipos[leer.nextInt() - 1]);
                        break;
                    case 4:
                    System.out.println("Regresando al menu principal ...");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            }while(opcion != 4);

        }else{

            System.out.println("No hay jugadores disponibles");
        }

    }

    //Metodo para seleccionar un equipo
    public static void seleccionarEquipo(){

        //Variables
        int equipo = 0;
        int opcion = 0;

        //Si hay equipos disponibles, muestra los equipos
        if(equipos[0] != null){

            Equipo.mostrarEquipo(equipos);
            System.out.print("Seleccione el equipo: ");
            equipo = leer.nextInt();
            do{
                menuSelecEquipo();
                opcion = leer.nextInt();
                leer.nextLine();
                switch(opcion){
                    case 1:
                        System.out.println("Nombre: " + equipos[equipo - 1].getNombre());
                        break;
                    case 2:
                        System.out.print("Ingrese el nuevo nombre: ");
                        equipos[equipo - 1].setNombre(leer.nextLine());
                        break;
                    case 3:
                        System.out.println("Jugadores disponibles ");
                        Jugador.mostrarJugadores(jugadores);
                        System.out.print("Seleccione el jugador: ");
                        jugadores[leer.nextInt() - 1].setEquipo(equipos[equipo - 1]);
                        break;
                    case 4:
                        System.out.println("Jugadores del equipo " + equipos[equipo - 1].getNombre());
                        Jugador.mostrarJugadoresPorEquipo(jugadores, equipos[equipo - 1]);
                        break;
                    case 5:
                        System.out.println("Regresando al menu principal ...");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            }while(opcion != 5);

        }else{

            System.out.println("No hay equipos disponibles");
        }

    }

    //Metodo para mostrar el menu de opciones
    public static void menuPrincipal(){
        System.out.print("|------------------------------------|"
                + "\n|           MENU PRINCIPAL           |"
                + "\n|------------------------------------|"
                + "\n| 1. Crear jugador                   |"
                + "\n| 2. Crear equipo                    |"
                + "\n| 3. Asignar jugador a equipo        |"
                + "\n| 4. Mostrar jugadores               |"
                + "\n| 5. Mostrar equipos                 |"
                + "\n| 6. Eliminar jugador                |"
                + "\n| 7. Eliminar equipo                 |"
                + "\n| 8. Seleccionar jugador             |"
                + "\n| 9. Seleccionar equipo              |"
                + "\n| 10. Salir                          |"
                + "\n|------------------------------------|"
                + "\n Ingrese una opcion: ");
    }

    //Menu para la seleccion de un jugador
    public static void menuSelecJugador(){
        System.out.print("|------------------------------------|"
                + "\n| 1. Ver detalles                    |"
                + "\n| 2. Cambiar nombre                  |"
                + "\n| 3. Cambiar equipo                  |"
                + "\n| 4. Regresar al menu principal      |"
                + "\n|------------------------------------|"
                + "\n Ingrese una opcion: ");
    }

    //Menu para la seleccion de un equipo
    public static void menuSelecEquipo(){
        System.out.print("|------------------------------------|"
                + "\n| 1. Ver detalles                    |"
                + "\n| 2. Cambiar nombre                  |"
                + "\n| 3. Agregar jugador al equipo       |"
                + "\n| 4. Mostrar jugadores del equipo    |"
                + "\n| 5. Regresar al menu principal      |"
                + "\n|------------------------------------|"
                + "\n Ingrese una opcion: ");
    }
}