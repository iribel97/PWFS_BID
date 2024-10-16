package com.egg.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity // Declaro una clase como entidad
@Table(name = "detalle_pedido") // Especifico como quiero llamar la tabla.
public class DetallePedido {
    // Generacion y declaración del id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = " id_detalle_pedido")
    private int idDetallePedido;

    @ManyToOne // Defino que "tipo de relacion"
    @JoinColumn(name = "id_pedido") // Establezco la relacion con Pedido. Indico con que "dato se relacionan".
    private Pedido pedido;

    @ManyToOne// Defino que "tipo de relacion"."Muchos detalles de pedido podriane star relacionados a un producto"
    @JoinColumn(name = "id_producto") // Establezco la relacion con Producto. Indico con que "dato se relacionan".
    private Producto Producto;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "precio_unidad")
    private double precioUnidad;

    @Column(name = "numero_linea")
    private int numeroLinea;

    // Constructor Vacio
    public DetallePedido() {
    }

    // Getter y Setter
    public int getIdDetallePedido() {
        return idDetallePedido;
    }

    public void setIdDetallePedido(int idDetallePedido) {
        this.idDetallePedido = idDetallePedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return Producto;
    }

    public void setProducto(Producto producto) {
        Producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public int getNumeroLinea() {
        return numeroLinea;
    }

    public void setNumeroLinea(int numeroLinea) {
        this.numeroLinea = numeroLinea;
    }

}
