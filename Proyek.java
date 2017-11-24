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
public class Proyek {

    private String id_proyek, namaProyek;
    private int tgl_mulai, tgl_selesai;
    private ArrayList<PegawaiTetap> daftarP_Tetap;
    private ArrayList<PegawaiKontrak> daftarP_Kontrak;

    public Proyek(String id_proyek, String namaProyek, int tgl_mulai, int tgl_selesai) {
        this.id_proyek=id_proyek;
        this.namaProyek = namaProyek;
        this.tgl_mulai = tgl_mulai;
        this.tgl_selesai = tgl_selesai;
        daftarP_Tetap = new ArrayList<>();
        daftarP_Kontrak = new ArrayList<>();
    }

    public String getId_proyek() {
        return id_proyek;
    }

    public void setId_proyek(String id_proyek) {
        this.id_proyek = id_proyek;
    }
    
    public String getNamaProyek() {
        return namaProyek;
    }

    public void setNamaProyek(String namaProyek) {
        this.namaProyek = namaProyek;
    }

    public int getTgl_mulai() {
        return tgl_mulai;
    }

    public void setTgl_mulai(int tgl_mulai) {
        this.tgl_mulai = tgl_mulai;
    }

    public int getTgl_selesai() {
        return tgl_selesai;
    }

    public void setTgl_selesai(int tgl_selesai) {
        this.tgl_selesai = tgl_selesai;
    }

    public ArrayList<PegawaiTetap> getDaftarP_Tetap() {
        return daftarP_Tetap;
    }

    public ArrayList<PegawaiKontrak> getDaftarP_Kontrak() {
        return daftarP_Kontrak;
    }

    public Pegawai getDaftarP_Tetap(String NIK) {
        PegawaiTetap pk = new PegawaiTetap();
        for (PegawaiTetap p : daftarP_Tetap) {
            if (p.equals(NIK)) {
                pk = p;
                break;
            }
        }
        return pk;
    }

    public Pegawai getDaftarP_Kontrak(String idKontrak) {
        PegawaiKontrak pk = new PegawaiKontrak();
        for (PegawaiKontrak p : daftarP_Kontrak) {
            if (p.equals(idKontrak)) {
                pk = p;
                break;
            }
        }
        return pk;
    }

    public void setDaftarP_Kontrak() {
        this.daftarP_Kontrak = daftarP_Kontrak;
    }

    public void setDaftarP_Tetap() {
        this.daftarP_Tetap = daftarP_Tetap;
    }

}
