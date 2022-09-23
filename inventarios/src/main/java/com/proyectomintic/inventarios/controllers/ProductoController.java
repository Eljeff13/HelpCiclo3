package com.proyectomintic.inventarios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectomintic.inventarios.DTO.CreacionProductoDTO;
import com.proyectomintic.inventarios.DTO.ModificarProductoDTO;
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
	
	@PostMapping("/crear")
	public String crearProducto(@RequestBody CreacionProductoDTO request) {
		System.out.println(request.getCategoria());
		return productoService.crearProducto(request);	
	}
	
	@PutMapping("/modificar")
	public String modifacarProducto(@RequestBody ModificarProductoDTO request) {
		System.out.println(request.getIdProducto());
		return productoService.modificacionProducto(request);
	}

	@DeleteMapping("/eliminar/{id}")
	public String eliminarProducto(@PathVariable Long id) {
		return productoService.eliminarProducto(id);
	}
	
	
}
