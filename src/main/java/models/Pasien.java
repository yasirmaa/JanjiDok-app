package models;

import java.util.ArrayList;

public class Pasien extends User{
    private String fotoProfile;
    private ArrayList<RiwayatMedis> riwayatMedis;
    private ArrayList<SoldMedicine> purchases;

    public Pasien(String fullName, String username, String password, String noTelp) {
        super(fullName, username, password, noTelp);
        riwayatMedis = new ArrayList<>();
        purchases = new ArrayList<>();
    }
    
    public void setFotoProfile(String fotoProfile) {
        this.fotoProfile = fotoProfile;
    }

    public String getFotoProfile() {
        return fotoProfile;
    }
    
    public void tambahRiwayatMedis(RiwayatMedis riwayatMedis) {
        this.riwayatMedis.add(riwayatMedis);
    }
    
    public RiwayatMedis getRiwayatMedis(int index) {
        return this.riwayatMedis.get(index);
    }
    
    public int getJumlahRiwayatMedis() {
        return this.riwayatMedis.size();
    }
    
    public ArrayList<RiwayatMedis> getAllRiwayatMedis() {
        return riwayatMedis;
    }
    
    public void addPurchase(SoldMedicine purchase) {
        this.purchases.add(purchase);
    }

    public int getPurchasesAmount() {
        return this.purchases.size();
    }

    public SoldMedicine getPurchases(int index) {
        return purchases.get(index);
    }
}
