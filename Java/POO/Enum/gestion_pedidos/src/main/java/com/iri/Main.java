package com.iri;

import com.iri.servicios.ServPedido;

public class Main {
    public static void main(String[] args) {
        ServPedido servPedido = new ServPedido();
        
        servPedido.gestionPedidos();
    }
}