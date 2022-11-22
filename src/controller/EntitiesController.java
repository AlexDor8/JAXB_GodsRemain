package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import model.Jugador;
import model.Jugadores;

public class EntitiesController {
	
	private ArrayList<String> todasAcciones = new ArrayList<String>();
	Jugadores jugadores = new Jugadores();
	ArrayList<Jugador> jugadores1 = jugadores.getJugadores();
	 
	
	private File ficheroAcciones() {
		String rutaDirectorio = System.getProperty("user.dir");
		String rutaFichero = rutaDirectorio  + File.separator + "resources" + File.separator
				+ "acciones.txt";
		File ficheroAcciones = new File(rutaFichero);
		return ficheroAcciones;
	}
	
	public void lecturaFichero() {
		BufferedReader br = null;
		try {
			String linea = "";

			br = new BufferedReader(new FileReader(ficheroAcciones()));
			while ((linea = br.readLine()) != null) {
				todasAcciones.add(linea);
			}
			for (int iii = 0;iii<=jugadores1.size();iii++) {
				System.out.println(jugadores1.size());
			}
			for (int i = 0;i<todasAcciones.size();i++) {
				if (todasAcciones.get(i).contains("P")) {
					for (int ii = 0;ii<jugadores1.size();ii++) {
						if (todasAcciones.get(i).contains(Integer.toString(jugadores1.get(ii).getId()))) {
							System.out.println("hola");
						}else {
							System.out.println("adios");
						}
					}
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
