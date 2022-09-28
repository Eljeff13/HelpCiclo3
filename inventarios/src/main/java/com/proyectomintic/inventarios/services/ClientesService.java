package com.proyectomintic.inventarios.services;

import java.util.List;

import org.springframework.stereotype.Controller;

import com.proyectomintic.inventarios.models.Clientes;
import com.proyectomintic.inventarios.repositories.ClientesRepository;

@Controller
public class ClientesService {

	private ClientesRepository clientesRepository;
	
	public List<Clientes> listarClientes(){
		return clientesRepository.findAll();
	}
}
