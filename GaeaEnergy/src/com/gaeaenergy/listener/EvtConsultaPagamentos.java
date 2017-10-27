/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaeaenergy.listener;

import com.gaeaenergy.visual.FrmConsultaPagamentos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author comp8
 */
public class EvtConsultaPagamentos implements ActionListener {

    private FrmConsultaPagamentos consultaPagamentos;

    public EvtConsultaPagamentos(FrmConsultaPagamentos consultaPagamentos) {
        this.consultaPagamentos = consultaPagamentos;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
