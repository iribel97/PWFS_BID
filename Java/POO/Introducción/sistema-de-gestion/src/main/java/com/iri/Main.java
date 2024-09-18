package com.iri;

import java.util.Scanner;

import com.iri.entidades.Empleado;

public class Main {

    private static Empleado[] empleados = new Empleado[10];

    public static void main(String[] args) {
        instanciarEmpleados();
        actividad();
    }

    //Instanciar empleados para pruebas
    public static void instanciarEmpleados() {
        empleados[0] = new Empleado("Juan", 25, 1000, "Ventas");
        empleados[1] = new Empleado("Pedro", 30, 1500, "Ventas");
        empleados[2] = new Empleado("Maria", 35, 2000, "Sistemas");
        empleados[3] = new Empleado("Ana", 40, 2500, "Sistemas");
        empleados[4] = new Empleado("Luis", 45, 3000, "Ventas");
        empleados[5] = new Empleado("Carlos", 50, 3500, "Sistemas");
        empleados[6] = new Empleado("Sofia", 55, 4000, "Sistemas");
        empleados[7] = new Empleado("Jorge", 60, 4500, "Ventas");
        empleados[8] = new Empleado("Fernando", 65, 5000, "Sistemas");
        empleados[9] = new Empleado("Rosa", 70, 5500, "Ventas");
    }

    //Metodo en donde se desarrolla la actividad
    public static void actividad() {

        Scanner leer = new Scanner(System.in);

        // VARIABLES
        int opcion, cont = 10;
        Empleado[] nuevaLista = new Empleado[10];

        do {
            
            //Mostrar menu y seleccionar opcion
            mostrarMenu();
            System.out.print("Seleccione una opcion: ");
            opcion = leer.nextInt();

            //Switch para el manejo de las opciones
            switch (opcion) {
                case 1:
                    System.out.println("Mostrar todos los empleados");
                    //Validar si hay empleados registrados
                    if (empleados[0] == null) {
                        System.out.println("No hay empleados registrados");
                    } else {
                        if (nuevaLista[0] != null) {
                            Empleado.mostrarEmpleados(nuevaLista);

                        } else {
                            Empleado.mostrarEmpleados(empleados);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Crear Empleado");
                    //Validar si hay espacio para registrar empleados
                    if (cont < empleados.length) {
                        //Caso de que si haya espacio se procede a registrar el nuevo empleado
                        empleados[cont] = new Empleado();
                        leer.nextLine();
                        System.out.print("Ingrese el nombre del empleado: ");
                        empleados[cont].setNombre(leer.nextLine());
                        System.out.print("Ingrese la edad del empleado: ");
                        empleados[cont].setEdad(leer.nextInt());
                        System.out.print("Ingrese el salario del empleado: ");
                        empleados[cont].setSalario(leer.nextDouble());
                        leer.nextLine();
                        System.out.print("Ingrese el departamento del empleado: ");
                        empleados[cont].setDepartamento(leer.nextLine());
                        cont++;
                    } else {
                        System.out.println("No se pueden registrar mas empleados");
                    }
                    break;
                case 3:
                    System.out.println("Filtrar Empleados");
                    //Validar si hay empleados registrados
                    if (empleados[0] == null) {
                        System.out.println("No hay empleados registrados");
                    } else {
                        //Variable para la opcion de filtrado
                        int opcionFiltro;

                        do {
                            menuFiltrarEmpleados();
                            opcionFiltro = leer.nextInt();
                            switch (opcionFiltro) {
                                case 1:
                                    leer.nextLine();
                                    System.out.print("Ingrese el nombre del empleado: ");
                                    String nombre = leer.nextLine();
                                    Empleado.mostrarEmpleados(Empleado.filtrarEmpleados(empleados, "nombre", nombre));
                                    break;
                                case 2:
                                    System.out.print("Ingrese la edad del empleado: ");
                                    String edad = leer.next();
                                    Empleado.mostrarEmpleados(Empleado.filtrarEmpleados(empleados, "edad", edad));
                                    break;
                                case 3:
                                    System.out.print("Ingrese el salario del empleado: ");
                                    double salario = leer.nextDouble();
                                    Empleado.mostrarEmpleados(Empleado.filtrarEmpleados(empleados, "salario", String.valueOf(salario)));
                                    break;
                                case 4:
                                    System.out.print("Ingrese el departamento del empleado: ");
                                    String departamento = leer.next();
                                    Empleado.mostrarEmpleados(Empleado.filtrarEmpleados(empleados, "departamento", departamento));
                                    break;
                                case 5:
                                    System.out.println("Regresando ...");
                                    break;
                                default:
                                    System.out.println("Opcion no valida");
                                    break;
                            }
                        } while (opcionFiltro != 5);

                    }
                    break;
                case 4:
                    System.out.println("Ordenar Empleados");
                    if (empleados[0] == null) {
                        System.out.println("No hay empleados registrados");
                    } else {
                        //Variable para la opcion de ordenado
                        int opcionOrdenar;
                        do {
                            menuOrdenarEmpleados();
                            opcionOrdenar = leer.nextInt();
                            switch (opcionOrdenar) {
                                case 1:
                                    nuevaLista = Empleado.ordenarEmpleados(empleados, "nombre");
                                    Empleado.mostrarEmpleados(nuevaLista);
                                    break;
                                case 2:
                                    nuevaLista = Empleado.ordenarEmpleados(empleados, "edad");
                                    Empleado.mostrarEmpleados(nuevaLista);
                                    break;
                                case 3:
                                    nuevaLista = Empleado.ordenarEmpleados(empleados, "salario");
                                    Empleado.mostrarEmpleados(nuevaLista);
                                    break;
                                case 4:
                                    nuevaLista = Empleado.ordenarEmpleados(empleados, "departamento");
                                    Empleado.mostrarEmpleados(nuevaLista);
                                    break;
                                case 5:
                                    System.out.println("Regresando ...");
                                    break;
                                default:
                                    System.out.println("Opcion no valida");
                                    break;
                            }
                        } while (opcionOrdenar != 5);
                    }
                    break;
                case 5:
                    System.out.println("Incrementar salario");
                    if (empleados[0] == null) {
                        System.out.println("No hay empleados registrados");
                    } else {
                        System.out.print("Ingrese el nombre del empleado: ");
                        String nombre = leer.next();
                        System.out.print("Ingrese el porcentaje de incremento: ");
                        double porcentaje = leer.nextDouble();
                        Empleado.incrementarSalario(Empleado.buscarPorNombre(nuevaLista, nombre), porcentaje);
                        System.out.println("Salario incrementado :)!!");
                    }
                    break;
                case 6:
                    System.out.println("Limpiar filtros");
                    nuevaLista = new Empleado[10];
                    break;
                case 7:
                    System.out.println("Salir ...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 7);

        leer.close();

    }

    // METODO PARA MOSTRAR EL MENU
    public static void mostrarMenu() {
        System.out.println("|____________________________________________________________________|"
                + "\n|______________________ MENU DE OPCIONES ____________________________|"
                + "\n| 1.- Mostrar todos los empleados                                    |"
                + "\n| 2.- Crear Empleado                                                 |"
                + "\n| 3.- Filtrar Empleados                                              |"
                + "\n| 4.- Ordenar Empleados                                              |"
                + "\n| 5.- Incrementar salario                                            |"
                + "\n| 6.- Limpiar filtros                                                |"
                + "\n| 7.- Salir                                                          |"
                + "\n|____________________________________________________________________|");
    }

    // METODO PARA LAS OPCIONES DE FILTRADO
    public static void menuFiltrarEmpleados() {

        System.out.println("|____________________________________________________________________|"
                + "\n|______________________ FILTRAR EMPLEADOS ___________________________|"
                + "\n| 1.- Filtrar por nombre                                             |"
                + "\n| 2.- Filtrar por edad                                               |"
                + "\n| 3.- Filtrar por salario                                            |"
                + "\n| 4.- Filtrar por departamento                                       |"
                + "\n| 5.- Regresar                                                       |"
                + "\n|____________________________________________________________________|");
        System.out.print("Seleccione una opcion: ");

    }

    //Metodo para las opciones de ordenar empleados
    public static void menuOrdenarEmpleados() {
        System.out.println( "|____________________________________________________________________|"
                        + "\n|______________________ ORDENAR EMPLEADOS ___________________________|"
                        + "\n| 1.- Ordenar por nombre                                             |"
                        + "\n| 2.- Ordenar por edad                                               |"
                        + "\n| 3.- Ordenar por salario                                            |"
                        + "\n| 4.- Ordenar por departamento                                       |"
                        + "\n| 5.- Regresar                                                       |"
                        + "\n|____________________________________________________________________|");
        System.out.print("Seleccione una opcion: ");
    }
}