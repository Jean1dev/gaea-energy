/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
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
    
    private String teste = "beanok";
    private ProdutoService service;

    public String getTeste() {
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste;
    }
    
    /**
     * Creates a new instance of MBPrincipal
     */
    public MBPrincipal() {
    }
    
    @PostConstruct
    public void aposConstruir() {
        service = new ProdutoService();
        service.getAll();
    }
}
