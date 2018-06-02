/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author jeanfernandes
 */
public abstract class MBAbstract {
    
    public abstract void novo();
    
    public abstract void novoRegistro();
    
    public abstract void salvar();
    
    public abstract boolean gravarRegistro();
    
    public abstract boolean excluirRegistro();
    
    public abstract boolean validarGravacao();
    
    public abstract void excluir();
    
    public abstract void antesGravar();
    
    public abstract void aposGravar();
}
