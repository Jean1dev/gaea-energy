/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaeaenergy.model;

/**
 *
 * @author JEAN - MURILO 01/09/2017
 */
public class ModelFatura {
    
    private String titulo;
    private String mes;
    private String unidadeConsumidora;
    
    private static final float precoKW = (float) 0.42; // CONSTANTE
    
    private float subtotal;
    private float total;
    private float desconto;
    private float taxa_imposto;
    private float consumo;
    private float horas_gasta;
    private float multa;

    public ModelFatura(String titulo, String mes, String unidadeConsumidora, float subtotal, float total, float desconto, float taxa_imposto, float consumo, float horas_gasta, float multa) {
        this.titulo = titulo;
        this.mes = mes;
        this.unidadeConsumidora = unidadeConsumidora;
        this.subtotal = subtotal;
        this.total = total;
        this.desconto = desconto;
        this.taxa_imposto = taxa_imposto;
        this.consumo = consumo;
        this.horas_gasta = horas_gasta;
        this.multa = multa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getUnidadeConsumidora() {
        return unidadeConsumidora;
    }

    public void setUnidadeConsumidora(String unidadeConsumidora) {
        this.unidadeConsumidora = unidadeConsumidora;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float getTaxa_imposto() {
        return taxa_imposto;
    }

    public void setTaxa_imposto(float taxa_imposto) {
        this.taxa_imposto = taxa_imposto;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public float getHoras_gasta() {
        return horas_gasta;
    }

    public void setHoras_gasta(float horas_gasta) {
        this.horas_gasta = horas_gasta;
    }

    public float getMulta() {
        return multa;
    }

    public void setMulta(float multa) {
        this.multa = multa;
    }

    public ModelFatura() {
    }
    
    
}
