package es.adama.spring.controladores.conversores.mensajes;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class JavaBean {

	private String fruta;
	private String carro;
	
	public JavaBean() {
		//constructor vacio
	}
	
	public JavaBean(String fruta, String carro) {
		this.fruta = fruta;
		this.carro = carro;
	}

	public String getFruta() {
		return fruta;
	}

	public String getCarro() {
		return carro;
	}

	public void setFruta(String frita) {
		this.fruta = frita;
	}

	public void setCarro(String carro) {
		this.carro = carro;
	}

	@Override
	public String toString() {
		return "JavaBean [" + (fruta != null ? "fruta=" + fruta + ", " : "") + (carro != null ? "carro=" + carro : "")
				+ "]";
	}

}
