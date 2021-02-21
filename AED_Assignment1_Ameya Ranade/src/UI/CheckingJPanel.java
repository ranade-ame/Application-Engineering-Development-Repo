/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Data.Person;
import javax.swing.JOptionPane;

/**
 *
 * @author ameya
 */
public class CheckingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CheckingJPanel
     */
    Person person;
    public CheckingJPanel(Person person) {
        initComponents();
        this.setSize(2000, 2000);
        this.person = person;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chkLbl = new javax.swing.JLabel();
        chkBtn = new javax.swing.JButton();
        chkaccTxt = new javax.swing.JTextField();
        chkbnknameLbl = new javax.swing.JLabel();
        chkaccbalTxt = new javax.swing.JTextField();
        chkbnknameTxt = new javax.swing.JTextField();
        chkrtngLbl = new javax.swing.JLabel();
        chkrtngTxt = new javax.swing.JTextField();
        chkacctypeTxt = new javax.swing.JTextField();
        chkaccLbl = new javax.swing.JLabel();
        chkacctypeLbl = new javax.swing.JLabel();
        chkaccbalLbl = new javax.swing.JLabel();

        setBackground(java.awt.SystemColor.inactiveCaption);
        setPreferredSize(new java.awt.Dimension(650, 500));

        chkLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        chkLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chkLbl.setText("Checking Account Information");

        chkBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chkBtn.setLabel("Save");
        chkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBtnActionPerformed(evt);
            }
        });

        chkaccTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkaccTxtActionPerformed(evt);
            }
        });

        chkbnknameLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkbnknameLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chkbnknameLbl.setText("Bank Name :");

        chkbnknameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbnknameTxtActionPerformed(evt);
            }
        });

        chkrtngLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkrtngLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chkrtngLbl.setText("Routing Number :");

        chkrtngTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkrtngTxtActionPerformed(evt);
            }
        });

        chkacctypeTxt.setEditable(false);
        chkacctypeTxt.setText("Checking");
        chkacctypeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkacctypeTxtActionPerformed(evt);
            }
        });

        chkaccLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkaccLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chkaccLbl.setText("Checking Account Number :");

        chkacctypeLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkacctypeLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chkacctypeLbl.setText("Account Type :");

        chkaccbalLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkaccbalLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chkaccbalLbl.setText("Account Balance :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(chkLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(chkbnknameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(chkbnknameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(chkrtngLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(chkrtngTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(chkaccLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(chkaccTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(chkaccbalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chkaccbalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(chkacctypeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chkacctypeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(chkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(chkLbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkbnknameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(chkbnknameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkrtngLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(chkrtngTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkaccLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(chkaccTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkaccbalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(chkaccbalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkacctypeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(chkacctypeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(chkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chkbnknameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbnknameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbnknameTxtActionPerformed

    private void chkrtngTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkrtngTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkrtngTxtActionPerformed

    private void chkaccTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkaccTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkaccTxtActionPerformed

    private void chkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBtnActionPerformed
        // TODO add your handling code here:
        
        person.setChk_name(chkbnknameTxt.getText());
        person.setChk__rnum(chkrtngTxt.getText());
        person.setChk__accnum(chkaccTxt.getText());
        person.setChk__accbal(chkaccbalTxt.getText());
        person.setChk__acctype(chkacctypeTxt.getText());
        
        JOptionPane.showMessageDialog(this, "Checking Bank Account Information Saved.");
        
    }//GEN-LAST:event_chkBtnActionPerformed

    private void chkacctypeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkacctypeTxtActionPerformed
        // TODO add your handling code here:
        chkacctypeTxt.setText("Savings");
    }//GEN-LAST:event_chkacctypeTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chkBtn;
    private javax.swing.JLabel chkLbl;
    private javax.swing.JLabel chkaccLbl;
    private javax.swing.JTextField chkaccTxt;
    private javax.swing.JLabel chkaccbalLbl;
    private javax.swing.JTextField chkaccbalTxt;
    private javax.swing.JLabel chkacctypeLbl;
    private javax.swing.JTextField chkacctypeTxt;
    private javax.swing.JLabel chkbnknameLbl;
    private javax.swing.JTextField chkbnknameTxt;
    private javax.swing.JLabel chkrtngLbl;
    private javax.swing.JTextField chkrtngTxt;
    // End of variables declaration//GEN-END:variables
}