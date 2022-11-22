package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import dao.Unmarshall;
import model.Jugador;
import model.Jugadores;

public class EntitiesController {

	ArrayList<Jugador> jugadores;

	private File ficheroAcciones() {
		String rutaDirectorio = System.getProperty("user.dir");
		String rutaFichero = rutaDirectorio + File.separator + "resources" + File.separator + "acciones.txt";
		File ficheroAcciones = new File(rutaFichero);
		return ficheroAcciones;
	}

	public void lecturaFichero(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
		BufferedReader br = null;
		try {
			String linea = "";

			br = new BufferedReader(new FileReader(ficheroAcciones()));
			while ((linea = br.readLine()) != null) {
				char accion = linea.charAt(0);
				String[] acciones = linea.split("");
				switch (acciones[0]) {
				case "P":
					System.out.println("Información del personaje:");
					for (int i = 0; i < jugadores.size(); i++) {
						if (Integer.toString(jugadores.get(i).getId()).equals(acciones[2])) {
							System.out.println(jugadores.get(i));
						}
					}
					break;
				case "B":
					break;
				case "A":
					break;
				case "S":
					break;
				}

			}

		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado" + e.getMessage());
		} catch (IOException e) {
			System.out.println("Error al leer el fichero");
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar el fichero");
			}

		}
	}

}
