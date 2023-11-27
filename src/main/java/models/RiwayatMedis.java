/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class RiwayatMedis {
    private Date tanggal;
    private Dokter dokter;
    private String catatan;

    public RiwayatMedis(Date tanggal, Dokter dokter, String catatan) {
        this.tanggal = tanggal;
        this.dokter = dokter;
        this.catatan = catatan;
    }

    
    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public Dokter getDokter() {
        return dokter;
    }

    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }

    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }
}
