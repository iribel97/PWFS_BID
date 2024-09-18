import java.util.Scanner;

public class CalcularArePer {
    
    public static void main(String[] args) {
        //Instanciar variable con el objeto Scanner
        Scanner leer = new Scanner(System.in);

        //VARIABLES
        double radio, area, perimetro, base, altura;

        System.out.print(  "|-----------------------------|"
                        +"\n|     FIGURAS DISPONIBLES     |"
                        +"\n|-----------------------------|"
                        +"\n| 1. Circulo                  |"
                        +"\n| 2. Rectangulo               |"
                        +"\n|-----------------------------|"
                        +"\nSeleccione una opción: ");
        int opcion = leer.nextInt();

        System.out.print("|--------------------------------|"
                        +"\n|SELECCIONAR OPERACION A REALIZAR|"
                        +"\n|--------------------------------|"
                        +"\n| 1. Calcular Area               |"
                        +"\n| 2. Calcular Perimetro          |"
                        +"\n|--------------------------------|"
                        +"\nSeleccione una opción: ");
        int operacion = leer.nextInt();

        switch (opcion) {
            case 1 -> {
                System.out.print("Ingrese el radio: ");
                radio = leer.nextDouble();

                switch (operacion) {
                    case 1 -> {
                        area = Math.PI * Math.pow(radio, 2);
                        System.out.println("El area del circulo es: " + area);
                    }
                    case 2 -> {
                        perimetro = 2 * Math.PI * radio;
                        System.out.println("El perimetro del circulo es: " + perimetro);
                    }
                    default -> System.out.println("Opción inválida");
                }
            }
            case 2 -> {
                System.out.print("Ingrese la base: ");
                base = leer.nextDouble();
                System.out.print("Ingrese la altura: ");
                altura = leer.nextDouble();

                switch (operacion) {
                    case 1 -> {
                        area = base * altura;
                        System.out.println("El area del rectangulo es: " + area);
                    }
                    case 2 -> {
                        perimetro = 2 * (base + altura);
                        System.out.println("El perimetro del rectangulo es: " + perimetro);
                    }
                    default -> System.out.println("Opción inválida");
                }
            }
            default -> System.out.println("Opción inválida");
        }

        leer.close();
    }

}
