/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Usuario;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author jeanfernandes
 */
@ManagedBean
@ViewScoped
public class MBUsuario extends MBGeneral {
    
    private Usuario user;

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    @Override
    public boolean gravarRegistro() {
       this.user.salvar();
       return true;
    }
    
    

    @PostConstruct
    @Override
    public void novoRegistro() {
        //super.novoRegistro(); //To change body of generated methods, choose Tools | Templates.
        this.user = new Usuario();
    }

    
    public MBUsuario() {
    }
    
    
}
