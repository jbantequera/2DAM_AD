/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejs;

import com.thoughtworks.xstream.*;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import java.io.*;

/**
 *
 * @author Javier
 */
public class ExportarXML {
	public static void prueba(){
		ListaAlumnos listaAlumnos = new ListaAlumnos();
		listaAlumnos.add(new Alumno("Javier", 20));
		listaAlumnos.add(new Alumno("Manolo", 21));
		listaAlumnos.add(new Alumno("Miguel", 34));
		
		try {
			XStream xstream = new XStream(new StaxDriver());
			
			//Añadimos alias para sustituir cadenas cuando exportamos a XML
			xstream.alias("ListaAlumnos", ListaAlumnos.class);
			xstream.alias("DatosAlumno", Alumno.class);
			
			//Omitimos que exporte la etiqueta "lista" correspondiente a lista de ListaAlumnos
			xstream.addImplicitCollection(ListaAlumnos.class, "lista");
			
			//Exportamos a XML
			xstream.toXML(listaAlumnos, new FileOutputStream("C:\\Users\\Javier\\Desktop\\Java\\alumnosexport.xml"));
			System.out.println("Archivo XML exportado");
			
			
		} catch(Exception e) {}
	}
}
