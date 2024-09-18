package com.iri.servicios;

import java.util.ArrayList;
import java.util.Scanner;

import com.iri.entidades.Pedido;
import com.iri.enums.EstadoPedido;

public class ServPedido {

    private Scanner scan = new Scanner(System.in);

    //Atributos
    private ArrayList<Pedido> listaPedidos;

    //Servicios
    private ServMenu servMenu = new ServMenu();

    /*
     * METODOS
     */

     //Crear nuevo pedido
    private Pedido crearPedido(){
        ArrayList<String> listaProductos = new ArrayList<>();
        System.out.println(  "|--------------------------------------------------|" +
                           "\n|                CREAR NUEVO PEDIDO                |" +
                           "\n|--------------------------------------------------|");    
        System.out.print("               Introduzca el número de pedido: ");
        int numPedido = scan.nextInt();
        scan.nextLine();
        System.out.print("             Introduzca el nombre del cliente: ");
        String cliente = scan.nextLine();
        System.out.print(" Introduzca la cantidad de productos a llevar: ");
        int numProductos = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < numProductos; i++) {
            System.out.print("Introduzca el nombre del producto " + (i+1) + ": ");
            listaProductos.add(new String(scan.nextLine()));
        }

        return new Pedido(numPedido, cliente, listaProductos, EstadoPedido.Pendiente);
    }

    //Actualizar estado de pedidos existentes
    private void actualizarEstadoPedido(){
        System.out.println(  "|--------------------------------------------------|" +
                           "\n|            ACTUALIZAR ESTADO DE PEDIDO           |" +
                           "\n|--------------------------------------------------|");
        System.out.print("Introduzca el número de pedido a actualizar: ");
        int numPedido = scan.nextInt();
        scan.nextLine();

        //Buscar pedido en la lista
        Pedido pedido = listaPedidos.stream().filter(p -> p.getNumPedido() == numPedido).findFirst().orElse(null);

        //Verificar si el pedido existe
        if (pedido != null) {

            //Mostrar menú de estados
            servMenu.menuEstado();
            int opcion = scan.nextInt();
            scan.nextLine();
            switch (opcion) {
                case 1 -> pedido.setEstado(EstadoPedido.Pendiente);
                case 2 -> pedido.setEstado(EstadoPedido.Enviado);
                case 3 -> pedido.setEstado(EstadoPedido.Entregado);
                default -> System.out.println("Opción no válida.");
            }
        } else {
            System.out.println("Pedido no encontrado.");
        }
    }

    //Buscar pedidos por estado
    private void buscarPedidosPorEstado(){
        System.out.println(  "|--------------------------------------------------|" +
                           "\n|           BUSCAR PEDIDOS POR ESTADO              |" +
                           "\n|--------------------------------------------------|");
        servMenu.menuEstado();
        int opcion = scan.nextInt();

        //Filtrar pedidos por estado
        EstadoPedido estado = seleccionarEstado(opcion);

        if (estado != null) {

            for (Pedido pedido : listaPedidos) {
                if (pedido.getEstado() == estado) {
                    System.out.println("Pedido #" + pedido.getNumPedido());
                    System.out.println("Cliente: " + pedido.getCliente());
                    System.out.println("Productos: " + pedido.getListaProductos().toString());
                    System.out.println("Estado: " + pedido.getEstado().toString());
                    System.out.println("|--------------------------------------------------|");
                }
            }
        } else {
            System.out.println("Opción no válida.");
        }

    }

    //Metodo que retorna un enum
    private EstadoPedido seleccionarEstado(int opcion){
        switch (opcion) {
            case 1 -> { return EstadoPedido.Pendiente; }
            case 2 -> { return EstadoPedido.Enviado; }
            case 3 -> { return EstadoPedido.Entregado; }
            default -> { return null; }
        }
    }

    //Mostrar listado de pedidos
    private void mostrarListadoPedidos(){
        System.out.println(  "|--------------------------------------------------|" +
                           "\n|             LISTADO DE PEDIDOS                   |" +
                           "\n|--------------------------------------------------|");
        for (Pedido pedido : listaPedidos) {
            System.out.println("Pedido #" + pedido.getNumPedido());
            System.out.println("Cliente: " + pedido.getCliente());
            System.out.println("Productos: " + pedido.getListaProductos().toString());
            System.out.println("Estado: " + pedido.getEstado().toString());
            System.out.println("|--------------------------------------------------|");
        }
    }

    //Método principal
    public void gestionPedidos(){
        listaPedidos = new ArrayList<>();
        int opcion = 0;
        do {
            servMenu.menuPrincipal();
            opcion = scan.nextInt();
            scan.nextLine();
            switch (opcion) {
                case 1 -> listaPedidos.add(crearPedido());
                case 2 -> actualizarEstadoPedido();
                case 3 -> buscarPedidosPorEstado();
                case 4 -> mostrarListadoPedidos();
                case 5 -> System.out.println("Hasta luego!");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }

}
