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
public class Lector {
    public static int ultimaCifra(int numero){
        String numeroString = Integer.toString(numero);
        
        return(numeroString.charAt(numeroString.length() - 1));
    }
}
