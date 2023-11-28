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
}
