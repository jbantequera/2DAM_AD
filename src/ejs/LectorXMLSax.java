/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejs;
import java.io.IOException;
import java.util.ArrayList;
import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

/**
 *
 * @author Javier
 */
public class LectorXMLSax {
	
	static ArrayList<Alumno> alumnos;
	
	public LectorXMLSax(ArrayList<Alumno> alumnos){
		alumnos = alumnos;
	}
	
	static class GestionContenido extends DefaultHandler{
			String elemento;
			String nombre;
			int edad;

			public GestionContenido(){
				super();
				this.elemento = null;
				this.nombre = null;
				this.edad = 0;
			}

			public void startDocument(){}

			public void endDocument(){}

			public void startElement(String uri, String nombre, String nombreC, Attributes atts){
				this.elemento = nombre;
				//System.out.println("Elemento: " + nombre);
			}

			public void endElement(String uri, String nombre, String nombreC){
				if (nombre.equals("alumno"))
					alumnos.add(new Alumno(this.nombre, this.edad));
			}

			public void characters(char[] ch, int inicio, int longitud) throws SAXException {
				String car = new String(ch, inicio, longitud);
				car = car.replaceAll("[\t\n]", "");

				if (elemento.equals("edad"))
					this.edad = Integer.parseInt(car);
				else if (elemento.equals("nombre"))
					this.nombre = car;
			}
		}
	
	public static void prueba() throws SAXException, IOException {
		XMLReader procesadorXML = XMLReaderFactory.createXMLReader();
		GestionContenido gestor = new GestionContenido();
		procesadorXML.setContentHandler(gestor);
		InputSource fileXML = new InputSource("C:\\Users\\Javier\\Desktop\\Java\\alumnos.xml");
		alumnos = new ArrayList();
		procesadorXML.parse(fileXML);
		
		for (int i = 0; i < alumnos.size(); i++)
			alumnos.get(i).printAlumno();
	}
}
