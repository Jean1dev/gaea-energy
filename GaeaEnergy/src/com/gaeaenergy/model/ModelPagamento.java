/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaeaenergy.model;

/**
 *
 * @author JEAN -MURILO 01/07/2017
 */
public class ModelPagamento extends ModelFatura{
    
    private float vlpago;
    private String tipoDocumento;

    public float getVlpago() {
        return vlpago;
    }

    public void setVlpago(float vlpago) {
        this.vlpago = vlpago;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public ModelPagamento() {
    }
}
