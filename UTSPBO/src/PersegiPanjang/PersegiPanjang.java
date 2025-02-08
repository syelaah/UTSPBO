/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersegiPanjang;

/**
 *
 * @author sye
 */
public class PersegiPanjang {
  
    double panjang, lebar, luas, keliling;
    
    public PersegiPanjang() {
        panjang = 1.0;
        lebar = 1.0;
    }
    
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;  
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getLuas() {
        luas = panjang * lebar;
        return luas;
    }

    public double getKeliling() {
        keliling = panjang + lebar + panjang + lebar;
        return keliling;
    }

    @Override
    public String toString() {
        return "PersegiPanjang[panjang= " + panjang + ", lebar= " + lebar + "]";
    } 
}