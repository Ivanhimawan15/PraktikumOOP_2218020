/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author User
 */
public class hitung_hargahp {
       int hargaperhari,durasi;
    double total;
    
    public hitung_hargahp(){
        this.hargaperhari=250000;
    }
    public double total(){
        total = (hargaperhari*durasi);
        return total;
    }
}

