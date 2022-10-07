package com.proyectomintic.inventarios.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.proyectomintic.inventarios.DTO.CreacionUsuarioDTO;
import com.proyectomintic.inventarios.DTO.ModificarUsuarioDTO;
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
	
	public String crearUsuarioPorDTO(CreacionUsuarioDTO usuario) {
		
		Usuario nuevoUsuario = new Usuario();
		nuevoUsuario.setUsername(usuario.getUsername());
		nuevoUsuario.setUsername(usuario.getContraseña());
		nuevoUsuario.setUsername(usuario.getNombreUsuario());
		nuevoUsuario.setUsername(usuario.getApellidoUsuario());
		nuevoUsuario.setUsername(usuario.getRol());	
		
		try {
			usuarioRepository.save(nuevoUsuario);
			return "Nuevo Usuario Registrado";
		}catch(Exception e){
			e.printStackTrace();
			return "Ha ocurrido un error en la creacion del usuario";
		}
	}
	
	
	public String modificacionUsuario(ModificarUsuarioDTO info) {
			
		Usuario nuevaModificacion = new Usuario();
		nuevaModificacion.setUsername(info.getUsername());
		nuevaModificacion.setApellidoUsuario(info.getApellidoUsuario());
		nuevaModificacion.setNombreUsuario(info.getNombreUsuario());
		nuevaModificacion.setUsername(info.getUsername());
		nuevaModificacion.setRol(info.getRol());
			
		try {
			usuarioRepository.save(nuevaModificacion);
			System.out.println(info.getNombreUsuario());
			return "Se ha modificado el usuario ";
		}catch(Exception e) {
			e.printStackTrace();
			return "Ha ocurrido un error al intentar modificar un usuario";
			}	
		}
		
	public String eliminarUsuario(Long idUsuario) {
		
		try {
			Optional<Usuario> usuarioEliminar = usuarioRepository.findById(idUsuario);
			if(usuarioEliminar.isPresent()) {
				usuarioRepository.delete(usuarioEliminar.get());
				return "Se ha eliminado satisfactoriamente el usuario";
				}else {
					return "no se ha podido eliminar el usuario";
				}
			
			}catch(Exception e) {
				e.printStackTrace();
				return "El usuario no fue eliminado por problemas diferentes a la existencia del mismo";
			}
	
		}

    public void crearUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
     
    }
	
}

