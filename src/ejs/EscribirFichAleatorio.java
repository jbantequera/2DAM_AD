/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejs;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class EscribirFichAleatorio {
	public static void prueba() throws FileNotFoundException, IOException {
		File fichero = new File("C:\\Users\\Javier\\Desktop\\Java\\fichaleatorio.dat");
		RandomAccessFile file = new RandomAccessFile(fichero, "rw");
		
		String apellido[] = {"FERNANDEZ", "GIL", "LOPEZ", "RAMOS", "SEVILLA", 
			"CASILLA", "REY"};
		
		int dep[] = {10, 20, 10, 10, 30, 30, 20};
		Double salario[] = {1000.45, 2400.60, 3000.0, 1500.56, 2200.0, 1435.87,
			2000.0};
		
		StringBuffer buffer = null;
		int n = apellido.length;
		
		for (int i = 0; i < n; i++) {
			file.writeInt(i+1);
			buffer = new StringBuffer(apellido[i]);
			buffer.setLength(10);
			file.writeChars(buffer.toString()); // Insertar apellido
			file.writeInt(dep[i]);
			file.writeDouble(salario[i]);
		}
		
		file.close();
	}
	
	public static void modificar() throws FileNotFoundException, IOException {
		Scanner cin = new Scanner(System.in);
		File fichero = new File("C:\\Users\\Javier\\Desktop\\Java\\fichaleatorio.dat");
		RandomAccessFile file = new RandomAccessFile(fichero, "rw");
		
		int id;
		int dep;
		double salario;
		char[] apellidoArray = new char [10];
		int num_trabajadores = (int) (file.length() / 36);
		
		int opcion;
		
		do{
			do{
				System.out.print("¿Qué usuario desea modificar? (0 para salir): ");
				id = cin.nextInt();
				
				if (id > num_trabajadores)
					System.out.println("Solo existen " + num_trabajadores + " en el sistema.");
			}while(id < 0 || id > num_trabajadores);
		
			if (id != 0){		
				file.seek((id-1)*36); //Nos movemos a la posición deseada

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
				
				do{
					System.out.print("Introduzca el nuevo salario: ");
					salario = cin.nextDouble();
				}while(salario <= 0);
				
				file.seek(((id - 1) * 36) + 28);
				file.writeDouble(salario);
			}
		}while(id!=0);
		
		file.close();
	}
}
