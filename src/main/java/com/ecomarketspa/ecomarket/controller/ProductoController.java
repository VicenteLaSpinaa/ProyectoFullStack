package com.ecomarketspa.ecomarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecomarketspa.ecomarket.model.Producto;
import com.ecomarketspa.ecomarket.service.ProductoService;

@RestController
@RequestMapping("/api/productos")

public class ProductoController {
    @Autowired
    private ProductoService productoService;
    
    @GetMapping
    public List<Producto> getAllProductos() {
        return productoService.listarProductos();
    }

    @PostMapping
    public Producto createProducto(@RequestBody Producto producto) {
        return productoService.crearProducto(producto);
    }



}
