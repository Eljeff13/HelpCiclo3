package com.proyectomintic.inventarios.services;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import com.proyectomintic.inventarios.DTO.CreacionFacturaDTO;
import com.proyectomintic.inventarios.models.Factura;
import com.proyectomintic.inventarios.repositories.FacturaRepository;

@Controller
public class FacturaService {

	private FacturaRepository facturaRepository;
	
	public List<Factura> listarFacturas(){
		
		return facturaRepository.findAll();
	}
	
	public String crearFactura(CreacionFacturaDTO info) {
		
		Factura nuevaFactura = new Factura();
		nuevaFactura.setUsername(info.getUsername());
		nuevaFactura.setFecha(info.getFecha());
		nuevaFactura.setTotal(info.getTotal());
		nuevaFactura.setCedula(info.getCedula());
				
		try {
			facturaRepository.save(nuevaFactura);
			return "La nueva factura se creado satisfactoriamente";
		}catch (Exception e) {
			e.printStackTrace();
			return "Ups, Algo ha fallado!";
		}
	}
	
	public String eliminarUsuario(Long idFactura) {
	
		try {
			Optional<Factura> facturaEliminar = facturaRepository.findById(idFactura);
			if(facturaEliminar.isPresent()) {
				facturaRepository.delete(facturaEliminar.get());
				return "Se ha eliminado satisfactoriamente una factura";
				}else {
					return "no se ha podido eliminar la factura";
				}
			
			}catch(Exception e) {
				e.printStackTrace();
				return "La factura no fue eliminada por problemas diferentes a la existencia del mismo";
			}
	
		}
}
