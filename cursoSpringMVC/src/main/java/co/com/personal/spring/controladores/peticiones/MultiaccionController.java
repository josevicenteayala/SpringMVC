package co.com.personal.spring.controladores.peticiones;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/multiaccion/*")
public class MultiaccionController {

	/*
	 * http://localhost:8080/cursoSpringMVC/multiaccion/path/
	 * */
	
	@RequestMapping("/path")
	public @ResponseBody String peticionesPorPath() {
	 return	"Peticiones por path";
	}
	
	/*
	 * http://localhost:8080/cursoSpringMVC/multiaccion/metodo/
	 * */
	@RequestMapping(value="/metodo", method=RequestMethod.GET)
	public @ResponseBody String peticionesPorMetodo() {
		return "Peticion por metodo";
	}
	
	/*
	 * http://localhost:8080/cursoSpringMVC/multiaccion/parametro?param1=valorParametro
	 * */
	@RequestMapping(value="/parametro",method=RequestMethod.GET, params="param1")
	public @ResponseBody String peticionPorParametro() {
		return "Peticion por presencia de parametro ";
	}	
	
	/*
	 * http://localhost:8080/cursoSpringMVC/multiaccion/sinparametro?param1=valorParametro
	 * */
	@RequestMapping(value="/sinparametro",method=RequestMethod.GET, params="!param1")
	public @ResponseBody String peticionPorAusenciaDeParametro() {
		return "Peticion por ausencia de parametro ";
	}	
	
	/*
	 * http://localhost:8080/cursoSpringMVC/multiaccion/cabeceras
	 * */
	@RequestMapping(value="/cabeceras",method=RequestMethod.GET, headers="Accept=text/plain")
	public @ResponseBody String peticionPorCabecera() {
		return "Peticion por presencia de cabeceras ";
	}	
	
	@RequestMapping(value="/produces",method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String peticionPorProduces() {
		return "Peticion por presencia de produces  application/json";
	}	
	
	@RequestMapping(value="/consumes",method=RequestMethod.GET, consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String peticionPorConsumes() {
		return "Peticion por presencia de consumes  application/json";
	}	

	//@RequestMapping(value="/*")
	public @ResponseBody String peticionPorExpresionesRegulares() {
		return "Peticion por expresion regular";
	}	
	
}
