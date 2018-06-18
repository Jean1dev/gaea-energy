/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Mesa;
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
public class MBMesa extends MBGeneral {

    private Mesa mesa;
    private List<Mesa> mesas;
    private String nmSituacao;

    public MBMesa() {
        this.ObjectControll = "mesa";
    }

    public void atualizarLista() {
        this.mesas = mesa.getAll();
    }

    @PostConstruct
    @Override
    public void novoRegistro() {
        this.mesa = new Mesa();
        this.atualizarLista();
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public List<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(List<Mesa> mesas) {
        this.mesas = mesas;
    }
  
    public String getNmSituacao() {
        if (this.mesa.isAberta()){
            this.nmSituacao = "aberto";
        }else{
            this.nmSituacao = "fechada";
        }
        return nmSituacao;
    }
    
    @Override
    public boolean excluirRegistro(){
        this.mesa.excluir(this.mesa);
        return true;
    }
    
    public void excluir(Mesa mesa){
        this.setMesa(mesa);
        this.excluir();
    }
}
