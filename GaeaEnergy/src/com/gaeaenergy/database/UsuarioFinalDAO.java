/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaeaenergy.database;

import com.gaeaenergy.model.ModelUsuarioFinal;
import com.gaeaenergy.stream.WriteToFile;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author comp8
 */
public class UsuarioFinalDAO {
    
    private WriteToFile log = new WriteToFile();
    private Connection connection = null;
    private PreparedStatement stm = null;
    
    public void delete(ModelUsuarioFinal user){
        
    }
    
    public void insert(ModelUsuarioFinal user){
        
    }
    
    public void update(ModelUsuarioFinal user){
        
    }
    
    public void select(ModelUsuarioFinal user){
        
    }
}
