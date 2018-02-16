package co.com.personal.spring.controladores.datos;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/datos-estandar")
public class DatosEstandarController {

	
	
	/**
	 * http://localhost:8080/cursoSpringMVC/datos-estandar/datos?nombre=Jose%20Vicente
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/datos")
	public @ResponseBody String datosEstandar(HttpServletRequest request) {
		String nombre = request.getParameter("nombre");
		return "Nombre : "+nombre;
	}

	/**
	 * http://localhost:8080/cursoSpringMVC/datos-estandar/datos?nombre=Jose%20Vicente
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/datosLenguaje")
	public @ResponseBody String datosEstandar(HttpServletRequest request, Locale locale) {
		String nombre = request.getParameter("nombre");
		String idioma = locale.getLanguage();
		return "Nombre : "+nombre + " idioma: "+idioma;
	}
	
}
