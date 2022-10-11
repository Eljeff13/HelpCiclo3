package com.proyectomintic.inventarios.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.proyectomintic.inventarios.models.Usuario;

public interface usuarioInterService {
    
    public Iterable<Usuario> findAll();
    
    public Page<Usuario> findAll1(Pageable pageable);
    
    public Optional<Usuario> findById(Long id);
    
    public Usuario Save(Usuario usuario);
    
    public void deleteById(Long id);

    Page<Usuario> findAll(Pageable pageable);

    
}
