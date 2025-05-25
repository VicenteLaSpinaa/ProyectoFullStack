package com.ecomarketspa.ecomarket.model;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long idUsuario;
    private long idProducto;
    private int cantidad;
    private String estado;
    private LocalDateTime fechaCreacion;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public long getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }
    public long getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(long idProducto) {
        this.idProducto = idProducto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    @Override
    public String toString() {
        return "Pedido [id=" + id + ", idUsuario=" + idUsuario + ", idProducto=" + idProducto + ", cantidad=" + cantidad
                + ", estado=" + estado + ", fechaCreacion=" + fechaCreacion + "]";
    }
    

}
