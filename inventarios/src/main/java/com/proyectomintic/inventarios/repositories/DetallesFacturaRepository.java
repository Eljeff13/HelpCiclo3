package com.proyectomintic.inventarios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectomintic.inventarios.models.DetallesFacturas;

@Repository
public interface DetallesFacturaRepository extends JpaRepository <DetallesFacturas, Long>{

}
