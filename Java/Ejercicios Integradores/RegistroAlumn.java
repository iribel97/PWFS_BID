import java.util.Scanner;

public class RegistroAlumn {
    
    public static void main(String[] args) {
        
        Scanner scaner = new Scanner(System.in);

        //VARIABLES
        int opc, cant = 0;
        String[] alumnos = new String[100];
        double[] notas = new double[100];

        try {
            do {
                System.out.print( "|-------------------------------------------------------|"+ 
                                "\n|                    MENU DE OPCIONES                   |"+
                                "\n|-------------------------------------------------------|"+
                                "\n| 1. Registrar alumno                                   |"+
                                "\n| 2. Mostrar todos los alumnos                          |"+
                                "\n| 3. Mostrar promedio de notas                          |"+
                                "\n| 4. Buscar alumno por nombre                           |"+
                                "\n| 5. Modificar nota por nombre                          |"+
                                "\n| 6. Eliminar alumno por nombre                         |"+
                                "\n| 7. Salir                                              |"+
                                "\n|-------------------------------------------------------|"+
                                "\nIngrese una opción: ");
                opc = scaner.nextInt();

                switch (opc) {
                    case 1:
                        System.out.print("Ingrese el numero de alumnos a registrar: ");
                        int numAlumnos = scaner.nextInt();

                        for (int i = cant; i < numAlumnos+cant; i++) {

                            System.out.print("Ingrese el nombre del alumno: ");
                            scaner.nextLine();
                            alumnos[i] = scaner.nextLine();

                            do {
                                System.out.print("Ingrese la nota del alumno: ");
                                notas[i] = scaner.nextDouble();

                                if (notas[i] < 0.00 || notas[i] > 10.00) {
                                    System.out.println("La nota debe ser un número válido entre 0.00 y 10.00");
                                }
                            } while (notas[i] < 0.00 || notas[i] > 10.00);
                        }
                        cant += numAlumnos;
                        
                        break;

                    case 2:

                        if (alumnos[0] == null) {

                            System.out.println("No hay alumnos registrados");

                        } else {

                            for (int i = 0; i < cant; i++) {
                                System.out.println("Nombre: " + alumnos[i] + " ------> Nota: " + notas[i]);
                            } 
                        }
                        break;

                    case 3:
                        
                        if (alumnos[0] == null) {

                            System.out.println("No hay alumnos registrados");
    
                        } else {
    
                            double promedio = 0;
    
                            for (int i = 0; i < cant; i++) {
                                promedio += notas[i];
                            }
    
                            promedio = promedio / cant;
                            System.out.println("El promedio de notas es: " + promedio);
    
                        }
                        break;

                    case 4:
                        if (alumnos[0] == null) {

                            System.out.println("No hay alumnos registrados");

                        } else {
                            boolean bandera = false;
                            int indice = 0 ;

                            System.out.print("Ingrese el nombre del alumno a buscar: ");
                            scaner.nextLine();
                            String nombre = scaner.nextLine();

                            for (int i = 0; i < cant; i++) {
                                if (alumnos[i].equalsIgnoreCase(nombre)) {
                                    bandera = true;
                                    indice = i;
                                }
                            }

                            if (bandera) {
                                System.out.println("Nombre: " + alumnos[indice] + " ------> Nota: " + notas[indice]);
                            } else {
                                System.out.println("El alumno no existe");
                            }
                        }
                        break;
                    
                    case 5:
                        if (alumnos[0] == null) {

                            System.out.println("No hay alumnos registrados");

                        } else {
                            boolean bandera = false;
                            int indice = 0 ;

                            System.out.print("Ingrese el nombre del alumno a modificar: ");
                            scaner.nextLine();
                            String nombre = scaner.nextLine();

                            for (int i = 0; i < cant; i++) {
                                if (alumnos[i].equalsIgnoreCase(nombre)) {
                                    bandera = true;
                                    indice = i;
                                }
                            }

                            if (bandera) {
                                System.out.print("Ingrese la nueva nota del alumno: ");
                                notas[indice] = scaner.nextDouble();
                            } else {
                                System.out.println("El alumno no existe");
                            }
                        }
                        break;

                    case 6:
                        if (alumnos[0] == null) {

                            System.out.println("No hay alumnos registrados");

                        } else {
                            int contador = 0 ;
                            int indices = 0;

                            System.out.print("Ingrese el nombre del alumno a eliminar: ");
                            scaner.nextLine();
                            String nombre = scaner.nextLine();

                            for (int i = 0; i < cant; i++) {
                                if (alumnos[i].equalsIgnoreCase(nombre)) {
                                    indices= i;
                                    contador++;
                                }
                            }

                            if (contador != 0) {
                                for (int i = indices; i < cant; i++) {
                                    alumnos[i] = alumnos[i+1];
                                    notas[i] = notas[i+1];  
                                }
                                cant--;
                            } else {
                                System.out.println("El alumno no existe");
                            }
                        }
                        break;

                    case 7:
                        System.out.println("Saliendo del programa...");
                        break;
                
                    default:
                        System.out.println("Opción inválida");
                        break;
                }
            } while (opc != 7);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scaner.close();
        }
    }

}
