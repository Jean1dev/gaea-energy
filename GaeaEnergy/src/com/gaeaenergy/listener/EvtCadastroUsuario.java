/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaeaenergy.listener;

import com.gaeaenergy.database.Conector;
import com.gaeaenergy.database.UsuarioDAO;
import com.gaeaenergy.exceptions.ExceptionLabel;
import com.gaeaenergy.model.ModelUsuario;
import com.gaeaenergy.stream.WriteToFile;
import com.gaeaenergy.visual.FrmCadastroUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author comp8
 */
public class EvtCadastroUsuario implements ActionListener {

    WriteToFile file = new WriteToFile();
    private FrmCadastroUsuario frame;
    private UsuarioDAO db = new UsuarioDAO();
    private int codigo;

    public EvtCadastroUsuario(FrmCadastroUsuario frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if ("Gravar".equals(e.getActionCommand())) {
            try {
                ModelUsuario user = new ModelUsuario();

                user.setNome(frame.getTxtNome().getText());
                user.setSobrenome(frame.getTxtSobrenome().getText());
                user.setEmail(frame.getTxtEmail().getText());
                user.setSenha(frame.getTxtSenha().getText());
                user.print();
                frame.gravarRegistro();
                testaConexao();
                db.insert(user);
            } catch (ExceptionLabel ex) {
                file.jogaPilhaNoArquivo(ex, true);
            } catch (SQLException ex) {
                file.jogaPilhaNoArquivo(ex, true);
            } catch (ClassNotFoundException ex) {
                file.jogaPilhaNoArquivo(ex, true);
            }
        } else if ("Excluir".equals(e.getActionCommand())) {
            String message = "Deseja realmente excluir o seu registro?";
            String title = "Confirmação";
            //Exibe caixa de dialogo (veja figura) solicitando confirmação ou não.
            //Se o usuário clicar em "Sim" retorna 0 pra variavel reply, se informado não retorna 1
            int reply = JOptionPane.showConfirmDialog(frame, message, title, JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                try {
                    db.delete(frame.getTxtNome().getText());
                    JOptionPane.showMessageDialog(frame, "SUCESSO");
                    frame.setVisible(false);
                } catch (SQLException ex) {
                    file.jogaPilhaNoArquivo(ex, true);
                }
            } else {
                frame.setVisible(false);
            }
        } else if ("Atualizar".equals(e.getActionCommand())) {
            String message = "Deseja realmente atualizar o seu registro?";
            String title = "Confirmação";
            //Exibe caixa de dialogo (veja figura) solicitando confirmação ou não.
            //Se o usuário clicar em "Sim" retorna 0 pra variavel reply, se informado não retorna 1
            int reply = JOptionPane.showConfirmDialog(frame, message, title, JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                try {
                    ModelUsuario user = new ModelUsuario();

                    user.setId(this.codigo);
                    user.setNome(frame.getTxtNome().getText());
                    user.setSobrenome(frame.getTxtSobrenome().getText());
                    user.setEmail(frame.getTxtEmail().getText());
                    user.setSenha(frame.getTxtSenha().getText());
                    //frame.gravarRegistro();
                    if (db.atualizar(user)) {
                        JOptionPane.showMessageDialog(frame, "SUCESSO");
                    } else {
                        JOptionPane.showMessageDialog(frame, "PROBLEMAS AO ATUALIZAR O REGISTRO");
                    }

                    frame.setVisible(false);
                } catch (ClassNotFoundException ex) {
                    file.jogaPilhaNoArquivo(ex, true);
                }
            } else {
                frame.setVisible(false);
            }
        }
    }

    public void testaConexao() throws ClassNotFoundException {
        Conector conect = new Conector();
        if (conect.testaConexao()) {
            System.out.println("CONECTADO");
        } else {
            System.out.println("NÃO CONSEGUIU CONECTAR");
        }
    }

    public String preparaAmbiente() throws IOException, SQLException {
        String aux = file.recuperaLogin();
        this.codigo = db.getCodigo(aux);
        return aux;
    }
}
