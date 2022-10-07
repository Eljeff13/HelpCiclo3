package com.proyectomintic.inventarios.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="detallesfacturas")
public class DetallesFacturas implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="iddetalle", nullable = false)
	private Long iddetalle;
	
	@Column(name="cantidad")
	private Integer cantidad;
	
	@Column(name="precio")
	private Double precio;
	
	@Column(name="subtotal")
	private Double subtotal;
	
	@Column(name="idProducto")
	private Long idProducto;
	
	@Column(name="idFactura")
	private Long idFactura;
	
	public DetallesFacturas() {
		
	}

	public DetallesFacturas(Long iddetalle, Integer cantidad, Double precio, Double subtotal, Long idProducto,
            Long idFactura) {
        super();
        this.iddetalle = iddetalle;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subtotal = subtotal;
        this.idProducto = idProducto;
        this.idFactura = idFactura;
    }

    public long getIddetalle() {
		return iddetalle;
	}

	public void setIddetalle(Long iddetalle) {
		this.iddetalle = iddetalle;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public long getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Long idFactura) {
		this.idFactura = idFactura;
	}
		
}
