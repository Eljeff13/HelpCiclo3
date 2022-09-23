package com.proyectomintic.inventarios.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.proyectomintic.inventarios.DTO.CreacionProductoDTO;
import com.proyectomintic.inventarios.DTO.ModificarProductoDTO;
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
		
		System.out.println(info.getNombreProducto());
		System.out.println(info.getPrecio());
		System.out.println(info.getProveedor());
		System.out.println(info.getCategoria());
		System.out.println(info.getDescripcion());
		System.out.println(info.getDisponible());
		
		try {
			productoRepository.save(nuevoProducto);
			return "El nuevo producto se creado satisfactoriamente";
		}catch (Exception e) {
			e.printStackTrace();
			return "Ups, Algo ha fallado!";
		}
	}
	
	public String modificacionProducto(ModificarProductoDTO recep) {
		
		Producto nuevaModificacion = new Producto();
		nuevaModificacion.setIdProducto(recep.getIdProducto());
		nuevaModificacion.setNombreProducto(recep.getNombreProducto());
		nuevaModificacion.setPrecio(recep.getPrecio());
		nuevaModificacion.setProveedor(recep.getProveedor());
		nuevaModificacion.setCategoria(recep.getCategoria());
		nuevaModificacion.setDescripcion(recep.getDescripcion());
		nuevaModificacion.setDisponible(recep.getDisponible());
		
		try {
			productoRepository.save(nuevaModificacion);
			return "Se han modificado los cambios";
		}catch(Exception e){
			e.printStackTrace();
			return "Ups,no sea ha logrado la modificacion :/";
		}
		
	}
	
	public String eliminarProducto(Long idProducto) {
		
		try {
			Optional<Producto> productoEliminar = productoRepository.findById(idProducto);
			if (productoEliminar.isPresent()) {
				productoRepository.delete(productoEliminar.get());
				return "Se ha Eliminado Correctamente el producto";
			}else {
				return "No existe producto con el ID especificado";
			}
						
		}catch(Exception e) {
						
			e.printStackTrace();
			return "Se ha presentado un error al tratar de eliminar el producto";
		}
	}

	
}
