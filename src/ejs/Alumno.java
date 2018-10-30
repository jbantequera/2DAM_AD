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
public class Alumno {
	String nombre;
	int edad;
	
	public Alumno(){
		this.nombre = null;
		this.edad = 0;
	}
	
	public Alumno(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void printAlumno(){
		System.out.println("Nombre: " + this.nombre + "\t Edad: " + this.edad);
	}
}
