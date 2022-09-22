package com.proyectomintic.inventarios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectomintic.inventarios.models.Producto;
import com.proyectomintic.inventarios.services.ProductoService;


@RestController
@RequestMapping("/producto")
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/listar")
	public List<Producto> listarProductos(){
		return productoService.listarProductos();
	}
	
	
	
}
