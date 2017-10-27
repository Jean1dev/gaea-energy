/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaeaenergy.listener;

import com.gaeaenergy.visual.FrmAdicionarFatura;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author comp8
 */
public class EvtAdicionarFatura implements ActionListener {

    private FrmAdicionarFatura adicionarFatura;

    public EvtAdicionarFatura(FrmAdicionarFatura adicionarFatura) {
        this.adicionarFatura = adicionarFatura;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

}
