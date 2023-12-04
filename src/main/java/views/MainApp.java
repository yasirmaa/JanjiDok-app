package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import models.Dokter;
import models.Medicine;
import models.Pasien;
import models.RumahSakit;
import views.auth.LoginView;

public class MainApp {

    private JFrame app;
    private RumahSakit rs;

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            MainApp app = new MainApp();
            Pasien pasien1 = new Pasien("Yasir Maarif", "yasirmaarif", "123", "085230538453");
            Pasien pasien2 = new Pasien("Qois Haidar", "qoishaidar", "123", "085230538456");
            app.getRS().tambahPasien(pasien1);
            app.getRS().tambahPasien(pasien2);
            Dokter dokter1 = new Dokter("Anak", "Rizal maulana", "rizalm", "rizal", "0852331212");
            Dokter dokter2 = new Dokter("Umum", "Rizal maul", "maul", "maul", "0852331213");
            app.getRS().tambahDokter(dokter1);
            app.getRS().tambahDokter(dokter2);
            app.getRS().tambahObat(new Medicine("A10", "Bodrex Extra", 3000, 11));
            app.getRS().tambahObat(new Medicine("A9", "Parasetamol", 3000, 20));
            app.getRS().tambahObat(new Medicine("A8", "Ibuprofen", 3000, 10));
            app.getRS().tambahObat(new Medicine("A7", "Amoksisilin", 3000, 30));
            app.getRS().tambahObat(new Medicine("A6", "Omeprazole", 3000, 8));
            app.getRS().tambahObat(new Medicine("A5", "Simvastatin", 3000, 10));
            app.changeView(new LoginView(app));
        });

    }

    public MainApp() {
        this.app = new JFrame("JanjiDok");
        this.rs = new RumahSakit();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(700, 450);
        app.setVisible(true);
        app.setResizable(false);
        app.setLocationRelativeTo(null);
    }

    public RumahSakit getRS() {
        return this.rs;
    }

    public void changeView(JPanel view) {
        app.getContentPane().removeAll();
        app.getContentPane().add(view);
        app.revalidate();
        app.repaint();
    }
}
