package es.adama.spring.controladores.conversores.mensajes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.syndication.feed.atom.Feed;
import com.sun.syndication.feed.rss.Channel;

import co.com.personal.spring.controladores.conversores.mensajes.JavaBean;

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
	 * http://localhost:8080/cursoSpringMVC/conversor-mensajes/json
	 * */
	
	@RequestMapping(value="/json", method=RequestMethod.GET)
	public @ResponseBody JavaBean json() {
		return new JavaBean("peras","Chevrolet");
	}
	/*
	 * http://localhost:8080/cursoSpringMVC/conversor-mensajes/atom
	 * */
	
	@RequestMapping(value="/atom", method=RequestMethod.GET)
	public @ResponseBody Feed atom() {
		Feed feed = new Feed();
		feed.setFeedType("atom_1.0");
		feed.setTitle("Titulo de la prueba");
		return feed;
	}	
	
	/*
	 * http://localhost:8080/cursoSpringMVC/conversor-mensajes/rss
	 * */
	
	@RequestMapping(value="/rss", method=RequestMethod.GET)
	public @ResponseBody Channel rss() {
		Channel channel = new Channel();
		channel.setFeedType("rss_2.0");
		channel.setTitle("Titulo del RSS");
		channel.setDescription("Cuerpo de la descripcion");
		channel.setLink("http://www.dicotraining.com");
		return channel;
	}	
	
}
