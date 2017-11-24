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
    ArrayList<Departement> departement;

    public Aplikasi() {
       departement = new ArrayList<>();
    }
    
    public void addDepartement(Departement d){
        departement.add(d);
    }
    
    
}
