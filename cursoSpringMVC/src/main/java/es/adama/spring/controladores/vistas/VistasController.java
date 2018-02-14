package es.adama.spring.controladores.vistas;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/vistas/*")
public class VistasController {

	/*
	 * http://localhost:8080/cursoSpringMVC/vistas/hola
	 * Para que este funcione, se debe quitar del archivo servlet-context.xml el bean org.springframework.web.servlet.view.InternalResourceViewResolver
	 * */
	@RequestMapping("/hola")
	public ModelAndView modelAndView() {
		return new ModelAndView("/WEB-INF/jsp/hello.jsp");
	}

	/*
	 * http://localhost:8080/cursoSpringMVC/vistas/hola2
	 * Para que este funcione, se debe quitar del archivo servlet-context.xml el bean org.springframework.web.servlet.view.InternalResourceViewResolver
	 * */
	@RequestMapping("/hola2")
	public ModelAndView modelAndView2() {
		String mensaje = "Jose Vicente";
		return new ModelAndView("/WEB-INF/jsp/hello2.jsp", "modelo", mensaje);
	}	
	
	/*
	 * http://localhost:8080/cursoSpringMVC/vistas/hola3
	 * Para que este funcione, se debe quitar del archivo servlet-context.xml el bean org.springframework.web.servlet.view.InternalResourceViewResolver
	 * */
	@RequestMapping("/hola3")
	public ModelAndView modelAndView3() {
		String nombre = "Jose Vicente";
		String apellido = "Ayala Luna";
		Map<String,String> modelo = new HashMap<>();
		modelo.put("nombre", nombre);
		modelo.put("apellido", apellido);
		return new ModelAndView("/WEB-INF/jsp/hello3.jsp", "modelo", modelo);
	}
	
	/*
	 * http://localhost:8080/cursoSpringMVC/vistas/hola4
	 * */
	@RequestMapping("/hola4")
	public ModelAndView modelAndView4() {
		String nombre = "Jose Vicente";
		String apellido = "Ayala Luna";
		Map<String,String> modelo = new HashMap<>();
		modelo.put("nombre", nombre);
		modelo.put("apellido", apellido);
		return new ModelAndView("hello3", "modelo", modelo);
	}	
	
	
	/*
	 * http://localhost:8080/cursoSpringMVC/vistas/saludos
	 * hello3 es el jsp invocado en los dos anteriores ejemplos
	 * */
	@RequestMapping("/saludos")
	public String vistaUno() {
		return "hello3";
	}		
	
	/*
	 * http://localhost:8080/cursoSpringMVC/vistas/saludos2
	 * 
	 * */
	@RequestMapping("/saludos2")
	public String vistaDos(Model modelo) {
		modelo.addAttribute("mensaje","Saludos Jose");
		modelo.addAttribute("mensaje2",", Cómo me le va?");
		return "hello4";
	}	
	
	/*
	 * http://localhost:8080/cursoSpringMVC/vistas/saludos3/Jose/Ayala
	 * 
	 * */
	@RequestMapping(value="/saludos3/{nombre}/{apellido}")
	public String vistaTres(@PathVariable String nombre, @PathVariable String apellido) {
		return "hello5";
	}	
	
	/*
	 * http://localhost:8080/cursoSpringMVC/vistas/saludos4/Vicente/Ayala
	 * 
	 * */
	@RequestMapping(value="/saludos4/{nombre}/{apellido}")
	public String vistaCuatro(JavaBean javaBean) {
		return "hello6";
	}	
	
	
	/*
	 * http://localhost:8080/cursoSpringMVC/vistas/saludos5
	 * Para que este funcione, es necesario crear un jsp en /WEB-INF/vistas llamado saludos5.jsp, dado que al no devolver una vista, Spring interpreta que la vista 
	 * es el nombre del enlace, es decir vistas/saludos5.jsp
	 * 
	 * */
	@RequestMapping(value="/saludos5")
	public void vistaCinco() {
		
	}	
	
	/*
	 * http://localhost:8080/cursoSpringMVC/vistas/saludos6
	 * Para que este funcione, es necesario crear un jsp en /WEB-INF/vistas llamado saludos5.jsp, dado que al no devolver una vista, Spring interpreta que la vista 
	 * es el nombre del enlace, es decir vistas/saludos5.jsp
	 * 
	 * */
	@RequestMapping(value="/saludos6")
	public String vistaSeis() {
		return "vistas/saludos5";
	}	
}
