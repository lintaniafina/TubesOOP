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
public class Aplikasi {
    //pegawai tetap
    ArrayList<PegawaiTetap> PegTetap;
    ArrayList<PegawaiKontrak> PegKontrak;
    ArrayList<Departement> departement;
    
    public Aplikasi() {
       departement = new ArrayList<>();
       PegTetap = new ArrayList<>();
       PegKontrak = new ArrayList<>();
    }
    
    public void addPegawaiTetap(PegawaiTetap P_Tetap){
         PegTetap.add(P_Tetap);
    }
    
    public void addPegawaiKontrak(PegawaiKontrak P_Kontrak){
         PegKontrak.add(P_Kontrak);
    }
    
    public void addDepartement(Departement d){
        departement.add(d);
    }
    
    
    
    
}
