/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Hp
 */
public class PegawaiTetap extends Pegawai {

    private String NIK, jabatan;
    private int golongan;

    public PegawaiTetap(String nama, String tgl_lahir, String alamat, String agama, String status, String no_hp, String email, String NIK, String jabatan, int golongan) {
        super(nama, tgl_lahir, alamat, agama, no_hp, email);
        this.NIK = NIK;
        this.jabatan = jabatan;
        this.golongan = golongan;
    }

    PegawaiTetap() {

    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

    @Override
    public void setGaji(double gaji) {
        super.setGaji(gaji); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getGaji() {
        return super.getGaji(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setGajiTambahan(double gaji) {
        switch (getGolongan()) {
            case 1:
                setGaji(gaji * 1.15);
                break;
            case 2:
                setGaji(gaji * 1.1);
                break;
            case 3:
                setGaji(gaji * 1.05);
                break;
            default:
                System.out.println("Golongan Salah / Belum Terisi");
        }
        if (jabatan == "Manager") {
            setGaji(gaji + 2000000);
        }
    }

}
