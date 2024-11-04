/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.transaction.transaction.igu;

import com.transaction.transaction.logic.Controller;
import com.transaction.transaction.logic.Transaction;
import com.transaction.transaction.logic.querys;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class UpdateTransaction extends javax.swing.JFrame {


    Controller control = null;
    Transaction tran = new Transaction();
    querys query = new querys();

    public UpdateTransaction( int idTransaction) {
        control = new Controller();
        initComponents();
        
        query.loadDataFromDatabase(comboIdUser, comboIdUserCreate, comboIdUserUpdate, comboIdForm, comboIdModule);
        loadDataTransaction(idTransaction);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtOldValue = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNewValue = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        comboIdUser = new javax.swing.JComboBox<>();
        comboIdModule = new javax.swing.JComboBox<>();
        comboIdForm = new javax.swing.JComboBox<>();
        comboIdUserCreate = new javax.swing.JComboBox<>();
        comboIdUserUpdate = new javax.swing.JComboBox<>();
        comboQueryType = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        jLabel1.setText("Update Transaction");

        jLabel2.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        jLabel2.setText("ID User: ");

        jLabel3.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        jLabel3.setText("ID Module: ");

        jLabel4.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        jLabel4.setText("ID Form: ");

        jLabel5.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        jLabel5.setText("Query Type:");

        jLabel6.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        jLabel6.setText("Old Value:");

        txtOldValue.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        txtOldValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOldValueActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        jLabel7.setText("New Value: ");

        txtNewValue.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        jLabel8.setText("ID User Create: ");

        jLabel9.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        jLabel9.setText("ID User Update: ");

        jButton1.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("/home/enzo/NetBeansProjects/icons/delete_10336397.png")); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon("/home/enzo/NetBeansProjects/icons/floppy_9512164.png")); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("/home/enzo/NetBeansProjects/icons/left-arrow_10024675.png")); // NOI18N
        jButton3.setText(" Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        comboIdUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32" }));
        comboIdUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboIdUserActionPerformed(evt);
            }
        });

        comboIdModule.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        comboIdModule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboIdModuleActionPerformed(evt);
            }
        });

        comboIdForm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41" }));
        comboIdForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboIdFormActionPerformed(evt);
            }
        });

        comboIdUserCreate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32" }));
        comboIdUserCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboIdUserCreateActionPerformed(evt);
            }
        });

        comboIdUserUpdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32" }));
        comboIdUserUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboIdUserUpdateActionPerformed(evt);
            }
        });

        comboQueryType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GET", "POST", "PUT", "DELETE", "PATCH" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4))
                            .addComponent(jLabel2))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboIdForm, 0, 280, Short.MAX_VALUE)
                                    .addComponent(comboIdModule, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(comboIdUser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboIdUserUpdate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboIdUserCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtNewValue, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtOldValue)
                                    .addComponent(comboQueryType, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)))
                .addGap(119, 119, 119))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboIdModule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(comboIdUserCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboIdForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(comboIdUserUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboQueryType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtOldValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNewValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtOldValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOldValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOldValueActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // clean the combobox and the txt input:
        comboIdUser.setSelectedIndex(0);
        comboIdModule.setSelectedIndex(0);
        comboIdForm.setSelectedIndex(0);
        comboQueryType.setSelectedIndex(0);
        txtOldValue.setText("");
        txtNewValue.setText("");
        comboIdUserCreate.setSelectedIndex(0);
        comboIdUserUpdate.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        //save the valor of the igu in a variable
        int idUser = comboIdUser.getSelectedIndex() + 1;
        int idModule = comboIdModule.getSelectedIndex() + 1;
        int idForms = comboIdForm.getSelectedIndex() + 1;
        String queryType = comboQueryType.getSelectedItem().toString();
        String oldValue = txtOldValue.getText();
        String newValue = txtNewValue.getText();
        int idUserCreate = comboIdUserCreate.getSelectedIndex() + 1;
        int idUserUpdate = comboIdUserUpdate.getSelectedIndex() + 1;
        
        control.updateTransaction(tran, idUser, idModule, idForms, queryType, oldValue, newValue, idUserCreate, idUserUpdate );
        
        showMessage("The record has been successfully updated.", "Info", "Update Successful");
        
        TransactionTable table = new TransactionTable();
        table.setVisible(true);
        table.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void comboIdUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboIdUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboIdUserActionPerformed

    private void comboIdModuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboIdModuleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboIdModuleActionPerformed

    private void comboIdFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboIdFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboIdFormActionPerformed

    private void comboIdUserCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboIdUserCreateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboIdUserCreateActionPerformed

    private void comboIdUserUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboIdUserUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboIdUserUpdateActionPerformed

    
     public void showMessage(String message, String type, String title){
        JOptionPane optionPane = new JOptionPane(message);
        if(type.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        else if (type.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(title);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboIdForm;
    private javax.swing.JComboBox<String> comboIdModule;
    private javax.swing.JComboBox<String> comboIdUser;
    private javax.swing.JComboBox<String> comboIdUserCreate;
    private javax.swing.JComboBox<String> comboIdUserUpdate;
    private javax.swing.JComboBox<String> comboQueryType;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNewValue;
    private javax.swing.JTextField txtOldValue;
    // End of variables declaration//GEN-END:variables

    private void loadDataTransaction(int idTransaction) {
        
        tran = control.getDataToUpdate(idTransaction);
        
       
        comboIdUser.setSelectedIndex(tran.getIdUser() - 1);
        comboIdModule.setSelectedIndex(tran.getIdModule() - 1);
        comboIdForm.setSelectedIndex(tran.getIdForms() - 1);
        comboQueryType.setSelectedItem(tran.getQueryType());
        txtOldValue.setText(tran.getOldValue());
        txtNewValue.setText(tran.getNewValue());
        comboIdUserCreate.setSelectedIndex(tran.getIdUserCreate() - 1);
        comboIdUserUpdate.setSelectedIndex(tran.getIdUserUpdate() - 1);
        

    }
}
