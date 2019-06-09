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
public class Produto {
    
    private Integer id;
    private String nome;
    private Double preco;

    public Produto(Integer id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
    
    public static class Builder {
        
        private String nome;
        private Double preco;
        
        public Builder nome(String nome){
            this.nome = nome;
            return this;
        }
        
        public Builder preco(Double preco) {
            this.preco = preco;
            return this;
        }
        
        public Produto build() {
            return new Produto(null, nome, preco);
        }
    }
}
