package com.proyectomintic.inventarios.models;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="CLIENTES")
public class Clientes implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cedula")
	private Long cedula;
	
	@Column(name="nombreCliente", length = 45, nullable = false)
	private String nombreCliente;
	
	@Column(name="apellidoCliente", nullable = false)
	private String apellidoCliente;
	
	@Column(name="email", nullable = false)
	private String email ;
	
	@Column(name="direccion", nullable = false)
	private String direccion;
	
	@Column(name="telefono", nullable = false)
	private Integer telefono;
	
	public Clientes() {
		
	}

	public Clientes(Long cedula, String nombreCliente, String apellidoCliente, String email, String direccion,
            Integer telefono) {
        super();
        this.cedula = cedula;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Long getCedula() {
		return cedula;
	}

	public void setCedula(Long cedula) {
		this.cedula = cedula;
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
