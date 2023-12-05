/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.pasien;

import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Pasien;
import models.SoldMedicine;
import views.MainApp;
import views.auth.LoginView;

/**
 *
 * @author Lenovo
 */
public class PasienBeliObat extends javax.swing.JPanel {

    private final MainApp app;
    private final Pasien pasien;

    public PasienBeliObat(MainApp app, Pasien pasien) {
        this.app = app;
        this.pasien = pasien;
        initComponents();
        tampilTabel();
        txtId.setEditable(false);
        txtName.setEditable(false);
        txtPrice.setEditable(false);
        txtStock.setEditable(false);
    }

    public void bersihkan() {
        txtId.setText("");
        txtName.setText("");
        txtPrice.setText("");
        txtStock.setText("");
        txtQuantity.setText("");
    }

    public void tampilTabel() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("Id Obat");
        model.addColumn("Name");
        model.addColumn("Price");
        model.addColumn("Stock");

        model.setRowCount(0);
        for (int i = 0; i < app.getRS().getJumlahObat(); i++) {
            model.addRow(new Object[]{
                i + 1,
                app.getRS().getObat(i).getId(),
                app.getRS().getObat(i).getNamaObat(),
                app.getRS().getObat(i).getHarga(),
                app.getRS().getObat(i).getStok(),});
        }

        tblObat.setModel(model);
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblObat = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnBuy = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtQuantity = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelLogout)
                .addGap(33, 33, 33))
        );

        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel5.setText("ObatKu");

        tblObat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "Id Obat", "Name", "Price", "Stock"
            }
        ));
        tblObat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblObatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblObat);

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel2.setText("Id");

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel7.setText("Name");

        txtId.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        txtName.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        txtPrice.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        txtStock.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel8.setText("Price");

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel9.setText("Stock");

        btnBuy.setBackground(new java.awt.Color(64, 123, 255));
        btnBuy.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btnBuy.setForeground(new java.awt.Color(255, 255, 255));
        btnBuy.setText("Buy");
        btnBuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuyMouseClicked(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });

        txtQuantity.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel13.setText("Quantity");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel5))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtQuantity)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCancel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnBuy, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuy)
                    .addComponent(btnCancel))
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void labelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHomeMouseClicked
        // TODO add your handling code here:
        app.changeView(new PasienHome(app, pasien));
    }//GEN-LAST:event_labelHomeMouseClicked

    private void labelJanjiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelJanjiMouseClicked
        // TODO add your handling code here:
        app.changeView(new PasienJanjiMedis(app, pasien));
    }//GEN-LAST:event_labelJanjiMouseClicked

    private void labelRiwayatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRiwayatMouseClicked
        // TODO add your handling code here:
        app.changeView(new PasienRiwayatMedis(app, pasien));
    }//GEN-LAST:event_labelRiwayatMouseClicked

    private void labelLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLogoutMouseClicked
        // TODO add your handling code here:
        app.changeView(new LoginView(app));
    }//GEN-LAST:event_labelLogoutMouseClicked

    private void labelObatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelObatMouseClicked
        // TODO add your handling code here:
        app.changeView(new PasienBeliObat(app, pasien));
    }//GEN-LAST:event_labelObatMouseClicked

    private void labelRiwayatBeliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRiwayatBeliMouseClicked
        // TODO add your handling code here:
        app.changeView(new PasienRiwayatBeli(app, pasien));
    }//GEN-LAST:event_labelRiwayatBeliMouseClicked

    private void tblObatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblObatMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblObat.getSelectedRow();
        txtId.setText(tblObat.getValueAt(selectedRow, 1).toString());
        txtName.setText(tblObat.getValueAt(selectedRow, 2).toString());
        txtPrice.setText(tblObat.getValueAt(selectedRow, 3).toString());
        txtStock.setText(tblObat.getValueAt(selectedRow, 4).toString());
    }//GEN-LAST:event_tblObatMouseClicked

    private void btnBuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuyMouseClicked
        // TODO add your handling code here:
        String id = txtId.getText();
        if (id.equals("")) {
            JOptionPane.showMessageDialog(null, "Pilih produk dulu");
            return;
        }
        int quantity = 0;
        try {
            quantity = Integer.parseInt(txtQuantity.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Quantitiy tidak valid!",
                    "Validasi Data", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        int indexItem = app.getRS().getIndexObat(id);
        String name = txtName.getText();
        int price = Integer.parseInt(txtPrice.getText());
        int stock = Integer.parseInt(txtQuantity.getText());
        String username = pasien.getUsername();
        LocalDateTime orderDate = LocalDateTime.now();
        LocalDateTime deliveryDate = orderDate.plusDays(3);
        int sumPrice = quantity * price;

        if (app.getRS().getObat(indexItem).buyMedicine(quantity)) {
            int jawab = JOptionPane.showConfirmDialog(null, "Total Harga = " + sumPrice + "\n Anda yakin membeli?",
                    "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (jawab == 0) {
                SoldMedicine purchase = new SoldMedicine(id, name, sumPrice, stock, username, orderDate, deliveryDate);
                pasien.addPurchase(purchase);
                app.getRS().tambahSoldObat(purchase);
                JOptionPane.showMessageDialog(null, "Pemebelian barang berhasil");
                tampilTabel();
                bersihkan();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Stok tidak cukup");
        }
    }//GEN-LAST:event_btnBuyMouseClicked

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        // TODO add your handling code here:
        bersihkan();
    }//GEN-LAST:event_btnCancelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuy;
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelHome;
    private javax.swing.JLabel labelJanji;
    private javax.swing.JLabel labelLogout;
    private javax.swing.JLabel labelObat;
    private javax.swing.JLabel labelRiwayat;
    private javax.swing.JLabel labelRiwayatBeli;
    private javax.swing.JTable tblObat;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
