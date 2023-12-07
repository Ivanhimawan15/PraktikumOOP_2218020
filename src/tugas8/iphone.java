/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas8;

import java.util.ArrayList;
import java.util.List;
import tugas6.*;
import tugas5.*;

/**
 *
 * @author User
 */
public class iphone extends Handphone implements bisadicetak{
 @Override
    String input(String nama){
        return "Data "+nama+" Berhasil di Inputkan";
    }  
 int totalhp(){
 return jumblah*harga;
}
 @Override
    String kode_HP(){
        return kode_HP="I312";
    } 
//klik kanan insert code generate
    @Override
    public String[] cetakditabel() {
        String[] list = new String[7];
list[0] = jenis;
list[1] = warna;
list[2] = tipe;
list[3] = kode_HP;
list[4] = Integer.toString(jumblah);
list[5] = Integer.toString(harga);
list[6] = Integer.toString(totalhp());
return list;

    }
    
}
 