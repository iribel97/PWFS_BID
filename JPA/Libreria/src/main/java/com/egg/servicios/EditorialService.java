package com.egg.servicios;

import java.util.List;
import java.util.Scanner;

import com.egg.entidades.Editorial;
import com.egg.persistence.EditorialDAO;


public class EditorialService {
    private final EditorialDAO dao;
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    
    public EditorialService(){
        this.dao = new EditorialDAO();
    }

    public Editorial crearEditorial(String nombre) {

        Editorial editorial = new Editorial();
        try {
            editorial.setNombre(nombre);
            editorial.setAlta(Boolean.TRUE);
            dao.guardar(editorial);
            return editorial;
        } catch (Exception e) {
            return null;
        }
    }
    
    public void modificarEditorial() {
        try {            
            System.out.print("INGRESE NOMBRE DE LA EDITORIAL: ");
            Editorial aux = buscarEditorialPorNombre(leer.nextLine());
            if (aux != null) {
                System.out.println("/// INGRESE LA NUEVA EDITORIAL ///");
                System.out.print("INGRESE NOMBRE: ");
                aux.setNombre(leer.nextLine());
                System.out.println("EDITORIAL MODIFICADA");
            } else {
                System.out.println("EDITORIAL NO ENCONTRADA");
            }

            dao.modificar(aux);
            
        } catch (Exception e) {
            System.out.println("Algo anda mal");
        }
    }
    
    public boolean eliminarEditorial(Integer id){
        try {
            Editorial editorial = dao.buscarEditorialPorId(id);
            dao.eliminar(editorial);
            return true;
        } catch (Exception e) {
            System.out.println("Algo anda mal");
            return false;
        }
    }
    
//    public Editorial buscarEditorialPorNombreAutor(String nombre) throws Exception{
//        try {
//            Editorial buscarPorNombre = dao.buscarEditorialPorNombre(nombre);
//            return buscarPorNombre;
//        } catch (Exception e) {
//            System.out.println("No existe el autor");
//            return null;
//        }
//    }
    
    public Editorial buscarEditorialPorNombre(String nombre) throws Exception{
        try {
            Editorial buscarPorNombre = dao.buscarEditorialPorNombre(nombre);
            return buscarPorNombre;
        } catch (Exception e) {
            System.out.println("No existe el autor");
            return null;
        }
    }
    
    public List<Editorial> listarEditorial() {
        try {
            return dao.listarEditoriales();
        } catch (Exception e) {
            return null;
        }
    }
    
    
}
