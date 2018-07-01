/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import app.JPA;
import entity.Produto;
import entity.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

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

    public List<Produto> getAll() {
        List<Produto> lista = null;

        try {
            Query q = this.Entity.createQuery("select object(m) from Produto as m");
            lista = q.getResultList();
        } catch (Exception e) {
            System.out.println(e);
        }

        return lista;
    }

    public Produto findByName(String nome) {
        Produto p = null;
        List<Produto> list = null;
        String sql = "select object(m) from Produto as m where m.nome = "+ "'" +nome+ "'";
        
        try {
            Query q = this.Entity.createQuery(sql);
            list = q.getResultList();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        for(Produto i: list){
            p = this.getProduto(i.getIdProduto());
        }

        return p;
    }
}
