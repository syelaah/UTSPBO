/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author sye
 */
public class Buku {
    String penerbit, kategori;
    int tahunTerbit;
    int tebalBuku;
    
    public Buku(String penerbit, int tahunTerbit) {
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
    }
    
    public String getPenerbit() {
        return penerbit;
    }
    
    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
    
    public int getTahunTerbit() {
        return tahunTerbit;
    }
        
    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public int getTebalBuku() {
        return tebalBuku;
    }

    public void setTebalBuku(int tebalBuku) {
        this.tebalBuku = tebalBuku;
    }
    
    public void cekKetebalan() {
        if ((tebalBuku <= 50)&&(tebalBuku >= 1)){
            kategori = "tipis";
        } else if ((tebalBuku <= 100)&&(tebalBuku >= 51)){
            kategori = "sedang";
        } else if (tebalBuku > 100){
             kategori = "tebal";
        } else {
          System.out.println("Tidak ada dalam kategori");
        }
    }
}