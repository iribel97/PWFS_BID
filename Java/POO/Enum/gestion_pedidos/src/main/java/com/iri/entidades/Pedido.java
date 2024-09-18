package com.iri.entidades;

import java.util.ArrayList;

import com.iri.enums.EstadoPedido;

public class Pedido {

    //Atributos
    private int numPedido;
    private String cliente;
    private ArrayList<String> listaProductos;
    private EstadoPedido estado;

    //Constructores
    public Pedido() {}

    public Pedido(int numPedido, String cliente, ArrayList<String> listaProductos, EstadoPedido estado) {
        this.numPedido = numPedido;
        this.cliente = cliente;
        this.listaProductos = listaProductos;
        this.estado = estado;
    }

    // Getters y Setters
    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public ArrayList<String> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<String> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    //Getters y Setters
    

}
