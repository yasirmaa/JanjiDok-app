/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.pasien;

import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import models.Pasien;
import views.MainApp;
import views.auth.LoginView;

/**
 *
 * @author Lenovo
 */
public class PasienRiwayatMedis extends javax.swing.JPanel {

    private final MainApp app;
    private final Pasien pasien;
    private SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

    public PasienRiwayatMedis(MainApp app, Pasien pasien) {
        this.app = app;
        initComponents();
        this.pasien = pasien;
        tampilTabel();
        txtCatatan.setEditable(false);
        txtDokter.setEditable(false);
        txtTanggal.setEditable(false);
        txtSpesialis.setEditable(false);
    }

    public void tampilTabel() {
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Mengembalikan false agar sel tidak bisa diedit
            }
        };
        model.addColumn("No.");
        model.addColumn("Tanggal");
        model.addColumn("Dokter");
        model.addColumn("Spesialis");
        model.addColumn("Catatan");

        model.setRowCount(0);

        for (int i = 0; i < pasien.getJumlahRiwayatMedis(); i++) {
            model.addRow(new Object[]{
                i + 1,
                formatter.format(pasien.getRiwayatMedis(i).getTanggal()),
                pasien.getRiwayatMedis(i).getDokter().getFullName(),
                pasien.getRiwayatMedis(i).getDokter().getSpesialisasi(),
                pasien.getRiwayatMedis(i).getCatatan()
            });
        }
        tableRiwayatMedis.setModel(model);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelLogout = new javax.swing.JLabel();
        labelRiwayat = new javax.swing.JLabel();
        labelObat = new javax.swing.JLabel();
        labelRiwayatBeli = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRiwayatMedis = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        formTitle = new javax.swing.JLabel();
        txtTanggal = new javax.swing.JTextField();
        txtDokter = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCatatan = new javax.swing.JTextArea();
        txtSpesialis = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

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
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelLogout)
                .addGap(33, 33, 33))
        );

        tableRiwayatMedis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Tanggal", "Dokter", "Spesialis", "Catatan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableRiwayatMedis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRiwayatMedisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableRiwayatMedis);

        jLabel5.setText("Tanggal");

        jLabel6.setText("Dokter");

        jLabel7.setText("Catatan");

        formTitle.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        formTitle.setText("Daftar Riwayat Medis");

        txtTanggal.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        txtDokter.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        txtCatatan.setColumns(20);
        txtCatatan.setRows(5);
        jScrollPane2.setViewportView(txtCatatan);

        txtSpesialis.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        jLabel8.setText("Spesialis");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formTitle)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSpesialis)
                            .addComponent(txtDokter)
                            .addComponent(txtTanggal)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))))
                .addGap(0, 69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(formTitle)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSpesialis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void labelLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLogoutMouseClicked
        // TODO add your handling code here:
        app.changeView(new LoginView(app));
    }//GEN-LAST:event_labelLogoutMouseClicked

    private void tableRiwayatMedisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRiwayatMedisMouseClicked
        // TODO add your handling code here:
        int index = tableRiwayatMedis.getSelectedRow();

        String date = formatter.format(pasien.getRiwayatMedis(index).getTanggal());
        String dokter = pasien.getRiwayatMedis(index).getDokter().getFullName();
        String spesialis = pasien.getRiwayatMedis(index).getDokter().getSpesialisasi();
        String catatan = pasien.getRiwayatMedis(index).getCatatan();
        txtTanggal.setText(date);
        txtDokter.setText(dokter);
        txtCatatan.setText(catatan);
        txtSpesialis.setText(spesialis);
    }//GEN-LAST:event_tableRiwayatMedisMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        app.changeView(new PasienHome(app, pasien));
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        app.changeView(new PasienJanjiMedis(app, pasien));
    }//GEN-LAST:event_jLabel3MouseClicked

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
    private javax.swing.JLabel formTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelLogout;
    private javax.swing.JLabel labelObat;
    private javax.swing.JLabel labelRiwayat;
    private javax.swing.JLabel labelRiwayatBeli;
    private javax.swing.JTable tableRiwayatMedis;
    private javax.swing.JTextArea txtCatatan;
    private javax.swing.JTextField txtDokter;
    private javax.swing.JTextField txtSpesialis;
    private javax.swing.JTextField txtTanggal;
    // End of variables declaration//GEN-END:variables
}
