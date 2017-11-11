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
public class Departement {
    private String namaDepart, lokasiDepart;
    private ArrayList<PegawaiTetap> daftarP_Tetap;
    private ArrayList<PegawaiKontrak> daftarP_Kontrak;
    private int jumlahP_Tetap=0;
    private int jumlahP_Kontrak=0;

    public Departement() {
        daftarP_Tetap = new ArrayList<>();
        daftarP_Kontrak = new ArrayList<>();
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
