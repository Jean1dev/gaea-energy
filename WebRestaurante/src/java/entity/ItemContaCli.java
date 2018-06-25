/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import repository.ItemContaCliRepository;

/**
 *
 * @author jeanfernandes
 */
@Entity
public class ItemContaCli extends ItemContaCliRepository implements Serializable {

    @Id
    private Integer codigo;
    private Integer quantidade;

    @ManyToOne(fetch = FetchType.LAZY)
    //@ForeignKey(name = "fk_item_produto")
    @JoinColumn(name = "cod_produto")
    private Produto produto;

    private Double valor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_contacli")
    private ContaCliente contacli;

    public Double getTotal() {
        return getQuantidade() * getValor();
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public ContaCliente getContacli() {
        return contacli;
    }

    public void setContacli(ContaCliente contacli) {
        this.contacli = contacli;
    }

}
