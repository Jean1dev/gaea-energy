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
import java.sql.SQLException;
import java.io.File;

/**
 *
 * @author comp8
 */
public class CadastroContaBancariaDAO {

    private WriteToFile log = new WriteToFile();
    private Connection connection = null;
    private PreparedStatement stm = null;

    public void delete(ModelCadastroContaBancaria bank) throws ClassNotFoundException {

        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conector.getConnection();
            String sql = "delete from cadastrocontabacaria where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, bank.getDv());
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

    public void insert(ModelCadastroContaBancaria bank) throws ClassNotFoundException {

        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conector.getConnection();
            String sql = "insert into cidade (codigo, descricacao, estado) values(?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, bank.getDv());
            ps.setString(2, bank.getAgencia());
            ps.setString(4, bank.getNome());
            ps.setString(5, bank.getAbreviatura());
            ps.setString(6, bank.getNumero());
            ps.setString(7, bank.getEndereco());
            ps.setString(8, bank.getEstado());
            ps.setString(9, bank.getCep());
            ps.setInt(10, bank.getCidade());
            ps.setInt(11, bank.getDv_cc());
            ps.setInt(12, bank.getDv_ag_cc());
            ps.setString(13, bank.getNome_agencia());
            ps.setInt(14, bank.getTipo_documento());
            ps.setString(15, bank.getCod_conta());
            ps.setInt(16, bank.getContabil());
            ps.setString(17, bank.getTipo_lote_clb());
            ps.setInt(18, bank.getCnab_layout());
            ps.setString(19, bank.getNum_convenio());
            ps.setString(20, bank.getNum_carteira());
            ps.setString(21, bank.getTipo());
            ps.setString(22, bank.getSequencial());
            ps.setString(23, bank.getDias_acrescimo());

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

    public void update(ModelCadastroContaBancaria bank) throws ClassNotFoundException {

        try {
            connection = Conector.getConnection();
            String sql = "UPDATE cadastrocontabancaria SET agencia = ?, nome = ?, abreviatura = ?, numero = ?, endereco = ?,"
                    + "estado = ?, cep = ?, cidade = ?, dv = ?, dv_cc = ?, dv_ag_cc = ?, nome_agencia = ?, tipo_documento = ?,"
                    + "cod_conta = ?, contabil = ?, tipo_lote_clb = ?, cnab_layout = ?, num_convenio = ?, num_carteira = ?, tipo = ?,"
                    + "sequencial = ?, dias_acrecimo = ?,";
            stm = connection.prepareStatement(sql);

            stm.setInt(1, bank.getDv());
            stm.setString(2, bank.getAgencia());
            stm.setString(3, bank.getNome());
            stm.setString(4, bank.getAbreviatura());
            stm.setString(5, bank.getNumero());
            stm.setString(6, bank.getEndereco());
            stm.setString(7, bank.getEstado());
            stm.setString(8, bank.getCep());
            stm.setInt(9, bank.getCidade());
            stm.setInt(10, bank.getDv_cc());
            stm.setInt(11, bank.getDv_ag_cc());
            stm.setString(12, bank.getNome_agencia());
            stm.setInt(13, bank.getTipo_documento());
            stm.setString(14, bank.getCod_conta());
            stm.setInt(15, bank.getContabil());
            stm.setString(16, bank.getTipo_lote_clb());
            stm.setInt(17, bank.getCnab_layout());
            stm.setString(18, bank.getNum_convenio());
            stm.setString(19, bank.getNum_carteira());
            stm.setString(20, bank.getTipo());
            stm.setString(21, bank.getSequencial());
            stm.setString(22, bank.getDias_acrescimo());

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

    public void select(ModelCadastroContaBancaria bank) {
           //FALTA IMPLEMENTAR NAO CONSEGUI
    }

}
