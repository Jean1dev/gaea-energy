/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaeaenergy.listener;

import com.gaeaenergy.visual.FrmCadastroCartaoCredito;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author comp8
 */
public class EvtCadastroCartaoCredito implements ActionListener {

    private FrmCadastroCartaoCredito CadastroCard;

    public EvtCadastroCartaoCredito(FrmCadastroCartaoCredito CadastroCard) {
        this.CadastroCard = CadastroCard;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

}
