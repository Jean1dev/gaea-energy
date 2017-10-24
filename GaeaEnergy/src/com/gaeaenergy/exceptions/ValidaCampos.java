/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaeaenergy.exceptions;

/**
 *
 * @author Jean
 */
public class ValidaCampos {

    public ValidaCampos() {
    }

    public void ValidacaoSimples(String param1, String param2,
            String param3, String param4, String param5) throws ExceptionLabel {

        if (param1.equals("")) {
            throw new ExceptionLabel(param1);
        }

        if (param2.equals("")) {
            throw new ExceptionLabel(param2);
        }

        if (param3.equals("")) {
            throw new ExceptionLabel(param3);
        }

        if (param4.equals("")) {
            throw new ExceptionLabel(param4);
        }

        if (param5.equals("")) {
            throw new ExceptionLabel(param5);
        }

    }
}
