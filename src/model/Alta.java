package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="alta")
public class Alta {
	
	private String ciudad;

	public Alta() {
		
	}

	@XmlAttribute(name="ciudad")
	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Alta [ciudad=" + ciudad + "]";
	}
	
	
}
