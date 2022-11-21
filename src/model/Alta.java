package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;


@XmlRootElement(name="alta")
public class Alta {
	
	private String alta;
	private String ciudad;

	
	public Alta() {
		
	}
	
	public Alta(String alta, String ciudad) {
		this.alta = alta;
		this.ciudad = ciudad;
	}


	@XmlValue
	public String getAlta() {
		return alta;
	}



	public void setAlta(String alta) {
		this.alta = alta;
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
		return "Alta [alta=" + alta + ", ciudad=" + ciudad + "]";
	}

	
	
	
}
