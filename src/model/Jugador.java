package model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="jugador")
@XmlType(propOrder= {"id", "nombre", "alta", "objetos", "habilidades"})
public class Jugador {
	private int id;
	private String nombre;
	private Alta alta;
	private ArrayList<Objeto> objetos = new ArrayList<Objeto>();
	private ArrayList<Habilidad> habilidades = new ArrayList<Habilidad>();
	
	
	
	public Jugador(int id, String nombre, Alta alta, ArrayList<Objeto> objetos, ArrayList<Habilidad> habilidades) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.alta = alta;
		this.objetos = objetos;
		this.habilidades = habilidades;
	}

	public Jugador() {
	}


	@XmlAttribute(name="id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@XmlElement(name="nombre")
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Alta getAlta() {
		return alta;
	}

	public void setAlta(Alta alta) {
		this.alta = alta;
	}
	
	@XmlElementWrapper(name="objetos")
	@XmlElement(name="objeto")
	public ArrayList<Objeto> getObjetos() {
		return objetos;
	}
	public void setObjetos(ArrayList<Objeto> objetos) {
		this.objetos = objetos;
	}
	
	@XmlElementWrapper(name="habilidades")
	@XmlElement(name="habilidad")
	public ArrayList<Habilidad> getHabilidades() {
		return habilidades;
	}
	public void setHabilidades(ArrayList<Habilidad> habilidades) {
		this.habilidades = habilidades;
	}
	



	@Override
	public String toString() {
		return "Jugador [id=" + id + ", nombre=" + nombre + ", alta=" + alta + ", objetos=" + objetos + ", habilidades="
				+ habilidades + "]";
	}
	
	
	
}
