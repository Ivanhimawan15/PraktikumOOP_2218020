/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab3;

/**
 *
 * @author User
 */
public class prisma_segitiga extends segitiga {
    double tinggiprisma,vol;
    double volumeprisma(){
        vol=(luas()*tinggiprisma);
        return vol;
    }
}
