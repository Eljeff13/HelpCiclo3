package com.proyectomintic.inventarios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectomintic.inventarios.models.Clientes;

@Repository
public interface ClientesRepository extends JpaRepository <Clientes, Long> {
	
}
