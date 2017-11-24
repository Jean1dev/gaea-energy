/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaeaenergy.model;

/**
 *
 * @author Jean 07/09/2017
 */
public class ModelUsuarioFinal {

    private boolean tipoPessoa; // TRUE = JURIDICO FALSE = FISICA
    private String cpf;
    private String cnpj;
    private String nome;
    private String endereco;
    private int numero;
    private String complemento;
    private String referencia;
    private String cep;
    private String bairro;
    private int cidade;
    private String estado;
    private int pais;

    //GERAL
    private int codigo;
    private String fone;
    private String fone2;
    private String campo;
    private String campo2;
    private String email;
    private String obs;
    private String lembrete;

    //PESSOA FISICA
    private String conjuge;
    private String nome_pai;
    private String nome_mae;
    private int orgao_expedidor;

    //PESSOA JURIDICA
    private String nome_fantasia;
    private String razao_social;
    private String IE; //INSCRIÇÃO ESTADUAL
    private int tipo;  //1 - SIMPLES NACIAL 2 - NÃO CONTRIBUINTE 3 - ISENTO

    public void print() {
        System.out.println("-------------------------------------------------");
        System.out.println("------------------INICIO DO OBJETO---------------");
        System.out.println(cpf);
        System.out.println(cnpj);
        System.out.println(nome);
        System.out.println(endereco);
        System.out.println(complemento);
        System.out.println(referencia);
        System.out.println(cep);
        System.out.println(bairro);
        System.out.println(estado);
        System.out.println(fone);
        System.out.println(fone2);
        System.out.println(email);
        System.out.println("-------------------------------------------------");
        System.out.println("------------------FIM DO OBJETO------------------");
    }

    public ModelUsuarioFinal(boolean tipoPessoa, String cpf, String cnpj, String nome, String endereco, int numero, String complemento, String referencia, String cep, String bairro, int cidade, String estado, int pais, String fone, String fone2, String campo, String campo2, String email, String obs, String lembrete, String conjuge, String nome_pai, String nome_mae, int orgao_expedidor, String nome_fantasia, String razao_social, String IE, int tipo) {
        this.tipoPessoa = tipoPessoa;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.referencia = referencia;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.fone = fone;
        this.fone2 = fone2;
        this.campo = campo;
        this.campo2 = campo2;
        this.email = email;
        this.obs = obs;
        this.lembrete = lembrete;
        this.conjuge = conjuge;
        this.nome_pai = nome_pai;
        this.nome_mae = nome_mae;
        this.orgao_expedidor = orgao_expedidor;
        this.nome_fantasia = nome_fantasia;
        this.razao_social = razao_social;
        this.IE = IE;
        this.tipo = tipo;
    }

    public ModelUsuarioFinal() {
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public boolean isTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(boolean tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCidade() {
        return cidade;
    }

    public void setCidade(int cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPais() {
        return pais;
    }

    public void setPais(int pais) {
        this.pais = pais;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getFone2() {
        return fone2;
    }

    public void setFone2(String fone2) {
        this.fone2 = fone2;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getCampo2() {
        return campo2;
    }

    public void setCampo2(String campo2) {
        this.campo2 = campo2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getLembrete() {
        return lembrete;
    }

    public void setLembrete(String lembrete) {
        this.lembrete = lembrete;
    }

    public String getConjuge() {
        return conjuge;
    }

    public void setConjuge(String conjuge) {
        this.conjuge = conjuge;
    }

    public String getNome_pai() {
        return nome_pai;
    }

    public void setNome_pai(String nome_pai) {
        this.nome_pai = nome_pai;
    }

    public String getNome_mae() {
        return nome_mae;
    }

    public void setNome_mae(String nome_mae) {
        this.nome_mae = nome_mae;
    }

    public int getOrgao_expedidor() {
        return orgao_expedidor;
    }

    public void setOrgao_expedidor(int orgao_expedidor) {
        this.orgao_expedidor = orgao_expedidor;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public String getIE() {
        return IE;
    }

    public void setIE(String IE) {
        this.IE = IE;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    

}


