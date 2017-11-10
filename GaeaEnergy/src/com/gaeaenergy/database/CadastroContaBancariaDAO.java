/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaeaenergy.database;

import com.gaeaenergy.model.ModelCadastroContaBancaria;
import com.gaeaenergy.stream.WriteToFile;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author comp8
 */
public class CadastroContaBancariaDAO {
    
    private WriteToFile log = new WriteToFile();
    private Connection connection = null;
    private PreparedStatement stm = null;
    
    public void delete(ModelCadastroContaBancaria bank){
        
    }
    
    public void insert(ModelCadastroContaBancaria bank){
        
    }
    
    public void update(ModelCadastroContaBancaria bank){
        
    }
    
    public void select(ModelCadastroContaBancaria bank){
        
    }
    
}
