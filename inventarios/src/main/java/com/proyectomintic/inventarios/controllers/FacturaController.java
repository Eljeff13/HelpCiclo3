package com.proyectomintic.inventarios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectomintic.inventarios.DTO.CreacionFacturaDTO;
import com.proyectomintic.inventarios.models.Factura;

import com.proyectomintic.inventarios.services.FacturaService;

@RestController
@RequestMapping("factura")
public class FacturaController {

	@Autowired
	private FacturaService facturaService;
	
	@GetMapping("/listar")
	public List<Factura> listarFactura(){
		return facturaService.listarFacturas();
	}
	
	@PostMapping("/crear")
	public String crearFactura(@RequestBody CreacionFacturaDTO request) {
		return facturaService.crearFactura(request);	
	}
	
	@DeleteMapping("/eliminar/{id}")
	public String eliminarProducto(@PathVariable Long id) {
		return facturaService.eliminarUsuario(id);
	}
}
