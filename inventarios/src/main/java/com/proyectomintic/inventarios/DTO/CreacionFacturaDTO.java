package com.proyectomintic.inventarios.DTO;

import java.util.Date;

public class CreacionFacturaDTO {

	private Date fecha;
	
	private Double total;

	private String username;

	private Long cedula;
	
	public CreacionFacturaDTO() {
		
	}

	public CreacionFacturaDTO(Date fecha, Double total, String username, Long cedula) {
        super();
        this.fecha = fecha;
        this.total = total;
        this.username = username;
        this.cedula = cedula;
    }

    public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getCedula() {
		return cedula;
	}

	public void setCedula(Long cedula) {
		this.cedula = cedula;
	}
	
	
	
}
