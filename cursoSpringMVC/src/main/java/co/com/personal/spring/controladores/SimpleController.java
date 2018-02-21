package co.com.personal.spring.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {

	@RequestMapping("/simple")
	public @ResponseBody String simple() {
		return "Hola";
	}
	
	@RequestMapping(value="/simple/revisado",method=RequestMethod.GET)
	public @ResponseBody String simpleRevisado() {
		return "Hola revisado";
	}
	
	@RequestMapping(value="/simple/revisadopost",method=RequestMethod.POST)
	public @ResponseBody String simpleRevisadoPOST() {
		return "Hola revisado por POST";
	}	
	
	
	
}
