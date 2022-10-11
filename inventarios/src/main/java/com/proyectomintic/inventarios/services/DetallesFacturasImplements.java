package com.proyectomintic.inventarios.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectomintic.inventarios.models.DetallesFacturas;
import com.proyectomintic.inventarios.repositories.DetallesFacturaRepository;

@Service
public class DetallesFacturasImplements implements detallesFacturas{

    @Autowired
    private DetallesFacturaRepository detallesFacturasRepository;
    
    @Override
    @Transactional(readOnly = true)
    public Iterable<DetallesFacturas> findAll() {
        
        return detallesFacturasRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<DetallesFacturas> findAll(Pageable pageable) {
        
        return detallesFacturasRepository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<DetallesFacturas> findById(Long id) {

        return detallesFacturasRepository.findById(id);
    }

    @Override
    @Transactional
    public DetallesFacturas Save(DetallesFacturas detallesFacturas) {
        
        return detallesFacturasRepository.save(detallesFacturas);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        detallesFacturasRepository.deleteById(id);
        
    }
    
}
