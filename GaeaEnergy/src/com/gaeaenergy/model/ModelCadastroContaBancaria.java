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
public class ModelCadastroContaBancaria {

    private String agencia;
    private String numConta;
    private String nomeTitular;
    private String banco;
    private String tipoConta;
    private String cpf;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ModelCadastroContaBancaria(String agencia, String numConta, String nomeTitular, String banco, String tipoConta, String cpf) {
        this.agencia = agencia;
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
        this.banco = banco;
        this.tipoConta = tipoConta;
        this.cpf = cpf;
    }

    public ModelCadastroContaBancaria() {
    }

}
