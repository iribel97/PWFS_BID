package com.egg.persistence;

import java.util.List;

import com.egg.entidades.Autor;

import jakarta.persistence.NoResultException;


public class AutorDAO extends DAO<Autor>{

    @Override    
    public void guardar(Autor autor) throws Exception{
        super.guardar(autor);
    }
    
    public void eliminar(Integer id) throws Exception{
        Autor autor = buscarAutorPorId(id);
        if (autor != null) {
            super.eliminar(autor);
        } else {
            throw new Exception("Autor no encontrado para el id: " + id);
        }
    }
    
    @Override
    public void modificar(Autor autor) throws Exception{
        super.modificar(autor);
    }
    
    public Autor buscarAutorPorId(Integer id) throws Exception{
        Autor autor = null;
        try {
            conectar();
            autor = em.find(Autor.class, id);
        } catch (NoResultException e) {
            // Manejar el caso en que no se encuentra el autor
            System.out.println("Autor no encontrado: " + id);
        } catch (Exception e) {
            e.printStackTrace(); // Para depuración
        } finally {
            desconectar(); // Asegúrate de cerrar el EntityManager al final
        }
        return autor;
    }
    
    public List<Autor> listarAutores(){
        List<Autor> autores = null;
        try {
            conectar();        
            autores = em.createQuery("SELECT a FROM Autor a", Autor.class)
                        .getResultList();
        } catch (NoResultException e) {
            // Manejar el caso en que no se encuentra el autor
            System.out.println("No se encontraron autores");
        } catch (Exception e) {
            e.printStackTrace(); // Para depuración
        } finally {
            desconectar();
        }
        return autores;
    }
    
    public Autor buscarAutorPorNombre(String nombre) {
        Autor autor = null;
        try{
            conectar();
            autor = (Autor) em.createQuery("SELECT a FROM Autor a JOIN FETCH a.libroCollection WHERE a.nombre LIKE :nombre")
                        .setParameter("nombre", "%" + nombre + "%")
                        .getSingleResult();
        } catch (Exception e) {
            System.out.println("Autor no encontrado: " + nombre);
            e.printStackTrace(); // Para depuración
        } finally {
            desconectar(); // Asegúrate de cerrar el EntityManager al final
        }
        return autor;
    }
}
