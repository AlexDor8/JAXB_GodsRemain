package model;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="habilidad")
public class Habilidad {
	private String id;
	private String nombre;
	private String tipo;
	private Atributo[] atributos = {};
	
	public Habilidad(String id, String nombre, String tipo, Atributo[] atributos) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.atributos = atributos;
	}

	public Habilidad() {
		
	}


	@XmlAttribute(name="id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@XmlElement(name="nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@XmlElement(name="tipo")
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@XmlElement(name="atributo")
	public Atributo[] getAtributos() {
		return atributos;
	}

	public void setAtributos(Atributo[] atributos) {
		this.atributos = atributos;
	}

	@Override
	public String toString() {
		return "Habilidad [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", atributos="
				+ Arrays.toString(atributos) + "]";
	}

	

	
	
	

	
}
