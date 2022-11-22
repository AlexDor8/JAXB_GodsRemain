package dao;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import model.Jugador;
import model.Jugadores;

public class Unmarshall {

	private ArrayList<Jugador> jugadores1 = new ArrayList<Jugador>();
	

	public ArrayList<Jugador> getJugadores1() {
		return jugadores1;
	}

	public void setJugadores1(ArrayList<Jugador> jugadores1) {
		this.jugadores1 = jugadores1;
	}

	public void initJugadores() {
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
			jugadores1.addAll(jugadores.getJugadores());
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
