/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragdrop;

import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author AnhTu
 */
public class CheckBoxDemo extends javax.swing.JFrame {

    /**
     * Creates new form CheckBoxDemo
     */
    public CheckBoxDemo() {
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

        jPanel1 = new javax.swing.JPanel();
        cbred = new javax.swing.JCheckBox();
        cbblue = new javax.swing.JCheckBox();
        cbyellow = new javax.swing.JCheckBox();
        btncheck = new javax.swing.JButton();
        cbsall = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbred.setText("Red");
        cbred.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbredItemStateChanged(evt);
            }
        });
        cbred.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cbredStateChanged(evt);
            }
        });

        cbblue.setText("Blue");

        cbyellow.setText("Yellow");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbred, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbblue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbyellow, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbred)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbblue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbyellow)
                .addContainerGap())
        );

        btncheck.setText("Check");
        btncheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncheckActionPerformed(evt);
            }
        });

        cbsall.setText("Select all");
        cbsall.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbsallItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(cbsall))
                    .addComponent(btncheck)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(cbsall)
                .addGap(18, 18, 18)
                .addComponent(btncheck)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncheckActionPerformed
        if(cbred.isSelected()) JOptionPane.showMessageDialog(null, "mày vừa chọn "+cbred.getText());
        if(cbblue.isSelected()) JOptionPane.showMessageDialog(null, "mày vừa chọn "+cbblue.getText());
        if(cbyellow.isSelected()) JOptionPane.showMessageDialog(null, "mày vừa chọn "+cbyellow.getText());
        if((!cbred.isSelected() && !cbblue.isSelected() && !cbyellow.isSelected())) JOptionPane.showMessageDialog(null, "mày ko chọn j à", "Ngu vl!", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btncheckActionPerformed

    private void cbredStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cbredStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbredStateChanged

    private void cbredItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbredItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED)  System.out.println("đỏ");
            //JOptionPane.showMessageDialog(null, "mày vừa chọn đỏ");
    }//GEN-LAST:event_cbredItemStateChanged

    private void cbsallItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbsallItemStateChanged
        boolean check = cbsall.isSelected();
        if(check) {
            cbred.setSelected(true);
            cbblue.setSelected(true);
            cbyellow.setSelected(true);
        }
        else {
            cbred.setSelected(false);
            cbblue.setSelected(false);
            cbyellow.setSelected(false);
        }
    }//GEN-LAST:event_cbsallItemStateChanged

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
            java.util.logging.Logger.getLogger(CheckBoxDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckBoxDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckBoxDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckBoxDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckBoxDemo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncheck;
    private javax.swing.JCheckBox cbblue;
    private javax.swing.JCheckBox cbred;
    private javax.swing.JCheckBox cbsall;
    private javax.swing.JCheckBox cbyellow;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}