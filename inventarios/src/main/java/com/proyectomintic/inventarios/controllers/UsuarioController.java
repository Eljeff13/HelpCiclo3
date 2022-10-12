package com.proyectomintic.inventarios.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectomintic.inventarios.DTO.CreacionUsuarioDTO;
import com.proyectomintic.inventarios.models.Usuario;
import com.proyectomintic.inventarios.services.UsuarioService;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/")
	public ArrayList<Usuario> listarUsuario(){
		return usuarioService.Obtenertodos();
	}
	
//	@PostMapping("/crear")
//	public String crearUsuario(Model model) {
//	    Usuario nuevoUsuario = new Usuario();
//		model.addAttribute(nuevoUsuario, usuarioService.crearUsuario());
//		return "/usuario/crear";	
//	}
                                                                                	
	@PutMapping("/crear")
	public String CrearUsuario(@ModelAttribute Usuario usuario) {
	    usuarioService.Save(usuario);
	    return "usuario/vistaAdministradorUsuarios";
	}
	
	
	@DeleteMapping("/eliminar/{id}")
	public String eliminarUsuario(@PathVariable Long id ) {
		
		return usuarioService.deleteById(id);
	}
}
