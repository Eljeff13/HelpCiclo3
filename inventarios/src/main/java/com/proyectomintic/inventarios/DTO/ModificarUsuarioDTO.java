package com.proyectomintic.inventarios.DTO;

public class ModificarUsuarioDTO {

	private String username;
	
	private String nombreUsuario;

	private String apellidoUsuario;

	private String contraseña ;

	private String rol;

	public ModificarUsuarioDTO() {
		
	}

	public ModificarUsuarioDTO(String username, String nombreUsuario, String apellidoUsuario, String contraseña,
            String rol) {
        super();
        this.username = username;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.contraseña = contraseña;
        this.rol = rol;
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
