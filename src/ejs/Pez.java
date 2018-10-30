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
public class Pez implements Cloneable{

       static private int numPeces = 0;
       protected String nombre;
       
       public Pez(){
           numPeces++;
       }
       
       static public int getNumPeces(){
           return(numPeces);
       }
       
       public String getNombre(){
           return(this.nombre);
       }
    
       public void setNombre(String nombre){
           this.nombre = nombre;
       }
       
       @Override
       public Object clone(){
           Object copia = null;
           
           try{
               copia = super.clone();
           }catch(CloneNotSupportedException ex){
               System.out.println("No se pudo clonar el pez");
           }
           
           return copia;
       }

       @Override
       public boolean equals(Object pez2){
           boolean resultado;
       
           if ((this.getNombre() != null) && (((Pez)pez2).getNombre() != null))
               resultado = this.getNombre().equals(((Pez)pez2).getNombre());
           else if ((this.getNombre() == null) && (((Pez)pez2).getNombre() == null))
               resultado = true;
           else
               resultado = false;
           
           return (resultado);
       }
}
