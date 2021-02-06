/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Data.Person;

/**
 *
 * @author ameya
 */
public class ViewSavingsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewSavingsJPanel
     */
    Person person;
    public ViewSavingsJPanel(Person person) {
        initComponents();
        this.person = person;
        displayperson();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        svngacctypeTxt = new javax.swing.JTextField();
        svngaccLbl = new javax.swing.JLabel();
        svngacctypeLbl = new javax.swing.JLabel();
        svngaccbalLbl = new javax.swing.JLabel();
        svngTxt = new javax.swing.JTextField();
        bnknameLbl = new javax.swing.JLabel();
        svngaccbalTxt = new javax.swing.JTextField();
        svngbnknameTxt = new javax.swing.JTextField();
        rtngLbl = new javax.swing.JLabel();
        svngrtngTxt = new javax.swing.JTextField();
        svngLbl = new javax.swing.JLabel();

        setBackground(java.awt.SystemColor.inactiveCaption);
        setPreferredSize(new java.awt.Dimension(650, 500));
        setLayout(null);

        svngacctypeTxt.setEditable(false);
        svngacctypeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svngacctypeTxtActionPerformed(evt);
            }
        });
        add(svngacctypeTxt);
        svngacctypeTxt.setBounds(297, 232, 190, 23);

        svngaccLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        svngaccLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        svngaccLbl.setText("Savings Account Number :");
        add(svngaccLbl);
        svngaccLbl.setBounds(104, 144, 175, 23);

        svngacctypeLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        svngacctypeLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        svngacctypeLbl.setText("Account Type :");
        add(svngacctypeLbl);
        svngacctypeLbl.setBounds(156, 230, 123, 23);

        svngaccbalLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        svngaccbalLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        svngaccbalLbl.setText("Account Balance :");
        add(svngaccbalLbl);
        svngaccbalLbl.setBounds(122, 187, 157, 23);

        svngTxt.setEditable(false);
        svngTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svngTxtActionPerformed(evt);
            }
        });
        add(svngTxt);
        svngTxt.setBounds(297, 146, 190, 23);

        bnknameLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bnknameLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bnknameLbl.setText("Bank Name :");
        add(bnknameLbl);
        bnknameLbl.setBounds(175, 58, 100, 23);

        svngaccbalTxt.setEditable(false);
        svngaccbalTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svngaccbalTxtActionPerformed(evt);
            }
        });
        add(svngaccbalTxt);
        svngaccbalTxt.setBounds(297, 189, 190, 23);

        svngbnknameTxt.setEditable(false);
        svngbnknameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svngbnknameTxtActionPerformed(evt);
            }
        });
        add(svngbnknameTxt);
        svngbnknameTxt.setBounds(297, 60, 190, 23);

        rtngLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rtngLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rtngLbl.setText("Routing Number :");
        add(rtngLbl);
        rtngLbl.setBounds(146, 101, 130, 23);

        svngrtngTxt.setEditable(false);
        svngrtngTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svngrtngTxtActionPerformed(evt);
            }
        });
        add(svngrtngTxt);
        svngrtngTxt.setBounds(297, 103, 190, 23);

        svngLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        svngLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        svngLbl.setText("Savings Account Information");
        add(svngLbl);
        svngLbl.setBounds(10, 11, 630, 29);
    }// </editor-fold>//GEN-END:initComponents

    private void svngacctypeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svngacctypeTxtActionPerformed
        // TODO add your handling code here:
        svngacctypeTxt.setText("Savings");
        svngacctypeTxt.setEditable(false);
    }//GEN-LAST:event_svngacctypeTxtActionPerformed

    private void svngbnknameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svngbnknameTxtActionPerformed
        // TODO add your handling code here:
        svngbnknameTxt.setEditable(false);
    }//GEN-LAST:event_svngbnknameTxtActionPerformed

    private void svngrtngTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svngrtngTxtActionPerformed
        // TODO add your handling code here:
        svngrtngTxt.setEditable(false);
    }//GEN-LAST:event_svngrtngTxtActionPerformed

    private void svngaccbalTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svngaccbalTxtActionPerformed
        // TODO add your handling code here:
        svngaccbalTxt.setEditable(false);
    }//GEN-LAST:event_svngaccbalTxtActionPerformed

    private void svngTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svngTxtActionPerformed
        // TODO add your handling code here:
        svngTxt.setEditable(false);
    }//GEN-LAST:event_svngTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bnknameLbl;
    private javax.swing.JLabel rtngLbl;
    private javax.swing.JLabel svngLbl;
    private javax.swing.JTextField svngTxt;
    private javax.swing.JLabel svngaccLbl;
    private javax.swing.JLabel svngaccbalLbl;
    private javax.swing.JTextField svngaccbalTxt;
    private javax.swing.JLabel svngacctypeLbl;
    private javax.swing.JTextField svngacctypeTxt;
    private javax.swing.JTextField svngbnknameTxt;
    private javax.swing.JTextField svngrtngTxt;
    // End of variables declaration//GEN-END:variables

    private void displayperson() {
        
        svngbnknameTxt.setText(person.getSave_name());
        svngrtngTxt.setText(person.getSave__rnum());
        svngTxt.setText(person.getSave__accnum());
        svngaccbalTxt.setText(person.getSave__accbal());
        svngacctypeTxt.setText(person.getSave__acctype());
    }
}
