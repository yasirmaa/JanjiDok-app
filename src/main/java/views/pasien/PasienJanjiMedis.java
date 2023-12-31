/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.pasien;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Pasien;
import views.MainApp;
import views.auth.LoginView;

/**
 *
 * @author Lenovo
 */
public class PasienJanjiMedis extends javax.swing.JPanel {

    private final MainApp app;
    private final Pasien pasien;
    private SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

    public PasienJanjiMedis(MainApp app, Pasien pasien) {
        this.app = app;
        initComponents();
        this.pasien = pasien;
        tampilTabel();
    }

    public void tampilTabel() {
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Mengembalikan false agar sel tidak bisa diedit
            }
        };
        model.addColumn("No.");
        model.addColumn("Dokter");
        model.addColumn("Spesialis");
        model.addColumn("Tanggal");
        model.addColumn("Status");

        model.setRowCount(0);

        for (int i = 0; i < app.getRS().getJumlahJanjiMedis(); i++) {
            boolean isRegistered = app.getRS().getJanjiMedis(i).isPasienRegistered(this.pasien);
            String status = isRegistered ? "Sudah Terdaftar" : "Tidak Terdaftar";
            model.addRow(new Object[]{
                i + 1,
                app.getRS().getJanjiMedis(i).getDokter().getFullName(),
                app.getRS().getJanjiMedis(i).getDokter().getSpesialisasi(),
                formatter.format(app.getRS().getJanjiMedis(i).getTanggal()),
                status
            });
        }

        tabelJanjiMedis.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelLogout = new javax.swing.JLabel();
        labelRiwayat = new javax.swing.JLabel();
        labelObat = new javax.swing.JLabel();
        labelRiwayatBeli = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelJanjiMedis = new javax.swing.JTable();
        btnDaftar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(64, 123, 255));

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("JanjiDok");

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Home");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Janji Medis");

        labelLogout.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        labelLogout.setForeground(new java.awt.Color(255, 255, 255));
        labelLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        labelLogout.setText("Log Out");
        labelLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLogoutMouseClicked(evt);
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
                    .addComponent(labelRiwayat)
                    .addComponent(labelLogout)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
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

        tabelJanjiMedis.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tabelJanjiMedis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "Dokter", "Spesialis", "Tanggal", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelJanjiMedis);

        btnDaftar.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnDaftar.setText("Daftar");
        btnDaftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDaftarMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel5.setText("Janji Medis");

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel4.setText("Berikut jadwal janji medis yang tersedia:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel5)
                                .addGap(178, 178, 178))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDaftar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnDaftar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void labelLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLogoutMouseClicked
        // TODO add your handling code here:
        app.changeView(new LoginView(app));
    }//GEN-LAST:event_labelLogoutMouseClicked

    private void btnDaftarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDaftarMouseClicked
        // TODO add your handling code here:
        int selectedRow = tabelJanjiMedis.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Pilih Janji Dahulu");
            return;
        }
        if (tabelJanjiMedis.getValueAt(selectedRow, 4).toString().equals("Sudah Terdaftar")) {
            JOptionPane.showMessageDialog(this, "Anda sudah terdaftar");
            return;            
        }
        app.getRS().getJanjiMedis(selectedRow).tambahPasien(pasien);
        JOptionPane.showMessageDialog(this, "Pendaftaran janji medis berhasil!");
        tampilTabel();
    }//GEN-LAST:event_btnDaftarMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        app.changeView(new PasienHome(app, pasien));
    }//GEN-LAST:event_jLabel2MouseClicked

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDaftar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelLogout;
    private javax.swing.JLabel labelObat;
    private javax.swing.JLabel labelRiwayat;
    private javax.swing.JLabel labelRiwayatBeli;
    private javax.swing.JTable tabelJanjiMedis;
    // End of variables declaration//GEN-END:variables
}
