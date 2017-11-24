/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Hp
 */
public abstract class Pegawai {
    private String nama, tgl_lahir, alamat, agama, no_hp, email;
    private double gaji;
    private Absen absen; 

    public Pegawai() {
    }
    
    public Pegawai(String nama, String tgl_lahir, String alamat, String agama, String no_hp, String email) {
        this.nama = nama;
        this.tgl_lahir = tgl_lahir;
        this.alamat = alamat;
        this.agama = agama;
        this.no_hp = no_hp;
        this.email = email;
        this.gaji = 5000000;
        this.absen = new Absen();
    }

    public void setAbsen(String tgl, String status, int jamMasuk, int jamKeluar) {
        this.absen = new Absen(tgl, status, jamMasuk, jamKeluar);
    }

    public Absen getAbsen() {
        return absen;
    }
    
    
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTgl_lahir() {
        return tgl_lahir;
    }

    public void setTgl_lahir(String tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

   

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getGaji(){
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    public abstract void setGajiTambahan(double gaji);


   
    
}
