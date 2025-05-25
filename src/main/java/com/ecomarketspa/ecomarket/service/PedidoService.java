package com.ecomarketspa.ecomarket.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomarketspa.ecomarket.model.Pedido;
import com.ecomarketspa.ecomarket.repository.PedidoRepository;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido crearPedido(Pedido pedido) {
        pedido.setFechaCreacion(LocalDateTime.now());
        pedido.setEstado("Pendiente");
        return pedidoRepository.save(pedido);
    }

    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }


    public Pedido actualizarEstado(Long id, String estado) {
        Pedido pedido = pedidoRepository.findById(id).orElseThrow(() -> new RuntimeException("Pedido no encontrado"));
        pedido.setEstado(estado);
        return pedidoRepository.save(pedido);
    }

}
