package com.iri.entidades;

public class Empleado {

    private String nombre;
    private int edad;
    private double salario;
    private String departamento;

    // CONSTRUCTORES
    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.departamento = departamento;
    }

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // METODOS A IMPLEMENTAR EN EL EJERCICIO
    public static void mostrarEmpleados(Empleado[] empleados) {
        System.out.println("|______________________________________________________________________________|"
                + "\n|_ # _|__________ Nombre __________|_ Edad _|__ Salario __|___ Departamento ___|");
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] == null) {
                break;
                
            }
            // Casilla de numero
            if (i < 9) {
                System.out.print("|_ " + (i + 1) + " _|");
            } else {
                System.out.print("|_ " + (i + 1) + "_|");
            }

            // Casilla de nombre
            int longitudNombre = empleados[i].getNombre().length();
            int longitudEncabezado = "__________ Nombre __________".length();
            if (longitudNombre < longitudEncabezado) {
                System.out.print(empleados[i].getNombre() + " ");
                for (int j = 0; j < longitudEncabezado - longitudNombre - 1; j++) {
                    System.out.print("_");
                }
                System.out.print("|");
            } else {
                System.out.print(empleados[i].getNombre().substring(0, longitudEncabezado) + "|");
            }

            // Casilla de edad
            if (empleados[i].getEdad() < 10) {
                System.out.print("__ 0" + empleados[i].getEdad() + " __|");
            } else {
                System.out.print("__ " + empleados[i].getEdad() + " __|");
            }

            // Casilla de salario
            String salario = String.valueOf(empleados[i].getSalario());
            int longitudSalario = salario.length();
            int longitudEncabezadoSalario = "__ Salario __".length();
            if (longitudSalario < longitudEncabezadoSalario) {
                System.out.print("_ $" + empleados[i].getSalario() + " ");
                for (int j = 0; j < longitudEncabezadoSalario - longitudSalario - 4; j++) {
                    System.out.print("_");
                }
                System.out.print("|");
            } else {
                System.out.print(empleados[i].getSalario() + "|");
            }

            // Casilla de departamento
            int longitudDepartamento = empleados[i].getDepartamento().length();
            int longitudEncabezadoDepartamento = "___ Departamento ___".length();
            if (longitudDepartamento < longitudEncabezadoDepartamento) {
                System.out.print(empleados[i].getDepartamento() + " ");
                for (int j = 0; j < longitudEncabezadoDepartamento - longitudDepartamento - 1; j++) {
                    System.out.print("_");
                }
                System.out.print("|");
            } else {
                System.out.print(empleados[i].getDepartamento() + "|");
            }
            System.out.println();
        }
        System.out.println("|______________________________________________________________________________|");
    }

    public static Empleado[] filtrarEmpleados(Empleado[] empleados, String filtro, String valor) {
        Empleado[] empleadosFiltrados = new Empleado[empleados.length];
        int contador = 0;
        switch (filtro.toLowerCase()) {
            case "nombre":
                for (int i = 0; i < empleados.length; i++) {
                    if(empleados[i] == null){
                        break;
                    }
                    if (empleados[i].getNombre().contains(valor)) {
                        empleadosFiltrados[contador] = empleados[i];
                        contador++;
                    }
                }
                break;
            case "edad":
                int valorEdad = Integer.parseInt(valor);
                for (int i = 0; i < empleados.length; i++) {
                    if(empleados[i] == null){
                        break;
                    }
                    if (empleados[i].getEdad() == valorEdad) {
                        empleadosFiltrados[contador] = empleados[i];
                        contador++;
                    }
                }
                break;
            case "salario":
                double valorSalario = Double.parseDouble(valor);
                for (int i = 0; i < empleados.length; i++) {
                    if(empleados[i] == null){
                        break;
                    }
                    if (empleados[i].getSalario() == valorSalario) {
                        empleadosFiltrados[contador] = empleados[i];
                        contador++;
                    }
                }
                break;
            case "departamento":
                for (int i = 0; i < empleados.length; i++) {
                    if(empleados[i] == null){
                        break;
                    }
                    if (empleados[i].getDepartamento().contains(valor)) {
                        empleadosFiltrados[contador] = empleados[i];
                        contador++;
                    }
                }
                break;
            default:
                break;
        }
        return empleadosFiltrados;
    }

    public static Empleado[] ordenarEmpleados(Empleado[] empleados, String criterio) {
        Empleado[] empleadosOrdenados = empleados;
        switch (criterio.toLowerCase()) {
            case "nombre":
                for (int i = 0; i < empleadosOrdenados.length - 1 ; i++) {
                    if(empleados[i] == null){
                        break;
                    }
                    for (int j = 0; j < empleadosOrdenados.length - i - 1; j++) {
                        if(empleados[j] == null){
                            break;
                        }
                        if (empleadosOrdenados[j].getNombre().compareTo(empleadosOrdenados[j + 1].getNombre()) > 0) {
                            Empleado aux = empleadosOrdenados[j];
                            empleadosOrdenados[j] = empleadosOrdenados[j + 1];
                            empleadosOrdenados[j + 1] = aux;
                        }
                    }
                }
                break;
            case "edad":
                for (int i = 0; i < empleadosOrdenados.length - 1 ; i++) {
                    if(empleados[i] == null){
                        break;
                    }
                    for (int j = 0; j < empleadosOrdenados.length - i - 1; j++) {
                        if(empleados[j] == null){
                            break;
                        }
                        if (empleadosOrdenados[j].getEdad() > empleadosOrdenados[j + 1].getEdad()) {
                            Empleado aux = empleadosOrdenados[j];
                            empleadosOrdenados[j] = empleadosOrdenados[j + 1];
                            empleadosOrdenados[j + 1] = aux;
                        }
                    }
                }
                break;
            case "salario":
                for (int i = 0; i < empleadosOrdenados.length - 1; i++) {
                    if(empleados[i] == null){
                        break;
                    }
                    for (int j = 0; j < empleadosOrdenados.length - i - 1; j++) {
                        if(empleados[j] == null){
                            break;
                        }
                        if (empleadosOrdenados[j].getSalario() > empleadosOrdenados[j + 1].getSalario()) {
                            Empleado aux = empleadosOrdenados[j];
                            empleadosOrdenados[j] = empleadosOrdenados[j + 1];
                            empleadosOrdenados[j + 1] = aux;
                        }
                    }
                }
                break;
            case "departamento":
                for (int i = 0; i < empleadosOrdenados.length - 1; i++) {
                    if(empleados[i] == null){
                        break;
                    }
                    for (int j = 0; j < empleadosOrdenados.length - i - 1; j++) {
                        if(empleados[j] == null){
                            break;
                        }
                        if (empleadosOrdenados[j].getDepartamento()
                                .compareTo(empleadosOrdenados[j + 1].getDepartamento()) > 0) {
                            Empleado aux = empleadosOrdenados[j];
                            empleadosOrdenados[j] = empleadosOrdenados[j + 1];
                            empleadosOrdenados[j + 1] = aux;
                        }
                    }
                }
                break;
            default:
                break;
        }
        return empleadosOrdenados;
    }

    public static Empleado buscarPorNombre(Empleado[] empleados, String nombre) {
        Empleado empleado = null;
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i].getNombre().contains(nombre)) {
                empleado = empleados[i];
                break;
            }
        }
        return empleado;
    }

    public static Empleado incrementarSalario(Empleado empleado, double porcentaje) {
        empleado.setSalario(empleado.getSalario() + (empleado.getSalario() * porcentaje / 100));
        return empleado;
    }
}
