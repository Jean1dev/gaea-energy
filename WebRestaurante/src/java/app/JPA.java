/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.persistence.*;

/**
 *
 * @author jeanfernandes
 */
public class JPA {

    public static EntityManagerFactory emf;

    public static EntityManager getEM() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory(
                    "WebRestaurante");
        }

        return emf.createEntityManager();
    }
}
