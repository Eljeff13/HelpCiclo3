package com.proyectomintic.inventarios.DTO;

public class ModificarProductoDTO {

	private Long idProducto;
	
	private String nombreProducto;
	
	private Double precio;
	
	private String proveedor;
	
	private String categoria;
	
	private String descripcion;
	
	private Boolean disponible;
	
	public ModificarProductoDTO() {
		
	}

	public ModificarProductoDTO(Long idProducto, String nombreProducto, Double precio, String proveedor,
            String categoria, String descripcion, Boolean disponible) {
        super();
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.proveedor = proveedor;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.disponible = disponible;
    }

    public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}
	
	
}