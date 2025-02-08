/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfisme;

/**
 *
 * @author sye
 */
public class Animal {
    String hewan = "kucing";
    
    public void binatang(){
        System.out.println("Hewan " + hewan + " berkaki empat.");
    }
    
    public void binatang(String hewan){
        System.out.println("Hewan " + hewan + " berkaki dua.");
    }
}
