package model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="jugadores")
public class Jugadores {
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

	public Jugadores() {

	}


	@XmlElement(name="jugador")
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	
}
