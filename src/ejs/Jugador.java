/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejs;

import java.io.Serializable;

/**
 *
 * @author Javier
 */
public class Jugador implements Serializable {
	String dni;
	String nombre;
	double peso;
	double altura;
	
	public Jugador(){
		this.dni = null;
		this.nombre = null;
		this.peso = 0.0;
		this.altura = 0.0;
	}
	
	public Jugador (String dni, String nombre, double peso, double altura) {
		this.dni = dni;
		this.nombre = nombre;
		this.peso = peso;
		this.altura = altura;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void print(){
		System.out.println("Nombre: " + getNombre());
		System.out.println("DNI: " + getDni());
		System.out.println("Altura: " + getAltura());
		System.out.println("Peso: " + getPeso());
	}
	
}
