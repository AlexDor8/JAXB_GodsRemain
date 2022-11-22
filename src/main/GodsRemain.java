package main;

import controller.EntitiesController;
import dao.Unmarshall;

public class GodsRemain {

	public static void main(String[] args) {
		(new Unmarshall()).init();
		(new EntitiesController()).lecturaFichero();
	}

}
