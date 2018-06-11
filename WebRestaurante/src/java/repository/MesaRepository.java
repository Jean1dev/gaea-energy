/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import entity.Mesa;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author jeanfernandes
 */
public class MesaRepository extends RepositoryGeneral {
    
    public List<Mesa> getAll(){
        List<Mesa> lista = null;
        
        try{
            Query q = this.Entity.createQuery("select object(m) from Mesa as m");
            lista = q.getResultList();
        }catch(Exception e){
            System.out.println(e);
        }
        
        return lista;
    }
}
