/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaeaenergy.listener;

import com.gaeaenergy.model.ModelUsuarioFinal;
import com.gaeaenergy.visual.FrmPerfil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jean
 */
public class EvtPerfil implements ActionListener {

    private FrmPerfil perfil;

    public EvtPerfil(FrmPerfil perfil) {
        this.perfil = perfil;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if ("Gravar".equals(ae.getActionCommand())) {
            ModelUsuarioFinal user = new ModelUsuarioFinal(
                    false,
                    perfil.getTxt_cpf().getText(),
                    perfil.getTxt_cnpj().getText(),
                    perfil.getTxt_nome().getText(),
                    perfil.getTxt_endereco().getText(),
                    0,
                    perfil.getTxt_completo().getText(),
                    perfil.getTxt_complemento().getText(),
                    perfil.getTxt_cep().getText(),
                    perfil.getTxt_bairro().getText(),
                    0,
                    null,
                    0,
                    perfil.getTxt_fone().getText(),
                    perfil.getTxt_fone2().getText(),
                    perfil.getTxt_campo1().getText(),
                    perfil.getTxt_campo2().getText(),
                    perfil.getTxt_email().getText(),
                    perfil.getTxt_obs().getText(),
                    perfil.getTxt_lembrete().getText(),
                    perfil.getTxt_conjuge().getText(),
                    perfil.getTxt_nmPao().getText(),
                    perfil.getTxt_nmMae().getText(),
                    0,
                    perfil.getTxt_nmFantasia().getText(),
                    perfil.getTxt_social().getText(),
                    perfil.getTxt_IE().getText(),
                    0);

            user.print();
        }
    }

}
