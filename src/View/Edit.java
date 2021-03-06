/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.controller;
import Model.Doctor;
import Model.Team;
import Model.Ward;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thisura
 */
public class Edit extends javax.swing.JFrame {
    
    String table = "";
    /**
     * Creates new form Edit
     */
    public Edit() {
        initComponents();
    }
    
    public Edit(String table) {
        initComponents();
        this.table=table;
        
        
        if(table=="doctor"){
            
            cb3.addItem("Junior Doctor");
            cb3.addItem("Consaltant");
            cb4.hide();
            lbl4.hide();
        }
        
        
        if(table=="ward"){
            lbl4.setText("Capacity");
            lbl5.hide();
            txt5.hide();
            cb3.addItem("Male");
            cb3.addItem("Female");
            for(int i=20; i<=30; i++){
                
                cb4.addItem(Integer.toString(i));
            }
            
        }
        else if(table=="team"){
            lbl3.setText("Consaltant");
            lbl4.hide();
            cb4.hide();
            lbl5.hide();
            txt5.hide();
            
            try { 
            Doctor dr = new Doctor();
            ResultSet rst = dr.getDocNames();
            while(rst.next()){
                String name = rst.getString("dName");
                cb3.addItem(name);
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
            
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

        lb2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        cb3 = new javax.swing.JComboBox<>();
        cb4 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb2.setText("Name");

        lbl3.setText("Type");

        lbl5.setText("Contact No");

        lbl4.setText("Team");

        txt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt2MousePressed(evt);
            }
        });
        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });

        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lbl1.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl5)
                            .addComponent(lb2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt5)
                            .addComponent(txt2)
                            .addComponent(cb3, 0, 272, Short.MAX_VALUE)
                            .addComponent(cb4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt1))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb2)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl3)
                    .addComponent(cb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl4)
                    .addComponent(cb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl5)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(this.table=="doctor"){
            String id=txt1.getText();
            String name=txt2.getText();
            String type=cb3.getSelectedItem().toString();
            String conno=txt5.getText();

            

            Doctor dr = new Doctor();
            dr.EditDoctor(id, name, type,conno);
        }
        else if(this.table=="ward"){
            String id=txt1.getText();
            String name=txt2.getText();
            String type=cb3.getSelectedItem().toString();
            String capacity=cb4.getSelectedItem().toString();

            

            Ward wd = new Ward();
            wd.EditWard(id, name, type,capacity);
        }
        else if(this.table=="team"){
            String id=txt1.getText();
            String name=txt2.getText();
            String consaltant=cb3.getSelectedItem().toString();

            

            Team tm = new Team();
            tm.EditTeam(id, name, consaltant);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt2MousePressed
         try {
        
            if(!txt1.getText().isEmpty()){
                
                String id = txt1.getText();
                
                controller ct = new controller();
                ResultSet rst=ct.getDetailsbyDB(id, table);
                
                while(rst.next()){                
                   if(this.table=="doctor"){
                        txt2.setText(rst.getString(2));
                        cb3.setSelectedItem(rst.getString(3));
                        cb4.setSelectedItem(controller.getNamebyID(rst.getString(5), "team"));
                        txt5.setText(rst.getString(4));
                    
                    } 
                    
                   else if(this.table=="ward"){
                        txt2.setText(rst.getString(2));
                        cb3.setSelectedItem(rst.getString(3));
                        cb4.setSelectedItem(rst.getString(4));
                   }
                    else if(this.table=="team"){
                        txt2.setText(rst.getString(2));
                        cb3.setSelectedItem(rst.getString(3));
                   }
                    
                }
            } 
            }catch (SQLException ex) {
                Logger.getLogger(EditPatient.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_txt2MousePressed

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
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb3;
    private javax.swing.JComboBox<String> cb4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt5;
    // End of variables declaration//GEN-END:variables
}
