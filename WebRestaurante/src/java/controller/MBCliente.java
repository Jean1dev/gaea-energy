/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Cliente;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author jeanfernandes
 */
@ManagedBean
@ViewScoped
public class MBCliente extends MBGeneral {

    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @PostConstruct
    @Override
    public void novoRegistro() {
        super.novoRegistro(); //To change body of generated methods, choose Tools | Templates.
        this.cliente = new Cliente();
    }

    @Override
    public boolean gravarRegistro() {
        this.cliente.salvar();
        return true;
    }

    public MBCliente() {
    }

}
