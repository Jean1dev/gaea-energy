/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaeaenergy.listener;

import com.gaeaenergy.model.ModelUsuario;
import com.gaeaenergy.visual.FrmCadastroUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author comp8
 */
public class EvtCadastroUsuario implements ActionListener {

  
    private FrmCadastroUsuario frame;
    
    public EvtCadastroUsuario(FrmCadastroUsuario frame){
        this.frame = frame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if("Gravar".equals(e.getActionCommand())){
            ModelUsuario user = new ModelUsuario();
            
            user.setNome(frame.getTxtNome().getText());
            user.setEmail(frame.getTxtEmail().getText());
            user.setSenha(frame.getTxtSenha().getText());
            user.print();
        }
    }
    
}
