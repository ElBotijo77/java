package org.example.model;

import jakarta.persistence.*;
import org.example.model.Producto;

import java.time.OffsetDateTime;

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private Integer idPedido;

    @ManyToOne
    @JoinColumn(name = "id_producto", referencedColumnName = "id") // ✅ "id" es la PK de productos
    private Producto producto;

    @Column(name = "unidades_pedidas")
    private Integer unidadesPedidas;

    @Column(name = "fecha_pedido")
    private OffsetDateTime fechaPedido;

    // Getters y setters
    public Integer getIdPedido() { return idPedido; }
    public Producto getProducto() { return producto; }
    public Integer getUnidadesPedidas() { return unidadesPedidas; }
    public OffsetDateTime getFechaPedido() { return fechaPedido; }
}