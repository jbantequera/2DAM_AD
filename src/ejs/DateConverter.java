/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejs;

/**
 *
 * @author Javier
 * Formato Americano: MM/DD/AAAA
 * Formato Europeo: DD/MM/AAAA
 */
public class DateConverter {
    public static String switchFormat(String oldDate){
        String auxDate[] = oldDate.split("/");
        
        return(auxDate[1] + "/" + auxDate[0] + "/" + auxDate[2]);
    }
}
