package com.egg.casaElectricidad.controladores;

import com.egg.casaElectricidad.entidades.Fabrica;
import com.egg.casaElectricidad.servicios.FabricaServicio;
import com.egg.casaElectricidad.excepciones.MiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/fabrica")
public class FabricaControlador {

    @Autowired
    private FabricaServicio fabricaServicio;

    @GetMapping("/lista")
    public String listar(ModelMap modelo) {
        List<Fabrica> fabricas = fabricaServicio.listarFabricas();
        modelo.addAttribute("fabricas", fabricas);
        return "fabrica/lista";
    }

    @GetMapping("/registrar")
    public String registrar() {
        return "fabrica/registro";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam String nombreFabrica, ModelMap modelo) {
        try {
            fabricaServicio.crear(nombreFabrica);
            modelo.put("exito", "La fábrica fue registrada exitosamente");
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            return "redirect:/fabrica/registrar";
        }
        return "redirect:/fabrica/lista";
    }

    @GetMapping("/modificar/{id}")
    public String modificar(@PathVariable UUID id, ModelMap modelo) {
        try {
            modelo.addAttribute("fabrica", fabricaServicio.getOne(id));
        } catch (MiException ex) {
            modelo.addAttribute("error", ex.getMessage());
        }
        return "fabrica/modificar";
    }

    @PostMapping("/modificar/{id}")
    public String modificar(@PathVariable UUID id, @RequestParam String nombreFabrica,
                            ModelMap modelo) {
        try {
            fabricaServicio.actualizar(id, nombreFabrica);
            modelo.put("exito", "La fábrica fue modificada exitosamente");
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
        }
        return "redirect:/fabrica/lista";
    }

    @PostMapping("/eliminar/{id}")
    public String eliminar(@PathVariable UUID id, ModelMap modelo) {
        try {
            fabricaServicio.eliminar(id);
            modelo.put("exito", "La fábrica fue eliminada exitosamente");
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
        }
        return "redirect:/fabrica/lista";
    }
}
