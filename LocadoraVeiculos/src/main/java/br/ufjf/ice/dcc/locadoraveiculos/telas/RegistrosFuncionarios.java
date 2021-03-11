/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.ice.dcc.locadoraveiculos.telas;

import br.ufjf.ice.dcc.locadoraveiculos.Locadora;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucca
 */
public class RegistrosFuncionarios extends javax.swing.JFrame {

    /**
     * Creates new form RegistrosClientes
     */
    public RegistrosFuncionarios() {
        initComponents();
        carregaTabelaFuncionario();
    }
    
    
    public void carregaTabelaFuncionario(){
        
        //VETOR DE OBJETO COM O NOME DAS COLUNAS
        Object colunas[] = new Object[]{"Funcionario", "Nome", "CPF", "Data de Nascimento", "Email", "Telefone", "Logradouro", "Nº", "CEP", "Complemento", "Bairro", "Cidade", "UF"};
        //ADICIONA COLUNAS NA TABELA.
        DefaultTableModel modeloTabela = new DefaultTableModel(colunas, 0);
        
        for (int i = 0; i < Locadora.getAtendente().size(); i++) {
            //FORMATA SAÍDA DA DATA.
            String data = Alugar.converteDateString(Locadora.getAtendente().get(i).getDataNascimento());
            
            //VETOR DE OBJETOS COM ITEMS DA LINHA
            Object linha[] = new Object[] {"Atendente", Locadora.getAtendente().get(i).getNome(),
                Locadora.getAtendente().get(i).getCpf(),data,
                Locadora.getAtendente().get(i).getEmail(),
                Locadora.getAtendente().get(i).getTelefone(),
                Locadora.getAtendente().get(i).getEndereco().getLogradouro(),
                Locadora.getAtendente().get(i).getEndereco().getNumero(),
                Locadora.getAtendente().get(i).getEndereco().getCep(),
                Locadora.getAtendente().get(i).getEndereco().getComplemento(),
                Locadora.getAtendente().get(i).getEndereco().getBairro(),
                Locadora.getAtendente().get(i).getEndereco().getCidade(),
                Locadora.getAtendente().get(i).getEndereco().getEstado()};
            
            //ADICIONA LINHA NA TABELA
            modeloTabela.addRow(linha);
        }
        
        for (int i = 0; i < Locadora.getGerente().size(); i++) {
            //FORMATA SAÍDA DA DATA.
            String data = Alugar.converteDateString(Locadora.getGerente().get(i).getDataNascimento());
            
            //VETOR DE OBJETOS COM ITEMS DA LINHA
            Object linha[] = new Object[] {"Gerente", Locadora.getGerente().get(i).getNome(),
                Locadora.getGerente().get(i).getCpf(),data,
                Locadora.getGerente().get(i).getEmail(),
                Locadora.getGerente().get(i).getTelefone(),
                Locadora.getGerente().get(i).getEndereco().getLogradouro(),
                Locadora.getGerente().get(i).getEndereco().getNumero(),
                Locadora.getGerente().get(i).getEndereco().getCep(),
                Locadora.getGerente().get(i).getEndereco().getComplemento(),
                Locadora.getGerente().get(i).getEndereco().getBairro(),
                Locadora.getGerente().get(i).getEndereco().getCidade(),
                Locadora.getGerente().get(i).getEndereco().getEstado()};
            
            //ADICIONA LINHA NA TABELA
            modeloTabela.addRow(linha);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTb_funcionario = new javax.swing.JTable();
        bt_voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Registro de Funcionários");

        jTb_funcionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Funcionário", "Nome", "CPF", "Data de Nascimento", "Email", "Telefone", "Logradouro", "Número", "CEP", "Complemento", "Bairro", "Cidade", "UF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTb_funcionario);

        bt_voltar.setText("Voltar");
        bt_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(628, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(147, 147, 147))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltarActionPerformed
        new Registros().setVisible(true);
        this.setVisible(false);         // TODO add your handling code here:
    }//GEN-LAST:event_bt_voltarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrosFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrosFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrosFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrosFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrosFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTb_funcionario;
    // End of variables declaration//GEN-END:variables
}
