package com.egg.casaElectricidad.controladores;

import com.egg.casaElectricidad.entidades.Articulo;
import com.egg.casaElectricidad.entidades.Fabrica;
import com.egg.casaElectricidad.servicios.ArticuloServicio;
import com.egg.casaElectricidad.servicios.FabricaServicio;
import com.egg.casaElectricidad.excepciones.MiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/articulo")
public class ArticuloControlador {

    @Autowired
    private ArticuloServicio articuloServicio;

    @Autowired
    private FabricaServicio fabricaServicio;

    @GetMapping("/lista")
    public String listar(ModelMap modelo) {
        List<Articulo> articulos = articuloServicio.obtenerTodosLosArticulos();
        modelo.addAttribute("articulos", articulos);
        return "articulo/lista";
    }

    @GetMapping("/registrar")
    public String registrar(ModelMap modelo) {
        List<Fabrica> fabricas = fabricaServicio.listarFabricas();
        modelo.addAttribute("fabricas", fabricas);
        return "articulo/registro";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam String nombre, @RequestParam String descripcion,
                           @RequestParam String idFabrica, @RequestParam(required = false) MultipartFile imagen,
                           ModelMap modelo) {
        try {
            Fabrica fabrica = new Fabrica();
            fabrica = fabricaServicio.getOne(UUID.fromString(idFabrica));
            articuloServicio.guardarArticulo(nombre, descripcion, fabrica);
            modelo.put("exito", "El artículo fue registrado exitosamente");
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            return "redirect:/articulo/registrar";
        }
        return "redirect:/articulo/lista";
    }

    @GetMapping("/modificar/{id}")
    public String modificar(@PathVariable UUID id, ModelMap modelo) {
        try {
            modelo.addAttribute("articulo", articuloServicio.obtenerArticuloPorId(id));
            modelo.addAttribute("fabricas", fabricaServicio.listarFabricas());
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
        }
        return "articulo/modificar";
    }

    @PostMapping("/modificar/{id}")
    public String modificar(@PathVariable UUID id, @RequestParam String nombre,
                            @RequestParam String descripcion, @RequestParam String idFabrica,
                            ModelMap modelo) {
        try {
            Articulo articulo = new Articulo();
            Fabrica newFabrica = fabricaServicio.getOne(UUID.fromString(idFabrica));
            articulo = articuloServicio.obtenerArticuloPorId(id);
            articulo.setNombreArticulo(nombre);
            articulo.setDescripcionArticulo(descripcion);
            articulo.setFabrica(newFabrica);
            articuloServicio.actualizarArticulo(articulo);
            modelo.put("exito", "El artículo fue modificado exitosamente");
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
        }
        return "redirect:/articulo/lista";
    }

    @PostMapping("/eliminar/{id}")
    public String eliminar(@PathVariable UUID id, ModelMap modelo) {
        articuloServicio.eliminarArticulo(id);
        modelo.put("exito", "El artículo fue eliminado exitosamente");
        return "redirect:/articulo/lista";
    }
}
