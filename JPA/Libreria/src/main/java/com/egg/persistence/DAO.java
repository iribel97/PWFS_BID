package com.egg.persistence;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class DAO<T> {
    EntityManagerFactory EMF = Persistence.createEntityManagerFactory("Libreria");
    EntityManager em = EMF.createEntityManager();
    
    public void conectar(){
        if(!em.isOpen()){
            em = EMF.createEntityManager();
        }
    }
    
    public void desconectar(){
        if(em.isOpen()){
            em.close();
        }
    }
    
    public void guardar(T objetc) throws Exception{
        try {
            conectar();           
            em.getTransaction().begin();           
            em.persist(objetc);           
            em.getTransaction().commit();
                        
        } catch (Exception e) {
            if (em != null && em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw e;
        } finally {
            if (em != null) {
                desconectar();
            }
        }
    }
    
    public void eliminar(T objetc) throws Exception{
        try {
            conectar();           
            em.getTransaction().begin();           
            em.remove(em.merge(objetc));           
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null && em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw e;
        } finally {
            if (em != null) {
                desconectar();
            }
        }
    }
    
    public void modificar(T objetc) throws Exception{
        try {
            conectar();
            em.getTransaction().begin();           
            em.merge(objetc);           
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null && em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw e;
        } finally {
            if (em != null) {
                desconectar();
            }
        }
    }
}
