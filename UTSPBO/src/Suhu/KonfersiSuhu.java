package Suhu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sye
 */
public class KonfersiSuhu implements KonversiSuhuInterface {
    double c, f, k;
    
    @Override
    public void CelciusKeKelvin(double c){
        this.c = c;
        k = c + 273;
        System.out.println(c + " celcius konfersi menjadi " + k + " kelvin");
    }
    
    @Override
    public void CelciusKeFahrenheit(double c){
        this.c = c;
        f= c * 1.8 + 32;
        System.out.println(c + " celcius konfersi menjadi " + f + " fahrenheit");
    }
    
    @Override
    public void KelvinKeCelcius(double k){
        this.k = k;
        c = k - 273;
        System.out.println(k + " kelvin konfersi menjadi " + c + " celcius");
    }
    
    @Override
    public void FahrenheitKeCelcius(double f){
        this.f = f;
        c = (0.5*(f-32));
        System.out.println(f + " fahrenheit konfersi menjadi " + c + " celcius");
    }       
}