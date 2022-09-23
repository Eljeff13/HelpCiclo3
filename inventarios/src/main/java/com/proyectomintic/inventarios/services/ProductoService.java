package com.proyectomintic.inventarios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.proyectomintic.inventarios.DTO.CreacionProductoDTO;
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
	
	//para creacion de productos creamos un DTO(Document to object)
	
	public String crearProducto(CreacionProductoDTO info) {
		
		Producto nuevoProducto = new Producto();
		nuevoProducto.setNombreProducto(info.getNombreProducto());
		nuevoProducto.setPrecio(info.getPrecio());
		nuevoProducto.setProveedor(info.getProveedor());
		nuevoProducto.setCategoria(info.getCategoria());
		nuevoProducto.setDescripcion(info.getDescripcion());
		nuevoProducto.setDisponible(info.getDisponible());
		
		System.out.println(info.getCategoria());
		
		try {
			productoRepository.save(nuevoProducto);
			return "El nuevo producto se creado satisfactoriamente";
		}catch (Exception e) {
			e.printStackTrace();
			return "Ups, Algo ha fallado!";
		}
	}
	

	
}
