package com.proyectomintic.inventarios.controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectomintic.inventarios.models.DetallesFacturas;
import com.proyectomintic.inventarios.services.detallesFacturas;

@RestController
@RequestMapping("/detallesfacturas")
public class DetallesFacturasController {
    
    @Autowired
    private detallesFacturas detallesFacturasService;
    
    //Creamos nueva factura
    @PostMapping
    public ResponseEntity<?> create (@RequestBody DetallesFacturas detallesFactura){
        return ResponseEntity.status(HttpStatus.CREATED).body(detallesFacturasService.Save(detallesFactura));
        
    }
    
    // leemos por medio de id pero sin que se llame "id"
    @GetMapping("/{id}")
    public ResponseEntity<?> read (@PathVariable(value = "id") Long detallesFacturaid){
        Optional<DetallesFacturas> oDetallesFacturas = detallesFacturasService.findById(detallesFacturaid);
        
        if (!oDetallesFacturas.isPresent()) {
            return ResponseEntity.notFound().build();    
        }
        
        return ResponseEntity.ok(oDetallesFacturas);
        }
    @PutMapping("/{id}")
    public ResponseEntity<?> update (@RequestBody DetallesFacturas detallesFacturasDetalles, @PathVariable(value = "id") Long iddetalle){
        
        Optional<DetallesFacturas> factura = detallesFacturasService.findById(iddetalle);
        
        if(!factura.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        
        //BeanUtils.copyProperties(detallesFacturasDetalles, factura.get());
        factura.get().setCantidad(detallesFacturasDetalles.getCantidad());
        factura.get().setIdFactura(detallesFacturasDetalles.getIdFactura());
        factura.get().setIdProducto(detallesFacturasDetalles.getIdProducto());
        factura.get().setSubtotal(detallesFacturasDetalles.getSubtotal());
        factura.get().setCantidad(detallesFacturasDetalles.getCantidad());
        factura.get().setPrecio(detallesFacturasDetalles.getPrecio());
        
        return ResponseEntity.status(HttpStatus.CREATED).body(detallesFacturasService.Save(factura.get()));
        
    }
    
    //eliminar
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete (@PathVariable Long id){
        if(!detallesFacturasService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        detallesFacturasService.deleteById(id);
        return ResponseEntity.ok().build();
    }
    
    //lista de Facturas
    @GetMapping("/")
    public String listarProductos(Model model){
        model.addAttribute("productos", detallesFacturasService.findAll());
        return "efectivo";
                //"producto/vistaAdministradorProductos";  
    }
}