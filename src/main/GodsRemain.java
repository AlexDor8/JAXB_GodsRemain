package main;

import controller.EntitiesController;
import dao.Unmarshall;

public class GodsRemain {

	public static void main(String[] args) {
		Unmarshall unmarshall = new Unmarshall();
		unmarshall.initJugadores();
		(new EntitiesController()).lecturaFichero(unmarshall.getJugadores1());
	}

}
