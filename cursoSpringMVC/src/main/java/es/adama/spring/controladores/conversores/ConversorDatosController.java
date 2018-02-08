package es.adama.spring.controladores.conversores;

import java.util.Collection;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/conversor/*")
public class ConversorDatosController {
	/*
	 * http://localhost:8080/cursoSpringMVC/conversor/entero?numero=55
	 * */
	@RequestMapping("/entero")
	public @ResponseBody String entero(@RequestParam Integer numero) {
		return "Datos numerico convertido "+numero;
	}

	/*
	 * http://localhost:8080/cursoSpringMVC/conversor/fecha?fecha=2018-02-10
	 * */	
	@RequestMapping("/fecha")
	public @ResponseBody String fecha(@RequestParam @DateTimeFormat(iso=ISO.DATE) Date fecha) {
		return "Datos fecha convertido "+fecha;
	}
	
	/*
	 * http://localhost:8080/cursoSpringMVC/conversor/fechaConOtroPatron?fecha=09-02-2018
	 * */	
	@RequestMapping("/fechaConOtroPatron")
	public @ResponseBody String fecha2(@RequestParam @DateTimeFormat(pattern="dd-MM-yyyy") Date fecha) {
		return "Datos fecha convertido "+fecha;
	}	
	
	/*
	 * http://localhost:8080/cursoSpringMVC/conversor/coleccion?coleccion=09&coleccion=10
	 * http://localhost:8080/cursoSpringMVC/conversor/coleccion?coleccion=34,45,67,87
	 * */
	@RequestMapping("/coleccion")
	public @ResponseBody String coleccion(@RequestParam Collection<Integer> coleccion) {
		return "Datos coleccion convertido "+coleccion;
	}	
	
	/*
	 * http://localhost:8080/cursoSpringMVC/conversor/coleccionfechas?fechas=2018-02-10&fecha=2018-03-23
	 * http://localhost:8080/cursoSpringMVC/conversor/coleccionfechas?fechas=2018-02-10,2018-03-23
	 * */
	@RequestMapping("/coleccionfechas")
	public @ResponseBody String coleccionfechas(@RequestParam @DateTimeFormat(iso=ISO.DATE) Collection<Date> fechas) {
		return "Datos coleccion fechas convertido "+fechas;
	}
	
	/*
	 * http://localhost:8080/cursoSpringMVC/conversor/objeto?numero=34&nombre=Vicente
	 * http://localhost:8080/cursoSpringMVC/conversor/objeto?numero=34&nombre=Vicente%20Ayala&fecha=2018-02-10
	 * http://localhost:8080/cursoSpringMVC/conversor/objeto?numero=34&nombre=Vicente%20Ayala&fecha=2018-02-10&coleccion=78,45,56,234,45,65
	 * http://localhost:8080/cursoSpringMVC/conversor/objeto?listaEnteros[0]=90&listaEnteros[1]=34
	 * http://localhost:8080/cursoSpringMVC/conversor/objeto?listaEnteros[0]=90&listaEnteros[1]=34&mapa[100]=Vicente&mapa[300]=Marta
	 * http://localhost:8080/cursoSpringMVC/conversor/objeto?anidado.numero=435&anidado.nombre=Jose%20Vicente
	 * http://localhost:8080/cursoSpringMVC/conversor/objeto?anidado.listaAnidados[0].numero=23&anidado.listaAnidados[0].nombre=Jose%20Vicente
	 * http://localhost:8080/cursoSpringMVC/conversor/objeto?anidado.mapa[1].numero=20&nombre=Jose%20Vicente
	 * */
	@RequestMapping("/objeto")
	public @ResponseBody String coleccion(JavaBean bean) {
		return "Datos objeto convertido "+bean;
	}	
	
}
