package es.adama.spring.controladores.conversores.mensajes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/conversor-mensajes/*")
public class ConversorMensajesController {

	/*
	 * http://localhost:8080/cursoSpringMVC/conversor-mensajes/xml
	 * */
	
	@RequestMapping(value="/xml", method=RequestMethod.GET)
	public @ResponseBody JavaBean xml() {
		return new JavaBean("manzanas","Nissan");
	}
	
	/*
	 * http://localhost:8080/cursoSpringMVC/conversor-mensajes/xml
	 * */
	
	@RequestMapping(value="/json", method=RequestMethod.GET)
	public @ResponseBody JavaBean json() {
		return new JavaBean("peras","Chevrolet");
	}
	
}
