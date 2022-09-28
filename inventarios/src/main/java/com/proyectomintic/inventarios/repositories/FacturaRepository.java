package com.proyectomintic.inventarios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectomintic.inventarios.models.Factura;

public interface FacturaRepository extends JpaRepository<Factura, Long>  {
		
}
