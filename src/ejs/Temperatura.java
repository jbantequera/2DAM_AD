/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejs;

/**
 *
 * @author Javier
 */
public class Temperatura {

    public static double celsiusToFahrenheit(double cels){
        return ((cels*1.8) + 32);
    }
    
    public static double fahrenheitToCelsius(double fahr){
        return ((fahr - 32) / 1.8);
    }
        
}
