package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="habilidad")
public class Habilidad {
	private int id;
	private String nombre;
	private String tipo;
	private Atributo atributo;
	
	public Habilidad(int id, String nombre, String tipo, Atributo atributo) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.atributo = atributo;
	}

	public Habilidad() {
		
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

	@XmlElement(name="tipo")
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@XmlElement(name="atributo")
	public Atributo getAtributo() {
		return atributo;
	}

	public void setAtributo(Atributo atributo) {
		this.atributo = atributo;
	}

	@Override
	public String toString() {
		return "Habilidad [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", atributo=" + atributo + "]";
	}

	
	
	

	
}
