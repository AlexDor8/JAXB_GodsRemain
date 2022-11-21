package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name="atributo")
public class Atributo {
	
	private int atributo;
	private String id;

	public Atributo(String id) {
		this.id = id;
	}

	public Atributo() {

	}

	@XmlAttribute(name="id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@XmlValue
	public int getAtributo() {
		return atributo;
	}

	public void setAtributo(int atributo) {
		this.atributo = atributo;
	}

	@Override
	public String toString() {
		return "Atributo [atributo=" + atributo + ", id=" + id + "]";
	}

	
	
	
	
}
