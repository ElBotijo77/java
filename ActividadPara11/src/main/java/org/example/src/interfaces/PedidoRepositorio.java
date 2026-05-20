package org.example.src.interfaces;
import org.example.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

// Util para hacer consultas a las tablas tipo GetById, GetAll, etc
public interface PedidoRepositorio extends JpaRepository<org.example.model.Pedido, Integer> {}