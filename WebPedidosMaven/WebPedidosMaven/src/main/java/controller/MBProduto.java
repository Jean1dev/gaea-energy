/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ViewScoped;
import model.Produto;
import service.ProdutoService;

/**
 *
 * @author jeanfernandes
 */
@Named(value = "mBProduto")
@Dependent
@ViewScoped
public class MBProduto {

    public Produto produto;
    private ProdutoService service;

    public MBProduto() {
    }
    
    @PostConstruct
    public void aposContruir(){
        novoRegistro();
        service = new ProdutoService();
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }
    
    public void novoRegistro(){
        produto = new Produto();
    }
    
    public void gravarRegistro() {
        service.post(produto);
    }
    
    public void excluir(Produto p) {
        
    }
}
