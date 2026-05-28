package org.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import org.example.model.Producto;

import java.time.OffsetDateTime;

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    @JsonProperty("id_pedido")
    private Integer idPedido;

    @ManyToOne
    @JoinColumn(name = "id_producto", referencedColumnName = "id")
    @JsonProperty("producto")
    private int idProducto;

    @Column(name = "unidades_pedidas")
    @JsonProperty("unidades_pedidas")
    private Integer unidadesPedidas;

    @Column(name = "fecha_pedido")
    @JsonProperty("fecha_pedido")
    private OffsetDateTime fechaPedido;



    // Getters y setters
    public Integer getIdPedido() { return idPedido; }
    public int getProducto() { return idProducto; }
    public Integer getUnidadesPedidas() { return unidadesPedidas; }
    public OffsetDateTime getFechaPedido() { return fechaPedido; }
}