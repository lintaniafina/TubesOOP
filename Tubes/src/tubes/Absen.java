/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author Hp
 */
public class Absen {
    private String tgl, status;
    private int jamMasuk, jamKeluar;
    
    public Absen(){
    }

    public Absen(String tgl, String status, int jamMasuk, int jamKeluar) {
        this.tgl = tgl;
        this.status = status;
        this.jamMasuk = jamMasuk;
        this.jamKeluar = jamKeluar;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getJamMasuk() {
        return jamMasuk;
    }

    public void setJamMasuk(int jamMasuk) {
        this.jamMasuk = jamMasuk;
    }

  
    public int getJamKeluar() {
        return jamKeluar;
    }

    public void setJamKeluar(int jamKeluar) {
        this.jamKeluar = jamKeluar;
    }

   
    public int lembur(){
        return (getJamKeluar() - getJamMasuk())-8;
    }
}
