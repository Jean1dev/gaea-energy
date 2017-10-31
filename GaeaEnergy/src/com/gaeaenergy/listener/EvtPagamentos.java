/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaeaenergy.listener;

import com.gaeaenergy.visual.FrmPagamentos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author comp8
 */
public class EvtPagamentos implements ActionListener {

    private FrmPagamentos pagamentos;

    public EvtPagamentos(FrmPagamentos pagamentos) {
        this.pagamentos = pagamentos;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
