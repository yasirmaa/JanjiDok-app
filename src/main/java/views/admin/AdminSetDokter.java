package views.admin;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Dokter;
import views.MainApp;
import views.auth.LoginView;

public class AdminSetDokter extends javax.swing.JPanel {

    private final MainApp app;

    public AdminSetDokter(MainApp app) {
        this.app = app;
        initComponents();
        tampilDokter();
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
    }

    public void bersihkan() {
        txtFullName.setText("");
        txtNoTelp.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        txtSpesialis.setSelectedIndex(0);
        
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnAdd.setEnabled(true);
    }

    public void tampilDokter() {
       DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Mengembalikan false agar sel tidak bisa diedit
            }
        };
        model.addColumn("No.");
        model.addColumn("Nama Lengkap");
        model.addColumn("No Telpon");
        model.addColumn("Username");
        model.addColumn("Password");
        model.addColumn("Spesialis");

        model.setRowCount(0);

        for (int i = 0; i < app.getRS().getJumlahDokter(); i++) {
            model.addRow(new Object[]{
                i + 1,
                app.getRS().getDokter(i).getFullName(),
                app.getRS().getDokter(i).getNoTelp(),
                app.getRS().getDokter(i).getUsername(),
                app.getRS().getDokter(i).getPassword(),
                app.getRS().getDokter(i).getSpesialisasi(),});
        }

        tabelDokter.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        txtSpesialis = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDokter = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtNoTelp = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelDashboard = new javax.swing.JLabel();
        labelPasien = new javax.swing.JLabel();
        labelDokter = new javax.swing.JLabel();
        labelLogout = new javax.swing.JLabel();
        labelObat = new javax.swing.JLabel();
        labelObatTerjual = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel5.setText("Data Dokter");

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel2.setText("Nama Lengkap");

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel3.setText("No Telpon");

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel4.setText("Username");

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel6.setText("Password");

        txtFullName.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        txtSpesialis.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtSpesialis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Umum", "Penyakit Dalam", "Anak", "Saraf", "Kandungan dan Ginekologi", "Kulit dan Kelamin", "THT", "Mata", "Psikiater", "Gigi", " " }));

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel7.setText("Spesialis");

        tabelDokter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelDokter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDokterMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelDokter);

        btnAdd.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        btnAdd.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });

        btnUpdate.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        btnUpdate.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });

        btnDelete.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        btnDelete.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });

        btnCancel.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.borderColor"));
        btnCancel.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });

        txtNoTelp.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        txtUsername.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(64, 123, 255));

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("JanjiDok");

        labelDashboard.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        labelDashboard.setForeground(new java.awt.Color(255, 255, 255));
        labelDashboard.setText("Dashboard");
        labelDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDashboardMouseClicked(evt);
            }
        });

        labelPasien.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        labelPasien.setForeground(new java.awt.Color(255, 255, 255));
        labelPasien.setText("Pasien");
        labelPasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelPasienMouseClicked(evt);
            }
        });

        labelDokter.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        labelDokter.setForeground(new java.awt.Color(255, 255, 255));
        labelDokter.setText("Dokter");
        labelDokter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDokterMouseClicked(evt);
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
        labelObat.setText("Obat");
        labelObat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelObatMouseClicked(evt);
            }
        });

        labelObatTerjual.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        labelObatTerjual.setForeground(new java.awt.Color(255, 255, 255));
        labelObatTerjual.setText("Obat Terjual");
        labelObatTerjual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelObatTerjualMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelObatTerjual)
                    .addComponent(labelObat)
                    .addComponent(labelLogout)
                    .addComponent(labelDokter)
                    .addComponent(labelPasien)
                    .addComponent(labelDashboard)
                    .addComponent(jLabel1))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(labelDashboard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPasien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelDokter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelObat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelObatTerjual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(labelLogout)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtFullName)
                                            .addComponent(txtSpesialis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNoTelp)
                                            .addComponent(txtUsername)
                                            .addComponent(txtPassword)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAdd)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDelete)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnUpdate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCancel))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 42, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSpesialis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        // TODO add your handling code here:
        String username = this.txtUsername.getText();
        String password = this.txtPassword.getText();
        String fullName = this.txtFullName.getText();
        String noTelp = this.txtNoTelp.getText();
        String spesialis = this.txtSpesialis.getSelectedItem().toString();

        if (username.equals("") || password.equals("")
                || fullName.equals("") || noTelp.equals("")) {
            JOptionPane.showMessageDialog(null, "Data belum lengkap", "Validasi Data", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (!username.matches("^[a-zA-Z]*$")) {
            JOptionPane.showMessageDialog(null, "Username harus berupa huruf dan tidak spasi", "Validasi Data", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Dokter dokter = new Dokter(spesialis, fullName, username, password, noTelp);
        app.getRS().tambahDokter(dokter);
        JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
        tampilDokter();
        bersihkan();
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        // TODO add your handling code here:
        int selectedRow = tabelDokter.getSelectedRow();
        int indexDokter = selectedRow;
        String username = this.txtUsername.getText();
        String password = this.txtPassword.getText();
        String fullName = this.txtFullName.getText();
        String noTelp = this.txtNoTelp.getText();
        String spesialis = this.txtSpesialis.getSelectedItem().toString();
        
        if (indexDokter > -1) {
            app.getRS().getDokter(indexDokter).setFullName(fullName);
            app.getRS().getDokter(indexDokter).setNoTelp(noTelp);
            app.getRS().getDokter(indexDokter).setUsername(username);
            app.getRS().getDokter(indexDokter).setPassword(password);
            app.getRS().getDokter(indexDokter).setSpesialisasi(spesialis);
        }
        bersihkan();
        tampilDokter();
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        // TODO add your handling code here:
        int jawab = JOptionPane.showConfirmDialog(null, "Data ini akan dihapus ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (jawab == 0) {
            int selectedRow = tabelDokter.getSelectedRow();
            int indexDokter = selectedRow;
            if (indexDokter > -1) {
                app.getRS().hapusDokter(indexDokter);
            }
            bersihkan();
            tampilDokter();
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        // TODO add your handling code here:
        bersihkan();
    }//GEN-LAST:event_btnCancelMouseClicked

    private void tabelDokterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDokterMouseClicked
        // TODO add your handling code here:
        int selectedRow = tabelDokter.getSelectedRow();

        txtFullName.setText(tabelDokter.getValueAt(selectedRow, 1).toString());
        txtNoTelp.setText(tabelDokter.getValueAt(selectedRow, 2).toString());
        txtUsername.setText(tabelDokter.getValueAt(selectedRow, 3).toString());
        txtPassword.setText(tabelDokter.getValueAt(selectedRow, 4).toString());
        
        btnDelete.setEnabled(true);
        btnUpdate.setEnabled(true);
        btnAdd.setEnabled(false);
    }//GEN-LAST:event_tabelDokterMouseClicked

    private void labelDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDashboardMouseClicked
        // TODO add your handling code here:
        app.changeView(new AdminHome(app));
    }//GEN-LAST:event_labelDashboardMouseClicked

    private void labelPasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPasienMouseClicked
        // TODO add your handling code here:
        app.changeView(new AdminSetPasien(app));
    }//GEN-LAST:event_labelPasienMouseClicked

    private void labelDokterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDokterMouseClicked
        // TODO add your handling code here:
        app.changeView(new AdminSetDokter(app));
    }//GEN-LAST:event_labelDokterMouseClicked

    private void labelLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLogoutMouseClicked
        // TODO add your handling code here:
        app.changeView(new LoginView(app));
    }//GEN-LAST:event_labelLogoutMouseClicked

    private void labelObatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelObatMouseClicked
        // TODO add your handling code here:
        app.changeView(new AdminSetObat(app));
    }//GEN-LAST:event_labelObatMouseClicked

    private void labelObatTerjualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelObatTerjualMouseClicked
        // TODO add your handling code here:
        app.changeView(new AdminSetObatTerjual(app));
    }//GEN-LAST:event_labelObatTerjualMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelDashboard;
    private javax.swing.JLabel labelDokter;
    private javax.swing.JLabel labelLogout;
    private javax.swing.JLabel labelObat;
    private javax.swing.JLabel labelObatTerjual;
    private javax.swing.JLabel labelPasien;
    private javax.swing.JTable tabelDokter;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtNoTelp;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JComboBox<String> txtSpesialis;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
