package com.egg.servicios;

import java.util.List;
import java.util.Scanner;

import com.egg.entidades.Autor;
import com.egg.persistence.AutorDAO;


public class AutorService {
    
    private final AutorDAO dao;
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    
    public AutorService() {
        this.dao = new AutorDAO();
    }

    
    public Autor crearAutor(String nombre) {
        Autor autor = new Autor();
        try {
            autor.setNombre(nombre);
            autor.setAlta(Boolean.TRUE);
            dao.guardar(autor);
            return autor;
        } catch (Exception e) {
            System.out.println("Error al crear autor: " + e.getMessage());
            return null;
        }
    }
    
    public boolean eliminarAutor(Integer id){
        try {
            Autor autor = dao.buscarAutorPorId(id);
            if (autor != null) {
                dao.eliminar(autor);
                return true;
            } else {
                System.out.println("Autor no encontrado.");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error al eliminar autor: " + e.getMessage());
            return false;
        }
    }
    
    public void modificarAutor() {
        try {
            System.out.print("INGRESE ID DEL AUTOR: ");
            Autor aux = buscarAutorPorId(Integer.parseInt(leer.nextLine()));
            if (aux != null) {
                System.out.print("INGRESE NOMBRE: ");
                aux.setNombre(leer.nextLine());
                dao.modificar(aux);
                System.out.println("AUTOR EDITADO");
            } else {
                System.out.println("AUTOR NO ENCONTRADO");
            }

            dao.modificar(aux);
        } catch (Exception e) {
            System.out.println("Error al modificar autor: " + e.getMessage());
        }
    }
    
    
    public Autor buscarAutorPorId(Integer id) {
        try {
            return dao.buscarAutorPorId(id);
        } catch (Exception e) {
            System.out.println("No existe el autor: " + e.getMessage());
            return null;
        }
    }
    
    public void darAutorDeAlta(Integer id) {
        try {
            Autor autor = buscarAutorPorId(id);
            if (autor != null) {
                if (!autor.getAlta()) {
                    autor.setAlta(true);
                    dao.modificar(autor);
                    System.out.println("Autor dado de alta con éxito!");
                } else {
                    System.out.println("El autor ya está dado de alta en el sistema.");
                }
            } else {
                System.out.println("Autor no encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Error al dar de alta al autor: " + e.getMessage());
        }
    }
    public void darAutorDeBaja(Integer id) {
        try {
            Autor autor = buscarAutorPorId(id);
            if (autor != null) {
                if (autor.getAlta()) {
                    autor.setAlta(false);
                    dao.modificar(autor);
                    System.out.println("Autor dado de baja con éxito!");
                } else {
                    System.out.println("El autor ya está dado de baja en el sistema.");
                }
            } else {
                System.out.println("Autor no encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Error al dar de baja al autor: " + e.getMessage());
        }
    }
    
    public Autor buscarPorNombre(String nombreAutor) {
        try {
            return dao.buscarAutorPorNombre(nombreAutor);
        } catch (Exception e) {
            System.out.println("No existe el autor: " + e.getMessage());
            return null;
        }
    }
    
    public List<Autor> listarAutores() {
        try {
            return dao.listarAutores();
        } catch (Exception e) {
            System.out.println("Error al listar autores: " + e.getMessage());
            return null;
        }
    }
}
