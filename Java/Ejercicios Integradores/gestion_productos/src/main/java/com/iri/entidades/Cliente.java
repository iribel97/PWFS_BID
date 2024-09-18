package com.iri.entidades;

import java.util.ArrayList;
import java.util.List;

import com.iri.exceptions.ProductoAgotadoException;

public class Cliente {

    // Atributos
    private List<ItemCarrito> carrito = new ArrayList<ItemCarrito>();
    private double totalPagar;

    // Constructor
    public Cliente() {}

    public Cliente(List<ItemCarrito> carrito, double totalPagar) {
        this.carrito = carrito;
        this.totalPagar = totalPagar;
    }

    // Getter y Setter
    public List<ItemCarrito> getCarrito() {
        return this.carrito;
    }

    public double getTotalPagar() {
        return this.totalPagar;
    }

    public void setCarrito(List<ItemCarrito> carrito) {
        this.carrito = carrito;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    /*
     * METODOS
     */

    // Metodo para agregar un producto al carrito
    public void agregarCarrito(ItemCarrito item) throws ProductoAgotadoException {
        // Verificar si hay stock
        item.getProducto().reducirStock(item.getCantidad());

        // Agregar producto al carrito
        carrito.add(item);

        // Actualizar total a pagar
        totalPagar += item.getProducto().calcularPrecio(item.getDescuento());

        System.out.println("Producto agregado al carrito con exito");
    }

    // Metodo para ver carrito
    public void verCarrito() {

        if (carrito.isEmpty()) {
            System.out.println("El carrito está vacío.");
            return;
        }
        
        System.out.println("|------------------------------------------------------------|\n"
                + "|                     CARRITO DE COMPRAS                     |\n"
                + "|------------------------------------------------------------|\n"
                + "|_______Producto______|_Cantidad_|_Precio Unitario_|__Total__|");

        for (ItemCarrito item : carrito) {
            System.out.println("| " + item.getProducto().getNombre() 
                            + " | " + item.getCantidad() 
                            + " | " + item.getProducto().getPrecio() 
                            + " | " + item.getProducto().calcularPrecio(item.getDescuento())+ " |");
        }

        System.out.println("|------------------------------------------------------------|");
        System.out.println("Total a pagar: " + totalPagar); 
    }

    // Metodo para realizar la compra
    public void realizarCompra() {
        verCarrito();
        carrito.clear();
        System.out.println("Compra realizada con éxito.");
    }

}
