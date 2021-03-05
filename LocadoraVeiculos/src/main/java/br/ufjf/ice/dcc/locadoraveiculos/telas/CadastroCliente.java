/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.ice.dcc.locadoraveiculos.telas;

import br.ufjf.ice.dcc.locadoraveiculos.Endereco;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ronan
 */
public class CadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        initComponents();
        setLocationRelativeTo(null);     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        but_cadastroCancelar = new javax.swing.JButton();
        but_cadastroSalvar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jL_nome = new javax.swing.JLabel();
        ctext_cadastroNome = new javax.swing.JTextField();
        jL_email = new javax.swing.JLabel();
        ctext_cadastroEmail = new javax.swing.JTextField();
        jL_CPF = new javax.swing.JLabel();
        ctext_cadastroCpf = new javax.swing.JTextField();
        jL_dataNascimento = new javax.swing.JLabel();
        ctext_cadastroNascimento = new javax.swing.JTextField();
        jL_telefone = new javax.swing.JLabel();
        ctext_cadastroTelefone = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        ctext_endLogra = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ctext_endCep = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ctext_endNumero = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ctext_endComplemento = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ctext_endBairro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ctext_endCidade = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        ctext_endUf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastre um novo Cliente");

        but_cadastroCancelar.setText("Cancelar");
        but_cadastroCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_cadastroCancelarActionPerformed(evt);
            }
        });

        but_cadastroSalvar.setText("Salvar");
        but_cadastroSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_cadastroSalvarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Pessoal"));

        jL_nome.setText("Nome");

        ctext_cadastroNome.setToolTipText("Nome completo");
        ctext_cadastroNome.setName("Nome completo"); // NOI18N

        jL_email.setText("E-mail");

        ctext_cadastroEmail.setToolTipText("Nome completo");
        ctext_cadastroEmail.setName("Nome completo"); // NOI18N

        jL_CPF.setText("CPF");

        ctext_cadastroCpf.setToolTipText("Nome completo");
        ctext_cadastroCpf.setName("Nome completo"); // NOI18N

        jL_dataNascimento.setText("Data de nascimento");

        ctext_cadastroNascimento.setToolTipText("Nome completo");
        ctext_cadastroNascimento.setName("Nome completo"); // NOI18N

        jL_telefone.setText("Telefone");

        ctext_cadastroTelefone.setToolTipText("Nome completo");
        ctext_cadastroTelefone.setName("Nome completo"); // NOI18N
        ctext_cadastroTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctext_cadastroTelefoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jL_CPF)
                    .addComponent(jL_email)
                    .addComponent(jL_nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ctext_cadastroEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jL_telefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctext_cadastroTelefone))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ctext_cadastroCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jL_dataNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctext_cadastroNascimento))
                    .addComponent(ctext_cadastroNome, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_nome)
                    .addComponent(ctext_cadastroNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_CPF)
                    .addComponent(ctext_cadastroCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_dataNascimento)
                    .addComponent(ctext_cadastroNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_email)
                    .addComponent(ctext_cadastroEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_telefone)
                    .addComponent(ctext_cadastroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Endereço"));

        jLabel8.setText("Logradouro");

        ctext_endLogra.setToolTipText("Nome completo");
        ctext_endLogra.setName("Nome completo"); // NOI18N
        ctext_endLogra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctext_endLograActionPerformed(evt);
            }
        });

        jLabel9.setText("CEP");

        ctext_endCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctext_endCepActionPerformed(evt);
            }
        });

        jLabel6.setText("Número");

        ctext_endNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctext_endNumeroActionPerformed(evt);
            }
        });

        jLabel10.setText("Complemento");

        ctext_endComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctext_endComplementoActionPerformed(evt);
            }
        });

        jLabel11.setText("Bairro");

        jLabel12.setText("Cidade");

        ctext_endCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctext_endCidadeActionPerformed(evt);
            }
        });

        jLabel13.setText("UF");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ctext_endBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctext_endCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctext_endUf, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ctext_endCep, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctext_endComplemento))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ctext_endLogra)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctext_endNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ctext_endLogra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(ctext_endNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ctext_endCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(ctext_endComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(ctext_endBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(ctext_endCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(ctext_endUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        ctext_endLogra.getAccessibleContext().setAccessibleName("Nome completo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(but_cadastroSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(but_cadastroCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(but_cadastroSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but_cadastroCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void but_cadastroCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_cadastroCancelarActionPerformed
        new Principal().setVisible(true);
        this.setVisible(false);        
    }//GEN-LAST:event_but_cadastroCancelarActionPerformed

    private void ctext_endLograActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctext_endLograActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctext_endLograActionPerformed

    private void but_cadastroSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_cadastroSalvarActionPerformed
        
        int numero = Integer.parseInt(ctext_endNumero.getText());//Passa numero de string para inteiro
        //Instancia um novo endereco
        Endereco endereco = new Endereco(ctext_endCep.getText(), ctext_endLogra.getText(), numero, ctext_endComplemento.getText(), 
                                         ctext_endBairro.getText(),ctext_endCidade.getText(),ctext_endUf.getText());
        
        new Principal().setVisible(true);
        this.setVisible(false);
        
       // String nome = jL_nome.getText().trim();
       // String cpf = jL_CPF.getText().trim();
       // String dtNasc = jL_dataNascimento.getText().trim();
       // String email = jL_email.getText().trim();
       // String tel = jL_telefone.getText().trim();
        

    }//GEN-LAST:event_but_cadastroSalvarActionPerformed

    private void ctext_endCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctext_endCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctext_endCepActionPerformed

    private void ctext_endNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctext_endNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctext_endNumeroActionPerformed

    private void ctext_endComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctext_endComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctext_endComplementoActionPerformed

    private void ctext_endCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctext_endCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctext_endCidadeActionPerformed

    private void ctext_cadastroTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctext_cadastroTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctext_cadastroTelefoneActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but_cadastroCancelar;
    private javax.swing.JButton but_cadastroSalvar;
    private javax.swing.JTextField ctext_cadastroCpf;
    private javax.swing.JTextField ctext_cadastroEmail;
    private javax.swing.JTextField ctext_cadastroNascimento;
    private javax.swing.JTextField ctext_cadastroNome;
    private javax.swing.JTextField ctext_cadastroTelefone;
    private javax.swing.JTextField ctext_endBairro;
    private javax.swing.JTextField ctext_endCep;
    private javax.swing.JTextField ctext_endCidade;
    private javax.swing.JTextField ctext_endComplemento;
    private javax.swing.JTextField ctext_endLogra;
    private javax.swing.JTextField ctext_endNumero;
    private javax.swing.JTextField ctext_endUf;
    private javax.swing.JLabel jL_CPF;
    private javax.swing.JLabel jL_dataNascimento;
    private javax.swing.JLabel jL_email;
    private javax.swing.JLabel jL_nome;
    private javax.swing.JLabel jL_telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
