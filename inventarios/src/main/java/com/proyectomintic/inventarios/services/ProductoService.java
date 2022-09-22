package com.proyectomintic.inventarios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.proyectomintic.inventarios.models.Producto;
import com.proyectomintic.inventarios.repositories.ProductoRepository;

@Controller
@Service
public class ProductoService {
	
	@Autowired
	private ProductoRepository productoRepository;
	
	public List<Producto> listarProductos() {
		List<Producto> aux= (List<Producto>) productoRepository.findAll();
		System.out.println(aux);
		for(Producto x:aux) {
			System.out.println(x.getNombreProducto());
		}
		return aux;
	}
	
}
