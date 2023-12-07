/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author User
 */
public class cetak {
    public static void main(String[] args) {
 handphone hp= new handphone(); 
hp.datajenis("iphone");
hp.datawarna("hitam");
hp.datatipe("elevenpro");
hp.datajumblah(8);
hp.dataharga(7000000);
 System.out.println("rental HP Acil Nila");
 System.out.println("------------------------------------");
 System.out.println("jenis HP :"+hp.cetakjenis());
 System.out.println("warna : "+ hp.cetakwarna()); 
 System.out.println("tipe : "+ hp.cetaktipe()); 
 System.out.println("jumblah : "+ hp.cetakjumblah()); 
 System.out.println("harga : "+ hp.cetakharga()); 
 }
}
