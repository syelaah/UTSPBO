/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfisme;

/**
 *
 * @author sye
 */
public class AnimalApp {
    public static void main(String[] args) {
        var animal = new Animal();
        var cat = new Cat();
        
        animal.binatang();
        animal.binatang("ayam");
        cat.binatang();
    }
}
