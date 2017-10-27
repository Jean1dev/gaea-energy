/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaeaenergy.listener;

import com.gaeaenergy.visual.FrmCadastroContaBancaria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author comp8
 */
public class EvtCadastroContaBancaria implements ActionListener {

    private FrmCadastroContaBancaria cadastroConta;

    public EvtCadastroContaBancaria(FrmCadastroContaBancaria cadastroConta) {
        this.cadastroConta = cadastroConta;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

}
