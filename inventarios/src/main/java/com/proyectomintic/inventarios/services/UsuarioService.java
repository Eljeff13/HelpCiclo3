package com.proyectomintic.inventarios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.proyectomintic.inventarios.models.Usuario;
import com.proyectomintic.inventarios.repositories.UsuarioRepository;

@Controller
@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	public List<Usuario> listarUsuario(){
		
		return usuarioRepository.findAll();
	}
	
	
	
}
