package ejs;


import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javier
 */
class GestionContenido extends DefaultHandler{
	
	ArrayList<Alumno> alumnos;
	String elemento;
	String nombre;
	int edad;
	
	public GestionContenido(){
		super();
		this.alumnos = new ArrayList();
		this.elemento = null;
		this.nombre = null;
		this.edad = 0;
	}
	
	public void startDocument(){}
	
	public void endDocument(){
		for (int i = 0; i < alumnos.size(); i++){
			alumnos.get(i).printAlumno();
		}
	}
	
	public void startElement(String uri, String nombre, String nombreC, Attributes atts){
		this.elemento = nombre;
	}
	
	public void endElement(String uri, String nombre, String nombreC){
		if (nombre.equals("alumno"))
			this.alumnos.add(new Alumno(nombre, edad));
	}
	
	public void characters(char[] ch, int inicio, int longitud) throws SAXException {
		String car = new String(ch, inicio, longitud);
		car = car.replaceAll("[\t\n]", "");
		
		if (elemento.equals("Edad"))
			edad = Integer.parseInt(car);
		else if (elemento.equals("Nombre"))
			nombre = car;
	}
}
