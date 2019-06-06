/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import model.Pedido;
import service.PedidoService;

/**
 *
 * @author jeanfernandes
 */
@ManagedBean
@ViewScoped
public class MBPedido {
    
    private PedidoService service;
    private List<Pedido> pedidos = null;

    public MBPedido() {
    }
    
    @PostConstruct
    public void aposConstruir() {
        
    }
    
    private void preencherObjetos() {
        
    }

    public PedidoService getService() {
        return service;
    }

    public void setService(PedidoService service) {
        this.service = service;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    
    
}
