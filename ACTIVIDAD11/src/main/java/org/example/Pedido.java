package org.example;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "pedidos")
public class Pedido {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_pedido")
        private int idPedido;

        @ManyToOne
        @JoinColumn(name = "id_producto", nullable = false)
        private Producto producto; // Vincula el pedido con el objeto Producto completo

        @Column(name = "unidades_pedidas")
        private int unidadesPedidas;

        @Column(name = "fecha_pedido")
        private LocalDateTime fechaPedido; // Mapea el DATETIME de la BD


        // Constructores, getters y setters
        public Pedido(int unidadesPedidas, LocalDateTime fechaPedido, Producto producto) {
                this.unidadesPedidas = unidadesPedidas;
                this.fechaPedido = fechaPedido;
                this.producto = producto;
        }

        public int getIdPedido() {
                return idPedido;
        }

        public void setIdPedido(int idPedido) {
                this.idPedido = idPedido;
        }

        public Producto getProducto() {
                return producto;
        }

        public void setProducto(Producto producto) {
                this.producto = producto;
        }

        public int getUnidadesPedidas() {
                return unidadesPedidas;
        }

        public void setUnidadesPedidas(int unidadesPedidas) {
                this.unidadesPedidas = unidadesPedidas;
        }

        public LocalDateTime getFechaPedido() {
                return fechaPedido;
        }

        public void setFechaPedido(LocalDateTime fechaPedido) {
                this.fechaPedido = fechaPedido;
        }
}
