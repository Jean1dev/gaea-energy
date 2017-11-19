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

    public void delete(String user) throws SQLException {
        try {
            connection = Conector.getConnection();
            String sql = "DELETE FROM usuario WHERE nome = ?";

            stm = connection.prepareStatement(sql);
            stm.setString(1, user);
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

    public void insert(ModelUsuario user) throws SQLException {
        int codigo = getUltimo();

        try {
            connection = Conector.getConnection();
            String sql = "INSERT INTO usuario(id_user ,nome, sobrenome, email, senha) VALUES(? ,? , ?, ? ,?)";
//                    + "id_user,"
//                    + "nome,"
//                    + "sobrenome,"
//                    + "email,"
//                    + "senha)"
//                    + " VALUES(?, ?, ?, ?)";

            stm = connection.prepareStatement(sql);
            stm.setInt(1, codigo);
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

    public boolean atualizar(ModelUsuario user) throws ClassNotFoundException {
        try {
            connection = Conector.getConnection();
            String sql = "UPDATE usuario SET nome = ?, sobrenome = ?, email = ?, senha = ?  WHERE id_user = ?";
            stm = connection.prepareStatement(sql);
            stm.setString(1, user.getNome());
            stm.setString(2, user.getSobrenome());
            stm.setString(3, user.getEmail());
            stm.setString(4, user.getSenha());
            stm.setInt(5, user.getId());
            stm.execute();

            connection.commit();
            return true;
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (connection != null) {
                try {
                    connection.rollback();
                    return false;
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return false;
    }

    public int Login(String usuario) throws SQLException {
        try {
            connection = Conector.getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        int contador = 0;
        String sql = "SELECT * FROM usuario WHERE nome = ?";

        stm = connection.prepareStatement(sql);
        stm.setString(1, usuario);
        ResultSet res = stm.executeQuery();
        while (res.next()) {
            contador++;
        }
        return contador;
    }

    private int getUltimo() {
        try {
            int retorno = 0;
            connection = Conector.getConnection();
            String sql = "SELECT * FROM usuario ORDER BY id_user desc";

            stm = connection.prepareStatement(sql);
            ResultSet resultSet = stm.executeQuery();
            while (resultSet.next()) {
                retorno++;
            }
//            resultSet.last();
//            RowId num = resultSet.getRowId(1);
            return retorno;

        } catch (ClassNotFoundException ex) {
            log.jogaPilhaNoArquivo(ex, true);
        } catch (SQLException ex) {
            log.jogaPilhaNoArquivo(ex, true);
        }
        return 0;

    }

    public int getCodigo(String string) throws SQLException {
        int retorno = 0;
        try {
            connection = Conector.getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT id_user FROM usuario WHERE nome = ?";
        stm = connection.prepareStatement(sql);
        stm.setString(1, string);
        ResultSet resultSet = stm.executeQuery();

        while (resultSet.next()) {
            retorno = resultSet.getInt(1);
        }
        System.out.println("REGISTRO ATUALIZADO CODIGO : " + retorno);
        return retorno;
    }
}
