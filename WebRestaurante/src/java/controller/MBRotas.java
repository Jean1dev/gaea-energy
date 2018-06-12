/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author jeanfernandes
 */
@ManagedBean
@ViewScoped
public class MBRotas {
    
    public MBRotas(){
        
    }
    
    public String goCadMesa(){
        return "mesa";
    }
    
    public String goCadUsu(){
        return "usuario";
    }
    
    public String goCadProd(){
        return "produto";
    }
}
