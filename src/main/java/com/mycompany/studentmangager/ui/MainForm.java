/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.studentmangager.ui;

import com.mycompany.studentmangager.helper.ShareData;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author tanki
 */
public class MainForm extends javax.swing.JFrame {
    private StudentManagerPanel mStudentPanel;
    private GPAManagementPanel mGPAPanel;
    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
       
        setLocationRelativeTo(null);
        
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);//mở mainForm toàn màn hình
        
        //Tạo from đăng nhập trước khi vào mainForm
        LoginDialog dialog = new LoginDialog(this, true);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        processLoginSuccessful();
        
        
        // display role
        lblLoginName.setText(ShareData.nguoiDangNhap.getTenDangNhap());
        lblRole.setText(ShareData.nguoiDangNhap.getVaiTro());
        if (ShareData.nguoiDangNhap.getVaiTro().equals("Giang vien")){
           jButton2.setEnabled(false);
           jButton3.setEnabled(true);
        }else if (ShareData.nguoiDangNhap.getVaiTro().equals("Dao tao")){
            jButton2.setEnabled(true);
            jButton3.setEnabled(false);
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

        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        tbrLogout = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        tbrAboutUs = new javax.swing.JButton();
        tplMainBoard = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        lblLoginName = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFile_Exit = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuManager = new javax.swing.JMenu();
        mnuManagerStudent = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuManagerGPA = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnuAboutUs = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        tbrLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/studentmangager/icons/logout-icon-32.png"))); // NOI18N
        tbrLogout.setText("Đăng xuất");
        tbrLogout.setFocusable(false);
        tbrLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbrLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbrLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbrLogoutActionPerformed(evt);
            }
        });
        jToolBar1.add(tbrLogout);
        jToolBar1.add(jSeparator4);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/studentmangager/icons/10207-man-student-light-skin-tone-icon-32.png"))); // NOI18N
        jButton2.setText("Quản Lý Sinh Viên");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/studentmangager/icons/Actions-document-edit-icon-32.png"))); // NOI18N
        jButton3.setText("Quản Lý Điểm");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);
        jToolBar1.add(jSeparator5);

        tbrAboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/studentmangager/icons/Actions-help-about-icon-32.png"))); // NOI18N
        tbrAboutUs.setText("Giới Thiệu");
        tbrAboutUs.setFocusable(false);
        tbrAboutUs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbrAboutUs.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbrAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbrAboutUsActionPerformed(evt);
            }
        });
        jToolBar1.add(tbrAboutUs);

        lblLoginName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblLoginName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginName.setText("Người dùng");

        lblRole.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRole.setText("Vai trò");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLoginName)
                    .addComponent(lblRole))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLoginName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRole)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        mnuFile_Exit.setText("Hệ thống");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Đăng xuất");
        mnuFile_Exit.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Thoát");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnuFile_Exit.add(jMenuItem2);
        mnuFile_Exit.add(jSeparator1);

        jMenuBar1.add(mnuFile_Exit);

        mnuManager.setText("Quản lý");

        mnuManagerStudent.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuManagerStudent.setText("Quản Lý Sinh Viên");
        mnuManagerStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManagerStudentActionPerformed(evt);
            }
        });
        mnuManager.add(mnuManagerStudent);
        mnuManager.add(jSeparator2);

        mnuManagerGPA.setText("Quản Lý Điểm");
        mnuManagerGPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManagerGPAActionPerformed(evt);
            }
        });
        mnuManager.add(mnuManagerGPA);

        jMenuBar1.add(mnuManager);

        jMenu4.setText("Trợ giúp");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem5.setText("Nội Dung");
        jMenu4.add(jMenuItem5);
        jMenu4.add(jSeparator3);

        mnuAboutUs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuAboutUs.setText("Giới Thiệu");
        mnuAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAboutUsActionPerformed(evt);
            }
        });
        jMenu4.add(mnuAboutUs);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tplMainBoard))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tplMainBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void mnuManagerStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManagerStudentActionPerformed
        if (mStudentPanel == null){
            mStudentPanel = new StudentManagerPanel();
            ImageIcon icon = new ImageIcon();
//            ImageIcon icon = new ImageIcon(getClass()
//                    .getResource("/com/mycompany/studentmangager/icons/10207-man-student-light-skin-tone-icon-16"));
            tplMainBoard.addTab("Quản Lý Sinh Viên", icon, mStudentPanel, "Quản Lý Sinh Viên");
        }
        tplMainBoard.setSelectedComponent(mStudentPanel);
    }//GEN-LAST:event_mnuManagerStudentActionPerformed

    private void mnuManagerGPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManagerGPAActionPerformed
        // TODO add your handling code here:
        if (mGPAPanel == null){
            mGPAPanel = new GPAManagementPanel();
            ImageIcon icon = new ImageIcon();
//            ImageIcon icon = new ImageIcon(getClass()
//                    .getResource("/com/mycompany/studentmangager/icons/10207-man-student-light-skin-tone-icon-16"));
            tplMainBoard.addTab("Quản Lý Điểm", icon, mGPAPanel, "Quản Lý Điểm");
        }
        tplMainBoard.setSelectedComponent(mGPAPanel);

    }//GEN-LAST:event_mnuManagerGPAActionPerformed

    private void tbrAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbrAboutUsActionPerformed
        AboutUsDialog aboutDialog = new AboutUsDialog(this, true);
        aboutDialog.setVisible(true);
        
        
    }//GEN-LAST:event_tbrAboutUsActionPerformed

    private void mnuAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAboutUsActionPerformed
        tbrAboutUsActionPerformed(evt);
    }//GEN-LAST:event_mnuAboutUsActionPerformed

    private void tbrLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbrLogoutActionPerformed

        dispose();
        new MainForm().setVisible(true);
        
    }//GEN-LAST:event_tbrLogoutActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        lblLoginName.setText(ShareData.nguoiDangNhap.getTenDangNhap());
        lblRole.setText(ShareData.nguoiDangNhap.getVaiTro());
        if (ShareData.nguoiDangNhap.getVaiTro().equals("Giang vien")){
           jButton2.setEnabled(false);
        }else if (ShareData.nguoiDangNhap.getVaiTro().equals("Dao tao")){
            jButton2.setEnabled(true);
            mnuManagerStudentActionPerformed(evt);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        lblLoginName.setText(ShareData.nguoiDangNhap.getTenDangNhap());
        lblRole.setText(ShareData.nguoiDangNhap.getVaiTro());
        if (ShareData.nguoiDangNhap.getVaiTro().equals("Giang vien")){
           jButton3.setEnabled(true);
            mnuManagerGPAActionPerformed(evt);
        }else if (ShareData.nguoiDangNhap.getVaiTro().equals("Dao tao")){
            jButton3.setEnabled(false);
           
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void processLoginSuccessful(){
        lblLoginName.setText(ShareData.nguoiDangNhap.getTenDangNhap());
        lblRole.setText(ShareData.nguoiDangNhap.getVaiTro());
        
        tplMainBoard.removeAll();
        if (ShareData.nguoiDangNhap.getVaiTro().equals("Giang vien")){
            mnuManagerStudent.setEnabled(false);
            mnuManagerGPA.setEnabled(true);
        }else if (ShareData.nguoiDangNhap.getVaiTro().equals("Dao tao")){
            mnuManagerStudent.setEnabled(true);
            mnuManagerGPA.setEnabled(false);
    }
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblLoginName;
    private javax.swing.JLabel lblRole;
    private javax.swing.JMenuItem mnuAboutUs;
    private javax.swing.JMenu mnuFile_Exit;
    private javax.swing.JMenu mnuManager;
    private javax.swing.JMenuItem mnuManagerGPA;
    private javax.swing.JMenuItem mnuManagerStudent;
    private javax.swing.JButton tbrAboutUs;
    private javax.swing.JButton tbrLogout;
    private javax.swing.JTabbedPane tplMainBoard;
    // End of variables declaration//GEN-END:variables
}
