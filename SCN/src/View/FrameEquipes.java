package View;

import Controller.constroiTabelaEquipe;
import Controller.deletaEquipe;
import Controller.pesquisaAtleta;
import Controller.pesquisaCompeticao;
import Controller.pesquisaEquipe;
import Model.Equipe;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dnlhi
 */
public class FrameEquipes extends javax.swing.JFrame {

    DefaultTableModel model;
    Equipe cliente = new Equipe();

    /**
     * Creates new form FrameEquipes
     */
    public FrameEquipes() throws SQLException {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btVoltar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        painelListagem = new javax.swing.JPanel();
        tbCRUD = new javax.swing.JToolBar();
        btAdicionar = new javax.swing.JButton();
        btIncluiAtleta = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        ftfPesquisar = new javax.swing.JFormattedTextField();
        spEquipes = new javax.swing.JScrollPane();
        tableListagem = new javax.swing.JTable();
        lbNomeCompeticao = new javax.swing.JLabel();
        btRelatorio = new javax.swing.JButton();
        mbEquipe = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btVoltar.setText("Voltar");
        btVoltar.setPreferredSize(new java.awt.Dimension(100, 30));
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.setPreferredSize(new java.awt.Dimension(100, 30));
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        painelListagem.setBorder(javax.swing.BorderFactory.createTitledBorder("EQUIPES"));

        tbCRUD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbCRUD.setFloatable(false);

        btAdicionar.setText("Adicionar");
        btAdicionar.setFocusable(false);
        btAdicionar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAdicionar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });
        tbCRUD.add(btAdicionar);

        btIncluiAtleta.setText("Incluir Atleta");
        btIncluiAtleta.setFocusable(false);
        btIncluiAtleta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btIncluiAtleta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btIncluiAtleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluiAtletaActionPerformed(evt);
            }
        });
        tbCRUD.add(btIncluiAtleta);

        btAlterar.setText("Alterar");
        btAlterar.setFocusable(false);
        btAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });
        tbCRUD.add(btAlterar);

        btRemover.setText("Remover");
        btRemover.setFocusable(false);
        btRemover.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btRemover.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });
        tbCRUD.add(btRemover);

        btPesquisar.setText("Pesquisar");
        btPesquisar.setFocusable(false);
        btPesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btPesquisar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        tbCRUD.add(btPesquisar);

        ftfPesquisar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        ftfPesquisar.setPreferredSize(new java.awt.Dimension(100, 30));
        ftfPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftfPesquisarActionPerformed(evt);
            }
        });
        tbCRUD.add(ftfPesquisar);

        tableListagem.setAutoCreateRowSorter(true);
        tableListagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableListagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableListagem.setAutoscrolls(false);
        tableListagem.getTableHeader().setReorderingAllowed(false);
        spEquipes.setViewportView(tableListagem);

        javax.swing.GroupLayout painelListagemLayout = new javax.swing.GroupLayout(painelListagem);
        painelListagem.setLayout(painelListagemLayout);
        painelListagemLayout.setHorizontalGroup(
            painelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbCRUD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(spEquipes)
        );
        painelListagemLayout.setVerticalGroup(
            painelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelListagemLayout.createSequentialGroup()
                .addComponent(tbCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spEquipes, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lbNomeCompeticao.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbNomeCompeticao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btRelatorio.setText("Relatório");
        btRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatorioActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        mbEquipe.add(jMenu1);

        jMenu2.setText("Edit");
        mbEquipe.add(jMenu2);

        setJMenuBar(mbEquipe);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelListagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btRelatorio)
                        .addGap(201, 201, 201)
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lbNomeCompeticao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNomeCompeticao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(painelListagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRelatorio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        FrameSelecaoPrincipal frameSelecao = new FrameSelecaoPrincipal();
        frameSelecao.lbNomeCompeticao.setText((String) this.lbNomeCompeticao.getText());
        frameSelecao.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSairActionPerformed

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        try {
            FrameAdicionaEquipe frameAdiciona = new FrameAdicionaEquipe();
            frameAdiciona.lbNomeCompeticao.setText((String) this.lbNomeCompeticao.getText());
            frameAdiciona.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrameEquipes.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        try {
            int linha = tableListagem.getSelectedRow();
            int codEquipe;
            codEquipe = Integer.parseInt((String) tableListagem.getValueAt(linha, 0));
            FrameAlteraEquipe frameEquipe = new FrameAlteraEquipe();
            frameEquipe.lbNomeCompeticao.setText((String) this.lbNomeCompeticao.getText());
            frameEquipe.setVisible(true);

            ResultSet rs = pesquisaEquipe.pesquisaEquipe(codEquipe);

            while (rs.next()) {
                frameEquipe.tfCodigo.setText(rs.getString("Codigo"));
                frameEquipe.tfCodigo.setEnabled(false);
                frameEquipe.tfNome.setText(rs.getString("Nome"));
                frameEquipe.cbNacionalidade.setSelectedItem(rs.getString("Nacionalidade"));
                frameEquipe.cbStatus.setSelectedItem(rs.getString("Status"));
            }
            this.dispose();
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Selecine uma equipe.");
        } catch (SQLException ex) {
            Logger.getLogger(FrameAtletas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btAlterarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        try {
            int linha = tableListagem.getSelectedRow();
            int codEquipe;
            codEquipe = (int) tableListagem.getValueAt(linha, 0);

            deletaEquipe.deletarEquipe(codEquipe);
            int codCompeticao = pesquisaCompeticao.pesquisaCompeticao(this.lbNomeCompeticao.getText());
            model = constroiTabelaEquipe.estruturaTabelaEquipe(this.tableListagem, this.spEquipes);
            pesquisaEquipe.carregaJTableEquipes(model, codCompeticao);

        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Selecine uma equipe.");
        } catch (SQLException ex) {
            Logger.getLogger(FrameEquipes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        try {
            pesquisaEquipe.pesquisaEquipe(this.ftfPesquisar, this.tableListagem, this.spEquipes);
        } catch (SQLException ex) {
            Logger.getLogger(FrameEquipes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void ftfPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftfPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftfPesquisarActionPerformed

    private void btIncluiAtletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluiAtletaActionPerformed
        try {
            int linha = tableListagem.getSelectedRow();
            String nomeEquipe;
            nomeEquipe = (String) tableListagem.getValueAt(linha, 1);

            FrameIncluirAtletaEquipe novoFrame = new FrameIncluirAtletaEquipe();
            novoFrame.setVisible(true);
            novoFrame.tfNomeEquipe.setText(nomeEquipe);
            novoFrame.tfNomeEquipe.setEnabled(false);

        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Selecine uma equipe.");
        } catch (SQLException ex) {
            Logger.getLogger(FrameEquipes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btIncluiAtletaActionPerformed

    private void btRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatorioActionPerformed
        ResultSet rs;
        try {
            int codCompeticao = pesquisaCompeticao.pesquisaCompeticao(this.lbNomeCompeticao.getText());
            rs = pesquisaEquipe.pesquisaTodasEquipe(codCompeticao);
            JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
            JasperPrint jp;
            jp = JasperFillManager.fillReport("C:\\Users\\dnlhi\\Dropbox\\FATEC\\2017\\2º Semestre\\Programação Orientada a Objetos Avançada\\NetBeansProjects\\Projeto\\SCN\\relatorio\\MyReports\\equipes.jasper", null, jrRS);
            JasperViewer relatorio = new JasperViewer(jp, false);
            relatorio.setVisible(true);
            relatorio.toFront();
        } catch (SQLException | JRException ex) {
            Logger.getLogger(FrameSelecaoPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btRelatorioActionPerformed

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
            java.util.logging.Logger.getLogger(FrameEquipes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameEquipes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameEquipes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameEquipes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new FrameEquipes().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(FrameEquipes.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btIncluiAtleta;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btRelatorio;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btVoltar;
    private javax.swing.JFormattedTextField ftfPesquisar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    public javax.swing.JLabel lbNomeCompeticao;
    private javax.swing.JMenuBar mbEquipe;
    private javax.swing.JPanel painelListagem;
    public javax.swing.JScrollPane spEquipes;
    public javax.swing.JTable tableListagem;
    private javax.swing.JToolBar tbCRUD;
    // End of variables declaration//GEN-END:variables

}
