package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import models.Dokter;
import models.Pasien;
import models.RumahSakit;
import views.admin.AdminHome;
import views.admin.AdminSetDokter;
import views.admin.AdminSetPasien;
import views.auth.LoginView;
import views.auth.RegisterView;

public class MainApp {

    private JFrame app;
    private RumahSakit rs;

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            MainApp app = new MainApp();
            Pasien pasien1 = new Pasien("yasir maa", "yasir", "123", "085230");
            app.getRS().tambahPasien(pasien1);
            Dokter dokter1 = new Dokter("Anak", "Rizal maulana", "rizalm", "rizal", "0852331212");
            app.getRS().tambahDokter(dokter1);
            app.showLoginView();
        });

    }

    public MainApp() {
        this.app = new JFrame("JanjiDok");
        this.rs = new RumahSakit();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(700, 400);
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

    public void showSignupView() {
        changeView(new RegisterView(this));
    }

    public void showLoginView() {
        changeView(new LoginView(this));
    }

    public void showAdminHome() {
        changeView(new AdminHome(this));
        app.setSize(700, 450);
    }

    public void showAdminSetPasien() {
        changeView(new AdminSetPasien(this));
        app.setSize(700, 450);
    }

    public void showAdminSetDokter() {
        changeView(new AdminSetDokter(this));
        app.setSize(700, 450);
    }
}
