package org.example.src.interfaces;
import org.example.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


// Util para hacer consultas a las tablas tipo GetById, GetAll, etc
public interface ProductoRepositorio extends JpaRepository<org.example.model.Producto, Integer> {}

