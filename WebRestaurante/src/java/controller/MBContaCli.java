/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Cliente;
import entity.ContaCliente;
import entity.ItemContaCli;
import entity.Produto;
import entity.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author jeanfernandes
 */
@ManagedBean
//@ViewScoped
@ApplicationScoped
//@SessionScoped
public class MBContaCli extends MBGeneral {

    private ContaCliente contacli;
    private ItemContaCli itemSelecionado;
    private Cliente localCli;
    private Produto localProd;
    private Usuario localusu;

    // LISTAS
    private String[] cli;
    private String[] usu;
    private String[] prod;
    private List<String> listaCliente;
    private List<String> listaUsuario;
    private List<String> listaProduto;

    public void iniciaObjetos() {
        this.listaCliente = new ArrayList<>();
        this.listaProduto = new ArrayList<>();
        this.listaUsuario = new ArrayList<>();
        this.contacli = new ContaCliente();
        this.itemSelecionado = new ItemContaCli();
        this.localCli = new Cliente();
        this.localProd = new Produto();
        this.localusu = new Usuario();
    }

    @PostConstruct
    public void aposConstruir() {
        this.novoRegistro();
    }

    @Override
    public void novoRegistro() {
        this.iniciaObjetos();
        this.atualizaListas();
    }

    public void inserirItem() {
        String[] tal = this.getProd();
        this.itemSelecionado.setProduto(this.localProd.findByName(tal[0]));
        this.contacli.add(itemSelecionado);
        this.itemSelecionado = new ItemContaCli();
    }

    public void excluirItem(ItemContaCli i) {
        this.contacli.remove(i);
    }

    public void atualizaListas() {
        //this.listaCliente = this.contacli.getCliente().getAll();
        //this.listaCliente = this.lsCli.getAll();
        try {
            this.atualizaListaUsu();
            this.atualizaListaProd();
            this.atualizaListaCli();
        } catch (Exception e) {
            System.out.println("CAIU AKI");
            this.paraResolverCoisasEstranhas();
            //this.finalizar();
        }

    }

    @Override
    public boolean gravarRegistro() {
       // return super.gravarRegistro(); //To change body of generated methods, choose Tools | Templates.
       this.contacli.preencherCampos();
       this.contacli.salvar();
       return true;
    }

    
    
    public void atualizaListaProd() {
        List<Produto> listTmp_ = new ArrayList<>();
        listTmp_ = this.localProd.getAll();

        for (Produto p : listTmp_) {
            this.listaProduto.add(p.getNome());
        }
    }

    public void atualizaListaUsu() {
        List<Usuario> listTmp = new ArrayList<>();
        listTmp = this.localusu.getAll();

        for (int i = 0; i < listTmp.size(); i++) {
            Usuario tal = listTmp.get(i);
        }
        for (Usuario u : listTmp) {
            String tal = u.getNome();
            this.listaUsuario.add(tal);
        }
    }

    public void atualizaListaCli() {
        List<Cliente> listTemp = new ArrayList<>();
        listTemp = this.localCli.getAll();

        for (Cliente la : listTemp) {
            this.listaCliente.add(la.getNome());
        }
    }

    public void atribuiCliente(String cli) {
        this.contacli.setCliente(this.localCli.findByName(cli));
    }

    public void atribuiUsuario(String usu) {
        this.contacli.setUsuario(this.localusu.findByName(usu));
    }

    public ContaCliente getContacli() {
        return contacli;
    }

    public void setContacli(ContaCliente contacli) {
        this.contacli = contacli;
    }

    public List<String> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(List<String> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public Cliente getLsCli() {
        return localCli;
    }

    public void setLsCli(Cliente lsCli) {
        this.localCli = lsCli;
        this.contacli.setCliente(lsCli);
    }

    public String[] getCli() {
        return cli;
    }

    public void setCli(String[] cli) {
        this.atribuiCliente(cli[0]);
        this.cli = cli;
    }

    public Cliente getLocalCli() {
        return localCli;
    }

    public void setLocalCli(Cliente localCli) {
        this.localCli = localCli;
    }

    public Produto getLocalProd() {
        return localProd;
    }

    public void setLocalProd(Produto localProd) {
        this.localProd = localProd;
    }

    public String[] getUsu() {
        return usu;
    }

    public void setUsu(String[] usu) {
        this.atribuiUsuario(usu[0]);
        this.usu = usu;
    }

    public String[] getProd() {
        return prod;
    }

    public void setProd(String[] prod) {
        this.prod = prod;
    }

    public List<String> getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(List<String> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }

    public List<String> getListaProduto() {
        return listaProduto;
    }

    public void setListaProduto(List<String> listaProduto) {
        this.listaProduto = listaProduto;
    }

    public Usuario getLocalusu() {
        return localusu;
    }

    public void setLocalusu(Usuario localusu) {
        this.localusu = localusu;
    }

    public ItemContaCli getItemSelecionado() {
        return itemSelecionado;
    }

    public void setItemSelecionado(ItemContaCli itemSelecionado) {
        this.itemSelecionado = itemSelecionado;
    }

    public MBContaCli() {
    }

    //************************ AREA STRANGER THINGS
    public void paraResolverCoisasEstranhas() {
        this.listaCliente.add("teste");
        this.listaProduto.add("teste");
        this.listaUsuario.add("teste");
    }

}
