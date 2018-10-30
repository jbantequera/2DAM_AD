/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejs.formas;

/**
 *
 * @author Javier
 */
public abstract class Forma {
    public void identidad(){
        System.out.println(this);
    }
    
    abstract public String toString();
}