/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author LamPham
 */
public class Home extends javax.swing.JFrame {
    public static User us ;
    FrmKQTD frmKQ;
    FrmTaiKhoan frmTK;
    FrmBXH frmBXH;
    /**
     * Creates new form Home
     * @param user
     */
    public Home(User user) {
        initComponents();
        us = user ; 
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jToolBar2 = new javax.swing.JToolBar();
        btnBXH = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        btnKQ = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        btnQL = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        btnLichDau = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnTK = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnExit = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jToolBar2.setRollover(true);

        btnBXH.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnBXH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/leaderboard_48px.png"))); // NOI18N
        btnBXH.setText("BXH");
        btnBXH.setFocusable(false);
        btnBXH.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBXH.setMaximumSize(new java.awt.Dimension(55, 73));
        btnBXH.setMinimumSize(new java.awt.Dimension(55, 73));
        btnBXH.setPreferredSize(new java.awt.Dimension(55, 73));
        btnBXH.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBXH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBXHActionPerformed(evt);
            }
        });
        jToolBar2.add(btnBXH);
        jToolBar2.add(jSeparator8);

        btnKQ.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnKQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/goals-icon.png"))); // NOI18N
        btnKQ.setText("Kết quả");
        btnKQ.setFocusable(false);
        btnKQ.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKQ.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKQActionPerformed(evt);
            }
        });
        jToolBar2.add(btnKQ);
        jToolBar2.add(jSeparator9);

        btnQL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnQL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_football_2_50px.png"))); // NOI18N
        btnQL.setText("Quản lý");
        btnQL.setFocusable(false);
        btnQL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQL.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLActionPerformed(evt);
            }
        });
        jToolBar2.add(btnQL);
        jToolBar2.add(jSeparator10);

        btnLichDau.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnLichDau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Calendar-icon.png"))); // NOI18N
        btnLichDau.setText("Lịch đấu");
        btnLichDau.setFocusable(false);
        btnLichDau.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLichDau.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLichDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLichDauActionPerformed(evt);
            }
        });
        jToolBar2.add(btnLichDau);
        jToolBar2.add(jSeparator1);

        btnTK.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnTK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_user_menu_male_skin_type_7_48px.png"))); // NOI18N
        btnTK.setText("Tài khoản");
        btnTK.setFocusable(false);
        btnTK.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTK.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKActionPerformed(evt);
            }
        });
        jToolBar2.add(btnTK);
        jToolBar2.add(jSeparator2);

        btnExit.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Logout_48px.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.setFocusable(false);
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jToolBar2.add(btnExit);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );

        jMenu.setText("Menu");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem2.setText("Refresh");
        jMenu.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem3.setText("Exit");
        jMenu.add(jMenuItem3);

        jMenuBar1.add(jMenu);

        jMenu2.setText("Tool");

        jMenuItem1.setText("Change");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu7.setText("Thông tin");

        jMenuItem4.setText("Cập nhật");
        jMenu7.add(jMenuItem4);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 630, Short.MAX_VALUE))
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKActionPerformed
        // TODO add your handling code here:
        if (frmTK == null || frmTK.isClosed()) {
            frmTK = new FrmTaiKhoan(us);
            jDesktopPane1.add(frmTK);
            frmTK.setLocation(0,0);
            frmTK.setVisible(true);
        } else {
            frmTK.setLocation(0,0);
            frmTK.setVisible(true);
        }      
    }//GEN-LAST:event_btnTKActionPerformed

    private void btnQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLActionPerformed
        // TODO add your handling code here:
        boolean check = false ;       
            if (us.getTinhtrang().equals("admin")) {
                check = true;
            }
        if(check) {
            HomeFrm homeFrm = new HomeFrm();
            homeFrm.setVisible(true);
            this.dispose();
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Ban không có quyền truy cập");
        }
    }//GEN-LAST:event_btnQLActionPerformed

    private void btnLichDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLichDauActionPerformed
        // TODO add your handling code here:
        LichThiDau lichdau = new LichThiDau(us);
        lichdau.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLichDauActionPerformed

    private void btnKQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKQActionPerformed
        // TODO add your handling code here:
        if (frmKQ == null || frmKQ.isClosed()) {
            frmKQ = new FrmKQTD(us);
            jDesktopPane1.add(frmKQ);
            frmKQ.setLocation(0,0);
            frmKQ.setVisible(true);
        } else {
            frmKQ.setLocation(0,0);
            frmKQ.setVisible(true);
        } 
    }//GEN-LAST:event_btnKQActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        DangNhapFrm frm = new DangNhapFrm();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnBXHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBXHActionPerformed
        // TODO add your handling code here:
        if (frmBXH == null || frmBXH.isClosed()) {
            frmBXH = new FrmBXH(us);
            jDesktopPane1.add(frmBXH);
            frmBXH.setLocation(0,0);
            frmBXH.setVisible(true);
        } else {
            frmBXH.setLocation(0,0);
            frmBXH.setVisible(true);
        } 
    }//GEN-LAST:event_btnBXHActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                User us1 = null ;
                new Home(us1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBXH;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnKQ;
    private javax.swing.JButton btnLichDau;
    private javax.swing.JButton btnQL;
    private javax.swing.JButton btnTK;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar2;
    // End of variables declaration//GEN-END:variables
}
