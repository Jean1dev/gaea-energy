/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaeaenergy.visual;

import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author JEAN - MURILO 01/09/2017
 */
public class DesktopPane extends javax.swing.JFrame {

    final JDesktopPane desktop = new JDesktopPane();
    FrmFatura frame;

    /**
     * Creates new form DesktopPane
     */
    public DesktopPane() {
        initComponents();
        this.setTitle("GAEA ENERGY");
        this.setLocationRelativeTo(null);
        this.setExtendedState(this.MAXIMIZED_BOTH);

        //CODIGO PARA MUDAR O VISUAL DO SWING, PEGA O PADRÃO DO S.O
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            System.out.println("erro");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        painel = new javax.swing.JPanel();
        btn_fatura = new javax.swing.JButton();
        btn_grafico = new javax.swing.JButton();
        btn_pagamento = new javax.swing.JButton();
        btn_perfil = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_visualizarFatura = new javax.swing.JMenuItem();
        menu_salvarFatura = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menu_grafico = new javax.swing.JMenuItem();
        menu_graficoAnual = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        menu_pagamento = new javax.swing.JMenuItem();
        menu_consulta_pagamento = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        menu_perfil = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        menu_cadastro_cartao = new javax.swing.JMenuItem();
        menu_cadastro_banco = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        painel.setBackground(new java.awt.Color(204, 204, 204));

        btn_fatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gaeenergy/images/lampada.png"))); // NOI18N
        btn_fatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_faturaActionPerformed(evt);
            }
        });

        btn_grafico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gaeenergy/images/grafics.png"))); // NOI18N
        btn_grafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_graficoActionPerformed(evt);
            }
        });

        btn_pagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gaeenergy/images/payment.png"))); // NOI18N
        btn_pagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pagamentoActionPerformed(evt);
            }
        });

        btn_perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gaeenergy/images/profile.png"))); // NOI18N
        btn_perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_perfilActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gaeenergy/images/suport.png"))); // NOI18N

        btn_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gaeenergy/images/quit.png"))); // NOI18N
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addComponent(btn_fatura, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_grafico, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 256, Short.MAX_VALUE))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_fatura, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_grafico, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 568, Short.MAX_VALUE))
        );

        getContentPane().add(painel);

        jMenu1.setText("Fatura");

        menu_visualizarFatura.setText("Visualizar fatura");
        menu_visualizarFatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_visualizarFaturaActionPerformed(evt);
            }
        });
        jMenu1.add(menu_visualizarFatura);

        menu_salvarFatura.setText("Salvar fatura");
        menu_salvarFatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_salvarFaturaActionPerformed(evt);
            }
        });
        jMenu1.add(menu_salvarFatura);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Analise de gastos");

        menu_grafico.setText("Grafico mensal");
        menu_grafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_graficoActionPerformed(evt);
            }
        });
        jMenu2.add(menu_grafico);

        menu_graficoAnual.setText("Grafico anual");
        menu_graficoAnual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_graficoAnualActionPerformed(evt);
            }
        });
        jMenu2.add(menu_graficoAnual);

        jMenuBar1.add(jMenu2);

        jMenu7.setText("Pagamentos");

        menu_pagamento.setText("Efetuar pagamento");
        menu_pagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_pagamentoActionPerformed(evt);
            }
        });
        jMenu7.add(menu_pagamento);

        menu_consulta_pagamento.setText("Consultar pagamento");
        menu_consulta_pagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_consulta_pagamentoActionPerformed(evt);
            }
        });
        jMenu7.add(menu_consulta_pagamento);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("Perfil");

        jMenuItem8.setText("Visualizar perfil");
        jMenu8.add(jMenuItem8);

        menu_perfil.setText("Editar Perfil");
        menu_perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_perfilActionPerformed(evt);
            }
        });
        jMenu8.add(menu_perfil);

        jMenuBar1.add(jMenu8);

        jMenu9.setText("Cadastros");

        menu_cadastro_cartao.setText("Cadastrar cartao de credito");
        menu_cadastro_cartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_cadastro_cartaoActionPerformed(evt);
            }
        });
        jMenu9.add(menu_cadastro_cartao);

        menu_cadastro_banco.setText("Cadastrar conta bancaria");
        menu_cadastro_banco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_cadastro_bancoActionPerformed(evt);
            }
        });
        jMenu9.add(menu_cadastro_banco);

        jMenuBar1.add(jMenu9);

        jMenu10.setText("Suporte");
        jMenuBar1.add(jMenu10);

        jMenu11.setText("Sobre");
        jMenuBar1.add(jMenu11);

        jMenu12.setText("Sair");
        jMenu12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu12ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu12);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_salvarFaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_salvarFaturaActionPerformed
        FrmAdicionarFatura fl = new FrmAdicionarFatura();
        painel.add(fl);
        fl.setVisible(true);
    }//GEN-LAST:event_menu_salvarFaturaActionPerformed

    private void jMenu12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu12ActionPerformed

        switch (JOptionPane.showConfirmDialog(null, "Deseja 'vazar'?")) {
            case 0:
                System.out.println("botao yes clicado");
                break;
            case 1:
                System.out.println("botao no clicado");
                break;
            case 2:
                System.out.println("botao cancel clicado");
                break;
        }
    }//GEN-LAST:event_jMenu12ActionPerformed

    private void menu_visualizarFaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_visualizarFaturaActionPerformed

        FrmFatura f1 = new FrmFatura();
        painel.add(f1);
        f1.setVisible(true);
    }//GEN-LAST:event_menu_visualizarFaturaActionPerformed

    private void btn_faturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_faturaActionPerformed
        FrmFatura f1 = new FrmFatura();
        painel.add(f1);
        f1.setVisible(true);
    }//GEN-LAST:event_btn_faturaActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        // System.exit(0);
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_graficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_graficoActionPerformed
        FrmGrafico fl = new FrmGrafico();
        painel.add(fl);
        fl.setVisible(true);
    }//GEN-LAST:event_btn_graficoActionPerformed

    private void menu_graficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_graficoActionPerformed
        FrmGrafico fl = new FrmGrafico();
        painel.add(fl);
        fl.setVisible(true);
    }//GEN-LAST:event_menu_graficoActionPerformed

    private void menu_graficoAnualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_graficoAnualActionPerformed
        JOptionPane.showMessageDialog(jMenu1, "AINDA NÃO IMPLEMENTADO");
    }//GEN-LAST:event_menu_graficoAnualActionPerformed

    private void btn_perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_perfilActionPerformed
        FrmPerfil fl = new FrmPerfil();
        painel.add(fl);
        fl.setVisible(true);
    }//GEN-LAST:event_btn_perfilActionPerformed

    private void menu_perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_perfilActionPerformed
        FrmPerfil fl = new FrmPerfil();
        painel.add(fl);
        fl.setVisible(true);
    }//GEN-LAST:event_menu_perfilActionPerformed

    private void menu_cadastro_cartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_cadastro_cartaoActionPerformed
        FrmCadastroCartaoCredito fl = new FrmCadastroCartaoCredito();
        painel.add(fl);
        fl.setVisible(true);
    }//GEN-LAST:event_menu_cadastro_cartaoActionPerformed

    private void menu_cadastro_bancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_cadastro_bancoActionPerformed
        FrmCadastroContaBancaria fl = new FrmCadastroContaBancaria();
        painel.add(fl);
        fl.setVisible(true);
    }//GEN-LAST:event_menu_cadastro_bancoActionPerformed

    private void menu_pagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_pagamentoActionPerformed
        FrmPagamentos fl = new FrmPagamentos();
        painel.add(fl);
        fl.setVisible(true);
    }//GEN-LAST:event_menu_pagamentoActionPerformed

    private void btn_pagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pagamentoActionPerformed
        FrmPagamentos fl = new FrmPagamentos();
        painel.add(fl);
        fl.setVisible(true);
    }//GEN-LAST:event_btn_pagamentoActionPerformed

    private void menu_consulta_pagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_consulta_pagamentoActionPerformed
        FrmConsultaPagamentos fl = new FrmConsultaPagamentos();
        painel.add(fl);
        fl.setVisible(true);
    }//GEN-LAST:event_menu_consulta_pagamentoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DesktopPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DesktopPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DesktopPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DesktopPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DesktopPane().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_fatura;
    private javax.swing.JButton btn_grafico;
    private javax.swing.JButton btn_pagamento;
    private javax.swing.JButton btn_perfil;
    private javax.swing.JButton btn_sair;
    private javax.swing.JButton jButton5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem menu_cadastro_banco;
    private javax.swing.JMenuItem menu_cadastro_cartao;
    private javax.swing.JMenuItem menu_consulta_pagamento;
    private javax.swing.JMenuItem menu_grafico;
    private javax.swing.JMenuItem menu_graficoAnual;
    private javax.swing.JMenuItem menu_pagamento;
    private javax.swing.JMenuItem menu_perfil;
    private javax.swing.JMenuItem menu_salvarFatura;
    private javax.swing.JMenuItem menu_visualizarFatura;
    private javax.swing.JPanel painel;
    // End of variables declaration//GEN-END:variables
}
