/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaeaenergy.model;

/**
 *
 * @author JEAN - MURILO 01/09/2017
 */
public class ModelCadastroCartaoCredito {

    private String numCartao;
    private String nomeTitular;
    private String bandeira;
    private String codSeguranca;
    private String validade;

    public void print() {
        System.out.println("------------------------------------------------");
        System.out.println("----------------INICIO DO OBJETO-----------------");
        System.out.println(numCartao);
        System.out.println(nomeTitular);
        System.out.println(bandeira);
        System.out.println(codSeguranca);
        System.out.println(validade);
        System.out.println("------------------------------------------------");
        System.out.println("-----------FIM DO OBJETO------------------------");
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getCodSeguranca() {
        return codSeguranca;
    }

    public void setCodSeguranca(String codSeguranca) {
        this.codSeguranca = codSeguranca;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public ModelCadastroCartaoCredito(String numCartao, String nomeTitular, String bandeira, String codSeguranca, String validade) {
        this.numCartao = numCartao;
        this.nomeTitular = nomeTitular;
        this.bandeira = bandeira;
        this.codSeguranca = codSeguranca;
        this.validade = validade;
    }

    public ModelCadastroCartaoCredito() {
    }

}
