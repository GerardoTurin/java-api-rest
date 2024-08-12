package com.java.apirest.apirest.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.apirest.apirest.Entities.Producto;
import com.java.apirest.apirest.Repositories.ProductoRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoRepository productoRepository;          // Repositorio de productos, para acceder a la base de datos.

    
    
    //^ Métodos de la API REST

    @GetMapping
    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    @PostMapping
    public Producto addProducto(@RequestBody Producto producto) {
        return productoRepository.save(producto);
    }
    @GetMapping("/{id}")
    public Producto getProductoById(@PathVariable Long id) {
        return productoRepository.findById(id)
            .orElseThrow( () -> new RuntimeException("Producto no encontrado") );
    }



    @PutMapping("/{id}")
    public Producto updateProducto(@PathVariable Long id, @RequestBody Producto producto) {
        Producto currentProducto = productoRepository.findById(id)  // Obtiene el producto actual de la base de datos.
        .orElseThrow( () -> new RuntimeException("Producto no encontrado") );   // Si no existe, lanza una excepción ( ERROR ).

        currentProducto.setNombre(producto.getNombre());    // Actualiza el nombre del producto actual.
        currentProducto.setDescripción(producto.getDescripción());
        currentProducto.setPrecio(producto.getPrecio());
        

        return productoRepository.save(currentProducto);    // Guarda el producto actualizado en la base de datos.
    }



    @DeleteMapping("/{id}")
    public String deleteProducto(@PathVariable Long id) {
        Producto producto = productoRepository.findById(id)
        .orElseThrow( () -> new RuntimeException("Producto no encontrado") );

        productoRepository.delete(producto);
        return "Producto eliminado";
    }






    

}
