package co.com.personal.spring.controladores.peticiones;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PeticionesController {

	/*
	 *http://localhost:8080/cursoSpringMVC/peticiones/path 
	 * */
	@RequestMapping("/peticiones/path")
	public @ResponseBody String peticionesPorPath() {
	 return	"Peticiones por path";
	}
	/*
	 * http://localhost:8080/cursoSpringMVC/peticiones/metodo
	 * */
	@RequestMapping(value="/peticiones/metodo", method=RequestMethod.GET)
	public @ResponseBody String peticionesPorMetodo() {
		return "Peticion por metodo";
	}
	
	/*
	 * http://localhost:8080/cursoSpringMVC/peticiones/parametro?param1=valorParametro
	 * */
	@RequestMapping(value="/peticiones/parametro",method=RequestMethod.GET, params="param1")
	public @ResponseBody String peticionPorParametro() {
		return "Peticion por presencia de parametro ";
	}	
	/*
	 * http://localhost:8080/cursoSpringMVC/peticiones/sinparametro?param1=valorParametro
	 * */
	@RequestMapping(value="/peticiones/sinparametro",method=RequestMethod.GET, params="!param1")
	public @ResponseBody String peticionPorAusenciaDeParametro() {
		return "Peticion por ausencia de parametro ";
	}	
	/*
	 * http://localhost:8080/cursoSpringMVC/peticiones/cabeceras/
	 * */
	@RequestMapping(value="/peticiones/cabeceras",method=RequestMethod.GET, headers="Accept=text/plain")
	public @ResponseBody String peticionPorCabecera() {
		return "Peticion por presencia de cabeceras ";
	}	
	/*
	 * http://localhost:8080/cursoSpringMVC/peticiones/produces/
	 * */
	@RequestMapping(value="/peticiones/produces",method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String peticionPorProduces() {
		return "Peticion por presencia de produces  application/json";
	}	
	
	/*
	 *http://localhost:8080/cursoSpringMVC/peticiones/consumes/
	 * */
	@RequestMapping(value="/peticiones/consumes",method=RequestMethod.GET, consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String peticionPorConsumes() {
		return "Peticion por presencia de consumes  application/json";
	}	

	/*
	 * http://localhost:8080/cursoSpringMVC/peticiones/
	 * */
	@RequestMapping(value="/peticiones/*")
	public @ResponseBody String peticionPorExpresionesRegulares() {
		return "Peticion por expresion regular";
	}	
	
}
