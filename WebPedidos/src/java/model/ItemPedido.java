/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jeanfernandes
 */
public class ItemPedido {

    private Double desconto;
    private Integer quantidade;
    private Double preco;
    private Produto produto;

    public ItemPedido() {
    }

    public ItemPedido(Double desconto, Integer quantidade, Double preco, Produto produto) {
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    
    
}
