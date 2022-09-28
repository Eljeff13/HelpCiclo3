package com.proyectomintic.inventarios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectomintic.inventarios.DTO.CreacionUsuarioDTO;
import com.proyectomintic.inventarios.models.Usuario;
import com.proyectomintic.inventarios.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/listar")
	public List<Usuario> listarUsuario(){
		return usuarioService.listarUsuario();
	}
	
	@PostMapping("/crear")
	public String crearUsuario(@RequestBody CreacionUsuarioDTO informacion) {
		
		return usuarioService.crearUsuario(informacion);	
	}
	
	@DeleteMapping("/eliminar/{id}")
	public String eliminarUsuario(@PathVariable Long id ) {
		
		return usuarioService.eliminarUsuario(id);
	}
}
