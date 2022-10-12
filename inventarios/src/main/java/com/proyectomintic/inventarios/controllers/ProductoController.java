package com.proyectomintic.inventarios.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyectomintic.inventarios.DTO.CreacionProductoDTO;
import com.proyectomintic.inventarios.DTO.ModificarProductoDTO;
import com.proyectomintic.inventarios.services.ProductoService;

@Controller
@RequestMapping("producto")
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/listar")
	public String listarProductos(Model model){
	    model.addAttribute("productos", productoService.listarProductos());
	    return "producto/vistaAdministradorProductos";	
	}
	
	@PostMapping("/crear")
	public String crearProducto(@RequestBody CreacionProductoDTO request) {
		return productoService.crearProducto(request);	
	}
	
	@PutMapping("/modificar")
	public String modifacarProducto(@RequestBody ModificarProductoDTO request) {
		return productoService.modificacionProducto(request);
	}

	@DeleteMapping("/eliminar/{id}")
	public String eliminarProducto(@PathVariable Long id) {
		return productoService.eliminarProducto(id);
	}
	
	
}
