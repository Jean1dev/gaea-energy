/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import app.JPA;
import entity.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Lurian V. Serafim
 */
public class ClienteRepository extends RepositoryGeneral {

    public List<Cliente> getAll() {
        List<Cliente> lista = null;

        try {
            Query q = this.Entity.createQuery("select object(m) from Cliente as m");
            lista = q.getResultList();
        } catch (Exception e) {
            System.out.println(e);
        }

        return lista;
    }
    
      public Cliente findByName(String nome) {
        EntityManager em = JPA.getEM();
        TypedQuery<Cliente> query = em.createQuery("select x from Cliente x where x.nome = :cod", Cliente.class);
        query.setParameter("cod", nome);
        Cliente ret = query.getSingleResult();
        return ret;
    }
}
