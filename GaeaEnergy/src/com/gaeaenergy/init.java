/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaeaenergy;

import com.gaeaenergy.visual.FrmLogin;

/**
 *
 * JEAN - MURILO 01/09/2017
 */
public class init {

    public String mensagem_inicial = "Para uma melhor avaliação, antes de começar a usar o software entre na "
            + "aba SOBRE, para saber o que já foi implementado";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FrmLogin init = new FrmLogin();
        init.setVisible(true);
    }

    public init() {

    }

}
