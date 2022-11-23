package dao;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import model.Jugador;
import model.Jugadores;



public class Marshall {
	
	
	public void generarXml(ArrayList<Jugador> jugadores) {
		Jugadores jugadores1  = new Jugadores();
		jugadores1.setJugadores(jugadores);
		try {
			JAXBContext context = JAXBContext.newInstance(Jugadores.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.marshal(jugadores1, ficheroSalida());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	private File ficheroSalida() {
		String rutaDirectorio = System.getProperty("user.dir");
		String rutaFichero = rutaDirectorio + File.separator +  "resources" + File.separator
				+ "salida1.xml";
		File ficheroSalida = new File(rutaFichero);
		return ficheroSalida;
	}
}
