/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Produto;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author jeanfernandes
 */
@ManagedBean
@ViewScoped
public class MBProduto extends MBGeneral{
    
    private Produto produto;
    
    @Override
    public void novoRegistro(){
        this.produto = new Produto();
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    @Override
    public boolean gravarRegistro(){
        this.produto.salvar();
        return true;
    }

    public MBProduto() {
    }
    
    @PostConstruct
    public void aposConstruc(){
        this.novoRegistro();
    }
}
