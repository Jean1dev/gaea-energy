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
public class ExceptionLabel extends Exception {

    public ExceptionLabel() {
        super("Por favor verifica os campos que devem ser preenchidos");
    }

    public ExceptionLabel(String param) {
        super("Por favor verifique o campo" + param);
    }

    public ExceptionLabel(int id, String param) {
        // super(getMensagem(id, param));
    }

    public String getMensagem(int id, String param) {
        String mensagem;

        switch (id) {
            case 1:
                mensagem = "O campo " + param + " é numerico";
                break;

            case 2:
                mensagem = "O campo " + param + " é muito curto";
                break;

            case 3:
                mensagem = "O campo " + param + " não é valido";
                break;

            default:
                mensagem = "";
        }
        return mensagem;
    }
}
