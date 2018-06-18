/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import app.JPA;
import controller.MBGeneral;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author jeanfernandes
 */
public class RepositoryGeneral {

    EntityManager Entity = JPA.getEM();

    public void salvar() {
        try {
            EntityTransaction t = Entity.getTransaction();
            t.begin();
            Entity.merge(this);
            t.commit();
        } catch (Exception ex) {
            Logger.getLogger(MBGeneral.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void excluir() {
        try {
            EntityTransaction t = Entity.getTransaction();
            t.begin();
            Entity.remove(this);
            t.commit();
        } catch (Exception e) {

        }
    }

    public void selecionarRegistro(Integer codigo) {
        Entity.find(this.getClass(), codigo);
    }
}
