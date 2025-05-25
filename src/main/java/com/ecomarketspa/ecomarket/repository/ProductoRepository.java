package com.ecomarketspa.ecomarket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecomarketspa.ecomarket.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    List<Producto> findByNombreContainingIgnoreCase(String nombre);


}
