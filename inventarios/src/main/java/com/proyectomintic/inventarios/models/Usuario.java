package com.proyectomintic.inventarios.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idusuario")
	private Long idusuario;
	
	@Column(name="username")
	private String username;
	
	@Column(name="nombreUsuario", nullable = false)
	private String nombreUsuario;
	
	@Column(name="apellidoUsuario", nullable = false)
	private String apellidoUsuario;
	
	@Column(name="contraseña", nullable = false)
	private String contraseña ;
	
	@Column(name="rol", nullable = false)
	private String rol;
	
	public Usuario() {
		
	}
	
	public Usuario(Long idusuario, String username, String nombreUsuario, String apellidoUsuario, String contraseña,
            String rol) {
        super();
        this.idusuario = idusuario;
        this.username = username;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public Long getIdusuario() {
		return idusuario;
	}
	
	public void setIdusuario(Long idusuario) {
		this.idusuario = idusuario;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getApellidoUsuario() {
		return apellidoUsuario;
	}

	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
	
	
}
