package com.iri.servicios;

public class ServMenu {

    public void menuPrincipal() {
        System.out.print( "|-----------------------------------------|" +
                        "\n|           GESTIÓN DE PEDIDOS            |" +
                        "\n|-----------------------------------------|" +
                        "\n| 1. Realizar pedido                      |" +
                        "\n| 2. Actualizar estado del pedido         |" +
                        "\n| 3. Buscar pedidos por estado            |" +
                        "\n| 4. Mostrar listado pedidos              |" +
                        "\n| 5. Salir                                |" +
                        "\n|-----------------------------------------|" +
                        "\n\n Seleccione una opción: ");
    }

    public void menuEstado(){
        System.out.print( "|-----------------------------------------|" +
                        "\n|           ESTADO DEL PEDIDO             |" +
                        "\n|-----------------------------------------|" +
                        "\n| 1. Pendiente                            |" +
                        "\n| 2. Enviado                              |" +
                        "\n| 3. Entregado                            |" +
                        "\n|-----------------------------------------|" +
                        "\n\n Seleccione una opción: ");
    }

}
