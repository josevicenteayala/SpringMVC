package es.adama.spring.controladores.peticiones;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PeticionesController {

	@RequestMapping("/peticiones/path")
	public @ResponseBody String peticionesPorPath() {
	 return	"Peticiones por path";
	}
	@RequestMapping(value="/peticiones/metodo", method=RequestMethod.GET)
	public @ResponseBody String peticionesPorMetodo() {
		return "Peticion por metodo";
	}
	
	@RequestMapping(value="/peticiones/parametro",method=RequestMethod.GET, params="param1")
	public @ResponseBody String peticionPorParametro() {
		return "Peticion por presencia de parametro ";
	}	
	@RequestMapping(value="/peticiones/sinparametro",method=RequestMethod.GET, params="!param1")
	public @ResponseBody String peticionPorAusenciaDeParametro() {
		return "Peticion por ausencia de parametro ";
	}	
	@RequestMapping(value="/peticiones/cabeceras",method=RequestMethod.GET, headers="Accept=text/plain")
	public @ResponseBody String peticionPorCabecera() {
		return "Peticion por presencia de cabeceras ";
	}	
	
	@RequestMapping(value="/peticiones/cabecerassintextoplano",method=RequestMethod.GET, headers="!Accept=text/plain")
	public @ResponseBody String peticionPorCabeceraSinTextoPlano() {
		return "Peticion por ausencia de cabeceras ";
	}	
	
	@RequestMapping(value="/peticiones/produces",method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String peticionPorProduces() {
		return "Peticion por presencia de produces  application/json";
	}	
	
	@RequestMapping(value="/peticiones/consumes",method=RequestMethod.GET, consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String peticionPorConsumes() {
		return "Peticion por presencia de consumes  application/json";
	}	

	@RequestMapping(value="/peticiones/*")
	public @ResponseBody String peticionPorExpresionesRegulares() {
		return "Peticion por expresion regular";
	}	
	
}
