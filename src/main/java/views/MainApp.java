package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import models.RumahSakit;
import views.admin.AdminHome;
import views.admin.AdminSetDokter;
import views.admin.AdminSetPasien;
import views.auth.LoginView;
import views.auth.RegisterView;
import views.pasien.PasienHome;

public class MainApp {

    private JFrame app;
    private RumahSakit rs;
    public int indexCurrentUser;

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            MainApp app = new MainApp();
            app.showLoginView();
//            app.showPasienHome();
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

    private void changeView(JPanel view) {
        app.getContentPane().removeAll();
        app.getContentPane().add(view);
        app.revalidate();
        app.repaint();
    }

    public void showSignupView() {
        changeView(new RegisterView(this));
//        app.setSize(700, 450);
    }

    public void showLoginView() {
        changeView(new LoginView(this));
//        app.setSize(700, 450);

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
    
    public void showPasienHome() {
        changeView(new PasienHome(this));
        app.setSize(700, 450);
    }
}
