/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;


import javax.swing.ImageIcon;
import repo.repogambar;


/**
 *
 * @author werkudoro
 */
public class Menu extends javax.swing.JFrame {
    repogambar r = new repogambar();
    
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        admin.setIcon(new ImageIcon(r.adminImage()));
        inpem.setIcon(new ImageIcon(r.databiayaImage()));
        dataguru.setIcon(new ImageIcon(r.guruImage()));
        datakelas.setIcon(new ImageIcon(r.kelasImage()));
        datasiswa.setIcon(new ImageIcon(r.siswaImage()));
        dalas.setIcon(new ImageIcon(r.walasImage()));
        gajiguru.setIcon(new ImageIcon(r.gajiguruImage()));
        lap.setIcon(new ImageIcon(r.infoImage()));
        spp.setIcon(new ImageIcon(r.sppImage()));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dalas = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        admin = new javax.swing.JButton();
        inpem = new javax.swing.JButton();
        dataguru = new javax.swing.JButton();
        datakelas = new javax.swing.JButton();
        datasiswa = new javax.swing.JButton();
        gajiguru = new javax.swing.JButton();
        lap = new javax.swing.JButton();
        spp = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        dalas.setBackground(new java.awt.Color(0, 56, 81));
        dalas.setForeground(new java.awt.Color(191, 210, 217));
        dalas.setText("Data Walikelas");
        dalas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(191, 210, 217), 2));
        dalas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dalas.setPreferredSize(new java.awt.Dimension(140, 141));
        dalas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        dalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dalasActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 153));

        jPanel1.setBackground(new java.awt.Color(0, 37, 53));
        jPanel1.setPreferredSize(new java.awt.Dimension(1010, 560));

        admin.setBackground(new java.awt.Color(0, 56, 81));
        admin.setForeground(new java.awt.Color(191, 210, 217));
        admin.setText("Admin");
        admin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(191, 210, 217), 2));
        admin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin.setPreferredSize(new java.awt.Dimension(140, 141));
        admin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });

        inpem.setBackground(new java.awt.Color(0, 56, 81));
        inpem.setForeground(new java.awt.Color(191, 210, 217));
        inpem.setText("Info Pembayaran");
        inpem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(191, 210, 217), 2));
        inpem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        inpem.setPreferredSize(new java.awt.Dimension(140, 141));
        inpem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        inpem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpemActionPerformed(evt);
            }
        });

        dataguru.setBackground(new java.awt.Color(0, 56, 81));
        dataguru.setForeground(new java.awt.Color(191, 210, 217));
        dataguru.setText("Data Guru");
        dataguru.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(191, 210, 217), 2));
        dataguru.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dataguru.setPreferredSize(new java.awt.Dimension(140, 141));
        dataguru.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        dataguru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataguruActionPerformed(evt);
            }
        });

        datakelas.setBackground(new java.awt.Color(0, 56, 81));
        datakelas.setForeground(new java.awt.Color(191, 210, 217));
        datakelas.setText("Data Kelas");
        datakelas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(191, 210, 217), 2));
        datakelas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        datakelas.setMaximumSize(new java.awt.Dimension(104, 25));
        datakelas.setMinimumSize(new java.awt.Dimension(104, 25));
        datakelas.setPreferredSize(new java.awt.Dimension(140, 141));
        datakelas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        datakelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datakelasActionPerformed(evt);
            }
        });

        datasiswa.setBackground(new java.awt.Color(0, 56, 81));
        datasiswa.setForeground(new java.awt.Color(191, 210, 217));
        datasiswa.setText("Data Siswa");
        datasiswa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(191, 210, 217), 2));
        datasiswa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        datasiswa.setPreferredSize(new java.awt.Dimension(140, 141));
        datasiswa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        datasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datasiswaActionPerformed(evt);
            }
        });

        gajiguru.setBackground(new java.awt.Color(0, 56, 81));
        gajiguru.setForeground(new java.awt.Color(191, 210, 217));
        gajiguru.setText("Gaji Guru");
        gajiguru.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(191, 210, 217), 2));
        gajiguru.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gajiguru.setPreferredSize(new java.awt.Dimension(140, 141));
        gajiguru.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gajiguru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gajiguruActionPerformed(evt);
            }
        });

        lap.setBackground(new java.awt.Color(0, 56, 81));
        lap.setForeground(new java.awt.Color(191, 210, 217));
        lap.setText("Laporan");
        lap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(191, 210, 217), 2));
        lap.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lap.setPreferredSize(new java.awt.Dimension(140, 141));
        lap.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapActionPerformed(evt);
            }
        });

        spp.setBackground(new java.awt.Color(0, 56, 81));
        spp.setForeground(new java.awt.Color(191, 210, 217));
        spp.setText("Pembayaran");
        spp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(191, 210, 217), 2));
        spp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        spp.setPreferredSize(new java.awt.Dimension(140, 141));
        spp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        spp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sppActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(59, 137, 172));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(191, 210, 217));
        jLabel1.setText("MTS AN NIZHOMIYAH");
        jLabel1.setPreferredSize(new java.awt.Dimension(419, 48));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(318, 318, 318))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inpem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datasiswa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gajiguru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataguru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datakelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lap, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(datakelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dataguru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datasiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inpem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gajiguru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void datasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datasiswaActionPerformed
        // TODO add your handling code here:
        dispose();
        datasiswa dsiswa = new datasiswa();
        dsiswa.show();
    }//GEN-LAST:event_datasiswaActionPerformed

    private void gajiguruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gajiguruActionPerformed
        // TODO add your handling code here:
        dispose();
        GajiGuru gg = new GajiGuru();
        gg.show();
    }//GEN-LAST:event_gajiguruActionPerformed

    private void dataguruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataguruActionPerformed
        // TODO add your handling code here:
        dispose();
        DataGuru dguru = new DataGuru();
        dguru.show();
    }//GEN-LAST:event_dataguruActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        // TODO add your handling code here:
        dispose();
        admin adminn = new admin();
        adminn.show();
    }//GEN-LAST:event_adminActionPerformed

    private void datakelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datakelasActionPerformed
        // TODO add your handling code here:
        dispose();
        datakelas dkelas= new datakelas();
        dkelas.show();
    }//GEN-LAST:event_datakelasActionPerformed

    private void dalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dalasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dalasActionPerformed

    private void inpemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpemActionPerformed
        // TODO add your handling code here:
        dispose();
        InfoPembayaran ip = new InfoPembayaran();
        ip.show();
    }//GEN-LAST:event_inpemActionPerformed

    private void sppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sppActionPerformed
        // TODO add your handling code here:
        dispose();
        Pembayaran spp = new Pembayaran();
        spp.show();
    }//GEN-LAST:event_sppActionPerformed

    private void lapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapActionPerformed
        // TODO add your handling code here:
       dispose();
       Laporann lp = new Laporann();
       lp.show();
        
    }//GEN-LAST:event_lapActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin;
    private javax.swing.JButton dalas;
    private javax.swing.JButton dataguru;
    private javax.swing.JButton datakelas;
    private javax.swing.JButton datasiswa;
    private javax.swing.JButton gajiguru;
    private javax.swing.JButton inpem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton lap;
    private javax.swing.JButton spp;
    // End of variables declaration//GEN-END:variables
}
