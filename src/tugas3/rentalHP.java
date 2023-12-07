/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author User
 */
public class rentalHP {
    public String kode_hp;
    String jenis_hp,warna,tipe;
    int harga_hp,durasi_hp;
    
    public rentalHP (){
        kode_hp = "hp2118";
        jenis_hp = "vivo";
    }
    
    
    
    void kodehp(String kode_hp){
        this.kode_hp = kode_hp;
    }
    void jenishp(String jenishp){
        this.jenis_hp = jenishp;
    }
    void warna(String warna){
        this.warna= warna;
    }
    void tipe (String tipe){
        this.tipe= tipe;
    }
    void hargahp(int harga){
        this.harga_hp = harga;
    }
    void durasihp(int durasi){
        this.durasi_hp = durasi;
    }
    
    String Cetakkode(){
        return kode_hp;
    }
    String Cetakjenis(){
        return jenis_hp;
    }
    String Cetakwarna(){
        return warna;
    }
    String Cetaktipe(){
        return tipe;
    }
    int Cetakharga(){
        return harga_hp;
    }
    int Cetakdurasi(){
        return durasi_hp;
    }

}
