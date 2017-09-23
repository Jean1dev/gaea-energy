/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaeaenergy.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jean
 */
public class EvtButton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent action) {
        
        if ("Sair".equals(action.getActionCommand())) {

        }else if("Entrar".equals(action.getActionCommand())){
            
        }else if("Consultar".equals(action.getActionCommand())){
            
        }else if("Limpar".equals(action.getActionCommand())){
        
        }
    }

    private void setClosed(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
