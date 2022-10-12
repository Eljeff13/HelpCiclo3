package com.proyectomintic.inventarios.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.proyectomintic.inventarios.models.Usuario;

public interface usuarioInterService {
    
    public ArrayList<Usuario> Obtenertodos();
    
    public Page<Usuario> findAll1(Pageable pageable);
    
    public Optional<Usuario> findById(Long id);
    
    public Usuario Save(Usuario usuario);
    
    public String deleteById(Long id);


    
}
