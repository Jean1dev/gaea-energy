/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import repository.ContaClienteRepository;
import repository.UsuarioRepository;

/**
 *
 * @author Lurian V. Serafim
 */
@Entity
public class ContaCliente extends ContaClienteRepository implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ContaCliente;
    private Date dataAbertura;
    private Date dataFechamento;
    private double valorTotal;
    private double valorRecebido;
    private Cliente Cliente;
    private Usuario usuario;
    
        @OneToMany(fetch = FetchType.LAZY, 
            mappedBy = "pedido", 
            orphanRemoval = true, 
            cascade = CascadeType.ALL)
    private List<Produto> itens = new ArrayList<>();

    public ContaCliente() {

    }

    public Integer getContaCliente() {
        return ContaCliente;
    }

    public void setContaCliente(Integer ContaCliente) {
        this.ContaCliente = ContaCliente;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Date getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(Date dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public List<?> getItens() {
        return itens;
    }

    public void setItens(List<Produto> itens) {
        this.itens = itens;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
