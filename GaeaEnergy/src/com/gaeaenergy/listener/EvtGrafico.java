/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaeaenergy.listener;

import com.gaeaenergy.visual.FrmGrafico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author comp8
 */
public class EvtGrafico implements ActionListener {

    private FrmGrafico grafico;

    public EvtGrafico(FrmGrafico grafico) {
        this.grafico = grafico;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

}
