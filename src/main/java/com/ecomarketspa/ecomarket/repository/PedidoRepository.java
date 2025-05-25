package com.ecomarketspa.ecomarket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecomarketspa.ecomarket.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByIdUsuario(Long idUsuario);
    

}
