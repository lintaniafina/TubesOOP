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
public class Departement {
    private String id_departement, namaDepart, lokasiDepart;
    private ArrayList<PegawaiTetap> daftarP_Tetap;
    private ArrayList<PegawaiKontrak> daftarP_Kontrak;
 

    public Departement(String id_departement, String namaDepart, String lokasiDepart ) {
        this.id_departement=id_departement;
        this.namaDepart=namaDepart;
        this.lokasiDepart=lokasiDepart;
        daftarP_Tetap = new ArrayList<>();
        daftarP_Kontrak = new ArrayList<>();
    }

    public String getId_departement() {
        return id_departement;
    }

    public void setId_departement(String id_departement) {
        this.id_departement = id_departement;
    }
    
    
    public String getNamaDepart() {
        return namaDepart;
    }

    public void setNamaDepart(String namaDepart) {
        this.namaDepart = namaDepart;
    }

    public String getLokasiDepart() {
        return lokasiDepart;
    }

    public void setLokasiDepart(String lokasiDepart) {
        this.lokasiDepart = lokasiDepart;
    }

    public ArrayList<PegawaiTetap> getDaftarP_Tetap() {
        return daftarP_Tetap;
    }

    public ArrayList<PegawaiKontrak> getDaftarP_Kontrak() {
        return daftarP_Kontrak;
    }

    public void setDaftarP_Tetap(ArrayList<PegawaiTetap> daftarP_Tetap) {
        this.daftarP_Tetap = daftarP_Tetap;
    }

    public void setDaftarP_Kontrak(ArrayList<PegawaiKontrak> daftarP_Kontrak) {
        this.daftarP_Kontrak = daftarP_Kontrak;
    }
    
    
   public Pegawai getDaftarP_Tetap(String NIK) {
        PegawaiTetap pk = new PegawaiTetap();
        for (PegawaiTetap p : daftarP_Tetap){
            if(p.equals(NIK)){
                pk = p;
                break;
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
