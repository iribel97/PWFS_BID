package com.egg.proyectoprueba.controlador;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MiControlador {

    @GetMapping("/")
    public String mostrarPagina() {
        return "index"; 
    }
}
