/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaeaenergy.listener;

import com.gaeaenergy.model.ModelFatura;
import com.gaeaenergy.visual.FrmAdicionarFatura;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jean
 */
public class EvtCadastroFatura implements ActionListener {

    private FrmAdicionarFatura fatura;

    public EvtCadastroFatura(FrmAdicionarFatura fatura) {
        this.fatura = fatura;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if ("Gravar".equals(ae.getActionCommand())) {
            ModelFatura fat = new ModelFatura(
                    "AKI SERA DEFINIDO AUTOMATICO",
                    fatura.getTxt_mes().toString(),
                    fatura.getTxt_un_consumidora().toString(),
                    Float.parseFloat(fatura.getTxt_subtotal().getText()),
                    Float.parseFloat(fatura.getTxt_total().getText()),
                    Float.parseFloat(fatura.getTxt_desconto().getText()),
                    Float.parseFloat(fatura.getTxt_imposto().getText()),
                    Float.parseFloat(fatura.getTxt_consumo().getText()),
                    Float.parseFloat(fatura.getTxt_horas().getText())
            );

            fat.print();
        }
    }

}
