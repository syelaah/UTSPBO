/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enkapsulasi;

/**
 *
 * @author sye
 */
public class TabunganApp {
    public static void main(String[] args) {
        var tabungan = new Tabungan();
        
        tabungan.setTabungan(50000);
        
        System.out.println("Tabunganku saat ini: " + tabungan.getTabungan());
    }
}