/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaeaenergy.model;

import java.io.File;

/**
 *
 * @author JEAN - MURILO 01/09/2017
 */
public class ModelCadastroContaBancaria {

    private String agencia;
    private String nome;
    private String abreviatura;
    private String numero;
    private String endereco;
    private String estado;
    private String cep;
    private int cidade;
    private int dv;
    private int dv_cc;
    private int dv_ag_cc;
    private String nome_agencia;
    private int tipo_documento;
    private String cod_conta;
    private int contabil;
    private String tipo_lote_clb;
    private int cnab_layout;
    private File arquivo_remessa;
    private String num_convenio;
    private String num_carteira;
    private String tipo;
    private String sequencial;
    private String dias_acrescimo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getCidade() {
        return cidade;
    }

    public void setCidade(int cidade) {
        this.cidade = cidade;
    }

    public int getDv() {
        return dv;
    }

    public void setDv(int dv) {
        this.dv = dv;
    }

    public int getDv_cc() {
        return dv_cc;
    }

    public void setDv_cc(int dv_cc) {
        this.dv_cc = dv_cc;
    }

    public int getDv_ag_cc() {
        return dv_ag_cc;
    }

    public void setDv_ag_cc(int dv_ag_cc) {
        this.dv_ag_cc = dv_ag_cc;
    }

    public String getNome_agencia() {
        return nome_agencia;
    }

    public void setNome_agencia(String nome_agencia) {
        this.nome_agencia = nome_agencia;
    }

    public int getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(int tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getCod_conta() {
        return cod_conta;
    }

    public void setCod_conta(String cod_conta) {
        this.cod_conta = cod_conta;
    }

    public int getContabil() {
        return contabil;
    }

    public void setContabil(int contabil) {
        this.contabil = contabil;
    }

    public String getTipo_lote_clb() {
        return tipo_lote_clb;
    }

    public void setTipo_lote_clb(String tipo_lote_clb) {
        this.tipo_lote_clb = tipo_lote_clb;
    }

    public int getCnab_layout() {
        return cnab_layout;
    }

    public void setCnab_layout(int cnab_layout) {
        this.cnab_layout = cnab_layout;
    }

    public File getArquivo_remessa() {
        return arquivo_remessa;
    }

    public void setArquivo_remessa(File arquivo_remessa) {
        this.arquivo_remessa = arquivo_remessa;
    }

    public String getNum_convenio() {
        return num_convenio;
    }

    public void setNum_convenio(String num_convenio) {
        this.num_convenio = num_convenio;
    }

    public String getNum_carteira() {
        return num_carteira;
    }

    public void setNum_carteira(String num_carteira) {
        this.num_carteira = num_carteira;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSequencial() {
        return sequencial;
    }

    public void setSequencial(String sequencial) {
        this.sequencial = sequencial;
    }

    public String getDias_acrescimo() {
        return dias_acrescimo;
    }

    public void setDias_acrescimo(String dias_acrescimo) {
        this.dias_acrescimo = dias_acrescimo;
    }
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

    public ModelCadastroContaBancaria() {
    }

}
