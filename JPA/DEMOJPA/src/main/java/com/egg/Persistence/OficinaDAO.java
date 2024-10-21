package com.egg.Persistence;

import com.egg.Entidades.Oficina;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class OficinaDAO {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("ViveroPU");
    private final EntityManager em = emf.createEntityManager();

    public void guardarOficina(Oficina oficina) throws Exception{
        em.getTransaction().begin();
        em.persist(oficina);
        em.getTransaction().commit();
    }

    public void actualizarOficina(Oficina newOficina){
        em.getTransaction().begin();
        em.merge(newOficina);
        em.getTransaction().commit();
    }

    public Oficina buscarOficina(int id){
        return em.find(Oficina.class, id);
    }

    public void eliminarOficina(int id) throws Exception{
        Oficina oficina = buscarOficina(id);
        em.getTransaction().begin();
        em.remove(oficina);
        em.getTransaction().commit();
    }

}
