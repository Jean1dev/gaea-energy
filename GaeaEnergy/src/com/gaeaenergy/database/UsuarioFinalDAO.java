/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaeaenergy.database;

import com.gaeaenergy.model.ModelCadastroContaBancaria;
import com.gaeaenergy.model.ModelCidade;
import com.gaeaenergy.model.ModelUsuarioFinal;
import com.gaeaenergy.stream.WriteToFile;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author comp8
 */
public class UsuarioFinalDAO {

    private WriteToFile log = new WriteToFile();
    private Connection connection = null;
    private PreparedStatement stm = null;

    public void delete(ModelUsuarioFinal user) throws ClassNotFoundException {

        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conector.getConnection();
            String sql = "delete from usuariofinal where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, user.getCodigo());
            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }

    }

    public void insert(ModelUsuarioFinal user) throws ClassNotFoundException {

        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conector.getConnection();

            String sql = "insert into usuariofinal (tipoPessoa, cpf, cnpj, nome, endereco, numero, complemento, referencia,"
                    + "cep, bairro, estado, pais, codigo, fone, fone2, campo, email, obs, lembrete, conjuge, nome_pai, nome_mae,"
                    + "orgao_expedidor, nome_fantasia, razao_social, IE, tipo) values(?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, user.getCodigo());
            ps.setString(2, user.getCpf());
            ps.setString(3, user.getCnpj());
            ps.setString(4, user.getEstado());
            ps.setString(5, user.getNome());
            ps.setString(6, user.getEndereco());
            ps.setInt(7, user.getNumero());
            ps.setString(8, user.getComplemento());
            ps.setString(9, user.getReferencia());
            ps.setString(10, user.getCep());
            ps.setString(11, user.getBairro());
            ps.setInt(12, user.getCidade());
            ps.setString(13, user.getEstado());
            ps.setInt(14, user.getPais());
            ps.setInt(15, user.getCodigo());
            ps.setString(16, user.getFone());
            ps.setString(17, user.getFone2());
            ps.setString(18, user.getCampo());
            ps.setString(19, user.getCampo2());
            ps.setString(20, user.getEmail());
            ps.setString(21, user.getObs());
            ps.setString(22, user.getLembrete());
            ps.setString(23, user.getConjuge());
            ps.setString(24, user.getNome_pai());
            ps.setString(25, user.getNome_mae());
            ps.setInt(26, user.getOrgao_expedidor());
            ps.setString(27, user.getNome_fantasia());
            ps.setString(28, user.getRazao_social());
            ps.setString(29, user.getIE());
            ps.setInt(30, user.getTipo());
            ps.execute();

            conn.commit();

        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public void update(ModelUsuarioFinal user) throws ClassNotFoundException {

        try {
            connection = Conector.getConnection();
            String sql = "UPDATE usuariofinal SET codigo = ?, cpf = ?, cnpj = ?, estado = ?, nome = ?, endereco = ?, numero = ?,"
                    + "complemento = ?, referencia = ?, cep = ?, bairro = ?, cidade = ?, estado = ?, pais = ?, codigo = ?, codigo = ?,"
                    + "fone = ?, fone2 = ?, campo = ?, campo2 = ?, email = ?, obs = ?, lembrete = ?, conjuge = ?, nome_pai = ?,"
                    + "nome_mae = ?, orgao_expedidor = ?, nome_fantasia = ?, razao_social = ?, ie = ?, tipo = ?";
            stm = connection.prepareStatement(sql);

            stm.setInt(1, user.getCodigo());
            stm.setString(2, user.getCpf());
            stm.setString(3, user.getCnpj());
            stm.setString(4, user.getEstado());
            stm.setString(5, user.getNome());
            stm.setString(6, user.getEndereco());
            stm.setInt(7, user.getNumero());
            stm.setString(8, user.getComplemento());
            stm.setString(9, user.getReferencia());
            stm.setString(10, user.getCep());
            stm.setString(11, user.getBairro());
            stm.setInt(12, user.getCidade());
            stm.setString(13, user.getEstado());
            stm.setInt(14, user.getPais());
            stm.setInt(15, user.getCodigo());
            stm.setString(16, user.getFone());
            stm.setString(17, user.getFone2());
            stm.setString(18, user.getCampo());
            stm.setString(19, user.getCampo2());
            stm.setString(20, user.getEmail());
            stm.setString(21, user.getObs());
            stm.setString(22, user.getLembrete());
            stm.setString(23, user.getConjuge());
            stm.setString(24, user.getNome_pai());
            stm.setString(25, user.getNome_mae());
            stm.setInt(26, user.getOrgao_expedidor());
            stm.setString(27, user.getNome_fantasia());
            stm.setString(28, user.getRazao_social());
            stm.setString(29, user.getIE());
            stm.setInt(30, user.getTipo());

            stm.execute();

            connection.commit();

        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (connection != null) {
                try {
                    connection.rollback();

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

    }

    public void select(ModelUsuarioFinal user) {
   //FALTA IMPLEMENTAR NAO CONSEGUI
    }

}
