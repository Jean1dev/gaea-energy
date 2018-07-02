/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Mesa;
import ferramentas.MessagesView;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.DataModel;

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

//    private DataModel<Mesa> data;
    public MBMesa() {
        this.ObjectControll = "mesa";
    }

    public void addMessage() {
        String summary = this.mesa.isAberta() ? "Checked" : "Unchecked";
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(summary));
    }

    public void atualizarLista() {
        this.mesas = mesa.getAll();
//        this.data = (DataModel<Mesa>) mesa.getAll();
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
        if (this.mesa.isAberta()) {
            this.nmSituacao = "aberto";
        } else {
            this.nmSituacao = "fechada";
        }
        return nmSituacao;
    }

    @Override
    public boolean excluirRegistro() {
        this.mesa.excluir(this.mesa);
        return true;
    }

    public void excluir(Mesa mesa) {
        this.setMesa(mesa);
        this.excluir();
    }

    @Override
    public boolean gravarRegistro() {
        this.mesa.salvar(this.mesa);
        MessagesView.info();
        return true;
    }

    public void teste() {

//     this.mesa = this.data.getRowData();
    }

//    public DataModel<Mesa> getData() {
//        return data;
//    }
//
//    public void setData(DataModel<Mesa> data) {
//        this.data = data;
//    }
//    
}
