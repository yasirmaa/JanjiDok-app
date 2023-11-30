package views.Dokter;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Dokter;
import models.JanjiMedis;
import models.Pasien;
import views.MainApp;
import java.text.SimpleDateFormat;
import views.auth.LoginView;

public class DokterJanjiMedis extends javax.swing.JPanel {

    private final MainApp app;
    private final Dokter dokter;
    private final SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

    public DokterJanjiMedis(MainApp app, Dokter dokter) {
        this.app = app;
        initComponents();
        this.dokter = dokter;
        tampilTabel();
        btnDelete.setEnabled(false);
        btnDetail.setEnabled(false);
    }

    public void tampilTabel() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("Tanggal");

        model.setRowCount(0);

        for (int i = 0; i < app.getRS().getJumlahJanjiMedis(); i++) {
            model.addRow(new Object[]{
                i + 1,
                formatter.format(dokter.getJanjiMedis(i).getTanggal())
            });
        }
        tableJanjiMedis.setModel(model);
    }

    private void bersihkan() {
        btnDelete.setEnabled(false);
        btnDetail.setEnabled(false);
        btnAdd.setEnabled(true);
        inputTanggal.setCalendar(null);
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
        jLabel2 = new javax.swing.JLabel();
        inputTanggal = new com.toedter.calendar.JDateChooser();
        btnAdd = new javax.swing.JButton();
        btnDetail = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableJanjiMedis = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();

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

        formTitle.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        formTitle.setText("Jadwal Janji Medis");

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel2.setText("Tanggal");

        btnAdd.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnAdd.setText("Tambah");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });

        btnDetail.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnDetail.setText("Detail");
        btnDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDetailMouseClicked(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });

        tableJanjiMedis.setModel(new javax.swing.table.DefaultTableModel(
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
        tableJanjiMedis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableJanjiMedisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableJanjiMedis);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(inputTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAdd)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnDetail)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDelete)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCancel))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(formTitle)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(formTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(inputTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnDetail)
                    .addComponent(btnDelete)
                    .addComponent(btnCancel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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
        app.changeView(new LoginView(app));
    }//GEN-LAST:event_labelLogoutMouseClicked

    private void labelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHomeMouseClicked
        // TODO add your handling code here:
        app.changeView(new DokterHome(app, dokter));
    }//GEN-LAST:event_labelHomeMouseClicked

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        // TODO add your handling code here:
        Date tanggal = inputTanggal.getDate();
        Date today = new Date();

        if (tanggal == null) {
            JOptionPane.showMessageDialog(this, "Mohon pilih tanggal!");
            return;
        }

        if (tanggal.compareTo(today) < 0) {
            JOptionPane.showMessageDialog(this, "Tanggal yang dipilih tidak boleh sebelum hari ini!");
            return;
        } else {
            app.getRS().tambahJanjiMedis(tanggal, dokter);
            JOptionPane.showMessageDialog(this, "Berhasil membuat janji medis!");
            tampilTabel();
        }
        bersihkan();
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDetailMouseClicked
        // TODO add your handling code here:
        int selectedRow = tableJanjiMedis.getSelectedRow();
        app.changeView(new DokterDetailJanji(app, dokter, dokter.getJanjiMedis(selectedRow)));
    }//GEN-LAST:event_btnDetailMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        // TODO add your handling code here:
        int selectedRow = tableJanjiMedis.getSelectedRow();
        JanjiMedis selectedJanjiMedis = dokter.getJanjiMedis(selectedRow);

        boolean hasUntreatedPasien = false;
        for (Pasien pasien : selectedJanjiMedis.getAllPasien()) {
            if ("Belum Ditangani".equals(selectedJanjiMedis.getPasienStatus(pasien))) {
                hasUntreatedPasien = true;
                break;
            }
        }

        if (!hasUntreatedPasien) {
            app.getRS().tutupJanjiMedis(selectedJanjiMedis);
            JOptionPane.showMessageDialog(this, "Jadwal janji medis berhasil ditutup!");
        } else {
            JOptionPane.showMessageDialog(this, "Tidak dapat menutup jadwal janji medis!\nMasih ada pasien yang belum ditangani.");
        }

        tampilTabel();
        bersihkan();
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        // TODO add your handling code here:
        bersihkan();
        tableJanjiMedis.getSelectionModel().clearSelection();
    }//GEN-LAST:event_btnCancelMouseClicked

    private void tableJanjiMedisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableJanjiMedisMouseClicked
        // TODO add your handling code here:
        btnDelete.setEnabled(true);
        btnDetail.setEnabled(true);
        btnAdd.setEnabled(false);
    }//GEN-LAST:event_tableJanjiMedisMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDetail;
    private javax.swing.JLabel formTitle;
    private com.toedter.calendar.JDateChooser inputTanggal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelHome;
    private javax.swing.JLabel labelJanji;
    private javax.swing.JLabel labelLogout;
    private javax.swing.JLabel labelRiwayat;
    private javax.swing.JTable tableJanjiMedis;
    // End of variables declaration//GEN-END:variables
}
