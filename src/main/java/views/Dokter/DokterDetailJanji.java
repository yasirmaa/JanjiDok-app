/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.Dokter;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Dokter;
import models.JanjiMedis;
import models.Pasien;
import models.RiwayatMedis;
import views.MainApp;

/**
 *
 * @author Lenovo
 */
public class DokterDetailJanji extends javax.swing.JPanel {

    private final MainApp app;
    private final Dokter dokter;
    private final JanjiMedis janjiMedis;
    private SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

    public DokterDetailJanji(MainApp app, Dokter dokter, JanjiMedis janjiMedis) {
        this.app = app;
        initComponents();
        this.dokter = dokter;
        this.janjiMedis = janjiMedis;
        labelTanggal.setText(": " + formatter.format(janjiMedis.getTanggal()));
        labelJumPasien.setText(": " + janjiMedis.getAllPasien().size());
        tampilTabel();
    }

    public void tampilTabel() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("Nama");
        model.addColumn("Status");

        model.setRowCount(0);

        for (int i = 0; i < janjiMedis.getJumlahPasien(); i++) {
            model.addRow(new Object[]{
                i + 1,
                janjiMedis.getPasien(i).getFullName(),
                janjiMedis.getPasienStatus(janjiMedis.getPasien(i))
            });
        }
        tabelDetailJanji.setModel(model);
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
        formTitle = new javax.swing.JLabel();
        btnTanganiPasien = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelTanggal = new javax.swing.JLabel();
        labelJumPasien = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDetailJanji = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

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
        labelRiwayat.setText("Riwayat");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
                .addComponent(labelLogout)
                .addGap(33, 33, 33))
        );

        formTitle.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        formTitle.setText("Detail Janji Medis");

        btnTanganiPasien.setText("Tangani");
        btnTanganiPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanganiPasienActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Tanggal");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Jumlah Pasien");

        labelTanggal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelTanggal.setText(": 17-10-2023");

        labelJumPasien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelJumPasien.setText(": 3");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Daftar Pasien :");

        tabelDetailJanji.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Tanggal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelDetailJanji.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDetailJanjiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelDetailJanji);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(formTitle)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(54, 54, 54)
                                        .addComponent(labelTanggal))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(labelJumPasien)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTanganiPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(55, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(formTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelTanggal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(labelJumPasien))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTanganiPasien)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void labelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHomeMouseClicked
        // TODO add your handling code here:
        app.changeView(new DokterHome(app, dokter));
    }//GEN-LAST:event_labelHomeMouseClicked

    private void labelJanjiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelJanjiMouseClicked
        // TODO add your handling code here:
        app.changeView(new DokterJanjiMedis(app, dokter));
    }//GEN-LAST:event_labelJanjiMouseClicked

    private void labelRiwayatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRiwayatMouseClicked
        // TODO add your handling code here:
        app.changeView(new DokterRiwayatJanji(app, dokter));
    }//GEN-LAST:event_labelRiwayatMouseClicked

    private void labelLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLogoutMouseClicked
        // TODO add your handling code here:
        app.showLoginView();
    }//GEN-LAST:event_labelLogoutMouseClicked

    private void btnTanganiPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTanganiPasienActionPerformed

        int selectedRow = tabelDetailJanji.getSelectedRow();
        if (selectedRow > -1) {
            Pasien pasien = janjiMedis.getPasien(selectedRow);
            if (janjiMedis.getPasienStatus(pasien).equals("Sudah Ditangani")) {
                btnTanganiPasien.disable();
            } else {
                String input = JOptionPane.showInputDialog(this,
                        "Masukkan catatan medis:");

                if (input != null) {
                    RiwayatMedis riwayatMedis = new RiwayatMedis(janjiMedis.getTanggal(), this.dokter, input);

                    pasien.tambahRiwayatMedis(riwayatMedis);
                    janjiMedis.setPasienStatus(pasien, "Sudah Ditangani");
                    JOptionPane.showMessageDialog(this, "Berhasil mencatat riwayat medis!");
                } else {
                    JOptionPane.showMessageDialog(this, "Catatan medis tidak valid!");
                }
                tampilTabel();
                tabelDetailJanji.getSelectionModel().clearSelection();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih pasien terlebih dahulu");
        }
    }//GEN-LAST:event_btnTanganiPasienActionPerformed

    private void tabelDetailJanjiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDetailJanjiMouseClicked
        // TODO add your handling code here:
        int selectedRow = tabelDetailJanji.getSelectedRow();

    }//GEN-LAST:event_tabelDetailJanjiMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        app.changeView(new DokterJanjiMedis(app, dokter));
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnTanganiPasien;
    private javax.swing.JLabel formTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelHome;
    private javax.swing.JLabel labelJanji;
    private javax.swing.JLabel labelJumPasien;
    private javax.swing.JLabel labelLogout;
    private javax.swing.JLabel labelRiwayat;
    private javax.swing.JLabel labelTanggal;
    private javax.swing.JTable tabelDetailJanji;
    // End of variables declaration//GEN-END:variables
}
