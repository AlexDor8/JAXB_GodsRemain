package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="atributo")
public class Atributo {
	
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

	@Override
	public String toString() {
		return "Atributo [id=" + id + "]";
	}
	
	
	
}
