import java.util.Scanner;

public class SelectFigGeometri {
    
    public static void main(String[] args) {
        //Instancias el objeto de la clase Scanner
        Scanner read = new Scanner(System.in);

        //VARIABLES
        double radio, area, base, altura;

        System.out.print( "|-------------------------------------------------|"
                        + "\n|  CALCULEMOS EL AREA DE LAS FIGURAS GEOMETRICAS  |"
                        + "\n|-------------------------------------------------|"
                        + "\n| 1. Triangulo                                    |"
                        + "\n| 2. Cuadrado                                     |"
                        + "\n| 3. Circulo                                      |"
                        + "\n|-------------------------------------------------|"
                        + "\n\nSeleccione una opción: ");
        int option = read.nextInt();

        switch (option) {
            case 1:
                System.out.println("Triangulo");
                System.out.print("Ingrese la base: ");
                base = read.nextDouble();
                System.out.print("Ingrese la altura: ");
                altura = read.nextDouble();
                area = (base * altura) / 2;
                System.out.println("El area del triangulo es: " + area);
                break;
            case 2:
                System.out.println("Cuadrado");
                System.out.print("Ingrese el lado: ");
                base = read.nextDouble();
                area = base * base;
                System.out.println("El area del cuadrado es: " + area);
                break;
            case 3:
                System.out.println("Circulo");
                System.out.print("Ingrese el radio: ");
                radio = read.nextDouble();
                area = Math.PI * Math.pow(radio, 2);
                System.out.println("El area del circulo es: " + area);
                break;
            default:
                System.out.println("Saliendo");
                break;
        }

        read.close();
    }

}
