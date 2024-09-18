import java.util.Scanner;

public class SelectOpction {
    
    public static void main(String[] args) {
        
        //Instanciar el objeto de la clase Scanner
        Scanner leer = new Scanner(System.in);
        
        System.out.print(  "|----------------------------------|"+ 
                           "\n| 1. Guardar                       |"+
                           "\n| 2. Cargar                        |"+
                           "\n| 3. Salir                         |"+
                           "\n|----------------------------------|" +
                           "\n\nSeleccione una opción: ");
        int opcion = leer.nextInt();

        leer.close();

        switch (opcion) {
            case 1:
                System.out.println("Guardando");
                break;
            case 2:
                System.out.println("Cargando");
                break;
            case 3:
                System.out.println("Saliendo");
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }

    }

}
