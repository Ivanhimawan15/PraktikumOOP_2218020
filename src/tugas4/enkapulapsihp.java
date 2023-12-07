/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author User
 */
public class enkapulapsihp {
    private String kode_hp;
    public double durasi,harga;
    double total;
    
 
    public String getkode_hp() {
        return kode_hp;
    }
    public void setkode_hp(String kode_hp) {
        this.kode_hp= kode_hp;
    }

    double totalhp() {
        total = (harga * durasi);
        return total;
    }
}
