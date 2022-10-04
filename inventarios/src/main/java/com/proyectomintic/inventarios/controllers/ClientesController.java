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

import com.proyectomintic.inventarios.DTO.CreacionClienteDTO;
import com.proyectomintic.inventarios.DTO.ModificarClienteDTO;
import com.proyectomintic.inventarios.models.Clientes;
import com.proyectomintic.inventarios.services.ClientesService;


@RestController
@RequestMapping("/Clientes")
public class ClientesController {
	
	@Autowired
	private ClientesService clientesService;
	
	@GetMapping("/listar")
	public List<Clientes> listarProductos(){
		return clientesService.listarClientes();
	}
	
	@PostMapping("/crear")
	public String crearClientes(@RequestBody CreacionClienteDTO request) {
		return clientesService.crearCliente(request);	
	}
	
	@PutMapping("/modificar")
	public String modificarClientes(@RequestBody ModificarClienteDTO request) {
		System.out.println(request.getCedula());
		return clientesService.modificacionCliente(request);
	}

	@DeleteMapping("/eliminar/{id}")
	public String eliminarProducto(@PathVariable Long id) {
		return clientesService.eliminarUsuario(id);
	}
}
