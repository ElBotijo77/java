package org.example.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private Integer idPedido;

    @ManyToOne
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    private Producto producto;

    @Column(name = "unidades_pedidas")
    private Integer unidadesPedidas;

    @Column(name = "fecha_pedido")
    private LocalDateTime fechaPedido;

    // Getters y Setters
    public Integer getIdPedido() { return idPedido; }
    public void setIdPedido(Integer id) { this.idPedido = id; }
    public Producto getProducto() { return producto; }
    public void setProducto(Producto p) { this.producto = p; }
    public Integer getUnidadesPedidas() { return unidadesPedidas; }
    public void setUnidadesPedidas(Integer u) { this.unidadesPedidas = u; }
    public LocalDateTime getFechaPedido() { return fechaPedido; }
    public void setFechaPedido(LocalDateTime f) { this.fechaPedido = f; }
}
