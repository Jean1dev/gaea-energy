/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import app.JPA;
import entity.Produto;
import javax.persistence.EntityManager;

/**
 *
 * @author Lurian V. Serafim
 */
public class ProdutoRepository extends RepositoryGeneral {

    public Produto getProduto(Integer codigo) {
        EntityManager em = JPA.getEM();
        /*TypedQuery<Produto> query = em.createQuery("select x from Produto x where x.codigo = :cod", Produto.class);
        query.setParameter("cod", codigo);
        return query.getSingleResult();*/
        return em.find(Produto.class, codigo);
    }
}
