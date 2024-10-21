package com.egg;

import com.egg.Entidades.Oficina;
import com.egg.Servicios.OficinaServicio;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        // Instanciar la clase OficinaServicio para acceder a sus métodos
        OficinaServicio oficinaServicio = new OficinaServicio();

        boolean flag = true;

        do {
            System.out.println("Que desea hacer con oficina?:\n" +
                    "1.Crear una Oficina\n" +
                    "2.Modificar una oficina\n" +
                    "3.Buscar una Oficina\n" +
                    "4.Eliminar una oficina\n" +
                    "5.Salir");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    oficinaServicio.crearOficina("OFI01", "Mendoza", "Argentina", "Cuyo", "11111111",
                            "CP5000");
                    break;
                case 2:
                    System.out.println("Ingrese el id de la oficina que desea modificar:");
                    int id3 = sc.nextInt();
                    oficinaServicio.modificarOficina(id3);
                    break;
                case 3:
                    System.out.println("Ingrese el id de oficina que desea buscar:");
                    int id1 = sc.nextInt();
                    Oficina of = oficinaServicio.buscarOficina(id1);
                    if(of != null) {
                        System.out.println(of.toString());
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el id de oficina a eliminar:");
                    int id2 = sc.nextInt();
                    oficinaServicio.eliminarOficina(id2);
                    break;
                case 5:
                    System.out.println("Saliendo de el programa tenga un buen dia");
                    flag = false;
            }
        } while (flag);
    }
}
