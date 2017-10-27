/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaeaenergy.listener;

import com.gaeaenergy.stream.WriteToFile;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;

/**
 *
 * @author Jean
 */
public class EvtButton implements ActionListener {
    
    JInternalFrame frame;
    WriteToFile arquivo = new WriteToFile();
    //************************* ESSA CLASSE CONTROLA TODOS OS BOTOES BASICOS QUE TODAS OS FRAMES TEM
    
    
    
    public EvtButton(JInternalFrame frame){
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent action) {
            
        if ("Sair".equals(action.getActionCommand())) {
            
            try {
                arquivo.geraLog("<<<<<<Saiu da tela");
                frame.setClosed(true);
            } catch (PropertyVetoException | IOException ex) {
                Logger.getLogger(EvtButton.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }else if("Entrar".equals(action.getActionCommand())){
            
        }else if("Consultar".equals(action.getActionCommand())){
            
        }else if("Limpar".equals(action.getActionCommand())){
        
        }
    }

    private void setClosed(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
