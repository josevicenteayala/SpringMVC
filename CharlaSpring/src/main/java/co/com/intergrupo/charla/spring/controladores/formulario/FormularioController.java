package co.com.intergrupo.charla.spring.controladores.formulario;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormularioController {

	
	/*
	 * http://localhost:8080/charlaSpring/formulario
	 * */
	@RequestMapping(value="/formulario", method=RequestMethod.GET)
	public String cargarFormulario(Model model) {
		model.addAttribute(new Usuario());
		return "formulario";
	}
	
	/*
	 * http://localhost:8080/charlaSpring/formulario
	 * */
	@RequestMapping(value="/formulario", method=RequestMethod.POST)
	public String obtenerDatosUsuario(@ModelAttribute Usuario usuario, Model model) {
		model.addAttribute(usuario);
		return "datosUsuario";
	}
	
}
