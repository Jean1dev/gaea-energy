/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaeaenergy.database;

import com.gaeaenergy.model.ModelUsuario;
import com.gaeaenergy.stream.WriteToFile;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author comp8
 */
public class UsuarioDAO {
    
    private WriteToFile log = new WriteToFile();
    private Connection connection = null;
    private PreparedStatement stm = null;
    
    public void delete(ModelUsuario user) throws SQLException{
        try {
            connection = Conector.getConnection();
            String sql = "DELETE FROM usuario WHERE id_user = ?";
            
            stm = connection.prepareStatement(sql);
            stm.setInt(1, user.getId());
            stm.execute();
            
            connection.commit();
        } catch (ClassNotFoundException ex) {
            connection.rollback();
            log.jogaPilhaNoArquivo(ex, true);
        } catch (SQLException ex) {
            connection.rollback();
            log.jogaPilhaNoArquivo(ex, true);
        }
    }
    
    public void insert(ModelUsuario user){
        int codigo = getUltimo() ;
        
        try {
            connection = Conector.getConnection();
            String sql = "";
            
            stm = connection.prepareStatement(sql);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private int getUltimo(){
        try {
            connection = Conector.getConnection();
            String sql = "SELECT * FROM usuario ORDER BY id_user desc";
            
            stm = connection.prepareStatement(sql);
            ResultSet resultSet = stm.executeQuery();
            
            //int aux = (int) resultSet.getRowId(1);
            return 1;
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
        
    }
}
