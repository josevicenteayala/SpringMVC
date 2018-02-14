package es.adama.spring.controladores.conversores;

import java.util.List;
import java.util.Map;

public class Anidado {

	private Integer numero;
	private String nombre;
	private List<Anidado> listaAnidados;
	private Map<Integer, Anidado> mapa;
	
	public Integer getNumero() {
		return numero;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<Anidado> getListaAnidados() {
		return listaAnidados;
	}

	public void setListaAnidados(List<Anidado> listaAnidados) {
		this.listaAnidados = listaAnidados;
	}

	public Map<Integer, Anidado> getMapa() {
		return mapa;
	}

	public void setMapa(Map<Integer, Anidado> mapa) {
		this.mapa = mapa;
	}

	@Override
	public String toString() {
		return "Anidado [" + (numero != null ? "numero=" + numero + ", " : "")
				+ (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (listaAnidados != null ? "listaAnidados=" + listaAnidados + ", " : "")
				+ (mapa != null ? "mapa=" + mapa : "") + "]";
	}	
}
