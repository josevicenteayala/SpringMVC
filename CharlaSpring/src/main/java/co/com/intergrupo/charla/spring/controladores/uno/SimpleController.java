package co.com.intergrupo.charla.spring.controladores.uno;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {

	
	/*
	 * http://localhost:8080/CharlaSpring/primerMetodo
	 * */
	@RequestMapping("/primerMetodo")
	public @ResponseBody String primerMetodo() {
		return "Este es el primer metodo de la charla";
	}
	
	/*
	 * http://localhost:8080/CharlaSpring/charlaSpring/segundoMetodo
	 * */
	@RequestMapping(value="/charlaSpring/segundoMetodo", method=RequestMethod.GET)
	public @ResponseBody String segundoMetodo() {
		return "Este es el segundo metodo de la charla";
	}

	/*
	 * http://localhost:8080/CharlaSpring/charlaSpring/tercerMetodo
	 * */
	@RequestMapping(value="/charlaSpring/tercerMetodo", method=RequestMethod.POST)
	public @ResponseBody String tercerMetodo() {
		return "Este es el tercer metodo de la charl, via POST";
	}	
	
}
