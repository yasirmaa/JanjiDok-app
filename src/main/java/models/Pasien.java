/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Pasien extends User{
    private ArrayList<RiwayatMedis> riwayatMedis;
    private ArrayList<SoldMedicine> purchases = new ArrayList<>();
    private String fotoProfile;
    private String alamat;

    public void setFotoProfile(String fotoProfile) {
        this.fotoProfile = fotoProfile;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getFotoProfile() {
        return fotoProfile;
    }

    public String getAlamat() {
        return alamat;
    }
    
    public Pasien(String fullName, String username, String password, String noTelp) {
        super(fullName, username, password, noTelp);
        riwayatMedis = new ArrayList<>();
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
