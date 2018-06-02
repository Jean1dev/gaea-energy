/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author jeanfernandes
 */
@ManagedBean
@ViewScoped
public class MBGeneral extends MBAbstract {

    private String MensagemAlerta;
    private String ObjectControll;
    ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");

    public String getMensagemAlerta() {
        return MensagemAlerta;
    }

    public void setMensagemAlerta(String MensagemAlerta) {
        this.MensagemAlerta = MensagemAlerta;
    }

    @Override
    public void novo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void novoRegistro() {
        this.novo();
    }

    @Override
    public boolean validarGravacao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void antesGravar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void aposGravar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void salvar() {
        this.gravarRegistro();
    }

    @Override
    public boolean gravarRegistro() {
        if(!this.validarGravacao()){
            return false;
        }
        
        this.antesGravar();
        try {
            engine.eval(this.ObjectControll + ".salvar();");
        } catch (ScriptException ex) {
            Logger.getLogger(MBGeneral.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        this.aposGravar();
        
        return true;
    }

    @Override
    public boolean excluirRegistro() {
        try {
            engine.eval(this.ObjectControll + ".excluir();");
        } catch (ScriptException ex) {
            Logger.getLogger(MBGeneral.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    @Override
    public void excluir() {
        this.excluirRegistro();
    }

}
