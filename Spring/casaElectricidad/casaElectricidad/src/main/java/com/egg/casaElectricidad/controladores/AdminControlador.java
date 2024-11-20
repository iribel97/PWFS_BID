package com.egg.casaElectricidad.controladores;

import com.egg.casaElectricidad.entidades.Usuario;
import com.egg.casaElectricidad.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.access.prepost.PreAuthorize;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/admin")
@PreAuthorize("hasRole('ADMIN')")
public class AdminControlador {

    @Autowired
    private UsuarioServicio usuarioServicio;

    @GetMapping("/dashboard")
    public String dashboard(ModelMap modelo) {
        return "admin/dashboard";
    }

    @GetMapping("/usuarios")
    public String listarUsuarios(ModelMap modelo) {
        List<Usuario> usuarios = usuarioServicio.listarUsuarios();
        modelo.addAttribute("usuarios", usuarios);
        return "admin/usuarios";
    }

    @PostMapping("/usuarios/{id}/rol")
    public String cambiarRol(@PathVariable String id) {
        usuarioServicio.cambiarRol(UUID.fromString(id));
        return "redirect:/admin/usuarios";
    }

    @GetMapping("/reportes")
    public String reportes(ModelMap modelo) {
        // Aquí agregarías la lógica para generar reportes
        return "admin/reportes";
    }

    @GetMapping("/configuracion")
    public String configuracion() {
        return "admin/configuracion";
    }
}