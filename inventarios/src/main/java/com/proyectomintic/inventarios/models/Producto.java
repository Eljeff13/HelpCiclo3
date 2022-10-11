package com.proyectomintic.inventarios.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Producto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_producto", nullable = false)
	private Long idProducto;
	
	@Column(name="nombreProducto", length = 45, nullable = false)
	private String nombreProducto;
	
	@Column(name="precio", nullable = false)
	private Double precio;
	
	@Column(name="proveedor", nullable = false)
	private String proveedor;
	
	@Column(name="categoria", nullable = false)
	private String categoria;
	
	@Column(name="descripcion", length = 500, nullable = false)
	private String descripcion;
	
	@Column(name="disponible", nullable = false)
	private Boolean disponible;
	
	public Producto() {
		
	}

	public Producto(String nombreProducto, Double precio, String proveedor, String categoria,
            String descripcion, Boolean disponible) {
        super();
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.proveedor = proveedor;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.disponible = disponible;
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
