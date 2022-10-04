package com.proyectomintic.inventarios.DTO;

public class CreacionClienteDTO {

	private String nombreCliente;

	private String apellidoCliente;

	private String email ;
	
	private String direccion;
	
	private Integer telefono;
	
	public CreacionClienteDTO(){
		
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellidoCliente() {
		return apellidoCliente;
	}

	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer puntos) {
		this.telefono = puntos;
	}
	
}
