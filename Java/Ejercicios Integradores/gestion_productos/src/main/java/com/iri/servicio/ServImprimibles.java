package com.iri.servicio;

import java.util.List;

import com.iri.entidades.Producto;

public class ServImprimibles {

    public void menuPrincipal(){
        System.out.print( "|-----------------------------------------|\n"
                        + "|           GESTION DE PRODUCTOS          |\n"
                        + "|-----------------------------------------|\n"
                        + "| 1. Agregar producto                     |\n"
                        + "| 2. Ver Carrito                          |\n"
                        + "| 3. Realizar Compra                      |\n"
                        + "| 4. Volver a Comprar                     |\n"
                        + "| 5. Salir                                |\n"
                        + "|-----------------------------------------|\n"
                        + "   Ingrese una opcion: ");
    }


    public void mostrarProductos(List<Producto> products){
        int cont = 1;
        System.out.println("|-------------------------------------------------------------------------------|\n"
                         + "|                             PRODUCTOS EN TIENDA                               |\n"
                         + "|-------------------------------------------------------------------------------|\n"
                         + "|_#_|______NOMBRE______|__PRECIO__|_STOCK_|_____________DESCRIPCION_____________|");

        for (Producto producto : products) {
            System.out.println("| " + cont 
                            + " | " + producto.getNombre() 
                            + " | " + producto.getPrecio() 
                            + " | " + producto.getCantidadStock() 
                            + " | " + producto.getDescripcion() + " |");  
            cont++;  
        }
        System.out.println("|-------------------------------------------------------------------------------|");

    }

}
