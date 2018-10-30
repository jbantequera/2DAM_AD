package ejs;
import java.io.*;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javier
 */
public class LeerFichAleatorio {
	static public void prueba() throws FileNotFoundException, IOException {
		Scanner cin = new Scanner(System.in);
		File fichero = new File("C:\\Users\\Javier\\Desktop\\Java\\fichaleatorio.dat");
		RandomAccessFile file = new RandomAccessFile(fichero, "r");
		
		int id, dep, posicion, tope;
		Double salario;
		char[] apellidoArray = new char [10];
		
		int num_trabajadores = (int) (file.length() / 36);
		posicion = 0;
		
		do{
			do{
				System.out.print("¿Cuántos usuarios desea mostrar? (0 para salir): ");
				tope = cin.nextInt();
				
				if (tope > num_trabajadores)
					System.out.println("Solo existen " + num_trabajadores + " en el sistema.");
			}while(tope < 0 || tope > num_trabajadores);
		
			if (tope != 0){
				for (int i = 0; i < tope; i++){
					file.seek(i*36); //Nos movemos a la posición deseada
					
					//Leo ID
					id = file.readInt();
					
					//Leo apellido
					for (int j = 0; j < apellidoArray.length; j++)
						apellidoArray[j] = file.readChar();
					
					String apellidoString = new String (apellidoArray);
					
					//Leo departamento
					dep = file.readInt();
					
					//Leo salario
					salario = file.readDouble();
					
					System.out.println("ID: " + id + ", Apellido: " + apellidoString + ", Departamento: " + dep + ", Salario: " + salario);
				}
			}
		}while(tope!=0);
		
		file.close();
	}
}
