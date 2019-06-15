/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import model.Produto;
import service.ProdutoService;

/**
 *
 * @author jeanfernandes
 */
@Named(value = "mBConsultaProduto")
@ManagedBean
@ViewScoped
public class MBConsultaProduto {

    private List<Produto> listaProduto = new ArrayList<>();
    /**
     * Creates a new instance of MBConsultaProduto
     */
    public MBConsultaProduto() {
    }
    
    @PostConstruct
    public void aposConstruir() {
        //ProdutoService service = new ProdutoService();
        //listaProduto = service.getAll();
        //listar();
        _listar();
    }
    
    public void listar() {
        listaProduto = new ProdutoService().getAll();
    }
    
    public void _listar(){
        ProdutoService service = new ProdutoService();
        listaProduto = service.getAll(); 
    }

    public List<Produto> getListaProduto() {
        return listaProduto;
    }

    public void setListaProduto(List<Produto> listaProduto) {
        this.listaProduto = listaProduto;
    }
    
    
}
