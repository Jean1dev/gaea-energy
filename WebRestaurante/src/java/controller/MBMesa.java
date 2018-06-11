/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Mesa;
import java.util.List;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author jeanfernandes
 */
public class MBMesa extends MBGeneral {
    
    private Mesa mesa;
    private DataModel<Mesa> mesas;
    
   public MBMesa(){
       this.ObjectControll = "Mesa";
   }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public DataModel<Mesa> getMesas() {
        List<Mesa> m = this.mesa.getAll();
        this.mesas = new ListDataModel<>(m);
        return this.mesas;
    }

    public void setMesas(DataModel<Mesa> mesas) {
        this.mesas = mesas;
    }
    
}
