package co.com.personal.spring.controladores.conversores;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class JavaBean {

	private Integer numero;
	private String nombre;
	
	@DateTimeFormat(iso=ISO.DATE)
	private Date fecha;
	private Collection<Integer> coleccion;
	
	private List<Integer> listaEnteros;
	
	private Map<Integer,String> mapa;
	
	private Anidado anidado;
	
	
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
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Collection<Integer> getColeccion() {
		return coleccion;
	}
	public void setColeccion(Collection<Integer> coleccion) {
		this.coleccion = coleccion;
	}
	public List<Integer> getListaEnteros() {
		return listaEnteros;
	}
	public void setListaEnteros(List<Integer> listaEnteros) {
		this.listaEnteros = listaEnteros;
	}
	public Map<Integer,String> getMapa() {
		return mapa;
	}
	public void setMapa(Map<Integer,String> mapa) {
		this.mapa = mapa;
	}
	public Anidado getAnidado() {
		return anidado;
	}
	public void setAnidado(Anidado anidado) {
		this.anidado = anidado;
	}
	@Override
	public String toString() {
		return "JavaBean [" + (numero != null ? "numero=" + numero + ", " : "")
				+ (nombre != null ? "nombre=" + nombre + ", " : "") + (fecha != null ? "fecha=" + fecha + ", " : "")
				+ (coleccion != null ? "coleccion=" + coleccion + ", " : "")
				+ (listaEnteros != null ? "listaEnteros=" + listaEnteros + ", " : "")
				+ (mapa != null ? "mapa=" + mapa + ", " : "") + (anidado != null ? "anidado=" + anidado : "") + "]";
	}
	

}
