package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import dao.Marshall;
import model.Atributo;
import model.Habilidad;
import model.Jugador;

public class EntitiesController {

	ArrayList<Jugador> jugadores;
	ArrayList<Habilidad> habilidades;

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
				String[] acciones = linea.split(" ");
				switch (acciones[0]) {
				case "P":
					System.out.println("Información del personaje:");
					for (int i = 0; i < jugadores.size(); i++) {
						if (Integer.toString(jugadores.get(i).getId()).equals(acciones[1])) {
							System.out.println(jugadores.get(i));
						}
					}
					break;
				case "B":
					for (int i = 0; i < jugadores.size(); i++) {
						if (Integer.toString(jugadores.get(i).getId()).equals(acciones[1])) {
							for (int ii = 0; ii < jugadores.get(i).getHabilidades().size(); ii++) {
								if (jugadores.get(i).getHabilidades().get(ii).getId().equals(acciones[2])) {
									habilidades = jugadores.get(i).getHabilidades();
									Habilidad habilidad = jugadores.get(i).getHabilidades().get(ii);
									boolean eliminado = habilidades.remove(habilidad);
									if (eliminado) {
										System.out.println("La habilidad " + habilidad + " ha sido eliminada");
									}
								}
							}
						}
					}
					break;
				case "A":
					for (int i = 0; i < jugadores.size(); i++) {
						if (Integer.toString(jugadores.get(i).getId()).equals(acciones[1])) {
							habilidades = jugadores.get(i).getHabilidades();
							if(acciones.length == 10) {
								Atributo PS = new Atributo(Integer.parseInt(acciones[3]), "PS");
								Atributo ATQ = new Atributo(Integer.parseInt(acciones[4]), "ATQ");
								Atributo SATQ = new Atributo(Integer.parseInt(acciones[5]), "SATQ");
								Atributo STA = new Atributo(Integer.parseInt(acciones[6]), "STA");
								Atributo VEL = new Atributo(Integer.parseInt(acciones[7]), "VEL");
								Atributo DEF = new Atributo(Integer.parseInt(acciones[8]), "DEF");
								Atributo SDEF = new Atributo(Integer.parseInt(acciones[9]), "SDEF");
								Atributo[] atributo = {PS, ATQ, SATQ, STA, VEL, DEF, SDEF};
								Habilidad habilidad = new Habilidad(acciones[2], "", "", atributo);
								habilidades.add(habilidad);
								System.out.println("La habilidad ha sido añadida.");
							}else if (acciones.length == 12){
								Atributo PS = new Atributo(Integer.parseInt(acciones[5]), "PS");
								Atributo ATQ = new Atributo(Integer.parseInt(acciones[6]), "ATQ");
								Atributo SATQ = new Atributo(Integer.parseInt(acciones[7]), "SATQ");
								Atributo STA = new Atributo(Integer.parseInt(acciones[8]), "STA");
								Atributo VEL = new Atributo(Integer.parseInt(acciones[9]), "VEL");
								Atributo DEF = new Atributo(Integer.parseInt(acciones[10]), "DEF");
								Atributo SDEF = new Atributo(Integer.parseInt(acciones[11]), "SDEF");
								Atributo[] atributo = {PS, ATQ, SATQ, STA, VEL, DEF, SDEF};
								Habilidad habilidad = new Habilidad(acciones[2], acciones[3], acciones[4], atributo);
								habilidades.add(habilidad);
								System.out.println("La habilidad ha sido añadida.");
							}else {
								System.out.println("Error al añadir la habilidad. Faltan parámetros.");
							}
							
						}
					}
					break;
				case "S":
					(new Marshall()).generarXml(this.jugadores);
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
