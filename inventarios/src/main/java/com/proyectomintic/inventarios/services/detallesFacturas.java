package com.proyectomintic.inventarios.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.proyectomintic.inventarios.models.DetallesFacturas;

public interface detallesFacturas {
    
    public Iterable<DetallesFacturas> findAll();
    
    public Page<DetallesFacturas> findAll(Pageable pageable);
    
    public Optional<DetallesFacturas> findById(Long id);
    
    public DetallesFacturas Save(DetallesFacturas detallesFacturas);
    
    public void deleteById(Long id);
    
    
        
}
