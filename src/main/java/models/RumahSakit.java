/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class RumahSakit {
    private ArrayList<Admin> admin;
    private ArrayList<Pasien> pasien;
    private ArrayList<Dokter> dokter;
    private ArrayList<JanjiMedis> janjiMedis;
    
    public RumahSakit() {
        admin = new ArrayList<>();
        admin.add(new Admin("Admin Admin", "admin", "admin123", "081234567890"));
        pasien = new ArrayList<>();
        dokter = new ArrayList<>();
        janjiMedis = new ArrayList<>();
    }
    
    //  Pasien
    public void tambahPasien(Pasien pasien) {
        this.pasien.add(pasien);
    }
    
    public Pasien getPasien(int index) {
        return this.pasien.get(index);
    }
    
    public void hapusPasien(int index) {
        this.pasien.remove(index);
    }
    
    public void updatePasien(int index, Pasien pasien) {
        this.pasien.set(index, pasien);
    }    
    
    public int getJumlahPasien() {
        return pasien.size();
    }
    
    //  Dokter    
    public void tambahDokter(Dokter dokter) {
        this.dokter.add(dokter);
    }
    
    public Dokter getDokter(int index) {
        return dokter.get(index);
    }
    
    public void hapusDokter(int index) {
        this.dokter.remove(index);
    }
    
    public void updateDokter(int index, Dokter dokter) {
        this.dokter.set(index, dokter);
    }
    
    public int getJumlahDokter() {
        return dokter.size();
    }    
    
    //  Janji Medis
    public void tambahJanjiMedis(Date tanggal, Dokter dokter) {
        JanjiMedis janjiMedis = new JanjiMedis(tanggal, dokter);
        this.janjiMedis.add(janjiMedis);
        dokter.getAllJanjiMedis().add(janjiMedis);
    }
    
    public void tutupJanjiMedis(JanjiMedis janjiMedis) {        
        janjiMedis.setIsActive(false);
        this.janjiMedis.remove(janjiMedis);
        janjiMedis.getDokter().getAllJanjiMedis().remove(janjiMedis);
        janjiMedis.getDokter().getAllRiwayatJanjiMedis().add(janjiMedis);
    }
    
    public JanjiMedis getJanjiMedis(int index) {
        return janjiMedis.get(index);
    }
    
    public int getJumlahJanjiMedis() {
        return janjiMedis.size();
    }
        
    public int getJumlahAdmin() {
        return admin.size();
    }
    
    public ArrayList<Admin> getAllAdmin() {
        return admin;
    }
    
    public ArrayList<Pasien> getAllPasien() {
        return pasien;
    }
    
    public ArrayList<Dokter> getAllDokter() {
        return dokter;
    }
    
    public ArrayList<JanjiMedis> getAllJanjiMedis() {
        return janjiMedis;
    }
}
