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
public class PegawaiKontrak extends Pegawai  {
    private String lamaKontrak;
    private int kinerja, id_kontrak;
    private Absen absen;

    public PegawaiKontrak( String nama, String tgl_lahir, String alamat, String agama, String status, String no_hp, String email,String lamaKontrak,int kinerja ) {
        super(nama, tgl_lahir, alamat, agama, status, no_hp, email);
        this.id_kontrak++;
        this.lamaKontrak = lamaKontrak;
        this.kinerja = kinerja;
    }

    public PegawaiKontrak() {
        
    }

    
    public String getLamaKontrak() {
        return lamaKontrak;
    }

    public void setLamaKontrak(String lamaKontrak) {
        this.lamaKontrak = lamaKontrak;
    }

    public double getKinerja() {
        return kinerja;
    }

    public void setKinerja(int kinerja) {
        this.kinerja = kinerja;
    }

    public void setAbsen(Absen absen) {
        this.absen = absen;
    }

    public int getId_kontrak() {
        return id_kontrak;
    }

    public void setId_kontrak(int id_kontrak) {
        this.id_kontrak = id_kontrak;
    }
    
    
    @Override
    public double getGaji() {
        return super.getGaji(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setGaji(double gaji) {
        super.setGaji(gaji); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setGajiTambahan(double gaji) {
        if (kinerja<=100 && kinerja >=85){
            setGaji(gaji*1.05+(super.getAbsen().lembur()*0.1*gaji));
        }else if (kinerja<85 && kinerja >=60){
            setGaji(gaji*1.03+(super.getAbsen().lembur()*0.1*gaji));
        }else{
            setGaji(gaji*1.01+(super.getAbsen().lembur()*0.1*gaji));
        }
    }
    
    
}

