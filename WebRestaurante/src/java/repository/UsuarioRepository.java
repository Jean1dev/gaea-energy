/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import app.JPA;
import entity.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Lurian V. Serafim
 */
public class UsuarioRepository extends RepositoryGeneral {

    public List<Usuario> getAll() {
        List<Usuario> lista = null;

        try {
            Query q = this.Entity.createQuery("select object(m) from Usuario as m");
            lista = q.getResultList();
        } catch (Exception e) {
            System.out.println(e);
        }

        return lista;
    }

    public Usuario findByName(String nome) {
        EntityManager em = JPA.getEM();
        TypedQuery<Usuario> query = em.createQuery("select x from Usuario x where x.nome = :cod", Usuario.class);
        query.setParameter("cod", nome);
        Usuario ret = query.getSingleResult();
        return ret;

    }
}
