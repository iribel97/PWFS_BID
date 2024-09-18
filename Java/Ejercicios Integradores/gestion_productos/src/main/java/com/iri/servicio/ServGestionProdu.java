package com.iri.servicio;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.iri.entidades.Cliente;
import com.iri.entidades.ItemCarrito;
import com.iri.entidades.ProduElectronico;
import com.iri.entidades.ProduRopa;
import com.iri.entidades.Producto;
import com.iri.exceptions.ProductoAgotadoException;

public class ServGestionProdu {

    // Instanciar el servicio donde se encuentran los menu
    ServImprimibles serviceMenu = new ServImprimibles();

    // Array de los productos de la tienda
    private List<Producto> productos = new ArrayList<Producto>();
    // Array por si el usuario quiere volver a comprar, este va a guastar los datos de la compra anterior
    private List<ItemCarrito> productosComprados = new ArrayList<ItemCarrito>();

    // Metodo para agregar productos
    public void productosEnTienda() {
        // 5 productos electronicos
        productos.add(new ProduElectronico("Celular", 20000, 10, "Celular de alta gama", "Samsung", "Galaxy S20", "Smartphone"));
        productos.add(new ProduElectronico("Notebook", 50000, 5, "Notebook de alta gama", "HP", "Pavilion", "Notebook"));
        productos.add(new ProduElectronico("Smartwatch", 10000, 15, "Smartwatch de alta gama", "Apple", "Watch Series 6", "Smartwatch"));
        productos.add(new ProduElectronico("Tablet", 15000, 20, "Tablet de alta gama", "Samsung", "Galaxy Tab S7", "Tablet"));
        productos.add(new ProduElectronico("Auriculares", 5000, 30, "Auriculares de alta gama", "Sony", "WH-1000XM4", "Auriculares"));
        // 5 productos de ropa
        productos.add(new ProduRopa("Remera", 2000, 50, "Remera de algodon", "M", "Blanca", "Algodon"));
        productos.add(new ProduRopa("Campera", 5000, 20, "Campera de cuero", "L", "Negra", "Cuero"));
        productos.add(new ProduRopa("Pantalon", 3000, 40, "Pantalon de jean", "L", "Azul", "Jean"));
        productos.add(new ProduRopa("Zapatillas", 4000, 60, "Zapatillas deportivas", "42", "Negro", "Caucho"));
        productos.add(new ProduRopa("Bufanda", 20.45, 10, "Bufanda para el frio", "S", "Cafe", "Algodon"));
    }

    // Metodo para manejar la actividad
    public void gestionProductos() {

        Scanner scan = new Scanner(System.in);

        Cliente cliente = new Cliente();

        // Variables
        int opcUsu = 0;

        // Iniciar Productos
        productosEnTienda();

        do {

            try {
                serviceMenu.menuPrincipal();
                opcUsu = scan.nextInt(); // Aquí puede lanzarse InputMismatchException

                switch (opcUsu) {
                    case 1:
                        // mostrar productos
                        serviceMenu.mostrarProductos(productos);
                        System.out.print("Seleccione un producto: ");
                        int opcProduUsu = scan.nextInt();

                        System.out.print("Ingrese la cantidad a llevar: ");
                        int cantidad = scan.nextInt();
                        scan.nextLine(); // Limpiar el buffer del scanner

                        try {
                            System.out.print("El producto cuenta con descuento? (S/N) ");
                            String descuento = scan.nextLine();

                            if (descuento.equalsIgnoreCase("S")) {
                                System.out.print("Ingrese el porcentaje de descuento: ");
                                double porcentaje = scan.nextDouble();
                                cliente.agregarCarrito(
                                        new ItemCarrito(productos.get(opcProduUsu - 1), cantidad, porcentaje));
                            } else {
                                cliente.agregarCarrito(new ItemCarrito(productos.get(opcProduUsu - 1), cantidad, 0));
                            }
                        } catch (ProductoAgotadoException e) {
                            System.out.println(e.getMessage());
                        }

                        break;

                    case 2:
                        cliente.verCarrito();
                        break;

                    case 3:
                        // Agregar productos comprados a la lista
                        productosComprados.addAll(cliente.getCarrito());
                        cliente.realizarCompra();
                        break;

                    case 4:
                        System.out.println("Restaurando compra ...");
                        cliente.setCarrito(productosComprados);
                        cliente.verCarrito();
                        break;

                    case 5:
                        System.out.println("Saliendo del sistema...");
                        break;

                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println(
                        "Entrada no válida. Por favor, ingrese un número correspondiente a una opción del menú.");
                scan.nextLine(); // Limpiar el buffer del scanner
            }

        } while (opcUsu != 5);

        scan.close();

    }

}
