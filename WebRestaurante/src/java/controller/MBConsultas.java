/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Cliente;
import entity.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author jeanfernandes
 */
@ManagedBean
@ViewScoped
public class MBConsultas extends MBGeneral {

    private List<Cliente> listaCliente = new ArrayList<>();
    private List<Produto> listaProduto = new ArrayList<>();

    public MBConsultas() {

    }

    @PostConstruct
    public void init() {
        Cliente cli = new Cliente();
        Produto pr = new Produto();
        this.listaCliente = cli.getAll();
        this.listaProduto = pr.getAll();
    }

    public List<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public List<Produto> getListaProduto() {
        return listaProduto;
    }

    public void setListaProduto(List<Produto> listaProduto) {
        this.listaProduto = listaProduto;
    }

}
