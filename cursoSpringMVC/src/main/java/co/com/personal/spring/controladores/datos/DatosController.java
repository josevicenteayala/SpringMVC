package co.com.personal.spring.controladores.datos;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/datos/*")
public class DatosController {

	/**
	 * http://localhost:8080/cursoSpringMVC/datos/parametro?param1=valorParametro1
	 * */
	
	@RequestMapping(value="/parametro",method=RequestMethod.GET)
	public @ResponseBody String conParametro(@RequestParam String param1) {
		return "Valor obtenido del param1 es >> "+param1;
	}
	
	
	/**
	 * http://localhost:8080/cursoSpringMVC/datos/pathvariable/valorParametroVariable
	 * */
	@RequestMapping(value="/pathvariable/{param1}",method=RequestMethod.GET)
	public @ResponseBody String conPathVariable(@PathVariable String param1) {
		return "Valor obtenido del param1 es >> "+param1;
	}	

	
	/*con matrix variable
	 * 
	 * http://localhost:8080/cursoSpringMVC/datos/Jose%20Vicente%20Ayala%20Luna;variableMatrix=otroDato,segundoDatos,tercerDato/cualquiercosa
	 * */
	@RequestMapping(value="/{param1}/cualquiercosa",method=RequestMethod.GET)
	public @ResponseBody String conMatrixVariable(@PathVariable String param1, @MatrixVariable String variableMatrix) {
		return "Valor obtenido del param1 es >> "+param1+" el valor de la matrix es "+variableMatrix;
	}	
	
	/*con doble matrix variable
	 * 
	 * http://localhost:8080/cursoSpringMVC/datos/ruta1;variableMatrix=valor1,valor2,valor3/ruta2;variableMatrix=valor1Ruta2,valor2Ruta2/
	 * */
	@RequestMapping(value="/{param1}/{param2}",method=RequestMethod.GET)
	public @ResponseBody String conMatrixVariableMultiple(@PathVariable String param1, @MatrixVariable(value="variableMatrix", pathVar="param1") String variableMatrix,
													     @PathVariable String param2, @MatrixVariable(value="variableMatrix", pathVar="param2") String variableMatrix2) {
		return "de la ruta >"+param1+" se obtiene la matrix >  "+variableMatrix+" y de la ruta >"+param2+" se obtiene la matrix >  "+variableMatrix2 ;
	}	
	
	/*recuperar cabeceras
	 * 
	 * http://localhost:8080/cursoSpringMVC/datos/cabeceras
	 * */
	@RequestMapping(value="/cabeceras",method=RequestMethod.GET)
	public @ResponseBody String conCabeceras(@RequestHeader String Accept) {
		return "Valor obtenido desde la cabecera "+Accept;
	}
	
	/*recuperar cabeceras el user agent
	 * 
	 * http://localhost:8080/cursoSpringMVC/datos/cabecerasUserAgent
	 * */
	@RequestMapping(value="/cabecerasUserAgent",method=RequestMethod.GET)
	public @ResponseBody String conCabecerasUserAgent(@RequestHeader(value="User-Agent") String userAgent) {
		return "Valor obtenido desde la cabecera "+userAgent;
	}		
	
	/*recuperar cookies
	 * 
	 * http://localhost:8080/cursoSpringMVC/datos/cookies
	 * Solo funciona en Internet Explorer
	 * */
	@RequestMapping(value="/cookies",method=RequestMethod.GET)
	public @ResponseBody String conCookies(@CookieValue String JSESSIONID) {
		return "Valor obtenido desde la cookie "+JSESSIONID;
	}	
	
	/*recuperar cookies
	 * 
	 * http://localhost:8080/cursoSpringMVC/
	 * Es necesario crear un html con un formulario
	 * */
	@RequestMapping(value="/body",method=RequestMethod.POST)
	public @ResponseBody String conBody(@RequestBody String body) {
		return "Valor obtenido desde el body "+body;
	}	
	
	/*recuperar cookies
	 * 
	 * http://localhost:8080/cursoSpringMVC/
	 * Es necesario crear un html con un formulario
	 * */
	@RequestMapping(value="/entidad",method=RequestMethod.POST)
	public @ResponseBody String conBody(HttpEntity<String> entity) {
		return "Valor obtenido desde el body: "+entity.getBody() +"; headers: "+entity.getHeaders();
	}		
	
	
}
