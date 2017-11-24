/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaeaenergy.database;

import com.gaeaenergy.model.ModelCidade;
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
public class CidadeDAO {

    private WriteToFile log = new WriteToFile();
    private Connection connection = null;
    private PreparedStatement stm = null;

    public void delete(ModelCidade cit) throws ClassNotFoundException {

        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conector.getConnection();
            String sql = "delete from cidade where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, cit.getCodigo());
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

    public void insert(ModelCidade cit) throws ClassNotFoundException {

        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conector.getConnection();
            String sql = "insert into cidade (codigo, descricacao, estado) values(?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, cit.getCodigo());
            ps.setString(2, cit.getCidade());
            ps.setString(3, cit.getEstado());
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

    public void update(ModelCidade cit) throws ClassNotFoundException {
        
        try {
            connection = Conector.getConnection();
            String sql = "UPDATE cidade SET cidade = ?, estado = ?";
            stm = connection.prepareStatement(sql);
            stm.setString(1, cit.getCidade());
            stm.setString(2, cit.getEstado());
           
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

    public List<ModelCidade> getAll() throws ClassNotFoundException {
    List<ModelCidade> lista = new ArrayList<ModelCidade>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conector.getConnection();
            String sql = "select codigo, cidade from cidade";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Integer codigo = rs.getInt(1);
                String cidade = rs.getString(2);
                ModelCidade m = new ModelCidade();
                m.setCodigo(codigo);
                m.setCidade(cidade);
                lista.add(m);
            }
        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return lista;
        
    }
}
