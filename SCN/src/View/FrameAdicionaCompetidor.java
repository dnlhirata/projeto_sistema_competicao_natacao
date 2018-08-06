package View;


import Controller.pesquisaCompeticao;
import Controller.pesquisaCompetidor;
import Controller.pesquisaModalidade;
import Model.Uteis;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class FrameAdicionaCompetidor extends javax.swing.JFrame {
    
    Uteis funcoes = new Uteis();
    
    /**
     * Creates new form FrameAdicionaCompetidor
     */
    public FrameAdicionaCompetidor() {
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
        btAdicionar = new javax.swing.JButton();
        painelCompetidores = new javax.swing.JPanel();
        chkCompetidor1 = new javax.swing.JCheckBox();
        chkCompetidor7 = new javax.swing.JCheckBox();
        cbCompetidor3 = new javax.swing.JComboBox<>();
        chkCompetidor3 = new javax.swing.JCheckBox();
        chkCompetidor8 = new javax.swing.JCheckBox();
        chkCompetidor5 = new javax.swing.JCheckBox();
        chkCompetidor6 = new javax.swing.JCheckBox();
        cbCompetidor2 = new javax.swing.JComboBox<>();
        cbCompetidor4 = new javax.swing.JComboBox<>();
        cbCompetidor6 = new javax.swing.JComboBox<>();
        chkCompetidor4 = new javax.swing.JCheckBox();
        cbCompetidor8 = new javax.swing.JComboBox<>();
        cbCompetidor1 = new javax.swing.JComboBox<>();
        cbCompetidor7 = new javax.swing.JComboBox<>();
        chkCompetidor2 = new javax.swing.JCheckBox();
        cbCompetidor5 = new javax.swing.JComboBox<>();
        lbNomeCompeticao = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btAdicionar.setText("Adicionar");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        chkCompetidor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCompetidor1ActionPerformed(evt);
            }
        });

        chkCompetidor7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCompetidor7ActionPerformed(evt);
            }
        });

        cbCompetidor3.setEnabled(false);

        chkCompetidor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCompetidor3ActionPerformed(evt);
            }
        });

        chkCompetidor8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCompetidor8ActionPerformed(evt);
            }
        });

        chkCompetidor5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCompetidor5ActionPerformed(evt);
            }
        });

        chkCompetidor6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCompetidor6ActionPerformed(evt);
            }
        });

        cbCompetidor2.setEnabled(false);

        cbCompetidor4.setEnabled(false);

        cbCompetidor6.setEnabled(false);

        chkCompetidor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCompetidor4ActionPerformed(evt);
            }
        });

        cbCompetidor8.setEnabled(false);

        cbCompetidor1.setEnabled(false);

        cbCompetidor7.setEnabled(false);

        chkCompetidor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCompetidor2ActionPerformed(evt);
            }
        });

        cbCompetidor5.setEnabled(false);
        cbCompetidor5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCompetidor5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCompetidoresLayout = new javax.swing.GroupLayout(painelCompetidores);
        painelCompetidores.setLayout(painelCompetidoresLayout);
        painelCompetidoresLayout.setHorizontalGroup(
            painelCompetidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCompetidoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCompetidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkCompetidor2)
                    .addComponent(chkCompetidor3)
                    .addComponent(chkCompetidor4)
                    .addComponent(chkCompetidor1))
                .addGap(8, 8, 8)
                .addGroup(painelCompetidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cbCompetidor3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbCompetidor2, javax.swing.GroupLayout.Alignment.LEADING, 0, 240, Short.MAX_VALUE)
                    .addComponent(cbCompetidor1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbCompetidor4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(painelCompetidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelCompetidoresLayout.createSequentialGroup()
                        .addComponent(chkCompetidor5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbCompetidor5, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelCompetidoresLayout.createSequentialGroup()
                        .addComponent(chkCompetidor6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbCompetidor6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelCompetidoresLayout.createSequentialGroup()
                        .addComponent(chkCompetidor7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbCompetidor7, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelCompetidoresLayout.createSequentialGroup()
                        .addComponent(chkCompetidor8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbCompetidor8, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelCompetidoresLayout.setVerticalGroup(
            painelCompetidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCompetidoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCompetidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkCompetidor1)
                    .addComponent(chkCompetidor5)
                    .addGroup(painelCompetidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbCompetidor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbCompetidor5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(painelCompetidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkCompetidor6)
                    .addGroup(painelCompetidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbCompetidor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chkCompetidor2)
                        .addComponent(cbCompetidor6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(painelCompetidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkCompetidor7)
                    .addGroup(painelCompetidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbCompetidor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chkCompetidor3)
                        .addComponent(cbCompetidor7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(painelCompetidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkCompetidor8)
                    .addGroup(painelCompetidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbCompetidor4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chkCompetidor4)
                        .addComponent(cbCompetidor8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        lbNomeCompeticao.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbNomeCompeticao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAdicionar)
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCompetidores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNomeCompeticao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNomeCompeticao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelCompetidores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btAdicionar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbCompetidor5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCompetidor5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCompetidor5ActionPerformed

    private void chkCompetidor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCompetidor1ActionPerformed
        int numBateria = pegaUltimoCaracter();
        funcoes.habilitaComboBox(chkCompetidor1, cbCompetidor1, this.painelCompetidores, this.lbNomeCompeticao, this, numBateria);
    }//GEN-LAST:event_chkCompetidor1ActionPerformed

    private void chkCompetidor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCompetidor2ActionPerformed
        int numBateria = pegaUltimoCaracter();
        funcoes.habilitaComboBox(chkCompetidor2, cbCompetidor2, this.painelCompetidores, this.lbNomeCompeticao, this, numBateria);
    }//GEN-LAST:event_chkCompetidor2ActionPerformed

    private void chkCompetidor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCompetidor3ActionPerformed
        int numBateria = pegaUltimoCaracter();
        funcoes.habilitaComboBox(chkCompetidor3, cbCompetidor3, this.painelCompetidores, this.lbNomeCompeticao, this, numBateria);
    }//GEN-LAST:event_chkCompetidor3ActionPerformed

    private void chkCompetidor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCompetidor4ActionPerformed
        int numBateria = pegaUltimoCaracter();
        funcoes.habilitaComboBox(chkCompetidor4, cbCompetidor4, this.painelCompetidores, this.lbNomeCompeticao, this, numBateria);
    }//GEN-LAST:event_chkCompetidor4ActionPerformed

    private void chkCompetidor5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCompetidor5ActionPerformed
        int numBateria = pegaUltimoCaracter();
        funcoes.habilitaComboBox(chkCompetidor5, cbCompetidor5, this.painelCompetidores, this.lbNomeCompeticao, this, numBateria);
    }//GEN-LAST:event_chkCompetidor5ActionPerformed

    private void chkCompetidor6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCompetidor6ActionPerformed
        int numBateria = pegaUltimoCaracter();
        funcoes.habilitaComboBox(chkCompetidor6, cbCompetidor6, this.painelCompetidores, this.lbNomeCompeticao, this, numBateria);
    }//GEN-LAST:event_chkCompetidor6ActionPerformed

    private void chkCompetidor7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCompetidor7ActionPerformed
        int numBateria = pegaUltimoCaracter();
        funcoes.habilitaComboBox(chkCompetidor7, cbCompetidor7, this.painelCompetidores, this.lbNomeCompeticao, this, numBateria);
    }//GEN-LAST:event_chkCompetidor7ActionPerformed

    private void chkCompetidor8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCompetidor8ActionPerformed
        int numBateria = pegaUltimoCaracter();
        funcoes.habilitaComboBox(chkCompetidor8, cbCompetidor8, this.painelCompetidores, this.lbNomeCompeticao, this, numBateria);
    }//GEN-LAST:event_chkCompetidor8ActionPerformed

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        try {
            FrameBateria frameBateria = new FrameBateria();
            int codCompeticao = pesquisaCompeticao.pesquisaCompeticao(this.lbNomeCompeticao.getText());
            int codModalidade = pesquisaModalidade.pesquisaModalidade(this.getName());
            int numBateria = pegaUltimoCaracter();
            String bateria = Integer.toString(numBateria);
            DefaultTableModel model = funcoes.montaTabelaCompetidor(frameBateria.tableListagem, frameBateria.spCompetidores);
            pesquisaCompetidor.pesquisaCompetidor(model, bateria, codModalidade, codCompeticao);
            frameBateria.lbNomeCompeticao.setText(this.lbNomeCompeticao.getText());
            frameBateria.setName(this.getName());
            frameBateria.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrameAdicionaCompetidor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(FrameAdicionaCompetidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed
    
    public int pegaUltimoCaracter(){
        int numBateria = (int)this.getTitle().charAt(this.getTitle().length() -1);
        numBateria = numBateria - '0';
        
        return numBateria;
    }
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
            java.util.logging.Logger.getLogger(FrameAdicionaCompetidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameAdicionaCompetidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameAdicionaCompetidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameAdicionaCompetidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameAdicionaCompetidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cbCompetidor1;
    private javax.swing.JComboBox<String> cbCompetidor2;
    private javax.swing.JComboBox<String> cbCompetidor3;
    private javax.swing.JComboBox<String> cbCompetidor4;
    private javax.swing.JComboBox<String> cbCompetidor5;
    private javax.swing.JComboBox<String> cbCompetidor6;
    private javax.swing.JComboBox<String> cbCompetidor7;
    private javax.swing.JComboBox<String> cbCompetidor8;
    private javax.swing.JCheckBox chkCompetidor1;
    private javax.swing.JCheckBox chkCompetidor2;
    private javax.swing.JCheckBox chkCompetidor3;
    private javax.swing.JCheckBox chkCompetidor4;
    private javax.swing.JCheckBox chkCompetidor5;
    private javax.swing.JCheckBox chkCompetidor6;
    private javax.swing.JCheckBox chkCompetidor7;
    private javax.swing.JCheckBox chkCompetidor8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JLabel lbNomeCompeticao;
    private javax.swing.JPanel painelCompetidores;
    // End of variables declaration//GEN-END:variables
}
