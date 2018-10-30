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
public class Circulo extends Forma{
    @Override
    public String toString(){
        return("Circulo");
    }
    
    public static void jerarquia(Object obj){
        Object o = obj;
        
        while(o.getClass().getSuperclass() != null){
            try{
                System.out.println(o.getClass() + " es una subclase de " + o.getClass().getSuperclass());
                o = o.getClass().getSuperclass().newInstance();
            }
            catch (InstantiationException e){
                System.out.println("Imposible estanciar la clase " + o.getClass().getSuperclass());
            }
            catch (IllegalAccessException e){
                System.out.println("No hay acceso");
            }
        }
    }
}
