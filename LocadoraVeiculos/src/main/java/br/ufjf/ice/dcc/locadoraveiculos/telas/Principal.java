/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.ice.dcc.locadoraveiculos.telas;

import br.ufjf.ice.dcc.locadoraveiculos.Locadora;
import br.ufjf.ice.dcc.locadoraveiculos.Funcionario;

import javax.swing.ImageIcon;

/**
 *
 * @author Ronan
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        
        carregaLogo();
        carregaNomeUsuario();
        verificaTipoUsuario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastrar_veiculo = new javax.swing.JButton();
        alugar = new javax.swing.JButton();
        adm = new javax.swing.JButton();
        cadastrar_cliente = new javax.swing.JButton();
        cadastrar_funcionario = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        logo2 = new javax.swing.JLabel();
        cx_bem_vindo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cadastrar_veiculo.setText("Cadastrar Veículo");
        cadastrar_veiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_veiculoActionPerformed(evt);
            }
        });

        alugar.setText("Alugar");
        alugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alugarActionPerformed(evt);
            }
        });

        adm.setText("Administração");
        adm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admActionPerformed(evt);
            }
        });

        cadastrar_cliente.setText("Cadastrar Cliente");
        cadastrar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_clienteActionPerformed(evt);
            }
        });

        cadastrar_funcionario.setText("Cadastrar Funcionário");
        cadastrar_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_funcionarioActionPerformed(evt);
            }
        });

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        cx_bem_vindo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cx_bem_vindo.setText("Bem-vindo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(alugar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cadastrar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cadastrar_veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adm, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cadastrar_funcionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cx_bem_vindo)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cx_bem_vindo)
                .addGap(18, 18, 18)
                .addComponent(logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrar_veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrar_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alugar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adm, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void admActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admActionPerformed
        new Registros().setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_admActionPerformed

    private void alugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alugarActionPerformed
        new Alugar().setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_alugarActionPerformed

    private void cadastrar_veiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_veiculoActionPerformed
        new CadastroVeiculo().setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrar_veiculoActionPerformed

    private void cadastrar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_clienteActionPerformed
        new CadastroCliente().setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_cadastrar_clienteActionPerformed

    private void cadastrar_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_funcionarioActionPerformed
        new CadastroFuncionarios().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cadastrar_funcionarioActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        try{
            new Login().setVisible(true);
            this.setVisible(false);
            Locadora.deslogar();
        }catch(RuntimeException err){
            System.out.println(err);
        }
        
    }//GEN-LAST:event_sairActionPerformed
    
    private void verificaTipoUsuario(){
        Funcionario logado = Locadora.getLogado();
        switch(logado.tipoFuncionario()){
            case 0: cadastrar_funcionario.setEnabled(true);
                    break;
            case 1: cadastrar_funcionario.setEnabled(false);
                    break;
        }
    }
    
    private void carregaLogo() {
        ImageIcon icon = new ImageIcon("src/main/java/br/ufjf/ice/dcc/locadoraveiculos/telas/Imagens/logo.png");
        logo2.setIcon(icon);
    }
    
    private void carregaNomeUsuario() {
        if(Locadora.getNomeLogado() == null)
            cx_bem_vindo.setText("Bem-vindo Administrador");
        else
            cx_bem_vindo.setText("Bem-vindo " + Locadora.getNomeLogado());
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adm;
    private javax.swing.JButton alugar;
    private javax.swing.JButton cadastrar_cliente;
    private javax.swing.JButton cadastrar_funcionario;
    private javax.swing.JButton cadastrar_veiculo;
    private javax.swing.JLabel cx_bem_vindo;
    private javax.swing.JLabel logo2;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}
