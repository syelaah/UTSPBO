/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Suhu;

/**
 *
 * @author sye
 */
public class KonfersiSuhuApp {
    public static void main(String[] args) {
        var suhu = new KonfersiSuhu();
        
        suhu.CelciusKeKelvin(200);
        suhu.CelciusKeFahrenheit(244);
        suhu.KelvinKeCelcius(425);
        suhu.FahrenheitKeCelcius(127);
    }
}
