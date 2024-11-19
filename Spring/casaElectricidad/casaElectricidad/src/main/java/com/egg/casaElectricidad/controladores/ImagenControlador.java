package com.egg.casaElectricidad.controladores;

import com.egg.casaElectricidad.entidades.Usuario;
import com.egg.casaElectricidad.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.UUID;

@Controller
@RequestMapping("/imagen")
public class ImagenControlador {
    
    @Autowired
    UsuarioServicio usuarioServicio;
    
    @GetMapping("/perfil/{id}")
    public ResponseEntity<byte[]> imagenUsuario (@PathVariable UUID id){
        Usuario usuario = usuarioServicio.getOne(id);
        
        byte[] imagen= usuario.getImagen().getContenido();
        
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        return new ResponseEntity<>(imagen,headers, HttpStatus.OK); 
    }
}

