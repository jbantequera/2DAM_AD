/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejs;

import java.io.*;

/**
 *
 * @author Javier
 */
public class LectorArchivos {
    
    public static void leerFichero(String ruta) throws IOException{
        //Declaramos el fichero que vamos a leer
        File fichero = new File(ruta);
        
        if (fichero.exists()){
            FileReader fic = new FileReader(fichero);

            int i;

            while((i = fic.read()) != -1) //Se lee carácter a carácter
                System.out.print((char) i);
            fic.close(); //Cerrar fichero
        } else {
            System.out.println("No existe el fichero");
        }
    }
}
