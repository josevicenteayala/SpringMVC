package co.com.personal.spring.controladores.respuestas;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/respuestas/*")
public class RespuestasController {

	/*
	 * http://localhost:8080/cursoSpringMVC/respuestas/entidad/estado
	 * Retorna error de acceso a recurso
	 * */
	
	@RequestMapping("/entidad/estado")
	public ResponseEntity<String> respuestaConResponseEntity(){
		return new ResponseEntity<>(HttpStatus.FORBIDDEN);
	}
	
	/*
	 * http://localhost:8080/cursoSpringMVC/respuestas/entidad/estado
	 * Retorna error de acceso a recurso
	 * */
	
	@RequestMapping("/entidad/estado2")
	public ResponseEntity<String> respuestaConResponseEntity2(){
		return new ResponseEntity<>("El recurso esta prohibido para ser usado, jajaja ",HttpStatus.FORBIDDEN);
	}	
	
	/*
	 * http://localhost:8080/cursoSpringMVC/respuestas/entidad/completo
	 * Retorna error de acceso a recurso
	 * */
	
	@RequestMapping("/entidad/completo")
	public ResponseEntity<String> respuestaConResponseEntityCompleta(){
		HttpHeaders cabeceras = new HttpHeaders();
		cabeceras.setContentType(MediaType.TEXT_PLAIN);
		
		return new ResponseEntity<>("<h1>Mensaje de la pagina</h1>",cabeceras, HttpStatus.OK);
	}	
	
	/*
	 * http://localhost:8080/cursoSpringMVC/respuestas/entidad/completo
	 * Retorna error de acceso a recurso
	 * */
	
	@RequestMapping("/entidad/completo2")
	public ResponseEntity<String> respuestaConResponseEntityCompleta2(){
		HttpHeaders cabeceras = new HttpHeaders();
		cabeceras.setContentType(MediaType.TEXT_HTML);
		
		return new ResponseEntity<>("<h1>Mensaje de la pagina</h1>",cabeceras, HttpStatus.OK);
	}	
	
}
