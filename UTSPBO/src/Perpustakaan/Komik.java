/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author sye
 */
public class Komik extends Buku {
    
    String namaKarakter;

    public Komik(String penerbit, int tahunTerbit, int tebalBuku, String namaKarakter) {
        super(penerbit, tahunTerbit);
        this.namaKarakter = namaKarakter;
        this.tebalBuku = tebalBuku;
    }

    public String getNamaKarakter() {
        return namaKarakter;
    }

    public void setNamaKarakter(String namaKarakter) {
        this.namaKarakter = namaKarakter;
    }  

    @Override
    public String toString() {
        cekKetebalan();
        return "Komik[judul= " + penerbit + ", tahun terbit= " + tahunTerbit 
                + ", karakter utama= " + namaKarakter + ", " 
                + tebalBuku + " lembar= " + kategori + "]";
    } 
}