package com.ecomarketspa.ecomarket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomarketspa.ecomarket.model.Producto;
import com.ecomarketspa.ecomarket.repository.ProductoRepository;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;
    public Producto crearProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    public Producto actualizarStock(Long id, int cantidad) {
        Producto producto = productoRepository.findById(id).orElseThrow(() -> new RuntimeException("Producto no encontrado"));
    producto.setStock(producto.getStock() + cantidad);
        return productoRepository.save(producto);
    }
    
    public List<Producto> BuscarproductoporNombre(String nombre) {
        return productoRepository.findByNombreContainingIgnoreCase(nombre);
    }
    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);
    }
    public Producto obtenerProductoPorId(Long id) {
        return productoRepository.findById(id).orElseThrow(() -> new RuntimeException("Producto no encontrado"));
    }

}
