/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab4;

/**
 *
 * @author User
 */
public class limasbab4 {
    private double LuasAlas;
    public double tinggi;
    double volume;

    public double getLuasAlas() {
        return LuasAlas;
    }

    public void setLuasAlas(double LuasAlas) {
        this.LuasAlas = LuasAlas;
    }

    double volumeLimas() {
        volume = (getLuasAlas() * tinggi) / 3;
        return volume;
    }
}
