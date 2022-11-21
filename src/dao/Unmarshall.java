package dao;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import model.Jugador;
import model.Jugadores;

public class Unmarshall {
	public void init() {
		Jugadores jugadores = null;
		try {
			JAXBContext context = JAXBContext.newInstance(Jugadores.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			jugadores = (Jugadores) unmarshaller.unmarshal(ficheroEntrada());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		if (jugadores == null) System.out.println("Error");
		else {
			for (Jugador j : jugadores.getJugadores()) {
				System.out.println(j);
			}
		}
	}
	
	private File ficheroEntrada() {
		String rutaDirectorio = System.getProperty("user.dir");
		String rutaFichero = rutaDirectorio  + File.separator + "resources" + File.separator
				+ "entrada.xml";
		File ficheroEntrada = new File(rutaFichero);
		return ficheroEntrada;
	}
}
