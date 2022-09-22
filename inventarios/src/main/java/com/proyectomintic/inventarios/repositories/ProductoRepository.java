package com.proyectomintic.inventarios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectomintic.inventarios.models.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
	
}
