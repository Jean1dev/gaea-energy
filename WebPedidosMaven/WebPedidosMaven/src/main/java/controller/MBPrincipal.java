/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import service.ProdutoService;

/**
 *
 * @author jeanfernandes
 */
@ManagedBean
@Named(value = "mBPrincipal")
@ViewScoped
public class MBPrincipal {
    
    private String APPLICATION_TITLE = "Pedidos";
    /**
     * Creates a new instance of MBPrincipal
     */
    public MBPrincipal() {
    }
    
    @PostConstruct
    public void aposConstruir() {
        
    }

    public String getAPPLICATION_TITLE() {
        return APPLICATION_TITLE;
    }

    public void setAPPLICATION_TITLE(String APPLICATION_TITLE) {
        this.APPLICATION_TITLE = APPLICATION_TITLE;
    }
    
}
