/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import Model.Departement;
import Model.PegawaiKontrak;
import Model.PegawaiTetap;
import View.FormOffice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Hp
 */
public class Handler implements ActionListener {
    
    Aplikasi app;
    FormOffice viewForm;
    
    public Handler() {
        this.app = new Aplikasi();
        this.viewForm = new FormOffice();
        this.viewForm.addActionListener(this);
        viewForm.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(viewForm.getTambah_departement())) {
            String id_departement = viewForm.getTambah_id_departement();
            String namaDepart = viewForm.getNama_departement();
            String lokasiDepart = viewForm.getLokasi_departement();
            
            Departement dept = new Departement(id_departement, namaDepart, lokasiDepart);
            app.addDepartement(dept);
            String kalimat = id_departement + "\n" + namaDepart + "\n" + lokasiDepart;
            viewForm.setArea_tambah_departement(kalimat);
        }else if (source.equals(viewForm.getBtnTambahPegTetap())){
            String NIK = viewForm.getTfNikPegawaiTetap();
            String nama = viewForm.getTfTambahNamaPegTetap();
            String tgl_lahir = viewForm.getTfTambahTglLahirPegTetap();
            String alamat = viewForm.getTfTambahAlamatPegTetap();
            String agama = viewForm.getTfTambahAgamaPegTetap();
            String no_hp = viewForm.getTfTambahHpPegTetap();
            String email = viewForm.getTfTambahEmailPegTetap();
            
            PegawaiTetap P_Tetap = new PegawaiTetap(nama, tgl_lahir, alamat, agama, email, no_hp, email, NIK, agama, 0);
            app.addPegawaiTetap(P_Tetap);
            String kalimat=NIK + "\n" + nama + "\n" + tgl_lahir  + "\n" + alamat + "\n" + agama + "\n" + no_hp + "\n" + email;
            viewForm.setTxTampilPegTetap(kalimat);
        }else if (source.equals(viewForm.getBtnTambahPegKontrak())){
            String id_kontrak = viewForm.getTfTambahIdKontrakPegKontrak();
            String nama = viewForm.getTfTambahNamaPegKontrak();
            String tgl_lahir = viewForm.getTfTambahTglPegKontrak();
            String alamat = viewForm.getTfTambahAlamatPegKontrak();
            String agama = viewForm.getTfTambahAgamaPegKontrak();
            String no_hp = viewForm.getTfTambahHpPegKontrak();
            String email = viewForm.getTfTambahEmailPegKontrak();
            String kinerja = viewForm.getTfTambahKinerja();
            String lamaKontrak = viewForm.getTfTambahLamaKontrak();
            
            PegawaiKontrak P_Kontrak = new PegawaiKontrak(nama, tgl_lahir, alamat, agama, no_hp, email, id_kontrak, lamaKontrak, 0);
            app.addPegawaiKontrak(P_Kontrak);
            String kalimat=id_kontrak+ "\n" + nama + "\n" + tgl_lahir  + "\n" + alamat + "\n" + agama + "\n" + no_hp + "\n" + email+ "\n" + id_kontrak+ "\n" + lamaKontrak+ "\n" + kinerja;
            viewForm.setTxTampilPegTetap(kalimat);
        
    }
    
}
}