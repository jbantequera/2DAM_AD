/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejs;

import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class Test {
    static public void calculos(){
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        
        System.out.print("Introduzca el primer número: ");
        num1 = sc.nextInt();
        
        System.out.print("Introduzca el segundo número: ");
        num2 = sc.nextInt();
        
        System.out.println("--- Operaciones ---");
        System.out.println("Suma: " + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("Multiplicación: " + num1 + " x " + num2 + " = " + (num1 * num2));
        try{
            System.out.println("División: " + num1 + " / " + num2 + " = " + (num1 / num2));
        } catch (Exception ex){
            System.out.println("Imposible dividir entre 0");
        }
        System.out.println("Módulo: " + num1 + " % " + num2 + " = " + (num1 % num2));
    }
}
