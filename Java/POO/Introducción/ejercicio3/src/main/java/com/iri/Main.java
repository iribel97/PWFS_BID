package com.iri;

import java.util.Scanner;

import com.iri.entidades.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static Rectangulo[] rectangulos = new Rectangulo[10];
    private static Triangulo[] triangulos = new Triangulo[10];
    private static Circulo[] circulos = new Circulo[10];

    public static void main(String[] args) {

        actividad();

    }

    public static void actividad(){

        int opcion = 0;

        do {
            menu();
            System.out.print("Opción: ");
            try {
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        crearFigura();
                        break;
                    case 2:
                        calcularArea();
                        break;
                    case 3:
                        calcularPerimetro();
                        break;
                    case 4:
                        System.out.println("Número de figuras creadas: " + (Rectangulo.getNumRectangulos() + Triangulo.getNumTriangulos() + Circulo.getNumCirculos()));
                        break;
                    case 5:
                        mostrarInformacion();
                        break;
                    case 6:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingresa un número válido.");
            }
        } while (opcion != 6);

    }

    public static void menu() {
        System.out.println("|------------------------------------------------|"
                + "\n|                    MENU                        |"
                + "\n|------------------------------------------------|"
                + "\n| 1. Crear Figura                                |"
                + "\n| 2. Calcular área                               |"
                + "\n| 3. Calcular perímetro                          |"
                + "\n| 4. Mostrar número figuras creadas              |"
                + "\n| 5. Mostrar información                         |"
                + "\n| 6. Salir                                       |"
                + "\n|------------------------------------------------|");
    }

    public static void menuFiguras() {
        System.out.println("|------------------------------------------------|"
                + "\n|                    FIGURAS                     |"
                + "\n|------------------------------------------------|"
                + "\n| 1. Rectángulo                                  |"
                + "\n| 2. Triángulo                                   |"
                + "\n| 3. Círculo                                     |"
                + "\n|------------------------------------------------|");
    }

    public static void crearFigura() {
        menuFiguras();
        System.out.print("Opción: ");
        int opcionFigura = Integer.parseInt(sc.nextLine());
        switch (opcionFigura) {
            case 1:
                rectangulos[Rectangulo.getNumRectangulos()] = crearRectangulo();
                break;
            case 2:
                triangulos[Triangulo.getNumTriangulos()] = crearTriangulo();
                break;
            case 3:
                circulos[Circulo.getNumCirculos()] = crearCirculo();
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    public static Rectangulo crearRectangulo() {
        System.out.print("Introduce el ancho: ");
        double ancho = Double.parseDouble(sc.nextLine());
        System.out.print("Introduce el alto: ");
        double alto = Double.parseDouble(sc.nextLine());

        return new Rectangulo(ancho, alto);
    }

    public static Triangulo crearTriangulo() {
        System.out.print("Introduce la base: ");
        double base = Double.parseDouble(sc.nextLine());
        System.out.print("Introduce la altura: ");
        double altura = Double.parseDouble(sc.nextLine());

        return new Triangulo(base, altura);
    }

    public static Circulo crearCirculo() {
        System.out.print("Introduce el radio: ");
        double radio = Double.parseDouble(sc.nextLine());

        return new Circulo(radio);
    }

    public static void calcularArea() {

        int indice;

        menuFiguras();
        System.out.print("Opción: ");
        int opcionFigura = Integer.parseInt(sc.nextLine());

        switch (opcionFigura) {
            case 1:
                System.out.print("Ingrese el índice del rectángulo: ");
                indice = Integer.parseInt(sc.nextLine());
                if (indice >= 0 && indice <= Rectangulo.getNumRectangulos()) {
                    System.out.println("Area del rectángulo: " + rectangulos[indice - 1].area());
                } else {
                    System.out.println("Índice no válido");
                }
                break;
            case 2: 
                System.out.print("Ingrese el índice del triángulo: ");
                indice = Integer.parseInt(sc.nextLine());
                if (indice >= 0 && indice <= Triangulo.getNumTriangulos()) {
                    System.out.println("Área del triángulo: " + triangulos[indice - 1].calcularArea());
                } else {
                    System.out.println("Índice no válido");
                }
                break;
            case 3:
                System.out.print("Ingrese el índice del círculo: ");
                indice = Integer.parseInt(sc.nextLine());
                if (indice >= 0 && indice <= Circulo.getNumCirculos()) {
                    System.out.println("Área del círculo: " + circulos[indice - 1].calcularArea());
                } else {
                    System.out.println("Índice no válido");
                }
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    public static void calcularPerimetro() {

        int indice;

        menuFiguras();
        System.out.print("Opción: ");
        int opcionFigura = Integer.parseInt(sc.nextLine());

        switch (opcionFigura) {
            case 1:
                System.out.print("Ingrese el índice del rectángulo: ");
                indice = Integer.parseInt(sc.nextLine());
                if (indice >= 0 && indice <= Rectangulo.getNumRectangulos()) {
                    System.out.println("Perímetro del rectángulo: " + rectangulos[indice - 1].perimetro());
                } else {
                    System.out.println("Índice no válido");
                }
                break;
            case 2: 
                System.out.println("Por el momento no se puede calcular el perímetro de un triángulo");
                break;
            case 3:
                System.out.print("Ingrese el índice del círculo: ");
                indice = Integer.parseInt(sc.nextLine());
                if (indice >= 0 && indice <= Circulo.getNumCirculos()) {
                    System.out.println("Perímetro del círculo: " + circulos[indice - 1].calcularPerimetro());
                } else {
                    System.out.println("Índice no válido");
                }
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    //Mostrar información
    public static void mostrarInformacion() {
        int indice;

        menuFiguras();
        System.out.print("Opción: ");
        int opcionFigura = Integer.parseInt(sc.nextLine());

        switch (opcionFigura) {
            case 1:
                System.out.print("Ingrese el índice del rectángulo: ");
                indice = Integer.parseInt(sc.nextLine());
                if (indice >= 0 && indice <= Rectangulo.getNumRectangulos()) {
                    rectangulos[indice - 1].imprimirDatos();
                } else {
                    System.out.println("Índice no válido");
                }
                break;
            case 2: 
                System.out.print("Ingrese el índice del triángulo: ");
                indice = Integer.parseInt(sc.nextLine());
                if (indice >= 0 && indice <= Triangulo.getNumTriangulos()) {
                    triangulos[indice - 1].imprimirDatos();
                } else {
                    System.out.println("Índice no válido");
                }
                break;
            case 3:
                System.out.print("Ingrese el índice del círculo: ");
                indice = Integer.parseInt(sc.nextLine());
                if (indice >= 0 && indice <= Circulo.getNumCirculos()) {
                    circulos[indice - 1].imprimirDatos();
                } else {
                    System.out.println("Índice no válido");
                }
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

}