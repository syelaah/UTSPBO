/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author sye
 */
public class BukuAnak extends Buku {
    
    int usia;

    public BukuAnak(String penerbit, int tahunTerbit, int tebalBuku, int usia) {
        super(penerbit, tahunTerbit);
        this.usia = usia;
        this.tebalBuku = tebalBuku;
    }
    
    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    } 

    @Override
    public String toString() {
        cekKetebalan();
        return "BukuAnak[judul= " + penerbit + ", tahun terbit= " 
                + tahunTerbit + ", batasan usia= " + usia + " tahun ke atas" + ", " 
                + tebalBuku + " lembar= " + kategori + "]";
    }
}