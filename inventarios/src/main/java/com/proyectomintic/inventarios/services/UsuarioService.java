package com.proyectomintic.inventarios.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.proyectomintic.inventarios.DTO.CreacionUsuarioDTO;
import com.proyectomintic.inventarios.DTO.ModificarUsuarioDTO;
import com.proyectomintic.inventarios.models.Usuario;
import com.proyectomintic.inventarios.repositories.UsuarioRepository;

@Service
public class UsuarioService implements usuarioInterService{
	
	@Autowired
	private UsuarioRepository usuarioRepository;

    @Override
    public ArrayList<Usuario> Obtenertodos() {
        
        return (ArrayList<Usuario>) usuarioRepository.findAll();
    }

    @Override
    public Page<Usuario> findAll1(Pageable pageable) {
        
        return usuarioRepository.findAll(pageable);
    }

    @Override
    public Optional<Usuario> findById(Long id) {
       
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuario Save(Usuario usuario) {
        
        return usuarioRepository.save(usuario);
    }

    @Override
    public String deleteById(Long id) {
        
        try {
            Optional<Usuario> user = usuarioRepository.findById(id);
            usuarioRepository.delete(user.get());
            return "El nuevo producto se creado satisfactoriamente";
        }catch (Exception e) {
            e.printStackTrace();
            return "Ups, Algo ha fallado!";
        }
    }
    
	
}

