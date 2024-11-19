package com.egg.casaElectricidad.servicios;


import com.egg.casaElectricidad.entidades.Imagen;
import com.egg.casaElectricidad.entidades.Usuario;
import com.egg.casaElectricidad.enumeraciones.Rol;
import com.egg.casaElectricidad.excepciones.MiException;
import com.egg.casaElectricidad.repositorios.UsuarioRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import jakarta.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UsuarioServicio{
// public class UsuarioServicio implements UserDetailsService {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    
    @Autowired
    private ImagenServicio imagenServicio;
    

    @Transactional
    public void registrar(MultipartFile archivo, String nombre, String email, String password, String password2) throws MiException {

        validar(nombre, email, password, password2);

        Usuario usuario = new Usuario();

        usuario.setNombre(nombre);
        usuario.setEmail(email);
        usuario.setPassword(new BCryptPasswordEncoder().encode(password));
        usuario.setRol(Rol.USER);
        
        Imagen imagen = imagenServicio.guardar(archivo);

        usuario.setImagen(imagen);
        
        usuarioRepositorio.save(usuario);
    }

    @Transactional
    public void actualizar(MultipartFile archivo, UUID idUsuario, String nombre, String email, String password, String password2) throws MiException {

        validar(nombre, email, password, password2);

        Optional<Usuario> respuesta = usuarioRepositorio.findById(idUsuario);
        if (respuesta.isPresent()) {

            Usuario usuario = respuesta.get();
            usuario.setNombre(nombre);
            usuario.setEmail(email);

            usuario.setPassword(new BCryptPasswordEncoder().encode(password));

            usuario.setRol(Rol.USER);
            
            UUID idImagen = null;
            
            if (usuario.getImagen() != null) {
                idImagen = usuario.getImagen().getId();
            }
            
            Imagen imagen = imagenServicio.actualizar(idImagen, archivo);
            
            usuario.setImagen(imagen);
            
            usuarioRepositorio.save(usuario);
        }

    }
    
    public Usuario getOne(UUID id){
        Optional<Usuario> usuarioOpt = usuarioRepositorio.findById(id);
    
        if (usuarioOpt.isPresent()) {
            return usuarioOpt.get();
        } else {
            // Maneja el caso en que no se encuentre el usuario, por ejemplo, devolviendo null
            return null;
        }
    }
    
    @Transactional(readOnly=true)
    public List<Usuario> listarUsuarios() {

        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios = usuarioRepositorio.findAll();
        return usuarios;
    }
    
    @Transactional
    public void cambiarRol(UUID id){
        Optional<Usuario> respuesta = usuarioRepositorio.findById(id);

        if(respuesta.isPresent()) {

            Usuario usuario = respuesta.get();
        if(usuario.getRol().equals(Rol.USER)) {
            usuario.setRol(Rol.ADMIN);
        }else if(usuario.getRol().equals(Rol.ADMIN)) {
                usuario.setRol(Rol.USER);
            }
        }
    }
    
    private void validar(String nombre, String email, String password, String password2) throws MiException {

        if (nombre.isEmpty() || nombre == null) {
            throw new MiException("el nombre no puede ser nulo o estar vacío");
        }
        if (email.isEmpty() || email == null) {
            throw new MiException("el email no puede ser nulo o estar vacio");
        }
        if (password.isEmpty() || password == null || password.length() <= 5) {
            throw new MiException("La contraseña no puede estar vacía, y debe tener más de 5 dígitos");
        }

        if (!password.equals(password2)) {
            throw new MiException("Las contraseñas ingresadas deben ser iguales");
        }

    }

    // @Override
    // public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

    //     Usuario usuario = usuarioRepositorio.buscarPorEmail(email);

    //     if (usuario != null) {
    //         List<GrantedAuthority> permisos = new ArrayList<GrantedAuthority>();
    //         GrantedAuthority p = new SimpleGrantedAuthority("ROLE_" + usuario.getRol().toString());
    //         permisos.add(p);
    //         ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
    //         HttpSession session = attr.getRequest().getSession(true);
    //         session.setAttribute("usuariosession", usuario);
    //         return new User(usuario.getEmail(), usuario.getPassword(), permisos);
    //     } else {
    //         return null;
    //     }
    // }

}

