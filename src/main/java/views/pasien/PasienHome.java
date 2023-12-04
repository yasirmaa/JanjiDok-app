/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.pasien;

import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import models.Pasien;
import views.MainApp;
import views.auth.LoginView;

/**
 *
 * @author Lenovo
 */
public class PasienHome extends javax.swing.JPanel {

    private final MainApp app;
    private final Pasien pasien;

    public PasienHome(MainApp app, Pasien pasien) {
        this.app = app;
        initComponents();
        this.pasien = pasien;
        tampilProfil();
    }
    
    private void tampilProfil(){
        labelNama.setText(": " +  pasien.getFullName());
        labelNoTelp.setText(": " + pasien.getNoTelp());
        labelUsername.setText(": " + pasien.getUsername());
        if(pasien.getFotoProfile() == null){
           ImageIcon icon = new ImageIcon(getClass().getResource("/profile-user.png"));
           lblImage.setIcon(icon);
        }else{
            ImageIcon icon = new ImageIcon("T:\\Kuliah\\Semester 3\\PBO\\JanjiDok\\src\\main\\resources\\"+pasien.getFotoProfile());
            Image image = icon.getImage().getScaledInstance(105,90, Image.SCALE_SMOOTH);
            ImageIcon ic = new ImageIcon(image);
            lblImage.setIcon(ic);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelHome = new javax.swing.JLabel();
        labelJanji = new javax.swing.JLabel();
        labelRiwayat = new javax.swing.JLabel();
        labelLogout = new javax.swing.JLabel();
        labelObat = new javax.swing.JLabel();
        labelRiwayatBeli = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        btnUpload = new javax.swing.JButton();
        labelNoTelp = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(64, 123, 255));

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("JanjiDok");

        labelHome.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        labelHome.setForeground(new java.awt.Color(255, 255, 255));
        labelHome.setText("Home");
        labelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelHomeMouseClicked(evt);
            }
        });

        labelJanji.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        labelJanji.setForeground(new java.awt.Color(255, 255, 255));
        labelJanji.setText("Janji Medis");
        labelJanji.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelJanjiMouseClicked(evt);
            }
        });

        labelRiwayat.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        labelRiwayat.setForeground(new java.awt.Color(255, 255, 255));
        labelRiwayat.setText("Riwayat Medis");
        labelRiwayat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRiwayatMouseClicked(evt);
            }
        });

        labelLogout.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        labelLogout.setForeground(new java.awt.Color(255, 255, 255));
        labelLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        labelLogout.setText("Log Out");
        labelLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLogoutMouseClicked(evt);
            }
        });

        labelObat.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        labelObat.setForeground(new java.awt.Color(255, 255, 255));
        labelObat.setText("Obatku");
        labelObat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelObatMouseClicked(evt);
            }
        });

        labelRiwayatBeli.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        labelRiwayatBeli.setForeground(new java.awt.Color(255, 255, 255));
        labelRiwayatBeli.setText("Riwayat Beli");
        labelRiwayatBeli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRiwayatBeliMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelRiwayatBeli)
                    .addComponent(labelObat)
                    .addComponent(labelLogout)
                    .addComponent(labelRiwayat)
                    .addComponent(labelJanji)
                    .addComponent(labelHome)
                    .addComponent(jLabel1))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(labelHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelJanji)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelRiwayat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelObat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelRiwayatBeli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(labelLogout)
                .addGap(33, 33, 33))
        );

        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel5.setText("Home");

        jLabel7.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel7.setText("Informasi Pribadi");

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel8.setText("Nama Lengkap");

        labelNama.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        labelNama.setText(": Yasir Maarif");

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnUpload.setBackground(new java.awt.Color(0, 153, 153));
        btnUpload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit.png"))); // NOI18N
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        labelNoTelp.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        labelNoTelp.setText(": 085230538453");

        jLabel10.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel10.setText("No Telpon");

        jLabel11.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel11.setText("Username");

        labelUsername.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        labelUsername.setText(": yasirmaarif");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(68, 68, 68)
                                .addComponent(labelNama))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblImage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpload))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelUsername)
                                    .addComponent(labelNoTelp))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpload))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(labelNama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(labelNoTelp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(labelUsername))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void labelLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLogoutMouseClicked
        // TODO add your handling code here:
        app.changeView(new LoginView(app));
    }//GEN-LAST:event_labelLogoutMouseClicked

    private void labelJanjiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelJanjiMouseClicked
        // TODO add your handling code here:
        app.changeView(new PasienJanjiMedis(app, pasien));
    }//GEN-LAST:event_labelJanjiMouseClicked

    private void labelRiwayatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRiwayatMouseClicked
        // TODO add your handling code here:
        app.changeView(new PasienRiwayatMedis(app, pasien));
    }//GEN-LAST:event_labelRiwayatMouseClicked

    private void labelObatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelObatMouseClicked
        // TODO add your handling code here:
        app.changeView(new PasienBeliObat(app, pasien));
    }//GEN-LAST:event_labelObatMouseClicked

    private void labelRiwayatBeliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRiwayatBeliMouseClicked
        // TODO add your handling code here:
        app.changeView(new PasienRiwayatBeli(app, pasien));
    }//GEN-LAST:event_labelRiwayatBeliMouseClicked

    private void labelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHomeMouseClicked
        // TODO add your handling code here:
        app.changeView(new PasienHome(app, pasien));
    }//GEN-LAST:event_labelHomeMouseClicked

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        try{
            String filename;
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File f = chooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(f.toString());
            Image image = icon.getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon ic = new ImageIcon(image);
            lblImage.setIcon(ic);
            
            filename = f.getAbsolutePath();
            String newPath = "src/main/resources";
            File directory = new File(newPath);
            if(!directory.exists()){
                directory.mkdirs();
            }
            File sourceFile = null;
            File destinationFile = null;
            String extension = filename.substring(filename.lastIndexOf('.') + 1);
            sourceFile = new File(filename);
            Date tanggalUpdate = new Date();
            String tampilan = "yyyyMMddhhmmss";
            SimpleDateFormat fm = new SimpleDateFormat(tampilan);
            String tanggal = String.valueOf(fm.format(tanggalUpdate));
            destinationFile = new File(newPath+"/newImage" + tanggal.toString() + "." + extension);
            
            pasien.setFotoProfile("newImage" + tanggal.toString() + "." + extension);
            
            Files.copy(sourceFile.toPath(),destinationFile.toPath());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"error" + e);
        }
    }//GEN-LAST:event_btnUploadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelHome;
    private javax.swing.JLabel labelJanji;
    private javax.swing.JLabel labelLogout;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNoTelp;
    private javax.swing.JLabel labelObat;
    private javax.swing.JLabel labelRiwayat;
    private javax.swing.JLabel labelRiwayatBeli;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JLabel lblImage;
    // End of variables declaration//GEN-END:variables
}
