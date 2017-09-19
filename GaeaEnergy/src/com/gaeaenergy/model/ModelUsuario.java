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
public class ModelUsuario {

    private String nome;
    private String sobrenome;
    private String email;
    private String senha;

    public void print() {
        System.out.println("-------------------------------------------------");
        System.out.println("------------------INICIO DO OBJETO---------------");
        System.out.println(nome);
        System.out.println(sobrenome);
        System.out.println(email);
        System.out.println(senha);
        System.out.println("-------------------------------------------------");
        System.out.println("------------------FIM DO OBJETO------------------");
    }

    public ModelUsuario() {
    }

    public ModelUsuario(String nome, String sobrenome, String email, String senha) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
