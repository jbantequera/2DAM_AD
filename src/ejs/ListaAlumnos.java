/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejs;

import java.util.ArrayList;

/**
 *
 * @author Javier
 */
public class ListaAlumnos {
	private ArrayList<Alumno> lista = new ArrayList();
	
	public ListaAlumnos() {}
	
	public void add (Alumno alu) {
		lista.add(alu);
	}
	
	public ArrayList<Alumno> getListaPersonas(){
		return lista;
	}
}
