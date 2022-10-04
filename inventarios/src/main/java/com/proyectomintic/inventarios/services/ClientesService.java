package com.proyectomintic.inventarios.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;

import com.proyectomintic.inventarios.DTO.CreacionClienteDTO;
import com.proyectomintic.inventarios.DTO.ModificarClienteDTO;
import com.proyectomintic.inventarios.models.Clientes;
import com.proyectomintic.inventarios.repositories.ClientesRepository;

@Controller
public class ClientesService {

	private ClientesRepository clientesRepository;
	
	public List<Clientes> listarClientes(){
		return clientesRepository.findAll();
	}
	
	public String crearCliente(CreacionClienteDTO info) {
		
		Clientes nuevoCliente = new Clientes();
		nuevoCliente.setNombreCliente(info.getNombreCliente());
		nuevoCliente.setApellidoCliente(info.getApellidoCliente());
		nuevoCliente.setEmail(info.getEmail());
		nuevoCliente.setDireccion(info.getDireccion());
		nuevoCliente.setTelefono(info.getTelefono());
				
		try {
			clientesRepository.save(nuevoCliente);
			return "El nuevo cliente se creado satisfactoriamente";
		}catch (Exception e) {
			e.printStackTrace();
			return "Ups, Algo ha fallado!";
		}
	}
	
	public String modificacionCliente(ModificarClienteDTO info) {
			
		Clientes modificacionCliente = new Clientes();
		modificacionCliente.setCedula(info.getCedula());
		modificacionCliente.setNombreCliente(info.getNombreCliente());
		modificacionCliente.setApellidoCliente(info.getApellidoCliente());
		modificacionCliente.setEmail(info.getEmail());
		modificacionCliente.setDireccion(info.getDireccion());
		modificacionCliente.setTelefono(info.getTelefono());
			
		try {
			clientesRepository.save(modificacionCliente);
			return "Se ha modificado el Cliente ";
		}catch(Exception e) {
			e.printStackTrace();
			return "Ha ocurrido un error al intentar modificar un cliente";
			}	
		}
		
	public String eliminarUsuario(Long cedula) {
		
		try {
			Optional<Clientes> clientesEliminar = clientesRepository.findById(cedula);
			if(clientesEliminar.isPresent()) {
				clientesRepository.delete(clientesEliminar.get());
				return "Se ha eliminado satisfactoriamente el cliente";
				}else {
					return "no se ha podido eliminar el cliente";
				}
			
			}catch(Exception e) {
				e.printStackTrace();
				return "El cliente no fue eliminado por problemas diferentes a la existencia del mismo";
			}
	
		}
}
