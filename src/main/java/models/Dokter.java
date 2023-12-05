package models;

import java.util.ArrayList;

public class Dokter extends User {

    private String spesialisasi;
    private String fotoProfile;
    private ArrayList<JanjiMedis> janjiMedis;
    private ArrayList<JanjiMedis> riwayatJanjiMedis;

    public Dokter(String spesialisasi, String fullName, String username, String password, String noTelp) {
        super(fullName, username, password, noTelp);
        this.spesialisasi = spesialisasi;
        this.janjiMedis = new ArrayList<>();
        this.riwayatJanjiMedis = new ArrayList<>();
    }

    public String getFotoProfile() {
        return fotoProfile;
    }

    public void setFotoProfile(String fotoProfile) {
        this.fotoProfile = fotoProfile;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }

    public void tambahJanjiMedis(JanjiMedis janjiMedis) {
        this.janjiMedis.add(janjiMedis);
    }

    public JanjiMedis getJanjiMedis(int index) {
        return janjiMedis.get(index);
    }

    public int getJumlahJanjiMedis() {
        return janjiMedis.size();
    }

    public ArrayList<JanjiMedis> getAllJanjiMedis() {
        return janjiMedis;
    }

    public JanjiMedis getRiwayatJanjiMedis(int index) {
        return riwayatJanjiMedis.get(index);
    }

    public int getJumlahRiwayatJanjiMedis() {
        return riwayatJanjiMedis.size();
    }

    public ArrayList<JanjiMedis> getAllRiwayatJanjiMedis() {
        return riwayatJanjiMedis;
    }
}
