package com.egg.persistence;

import java.util.List;

import com.egg.entidades.Editorial;

import jakarta.persistence.NoResultException;


public class EditorialDAO extends DAO<Editorial>{
    

    @Override    
    public void guardar(Editorial editorial) throws Exception{
        super.guardar(editorial);
    }
    
    public void eliminar(Integer id) throws Exception{
        Editorial editorial = buscarEditorialPorId(id);
        if (editorial != null) {
            super.eliminar(editorial);
        } else {
            throw new Exception("Editorial no encontrada para el id: " + id);
        }
    }
    
    @Override
    public void modificar(Editorial editorial) throws Exception{
        super.modificar(editorial);
    }
    
    
    public Editorial buscarEditorialPorId(Integer id) throws Exception{
        Editorial editorial = null;
        try {
            conectar();
            editorial = em.find(Editorial.class, id);
        } catch (NoResultException e) {
            System.out.println("Editorial no encontrada: " + id);
        } catch (Exception e) {
            e.printStackTrace(); // Para depuración
        } finally {
            desconectar(); // Asegúrate de cerrar el EntityManager al final
        }
        return editorial;
    }
    
    public List<Editorial> listarEditoriales(){
        List<Editorial> editoriales = null;
        try {
            conectar();
            editoriales = em.createQuery("SELECT a FROM Editorial a", Editorial.class)
                            .getResultList();
        } catch (NoResultException e) {
            // Manejar el caso en que no se encuentra el autor
            System.out.println("No se encontraron editoriales");
        } catch (Exception e) {
            e.printStackTrace(); // Para depuración
        } finally {
            desconectar();
        }
            
        
        return editoriales;
        
    }
    
    public Editorial buscarEditorialPorNombre(String nombre) throws Exception{
        Editorial editorial = null;
        try {
            conectar();
            editorial = (Editorial) em.createQuery("SELECT a FROM Editorial a JOIN FETCH a.libroCollection WHERE LOWER(a.nombre) LIKE LOWER(:nombre)")
                    .setParameter("nombre", "%" + nombre + "%")
                    .getSingleResult();  
        } catch (Exception e) {
            System.out.println("Editorial no encontrada: " + nombre);
            e.printStackTrace(); // Para depuración
        } finally {
            desconectar(); // Asegúrate de cerrar el EntityManager al final
        }
        return editorial;
    } 
}

