/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import entity.Mesa;
import java.util.List;

/**
 *
 * @author jeanfernandes
 */
public class Testes {
    
    public static void main(String[] args){
        
        Mesa mesa = new Mesa();
        
        List<?> list = mesa.getAll();
        
        mesa.setNrMesa(1);
        mesa.setAberta(true);
        mesa.salvar();
        
        
    }
    
}
