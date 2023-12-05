package views.admin;

import java.time.format.DateTimeFormatter;
import javax.swing.table.DefaultTableModel;
import views.MainApp;
import views.auth.LoginView;

public class AdminSetObatTerjual extends javax.swing.JPanel {
    private final MainApp app;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    
    public AdminSetObatTerjual(MainApp app) {
        this.app = app;
        initComponents();
        tampilTabel();
    }

    public void tampilTabel() {

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("Name");
        model.addColumn("Price");
        model.addColumn("Quantitiy");
        model.addColumn("username");
        model.addColumn("Order date");
        model.addColumn("Delivery date");

        model.setRowCount(0);
        for (int i = 0; i < app.getRS().getJumlahSoldObat(); i++) {
            model.addRow(new Object[]{
                i + 1,
                app.getRS().getSoldObat(i).getNamaObat(),
                app.getRS().getSoldObat(i).getHarga(),
                app.getRS().getSoldObat(i).getStok(),
                app.getRS().getSoldObat(i).getUsername(),
                app.getRS().getSoldObat(i).getOrderDate().format(formatter),
                app.getRS().getSoldObat(i).getDeliveryDate().format(formatter)
            });
        }

        tblSoldItems.setModel(model);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelDashboard = new javax.swing.JLabel();
        labelPasien = new javax.swing.JLabel();
        labelDokter = new javax.swing.JLabel();
        labelLogout = new javax.swing.JLabel();
        labelObat = new javax.swing.JLabel();
        labelObatTerjual = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSoldItems = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

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

        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel5.setText("Obat Terjual");

        tblSoldItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No.", "Name", "Price", "Quantity", "Username", "Order date", "Delivery Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSoldItems);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel5)
                                .addGap(0, 354, Short.MAX_VALUE)))
                        .addGap(5, 5, 5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelDashboard;
    private javax.swing.JLabel labelDokter;
    private javax.swing.JLabel labelLogout;
    private javax.swing.JLabel labelObat;
    private javax.swing.JLabel labelObatTerjual;
    private javax.swing.JLabel labelPasien;
    private javax.swing.JTable tblSoldItems;
    // End of variables declaration//GEN-END:variables
}
