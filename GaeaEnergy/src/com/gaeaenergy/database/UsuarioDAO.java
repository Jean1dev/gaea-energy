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
    
    public void insert(ModelUsuario user) throws SQLException{
        int codigo = getUltimo() ;
        
        try {
            connection = Conector.getConnection();
            String sql = "INSERT INTO usuario("
                    + "id_user,"
                    + "nome,"
                    + "sobrenome,"
                    + "email,"
                    + "senha)"
                    + " VALUES(?, ?, ?, ?)";
            
            stm = connection.prepareStatement(sql);
            stm.setInt(1, user.getId());
            stm.setString(2, user.getNome());
            stm.setString(3, user.getSobrenome());
            stm.setString(4, user.getEmail());
            stm.setString(5, user.getSenha());
            
            stm.execute();
            connection.commit();
            System.out.println("SUCESSO AO GRAVAR NO BANCO");
            
        } catch (ClassNotFoundException ex) {
            connection.rollback();
            log.jogaPilhaNoArquivo(ex, true);
            System.out.println("EXCPTION ROLLBACK");
        } catch (SQLException ex) {
            log.jogaPilhaNoArquivo(ex, true);
            System.out.println("EXCEPTION SQL");
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
            log.jogaPilhaNoArquivo(ex, true);
        } catch (SQLException ex) {
            log.jogaPilhaNoArquivo(ex, true);
        }
        return 0;
        
    }
}
