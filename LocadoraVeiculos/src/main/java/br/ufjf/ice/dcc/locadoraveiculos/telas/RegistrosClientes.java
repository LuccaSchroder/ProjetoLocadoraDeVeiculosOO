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
public class RegistrosClientes extends javax.swing.JFrame {

    /**
     * Creates new form RegistrosClientes
     */
    public RegistrosClientes() {
        initComponents();
        carregaTabelaClientes();
    }
    
    public void carregaTabelaClientes(){
        String data;
        //VETOR DE OBJETO COM O NOME DAS COLUNAS
        Object colunas[] = new Object[]{"Nome", "CPF/CNPJ", "Data de Nascimento", "Email", "Telefone", "Logradouro", "Nº", "CEP", "Complemento", "Bairro", "Cidade", "UF"};
        //ADICIONA COLUNAS NA TABELA.
        DefaultTableModel modeloTabela = new DefaultTableModel(colunas, 0);
        
        for (int i = 0; i < Locadora.getCliente().size(); i++) {
            //FORMATA SAÍDA DA DATA.
            if(Locadora.getCliente().get(i).getDataNascimento() != null)
                data = Alugar.converteDateString(Locadora.getCliente().get(i).getDataNascimento());
            else
                data = " - ";
            
            //VETOR DE OBJETOS COM ITEMS DA LINHA
            Object linha[] = new Object[] {Locadora.getCliente().get(i).getNome(),
                Locadora.getCliente().get(i).getID(),data,
                Locadora.getCliente().get(i).getEmail(),
                Locadora.getCliente().get(i).getTelefone(),
                Locadora.getCliente().get(i).getEndereco().getLogradouro(),
                Locadora.getCliente().get(i).getEndereco().getNumero(),
                Locadora.getCliente().get(i).getEndereco().getCep(),
                Locadora.getCliente().get(i).getEndereco().getComplemento(),
                Locadora.getCliente().get(i).getEndereco().getBairro(),
                Locadora.getCliente().get(i).getEndereco().getCidade(),
                Locadora.getCliente().get(i).getEndereco().getEstado()};
            
            //ADICIONA LINHA NA TABELA
            modeloTabela.addRow(linha);
        }
        
        jTb_Clientes.setModel(modeloTabela);
        
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
        jTb_Clientes = new javax.swing.JTable();
        but_voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Registro de Clientes");

        jTb_Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Data de Nascimento", "Email", "Telefone", "Logradouro", "Número", "CEP", "Complemento", "Bairro", "Cidade", "UF"
            }
        ));
        jScrollPane1.setViewportView(jTb_Clientes);

        but_voltar.setText("Voltar");
        but_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(but_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(jLabel1)))
                        .addGap(0, 224, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(but_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void but_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_voltarActionPerformed
        new Registros().setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_but_voltarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrosClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrosClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrosClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrosClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrosClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTb_Clientes;
    // End of variables declaration//GEN-END:variables
}
