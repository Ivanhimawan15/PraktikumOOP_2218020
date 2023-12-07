/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB1.ClassObject;

/**
 *
 * @author User
 */
public class main {
    public static void main(String[]args){
        //membuat objek
        kendaraan mobil = new kendaraan();
        mobil.nama="mobil";
        mobil.warna="merah";
        mobil.merk="toyota";
        System.out.println("nama kendaraan :"+mobil.nama);
        System.out.println("warna kendaraan : "+mobil.warna);
        System.out.println("merek kendaraan : "+mobil.merk);
        System.out.println("jumblah roda :"+mobil.jmlroda(4)+"\n");
        System.out.println("cara kendaraan bergerak :");
        System.out.println("saat maju :");
        mobil.kendaraanmaju();
        System.out.println("saat mundur : ");
        mobil.kendaraanmundur();
        System.out.println("saat berhenti : "+mobil.nama);
        mobil.kendaraanberhenti();
    }
}
