/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

import java.util.ArrayList;

/**
 *
 * @author Hp
 */
public class Proyek {
    private String namaProyek;
    private int tgl_mulai, tgl_selesai;
    private ArrayList<PegawaiTetap> daftarP_Tetap;
    private ArrayList<PegawaiKontrak> daftarP_Kontrak;

    public Proyek() {
  
        this.daftarP_Tetap = daftarP_Tetap;
        this.daftarP_Kontrak = daftarP_Kontrak;
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

    public Pegawai getDaftarP_Tetap(String NIK) {
         PegawaiTetap pk = new PegawaiTetap();
        for (PegawaiTetap p : daftarP_Tetap){
            if(p.equals(NIK)){
                pk = p;
                break;
            }else{
                System.out.println("tidak ada pegawai");
            }
        }
        return pk;
    }

    public Pegawai getDaftarP_Kontrak(String idKontrak) {
        PegawaiKontrak pk = new PegawaiKontrak();
        for (PegawaiKontrak p : daftarP_Kontrak){
            if(p.equals(idKontrak)){
                pk = p;
                break;
            }else{
                System.out.println("tidak ada pegawai");
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
