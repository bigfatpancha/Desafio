package com.desafio.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.desafio.model.Aspirante;
import com.desafio.model.ListaAspirante;
import com.desafio.model.ListaUsuariosYContrasenias;
import com.desafio.model.Usuario;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SessionAttributes({"usuario", "aspirantes"})
@Controller
public class Login {
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/doLogin")
	public String doLogin(Model model,
			@RequestParam String usuario, @RequestParam String contrasenia) {
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			ListaUsuariosYContrasenias listaUsuario = (ListaUsuariosYContrasenias) mapper.readValue(new File("C:/Users/ljulia/Desktop/volverAEmpezar/Desafio/desafio/src/com/desafio/archivos/usuariosYContras.json"), ListaUsuariosYContrasenias.class);
			for(Usuario userPass : listaUsuario.getData()) {
				if(userPass.getUser().equals(usuario) && userPass.getPass().equals(contrasenia)) {
					ListaAspirante listaAspirante = (ListaAspirante) mapper.readValue(new File("C:/Users/ljulia/Desktop/volverAEmpezar/Desafio/desafio/src/com/desafio/archivos/ListaAspirantes.json"), ListaAspirante.class);
					model.addAttribute("aspirantes", listaAspirante.getData());
					model.addAttribute("usuario", userPass);
					return "home";
				}
			}
			return "loginError";
		} catch (JsonParseException e) {
			System.out.print("Error: " + e.getMessage());
			return "error";
		} catch (JsonMappingException e) {
			System.out.print("Error: " + e.getMessage());
			return "error";
		} catch (IOException e) {
			System.out.print("Error: " + e.getMessage());
			return "error";
		}
	}

	@RequestMapping("/detalle/{dni}")
	public String detalle(Model model, @PathVariable String dni,
			@ModelAttribute("aspirantes") List<Aspirante> aspirantes,
			@ModelAttribute("usuario") Usuario usuario) {
		
		for(Aspirante aspirante : aspirantes) {
			if(aspirante.getDni().equals(dni)) {
				model.addAttribute("aspirante", aspirante);
				model.addAttribute("usuario", usuario);
				return "detalle";				
			}
		}
		
		return "errorNoUsuario";
	}
	
}
